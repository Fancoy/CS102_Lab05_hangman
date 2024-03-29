package cs102.GUIHangman.src;
import cs102.ConsoleHangman.src.Hangman;

/**
 * IHangmanView - view interface for MVC demo using Hangman
 *
 * @author David
 * @version 1.00 2012/4/4
 */
public interface IHangmanView
{

	void updateView( Hangman hangmanModel);
}