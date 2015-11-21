package task02;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        CircularList<String> team1 = new CircularList<>();
        CircularList<String> team2 = new CircularList<>();

        //Додамо гравців у команди
        team1.add("Вальчишин");
        team1.add("Голубєв");
        team1.add("Кійко");
        team1.add("Федоров");

        team2.add("Феновка");
        team2.add("Тиран");
        team2.add("Щур");
        team2.add("Журавель");

        //У першій команді вибирається кожен n-й гравець, а в другій - кожен m-й.
        System.out.println("Введіть через пробіл яких по рахунку гравців ви хочете брати: ");
        String[] input = new Scanner(System.in).nextLine().split("\\s");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        //Жеребкуємо
        System.out.println("Результати жеребкуваня: ");
        for (int i = 0; team1.size() > 0 && team2.size() > 0; i++) {
            String player1 = team1.get(n);
            String player2 = team2.get(m);
            team1.remove(n);
            team2.remove(m);
            System.out.println(player1 + " проти " + player2);
        }
    }
}
