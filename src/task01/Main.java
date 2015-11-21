package task01;

import java.util.ArrayList;

public class Main {
    private static ArrayList<Request> requests = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Ласкаво просимо до програми, що містить поточну інформацію про авіаквитки.");
        //Додамо кілька заявок
        Request brest = new Request("Брест", 14, "Путін В.В.", "12.21.86");
        Request zaporizhzhya = new Request("Запоріжжя", 90, "Петренко А.І.", "12.12.86");
        Request paris = new Request("Париж", 32, "John Gult", "11.12.12");
        Request kirovograd = new Request("Кіровоград", 6, "Кінах Ю.В.", "12.21.86");

        requests.add(zaporizhzhya);
        requests.add(brest);
        requests.add(paris);
        requests.add(kirovograd);

        //Видалимо кілька заявок
        requests.remove(brest);

        //Видалимо по номеру рейсу
        requests.removeIf((request -> request.getFlightNumber() == 32));

        //Виведення заявок по заданому рейсу і датою вильоту
        requests.stream().filter((request ->
                request.getFlightNumber() == 90
                        && request.getDesiredFlightDate().equals("12.12.86")))
                .forEach(System.out::println);

        //Виведення всіх заявок
        requests.stream().forEach(System.out::println);
    }
}
