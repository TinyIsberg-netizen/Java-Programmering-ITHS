public class DistanceConverter {
    public static void main(String[] args) {
       DistanceConverter dc = new DistanceConverter();

       double distanceInKilometers = dc.milesToKilometers();
       System.out.println (distanceInKilometers)
    }
    
    double milesToKilometers(){
        double miles = 100;
        double kilometers = miles * 1.60934;
        return kilometers;        
    }
    void echoDistnaceInKilometers(){
        double miles = 100;
        double kilometers = miles * 1.60934;
        System.out.println(kilometers);


    }
    // Parametriserad method
    double milesToKilometers(double miles){
        double kilometers = miles * 1.60934;
        return kilometers;        
    }
}

