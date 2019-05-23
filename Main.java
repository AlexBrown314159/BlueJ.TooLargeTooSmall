import java.util.Scanner;
import java.util.Random;
/**
 * This code picks a random number between rangeMin and rangeMax inclusive.
 * The player must guess the number when given clues of "Large!" or "Too Small!".
 *
 * @author (Alex Brown)
 * @version (2019-05-22)
 */
public class Main
{
    private int rangeMin = 1;
    private int rangeMax = 100;
    private int actualNumber = 0;
    private int myGuess = 0;
    private int numberOfGuesses = 0;

    /**
     * Constructor for objects of class Main
     */
    public void Main()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("I'm thinking of an integer between " + rangeMin);
        System.out.println(" and " + rangeMax + " inclusive.");
        System.out.println("");
        
        // Get the number
        actualNumber = randomNumber(rangeMin, rangeMax);
        
        Boolean playOn = true;
        while (playOn) {
     
            System.out.print("Take a Guess: ");
  
            myGuess = sc.nextInt();
            numberOfGuesses++;
        
            if (myGuess < actualNumber) {
                System.out.println("Too Small!");
                System.out.println("");
            }
            else if (myGuess > actualNumber) {
                System.out.println("Too Large!");
                System.out.println("");
            }
            else {
                System.out.println("Correct!");
                System.out.println("You guessed my number in only " + numberOfGuesses + " tries!");
                System.out.println("--------------------------------------------------");
                playOn = false;
        }
    }

    }

    /**
     * Method to generate a random integer 
     * between rMin and rMax inclusive
     */
    public int randomNumber(int rMin, int rMax)
    {
        Random randMaker = new Random();
    
        int randNum = randMaker.nextInt(rMax - rMin + 1) + rMin;
      
        return randNum;
    }
    
    
    
    
    
    
    
    
    
}
