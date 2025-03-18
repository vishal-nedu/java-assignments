package assignments.classesandobjects;

public class Flightdto {
    private String flight_num;
    private String airline;
    private String passenger_name;
    private String departure_time;
    private String arrival_time;
    private int ticket_price;
    private  String source;
    private String destination;
    private static String  airport_code="TN-CHEN";
    public Flightdto(String flight_num, String airline, String passenger_name, String departure_time, String arrival_time, int ticket_price, String source, String destination) {
        this.flight_num = flight_num;
        this.airline = airline;
        this.passenger_name = passenger_name;
        this.departure_time = departure_time;
        this.arrival_time = arrival_time;
        this.ticket_price = ticket_price;
        this.source = source;
        this.destination = destination;
    }

    public String getFlight_num() {
        return flight_num;
    }

    public String getAirline() {
        return airline;
    }

    public String getPassenger_name() {
        return passenger_name;
    }

    public String getDeparture_time() {
        return departure_time;
    }

    public String getArrival_time() {
        return arrival_time;
    }

    public int getTicket_price() {
        return ticket_price;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public void setTicket_price(int ticket_price) {
        this.ticket_price = ticket_price;
    }

    public static String getAirport_code() {
        return airport_code;
    }

    public static void setAirport_code(String airport_code) {
        Flightdto.airport_code = airport_code;
    }

    @Override
    public String toString() {
        return "Flightdto{" +
                "flight_num='" + flight_num + '\'' +
                ", airline='" + airline + '\'' +
                ", passenger_name='" + passenger_name + '\'' +
                ", departure_time='" + departure_time + '\'' +
                ", arrival_time='" + arrival_time + '\'' +
                ", ticket_price=" + ticket_price +
                ", source='" + source + '\'' +
                ", destination='" + destination + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Flightdto f1=new Flightdto("A102","Deccan","rudra","10:00AM","8:00PM",450000,"New York","London");
        Flightdto f2=new Flightdto("B105","Emirates","anil","12:00AM","11:00PM",550000,"australia","dubai");
        System.out.println(f1.toString());
        f1.setTicket_price(100000);
        System.out.println(f1.toString());
    }
}
