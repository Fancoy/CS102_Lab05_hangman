package cs102.GUIHangman.src;

import cs102.ConsoleHangman.src.BasicSetup;
import cs102.ConsoleHangman.src.IHangmanSetup;

import javax.swing.*;

/**
 * GUIHangman - GUI based MVC test for cs102 Hangman & IHangmanSetup
 *
 * @author David
 * @version 1.00 2013/4/7
 */

public class GUIHangman
{


	public GUIHangman()
	{
    	System.out.println( "Start of GUIHangman\n");

		HangmanModel		hangman;
		IHangmanSetup basicSetup;
		ConsoleHangmanView	consoleView;

		basicSetup = new BasicSetup();
		hangman = new HangmanModel( basicSetup);

		consoleView = new ConsoleHangmanView();
		hangman.addView( consoleView);

		LabelsHangmanView  a = new LabelsHangmanView();
		hangman.addView((cs102.ConsoleHangman.src.IHangmanView) a);

		new SimpleJFrame( "GUIHangman", new GallowsHangmanView(hangman),new TextFieldControlPanel(hangman), new NewGameButtonControl(hangman),		// north, south
							new LetterButtonControls("Ricardo",13,2), a );


		ConsoleControl.controlFor( hangman);
	}

	public static void main( String[] args)
	{
		new GUIHangman();

//		// This is the approved way to initialise GUIs
//		// but won't work with the ConsoleControl as is!
//		// --------------------------------------------
//		SwingUtilities.invokeLater(
//		new Runnable() {
//			    public void run() {
//	        		new GUIHangman();
//	        		new GUIHangman();
//	    		}
//			});
	}

} // end of class GUIHangman
