package E7;
import java.util.*;

public class SetComparison {
    public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<String>();
        
            set1.add("apple");
            set1.add("banana");
            set1.add("orange");
            set1.add("mango");

        HashSet<String> set2 = new HashSet<String>();
        
            set2.add("apple");
            set2.add("mango");
            set2.add("grape");
            set2.add("pear");

        HashSet<String> commonFruits = new HashSet<>(set1);

        commonFruits.retainAll(set2);
            System.out.println(commonFruits);

        HashSet<String> uniqueFruits1 = new HashSet<>(set1);
            uniqueFruits1.removeAll(set2);
            System.out.println(uniqueFruits1);

        HashSet<String> uniqueFruits2 = new HashSet<>(set2);
            uniqueFruits2.removeAll(set1);
            System.out.println(uniqueFruits2);

        



        

        
            
        }


    }
    

