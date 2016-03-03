import java.util.Scanner;
import java.util.Arrays;
public class GradingQuizzes
{
    public static void main() {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many Questions are there:");
        int incorrect = 0;
        int correct = 0;
        int numofq = scan.nextInt();
        String keepGoing = "y";
        
        int[] key = new int [numofq];
        int[] quiz = new int [numofq];
        System.out.println("Enter the key");
        for(int i = 0; i<numofq; i++){
            key[i]=scan.nextInt();
        }
        while(keepGoing.equals("y") || keepGoing.equals("Y")){
            System.out.println("Enter the answer");
            for(int c = 0; c<numofq; c++){
                quiz[c]=scan.nextInt();
            }
            for(int i=0; i<numofq; i++)
            {
             if(key[i] == quiz[i])
             {
                 correct+=1;
             }else{
                 incorrect+=1;           
                }
             }
            double percCorrect = ((double) correct / numofq)*100;
            System.out.println("You got "+correct+" correct");
            System.out.println("You scored a "+percCorrect+"%!");
            System.out.println("Do you wanna grade more quizes");
            keepGoing = scan.next();

        }
    }
}
