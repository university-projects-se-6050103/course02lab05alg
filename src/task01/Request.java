package task01;

public class Request {

    private String destination;
    private int flightNumber;
    private String passangerName;
    private String desiredFlightDate;

    public Request(String destination, int flightNumber, String passangerName, String desiredFlightDate) {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.passangerName = passangerName;
        this.desiredFlightDate = desiredFlightDate;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public String getDesiredFlightDate() {
        return desiredFlightDate;
    }

    @Override
    public String toString() {
        return "Заявка{" +
                "пункт призначення='" + destination + '\'' +
                ", номер рейсу=" + flightNumber +
                ", ім'я пасажира='" + passangerName + '\'' +
                ", бажана дата вильоту='" + desiredFlightDate + '\'' +
                '}';
    }
}
