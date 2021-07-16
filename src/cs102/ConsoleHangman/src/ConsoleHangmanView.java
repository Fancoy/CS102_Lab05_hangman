package cs102.ConsoleHangman.src;

import cs102.*;

public class ConsoleHangmanView implements IHangmanView{

    public ConsoleHangmanView(){
    }


    public void updateView(Hangman hangman) {
        System.out.println("All letters = " + hangman.getAllLetters());
        System.out.println("Known so far = " + hangman.getKnownSoFar());
        System.out.println("Used letters = " + hangman.getUsedLetters());
        System.out.println("Number of incorrect tries = " + hangman.getNumOfIncorrectTries());
        System.out.println("Maximum allowed incorrect tries = " + hangman.getMaxAllowedIncorrectTries());
        System.out.println("Has lost? = " + hangman.hasLost());
        System.out.println("Is game over? = " + hangman.isGameOver());


    }
}
