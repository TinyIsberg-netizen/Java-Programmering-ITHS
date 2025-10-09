package E7;
import java.util.LinkedList;
import java.util.Queue;
import java.util.*;

public class Ko {
    public static void main(String[] args) {
        Queue<String> Kö = new LinkedList<String>();{
            Kö.add("Johan");
            Kö.add("Åke");
            Kö.add("Maja");
            Kö.offer("Patrick");

            System.out.println("Den som är först nu är: " + Kö.poll() + "\nNästa är:" + Kö.peek() + "\nResten av kön ser ut så här: " + Kö);
            
            

            
        }
    }
    
}
