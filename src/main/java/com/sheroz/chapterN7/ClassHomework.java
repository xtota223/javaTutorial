package com.sheroz.chapterN7;
import java.util.Scanner;
public class ClassHomework {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the game");
        do {
            playARound(1, getRandomNumber(1, 6));
        } while (askForAnotherRound("try again?"));
        System.out.println("the end");
    }

    public static void playARound(int min,int max){

        int number, guess;
        number =getRandomNumber(min, max);

        System.out.println("I'am thinking of a number " + "between " + min + " and " + max + ".");
        System.out.print("what do you think it is ");
        guess = getGuess(min, max);

        if (guess == number)
            System.out.println("correct");
        else
            System.out.println("wrong");
    }

    public static int getRandomNumber(int min, int max) {
        return (int) (Math.random() * (max - min + 1)+min );
    }

    public static int getGuess(int min, int max) {
        while (true) {
            int guess = sc.nextInt();
            if ((guess < min) || (guess > max))
                System.out.println("Wrong range of number, it should be between " + min + " and " + max);
            else
                return guess;
        }
    }

    public static boolean askForAnotherRound(String prompt) {
        while (true) {
            System.out.println("do you want to play again? press (Y or N)");
            String answer = sc.next();
            if (answer.equalsIgnoreCase("Y"))
                return true;
            else if (answer.equalsIgnoreCase("N"))
                return false;
        }

    }
}
