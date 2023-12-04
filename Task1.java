import java.util.Random ;
import java.util.Scanner;


public class Task1 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
           Random random = new Random();
           

           int MinRange=1;
           int MaxRange=100;
           int MaxAttempt=5;
           int Score =0;

           System.out.println("Welcome to play the Guessing game!");
          System.out.println("You have a total of "+ MaxAttempt +"Attempts");
             
           boolean playAgain =true;

           while(playAgain){
             int randomNum = random.nextInt(MaxRange-MinRange +1)+MinRange;
             System.out.println("Guess a number between "+MinRange+" and " + MaxRange+" ?");

             for(int Attempts=1;Attempts<=MaxAttempt;Attempts++){
                System.out.println("Attempt"+ Attempts +":");
                int guess= scan.nextInt();

                if(guess==randomNum){
                    System.out.println("congradulations! you guessed right .");
                    Score++;
                    break;

                }
                else if(guess<randomNum){
                    System.out.println("Too low Play Again");
                }else{
                    System.out.println("Too high play again ");
                }
                    if(Attempts==MaxAttempt){
                        System.out.println("You have reached the maximum number of attempts .The Correct number is" + randomNum + ".");
                        System.out.println("Game Over!");
                    }
             }
               System.out.println("Do you want to play again?(yes/no) :");
               String answerInput = scan.next();

               if(!answerInput.equalsIgnoreCase("yes")){
                playAgain = false; 
               }

           }
                System.out.println("your Score=" +Score);
                scan.close();

    }
}
