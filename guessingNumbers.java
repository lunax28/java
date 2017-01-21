
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        
        // program your solution here. Do not touch the above lines!
        System.out.println("Guess a number: ");
        int guesses = 1;
        //int num = Integer.parseInt(reader.nextLine());
        while(true){
        
        int num = Integer.parseInt(reader.nextLine());
        if (num == numberDrawn) {
            System.out.println("Congratulations, your guess is correct!");
            break;
        } else if (num < numberDrawn) {
            System.out.println("The number is greater, guesses made: " + guesses);
        } else if (num > numberDrawn) {
            System.out.println("The number is lesser, guesses made: " + guesses);
        }
        guesses++;
    }
        //System.out.println("Congratulations, your guess is correct!");

        

    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
