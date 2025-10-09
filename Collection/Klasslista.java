package Collection;
import java.util.*;

public class Klasslista {
    public static void main(String[] args){
        Set <Student> klasslistan = new HashSet<>();
        Student tom = new Student("Tom", 12345, true);
        Student pater = new Student("Pater", 54321, false);
        klasslistan.add(tom);
        klasslistan.add(pater);
        //System.out.println(klasslistan);

        List <Student> klasslistan2 = new ArrayList<>();
        
        klasslistan.add(tom);
        klasslistan2.add(pater);



    }
    
}
