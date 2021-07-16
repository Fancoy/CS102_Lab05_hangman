package cs102.ConsoleHangman.src;


public interface IHangman {
    int getMaxAllowedIncorrectTries();
    char getBlankChar();
    String getCharsToPreserve();
    String getAllLetters();
    String chooseSecretWord();

}
