public class HotelGuests {

    String name;
    String egn;
    int maritalStatus;
    int nights;
    double beds;
    String city;

    public HotelGuests(String name, String egn, int maritalStatus, int nights, double beds, String city) {
        this.name = name;
        this.egn = egn;
        this.maritalStatus = maritalStatus;
        this.nights = nights;
        this.beds = beds;
        this.city = city;
    }

    public HotelGuests() {

    }

    @Override
    public String toString() {
        return "HotelGuests{" +
                "name='" + name + '\'' +
                ", egn='" + egn + '\'' +
                ", maritalStatus=" + maritalStatus +
                ", nights=" + nights +
                ", beds=" + beds +
                ", city='" + city + '\'' +
                '}';
    }
}