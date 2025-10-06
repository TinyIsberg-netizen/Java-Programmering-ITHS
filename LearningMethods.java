import java.util.Scanner;

public class LearningMethods {
    public static void main(String[] args){
        String name;
        String answer;
        Scanner sc = new Scanner (System.in);
        hello(sc);
        whatsYourName(sc);
        whatsYourAge(sc);
        indoorOutdoorAnswers(indoorOutdoor(sc));
        sc.close();
    }
    
    static void hello(Scanner sc){   
    System.out.println("Hello! I want to show you how to use methods!");
    }
        
    static void whatsYourName(Scanner sc){
        String name;
        System.out.println("First off, what is your name?");
        name = sc.nextLine();
        System.out.println("Nice to meet you " + name + "!");
    }
    static void whatsYourAge(Scanner sc){
        int age;
        System.out.println("What is your age?");
        age = sc.nextInt();
        System.out.println("That means you where born in " + (2025 - age) + "!");
    }
    static String indoorOutdoor(Scanner sc){
        System.out.println("Are you an indoor or outdoor person?");
        sc.nextLine();
        String answer = sc.nextLine();
        return answer;
    }
        
        
    
        

    static void indoorOutdoorAnswers(String answer){
        boolean indoorPerson = false;
        boolean outdoorPerson = false;


    if(answer.matches("indoor")|| answer.matches("Indoor")){
            indoorPerson = true;
        }
        else if(answer.matches("outdoor") || answer.matches("Outdoor")){
            outdoorPerson = true;
        }
        else{
            System.out.println("That was an unexpected answer! O.o");
        }
        if(indoorPerson == true){
            System.out.println("Awesome! What is it that you do indoors?");
        }else if (outdoorPerson == true){
            System.out.println("Wow cool! Thats unusual nowadays. What is it you like about the great outdoors?");
        }else{
            System.out.println("Lets start over!");
        }
        
    }
    

}         

        
    

