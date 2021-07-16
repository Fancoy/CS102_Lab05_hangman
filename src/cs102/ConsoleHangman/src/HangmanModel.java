package cs102.ConsoleHangman.src;

import java.util.ArrayList;
import java.util.Iterator;

public class HangmanModel extends Hangman {
    ArrayList<IHangmanView> view = new ArrayList();

    public HangmanModel(BasicSetup basicSetup){
        super(basicSetup);

    }
    public int tryThis(char a){
        int result = super.tryThis(a);
        this.update();
        return result;

    }
    public void initNewGame(){
        super.initNewGame();
        this.update();
    }
    public void addView(IHangmanView iHangmanView){
        this.view.add(iHangmanView);
        iHangmanView.updateView(this);

    }
    public void update(){
        if(this.view != null){

            Iterator it1 = this.view.iterator();


            while (it1.hasNext()){
                IHangmanView iHangmanView = (IHangmanView)it1.next();
                iHangmanView.updateView(this);
            }
        }

    }
}
