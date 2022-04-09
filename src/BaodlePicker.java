import java.io.File;
import java.io.RandomAccessFile;

/**
 * Picker class.
 * It pick a word from list of words (WordleWords)
 */
public class BaodlePicker {
    /**
     * The list of words file, WordleWords
     */
    private final File myBaodleTextFile = new File("WordleWords");

    /**
     * The picked word
     */
    public String myBaodle;

    /**
     * Constructor
     * @throws Exception if no file is found
     */
    public BaodlePicker() throws Exception {
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
     * @throws Exception if no file is found
     */
    private void pickAWord() throws Exception {
        final RandomAccessFile f = new RandomAccessFile(myBaodleTextFile, "r");
        final long randomLocation = (long) (Math.random() * f.length());
        f.seek(randomLocation);
        f.readLine();
        myBaodle = f.readLine();
        f.close();
    }

}
