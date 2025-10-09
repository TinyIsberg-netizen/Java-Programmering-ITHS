import java.util.*;

public class Listoperations {
    
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

       

        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
            
        }

        for (int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i) % 2 == 0){
                numbers.remove(i);
                i--;
            }


        }

        for (int i = 0; i < numbers.size(); i++) {
            numbers.set(i, numbers.get(i) * 2);
            
        }

        System.out.println(numbers);
         
        


        
    }
    
}
