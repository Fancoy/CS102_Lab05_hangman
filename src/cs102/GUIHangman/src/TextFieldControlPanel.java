package cs102.GUIHangman.src;

import cs102.ConsoleHangman.src.Hangman;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TextFieldControlPanel extends JPanel {
    Hangman hM;
    JTextField textField;

    public TextFieldControlPanel(Hangman hangman){
        this.hM = hangman;
        this.textField = new JTextField(20);
        this.textField.addActionListener(new MyActionListener());
        this.add(this.textField);


    }
    class MyActionListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            String str;
            str = textField.getText();
            for (int i = 0; i < str.length(); i++){
                hM.tryThis(str.charAt(i));
            }
            textField.setText("");
        }
    }
}

