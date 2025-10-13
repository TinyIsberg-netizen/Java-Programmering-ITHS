import java.util.*;
//import java.lang.*;

public class Exceptions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        

        try{
            System.out.println("Hey! Let me help you divide those nummbers! \nEnter the first number: ");
            int num1 = scan.nextInt();

            System.out.println("Enter the second number: ");
            int num2 = scan.nextInt();

            if(num1 < 0 || num2 < 0) {
                throw new NegativeNumbers("Negative numbers not allowed!");
                
            }else{
                int result = num1/num2;
                System.out.println("Results: " + result);
            }
            

            
            

        }catch(Throwable e) {
            System.out.println("Something went wrong!");
            System.out.println("Exception type: " + e.getClass().getName());
            System.out.println("Message: " + e.getMessage());

        }finally{
            System.out.println("Program Ended.");
            scan.close();
        }

    
    }

    
}
