import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * Input class
 * Handle user inputs
 */
public class inputHandler {
    /**
     * The picked word.
     */
    String myBaodle;

    /**
     * Total tries to guess the word
     */
    int myTotalTries = 5;

    /**
     * If game is complete logic boolean
     */
    boolean myCompleted = false;

    /**
     * The list of words file, WordleWords
     */
    private File myBaodleTextFile = new File("WordleWords");

    /**
     * Const for change word background in System Print
     * No future usage after Display class finish.
     */
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String GREEN_BACKGROUND = "\u001B[42m";
    public static final String YELLOW_BACKGROUND = "\u001B[43m";

    /**
     * Constructors
     * Run game logic functions when called.
     * Require the wordle word
     */
    public inputHandler(String theBaodle) throws FileNotFoundException {
        this.myBaodle = theBaodle;
    }

    /**
     * Function for receiving inputs and counts the
     *  number of tries.
     */
    public void enterInput(String input) throws FileNotFoundException {
        if(myTotalTries >= 0 && !myCompleted) {
            if (input.length() == 5 && realWord(input.toLowerCase())) {
                checkWord(input.toLowerCase());
                myTotalTries--;
            } else {
                System.out.println("Please enter a real word with 5 letters");
                JFrame f = new JFrame();
                JOptionPane.showMessageDialog(f, "Please enter a real word with 5 letters", "Error", JOptionPane.WARNING_MESSAGE);
            }
        }
        if(myTotalTries < 0) {
            System.out.println("You have used up all 6 tries.");
            JFrame f = new JFrame();
            JOptionPane.showMessageDialog(f, "You have used up all 6 tries.", "GAME OVER", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    /**
     * Function for checking the received words
     *  End the game if words is correct else checks it.
     * @param receivedWord Require the received word, user input
     */
    private void checkWord(String receivedWord){
        if(receivedWord.toLowerCase().equals(myBaodle)) { // if correct word
            System.out.println("Good job! You got the word correct");
            System.out.println("You got it in " + (6 - myTotalTries) + " tries");
            myCompleted = true;
        } else { // else run game logic
            hasLettersOrLocations(receivedWord);
            System.out.println("You have " + myTotalTries + " total tries left!");
        }
    }

    /**
     * Function for checking the received words
     *  Check for letter locations and has
     *  and prints if true.
     * @param receivedWord Require the received word, user input
     */
    private void hasLettersOrLocations(String receivedWord){
        char[] baodleArr = myBaodle.toCharArray();
        char[] recieChars = receivedWord.toCharArray();
        System.out.println("___________________________\n");

        for (int i = 0; i < recieChars.length; i++) {
            for (int j = 0; j < baodleArr.length; j++) {
                if(i == j && recieChars[i] == baodleArr[j]) { //Correct location
                    System.out.print(GREEN_BACKGROUND + recieChars[i] + ANSI_RESET);
                    break;
                } else if (recieChars[i] == baodleArr[j]) { // Correct letter
                    System.out.print(YELLOW_BACKGROUND + recieChars[i] +ANSI_RESET);
                    break;
                } else if (j == 4){
                    System.out.print(recieChars[i]);
                }
            }
        }
        System.out.println("\n");
    }

    private boolean realWord(String receviedWords) throws FileNotFoundException {
        Scanner scan = new Scanner(myBaodleTextFile);
        while (scan.hasNext()) {
            if (scan.nextLine().equals(receviedWords)) {
                return true;
            }
        }
        return false;
    }

}
