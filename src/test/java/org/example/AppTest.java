package org.example;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    static App numberGuessingGame = new App();
    static int answer = 5;
    @Test
    void compareUserInputToAnswer() {


        assertEquals("Your answer is too", numberGuessingGame.checkAnswer(answer, 3));
        assertEquals("Your answer is too big.", numberGuessingGame.checkAnswer(answer, 7));
        assertEquals("Your answer is correct!", numberGuessingGame.checkAnswer(answer, 5));

        System.out.println("Congratulations, all your comparisons work!");
    }

    @Test
    void checkCheckTries(){
        assertEquals("You have 2 more tries.", numberGuessingGame.checkTries(2, answer));
        assertEquals("You have 1 more try.", numberGuessingGame.checkTries(1, answer));
        assertEquals("You have 0 tries left.\nThe correct answer is " + answer, numberGuessingGame.checkTries(0, answer));
        //assertEquals("The correct answer is " + answer, numberGuessingGame.checkTries(0, answer));

        System.out.println("Congratulations, your checkTries() method works!");
    }




}
