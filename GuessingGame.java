package congnizant;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    
    public static void Random_Number_Generator() {
        Random rand = new Random();
        int num = rand.nextInt(10) + 1; 
        Scanner sc = new Scanner(System.in);
        
        int user;
        boolean guessedCorrectly = false;
        
        while (!guessedCorrectly) {
            System.out.println("Enter a number between 1 and 10: ");
            user = sc.nextInt();
            if (user == num) {
                System.out.println("Congratulations! You guessed it: " + num);
                guessedCorrectly = true;
            } else if (user > num) {
                System.out.println("Too High! Try Again.");
            } else {
                System.out.println("Too Low! Try Again.");
            }
        }
        
        sc.close();  // Closing the scanner after use
    }
    
    public static void main(String[] args) {
        Random_Number_Generator();
    }
}
