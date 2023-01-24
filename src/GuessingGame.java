package src;
import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args){

        System.out.println("Hello, what is your name?");
        System.out.println("(enter your name)");

        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        System.out.println(name + ", can you guess the number I'm thinking of? It's between 1 and 100");

        Random rand = new Random();
        int number = rand.nextInt(100);

        boolean guessing = true;
        int tries = 0;

        while (guessing) {
            int guess;
            try {
                guess = input.nextInt();
            } catch (Exception e) {
                String badInput = input.next();
                System.out.println("You must guess a number.");
                continue;
            }
            if (guess < 1 || guess > 100) {
                System.out.println("You must guess a number between 1 and 100.");
            } else if (guess == number) {
                System.out.println("That is correct, " + name + "!\nYou guessed the correct number in " + tries + " tries.");
                guessing = false;
            } else if (guess > number) {
                System.out.println("Your guess is too high. Try again!");
                tries++;
            } else if (guess < number) {
                System.out.println("Your guess is too low. Try again!");
                tries++;
            }
        }
    }
}
