package cs102.GUIHangman.src;

import cs102.ConsoleHangman.src.Hangman;

import javax.swing.*;
import java.awt.*;

public class GallowsHangmanView extends JPanel implements IHangmanView {

    HangmanModel hangmanModel;

    public GallowsHangmanView(HangmanModel hm){
        this.hangmanModel = hm;
        this.setBackground(Color.yellow);
        this.setPreferredSize(new Dimension(400,400));
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        g.drawLine(50, 250, 150, 250);
        g.drawLine(100, 250, 100, 50);
        g.drawLine(150, 50, 150, 70);
        g.drawLine(100, 50, 150, 50);

        if (this.hangmanModel.getNumOfIncorrectTries() >= 1){
            g.drawOval(130,70,30,30);
        }
        if (this.hangmanModel.getNumOfIncorrectTries() >= 2){
            g.drawLine(150,110,150,90);
        }
        if (this.hangmanModel.getNumOfIncorrectTries() >= 3){
            g.drawLine(150,110,120,140);
        }
        if (this.hangmanModel.getNumOfIncorrectTries() >= 4){
            g.drawLine(150,110,180,140);
        }
        if (this.hangmanModel.getNumOfIncorrectTries() >= 5){
            g.drawLine(150,190,120,210);
        }
        if (this.hangmanModel.getNumOfIncorrectTries() >= 6){
            g.drawLine(150,190,180,210);
        }


    }

    @Override
    public void updateView(Hangman hangmanModel) {
        this.repaint();
    }

}
