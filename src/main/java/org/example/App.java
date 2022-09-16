package org.example;

import java.util.Random;
import java.util.Scanner;

public class App
{
    static int tries = 3;
    public String checkAnswer(int answer, int userInput) {

        if (userInput > answer) {
            return "Your answer is too big.";
        } else if (userInput < answer) {
            return "Your answer is too small.";
        } else {
            tries = -1;
            return "Your answer is correct!";
        }

    }

    public String checkTries(int tries, int answer) {

        String message = new String();

        if (tries >= 0) {
            message = "You have " + tries;
        }

        if (tries > 1) {
            message += " more tries.";
        } else if (tries == 1) {
            message += " more try.";
        } else if (tries == 0){
            message += " tries left.";
        }

        if (tries == 0) {
            message += "\nThe correct answer is " + answer;
        }

        return message;
    }


    public static void main(String[] args) {
        System.out.println("Hello! Welcome to our number guessing game! \nYou have 3 guesses in this game.");

        App numberGuessingGame = new App();
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int answer = 5;
        //int answer = random.nextInt(10) ;


        while (tries > 0) {
            System.out.println("\nPlease input an integer between 1-10:");
            int userInput = input.nextInt();
            tries -= 1;

            System.out.println(numberGuessingGame.checkAnswer(answer, userInput));
            System.out.println(numberGuessingGame.checkTries(tries, answer));


        }

        input.close();

    }
}
