package cs102.ConsoleHangman.src;



public class Hangman {

    String charsToPreserve;
    char blankChar;
    StringBuffer secretWord;
    StringBuffer allLetters;
    StringBuffer usedLetters;
    StringBuffer knownSoFar;
    int numberOfIncorrectTries;
    int maxAllowedIncorrectTries;
    BasicSetup basicSetup;


    public Hangman(BasicSetup basicSetup) {
        this.basicSetup = basicSetup;
        this.initNewGame();

    }
// Methods
    public void initNewGame(){
        this.maxAllowedIncorrectTries = this.basicSetup.getMaxAllowedIncorrectTries();
        this.blankChar = this.basicSetup.getBlankChar();
        this.charsToPreserve = this.basicSetup.getCharsToPreserve();
        this.allLetters = new StringBuffer(this.basicSetup.getAllLetters());
        this.secretWord = new StringBuffer(this.basicSetup.chooseSecretWord());
        this.knownSoFar = new StringBuffer();
        this.usedLetters = new StringBuffer();


        for (int i = 0; i < secretWord.length(); ++i){
            if (this.charsToPreserve.indexOf(this.secretWord.charAt(i)) >= 0){
                this.knownSoFar.append(this.secretWord.charAt(i));
            }
            else{
                this.knownSoFar.append(this.blankChar);

            }
        }
        this.numberOfIncorrectTries = 0;

    }
    /**
     * This method returns all letters of the English alphabet.
     * @return allLetters
     */
    public String getAllLetters(){
        return allLetters.toString();
    }

    /**
     * This method returns the used letters.
     * @return usedLetters
     */
    public String getUsedLetters(){
        return usedLetters.toString();
    }

    /**
     * This method returns the revealed letters so far.
     * @return  knownSoFar
     */
    public String getKnownSoFar(){
        return knownSoFar.toString();
    }

    /**
     * This method returns number of incorrect tries.
     * @return numberOfIncorrectTries
     */
    public int getNumOfIncorrectTries(){
        return numberOfIncorrectTries;
    }

    /**
     * This method returns the maximum allowed incorrect tries.
     * @return maxAllowedIncorrectTries
     */
    public int getMaxAllowedIncorrectTries(){
        return maxAllowedIncorrectTries;
    }

    /**
     * This method returns a boolean value whether the game has ended or not due to winning or losing the game.
     * @return true if the game is over false if not
     */
    public boolean isGameOver(){
        if( hasLost() || knownSoFar.toString().equals(secretWord.toString())) {
            return true;
        }
        return false;
    }

    /**
     * This method returns a boolean value whether the user has lost the game or not.
     * @return boolean value of if the user lost the game
     */
    public boolean hasLost(){
        if ( getMaxAllowedIncorrectTries() == numberOfIncorrectTries ){
            return true;
        }
        else {
            return false;
        }
    }

    public int tryThis(char a){
        int counter = 0;
        int incorrect = 0;
        for( int i = 0; i < secretWord.length(); i++){
            if( a == secretWord.charAt(i)){
                counter = counter + 1;
                knownSoFar.replace(i, i + 1, String.valueOf(a));
            }
        }
        if( counter == 0){
            incorrect = incorrect + 1;
        }
        usedLetters.append(a);
        return counter;
    }


}





