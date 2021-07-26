package cs102.GUIHangman.src;

import cs102.ConsoleHangman.src.Hangman;

import javax.swing.*;
import java.awt.*;

public class LabelsHangmanView extends JPanel implements IHangmanView {

    JLabel numOfIncorrectTries;
    JLabel usedLetters;
    JLabel knownSoFar;

    public LabelsHangmanView(){
        this.setPreferredSize(new Dimension(800,800));
        this.setBackground(Color.RED);
        this.numOfIncorrectTries = new JLabel("");
        this.add(this.numOfIncorrectTries);
        this.usedLetters = new JLabel("");
        this.add(this.usedLetters);
        this.knownSoFar = new JLabel("");
        this.add(this.knownSoFar);

    }


    @Override
    public void updateView(Hangman hangmanModel) {
        if(hangmanModel.isGameOver()){
            if(hangmanModel.hasLost()){
                this.numOfIncorrectTries.setText("Incorrect tries = " + hangmanModel.getNumOfIncorrectTries());
                this.usedLetters.setText("Used letters = " + hangmanModel.getUsedLetters());
                this.knownSoFar.setText("You lost the game");
                this.setBackground(Color.GREEN);
            }
            else{
                this.numOfIncorrectTries.setText("Incorrect tries = " + hangmanModel.getNumOfIncorrectTries());
                this.usedLetters.setText("Used letters = " + hangmanModel.getUsedLetters());
                this.knownSoFar.setText("You won the game");
                this.setBackground(Color.GREEN);

            }
        }
        else{
            this.setBackground(Color.YELLOW);
            this.knownSoFar.setText(hangmanModel.getKnownSoFar());
            this.numOfIncorrectTries.setText("Incorrect tries = " + hangmanModel.getNumOfIncorrectTries());
            this.usedLetters.setText("Used letters = " + hangmanModel.getUsedLetters());
            this.repaint();

        }

    }
}
