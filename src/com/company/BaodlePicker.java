package com.company;

import java.io.InputStream;
import java.util.Random;
import java.util.Scanner;

/**
 * Picker class.
 * It pick a word from list of words (WordleWords)
 */
public class BaodlePicker {
    /**
     * The list of words file, WordleWords
     */
    private InputStream myBaodleTextFile = getClass().getResourceAsStream("/WordleWords");

    /**
     * The picked word
     */
    public String myBaodle;

    /**
     * Constructor
     */
    public BaodlePicker() {
        pickAWord();
    }

    /**
     * Grab the picked word
     * @return myBaodle
     */
    public String getMyBaodle(){
        return myBaodle;
    }

    /**
     * Pick a word function,
     * Choose a random word from the word list.
     */
    private void pickAWord() {

//        final RandomAccessFile f = new RandomAccessFile(String.valueOf(myBaodleTextFile) , "r");
//        final long randomLocation = (long) (Math.random() * f.length());
//        f.seek(randomLocation);
//        f.readLine();
//        myBaodle = f.readLine();
//        f.close();

        Scanner scan = new Scanner(myBaodleTextFile);
        Random r = new Random();
        int low = 1;
        int high = 3088;
        int result = r.nextInt(high-low);

        int count = 0;
        while (count != result) {
            scan.nextLine();
            count++;
        }
        myBaodle = scan.nextLine();
        scan.close();
    }

}
