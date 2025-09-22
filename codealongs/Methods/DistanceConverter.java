package codealongs.Methods;

public class DistanceConverter {
    public static void main(String[] args) {
        milesToKilometers(3.68);
        milesToKilometers(4.7);
        milesToKilometers(8.2);
    }

    static void milesToKilometers(double miles) {
        double kilometers = miles * 1.60934;
        System.out.println(kilometers);
    }

    
}
