package com.company;

import javax.swing.*;
import java.awt.*;

import java.io.InputStream;
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
     * Const for change word background in System Print
     * No future usage after BaodlePackage.Display class finish.
     */
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String GREEN_BACKGROUND = "\u001B[42m";
    public static final String YELLOW_BACKGROUND = "\u001B[43m";

    /**
     * Constructors
     * Run game logic functions when called.
     * Require the wordle word
     */
    public inputHandler(String theBaodle) {
        this.myBaodle = theBaodle;
    }

    /**
     * Function for receiving inputs and counts the
     *  number of tries.
     */
    public void submitInput(String input, JLabel[] myDisplay, JLabel[] theLetters) {
        if(myTotalTries >= 0 && !myCompleted) {
            if (input.length() == 5 && realWord(input.toLowerCase())) {
                checkWord(input.toLowerCase(), myDisplay, theLetters);
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
            JOptionPane.showMessageDialog(f, "You have used up all 6 tries. \nThe Correct Word was: " + myBaodle, "GAME OVER", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    /**
     * Update the display row for when key is press
     * @param input the key stroke that was entered.
     * @param myDisplay The display where they key are appearing on
     */
    public void pressedInput(String input, JLabel[] myDisplay){
        char[] inputArray = input.toCharArray();
        for(int i = 0; i < input.length(); i ++) {
            myDisplay[i].setText(String.valueOf(inputArray[i]));
        }
    }

    /**
     * Function for checking the received words
     *  End the game if words is correct else checks it.
     * @param receivedWord Require the received word, user input
     */
    private void checkWord(String receivedWord, JLabel[] theDisplay, JLabel[] theLetters){
        if(receivedWord.toLowerCase().equals(myBaodle)) { // if correct word
            int count = 0;
            for(char c: receivedWord.toCharArray()) {
                displayOnLetterDisplay(theDisplay[count],theLetters, "Green", Character.toString(c));
                count++;
            }
            JFrame f = new JFrame();
            JOptionPane.showMessageDialog(f, "GOOD JOB! You answered correctly", "YAY!", JOptionPane.INFORMATION_MESSAGE);

            System.out.println("Good job! You got the word correct");
            System.out.println("You got it in " + (6 - myTotalTries) + " tries");
            myCompleted = true;
        } else { // else run game logic
            hasLettersOrLocations(receivedWord, theDisplay, theLetters);
            System.out.println("You have " + myTotalTries + " total tries left!");
        }
    }

    /**
     * Function for checking the received words
     *  Check for letter locations and has
     *  and prints if true.
     * @param receivedWord Require the received word, user input
     */
    private void hasLettersOrLocations(String receivedWord, JLabel[] theDisplay, JLabel[] theLetters){
        char[] baodleArr = myBaodle.toCharArray();
        char[] recieChars = receivedWord.toCharArray();
        System.out.println("___________________________\n");

        for (int i = 0; i < recieChars.length; i++) {
            for (int j = 0; j < baodleArr.length; j++) {
                if(i == j && recieChars[i] == baodleArr[j]) { //Correct location
                    System.out.print(GREEN_BACKGROUND + recieChars[i] + ANSI_RESET);
                    displayOnLetterDisplay(theDisplay[i], theLetters, "Green", receivedWord.substring(i,i+1));
                    break;
                } else if (recieChars[i] == baodleArr[j]) { // Correct letter
                    System.out.print(YELLOW_BACKGROUND + recieChars[i] +ANSI_RESET);
                    displayOnLetterDisplay(theDisplay[i], theLetters, "Yellow", receivedWord.substring(i,i+1));
                    break;
                } else if (j == 4){
                    System.out.print(recieChars[i]);
                    displayOnLetterDisplay(theDisplay[i],theLetters, "", receivedWord.substring(i,i+1));
                }
            }
        }
        System.out.println("\n");
    }

    private void displayOnLetterDisplay(JLabel theDisplay, JLabel[] theLetters, String theColor, String theLetter){
        if (theColor.equals("Green")) {
            theDisplay.setBackground(new Color(3, 255, 33));
            theDisplay.setText(theLetter.toUpperCase());
            theLetters[theLetter.charAt(0)-97].setBackground(new Color(3, 255, 33));
        } else if (theColor.equals("Yellow")) {
            theDisplay.setBackground(new Color(241, 210, 8));
            theDisplay.setText(theLetter.toUpperCase());
            theLetters[theLetter.charAt(0)-97].setBackground(new Color(241, 210, 8));
        } else {
            theDisplay.setBackground(new Color(76, 76, 76));
            theDisplay.setText(theLetter.toUpperCase());
            theLetters[theLetter.charAt(0)-97].setBackground(new Color(76, 76, 76));
        }
    }

    private boolean realWord(String receivedWords) {
        final InputStream myBaodleTextFile = getClass().getResourceAsStream("/WordleWords");
        assert myBaodleTextFile != null;
        Scanner scan = new Scanner(myBaodleTextFile);
        while (scan.hasNext()) {
            if (scan.nextLine().equals(receivedWords)) {
                scan.close();
                return true;
            }
        }
        scan.close();
        return false;
    }

}
