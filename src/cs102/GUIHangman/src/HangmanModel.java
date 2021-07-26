package cs102.GUIHangman.src;

import java.util.*;

import cs102.ConsoleHangman.src.BasicSetup;
import cs102.ConsoleHangman.src.Hangman;
import cs102.ConsoleHangman.src.IHangmanSetup;
import cs102.ConsoleHangman.src.IHangmanView;


// HangmanModel - extends hangman adding support for single/multiple views & controllers
// David, 2012/4/8

public class HangmanModel extends Hangman
{
	ArrayList<IHangmanView> views;
	// IHangmanView	view;

	public HangmanModel( IHangmanSetup setup)
	{
		super((BasicSetup) setup);
		views = new ArrayList<IHangmanView>();
		// view = null;
	}

	@Override
	public int tryThis( char letter)
	{
		int result = super.tryThis( letter);
		notifyViews();
		return result;
	}


	public void initNewGame()
	{
		super.initNewGame();
		notifyViews();
	}


	// **********************************************************
	// * Single View Support
	// **********************************************************
//	public void addView( IHangmanView view)
//	{
//		this.view = view;
//		notifyViews();
//	}
//
//	public void notifyViews()
//	{
//		if ( view != null)
//			view.updateView( this);
//	}


	// **********************************************************
	// * Multiple View Support
	// **********************************************************
	public void addView( IHangmanView view)
	{
		views.add( view);
		// notifyViews();
		if ( view != null)
			view.updateView( this);
	}

	public void notifyViews()
	{
		if ( views != null)
			for ( IHangmanView view : views)
				view.updateView( this);
	}

	public void removeView( IHangmanView view)
	{
		views.remove( view);
	}

} // end class HangmanModel