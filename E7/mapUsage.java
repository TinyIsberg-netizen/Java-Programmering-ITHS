package E7;
import java.util.*;

public class mapUsage {
    public static void main(String[] args) {
        HashMap<String, Integer> Points = new HashMap<>();
        
        

        Points.put("Alice", 88);
        Points.put("Brian", 76);
        Points.put("Chloe", 93);
        Points.put("Daniel", 81);
        Points.put("Eva", 95);

        String topStudent = null;
        int maxScore = 0;

    

        for(Map.Entry<String, Integer> HighScore : Points.entrySet()){
            if(HighScore.getValue() > 90){
                System.out.println(HighScore.getKey() + " har " + HighScore.getValue() + " poäng ");

            }
            
        }

        for(Map.Entry<String, Integer> HighestScore : Points.entrySet() ){
                if(HighestScore.getValue() > maxScore){
                    maxScore = HighestScore.getValue();
                    topStudent = HighestScore.getKey();
                    
                }
            
        }
        System.out.println(topStudent + " har mest poäng med: " + maxScore);

        int sum = 0;

        for (int value : Points.values()){
            sum += value;
        }
        int average = sum / Points.size();
        System.out.println("\nMedelvärdet är: " + average);
     }
            

}     

            


        

        




