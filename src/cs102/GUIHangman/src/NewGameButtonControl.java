package cs102.GUIHangman.src;

import cs102.ConsoleHangman.src.Hangman;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewGameButtonControl extends JButton implements IHangmanView {

    public Hangman hM;

    public NewGameButtonControl(Hangman hangman){
        super("New Game");
        this.hM = hangman;
        this.addActionListener(new myActionListener());
        this.setEnabled(false);
        this.setBackground(Color.BLACK);

    }
    class myActionListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            hM.initNewGame();
            setEnabled(false);

        }

    }

    @Override
    public void updateView(Hangman hangmanModel) {

        if(hangmanModel.isGameOver()){
            this.setEnabled(true);
        }
    }
}
