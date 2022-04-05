import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

public class BaodlePicker {
    private File myBaodleTextFile = new File("WordleWords");
    public String myBaodle;

    public BaodlePicker() throws Exception {
        pickAWord();
    }

    public String getMyBaodle(){
        return myBaodle;
    }

    private void pickAWord() throws Exception {
        final RandomAccessFile f = new RandomAccessFile(myBaodleTextFile, "r");
        final long randomLocation = (long) (Math.random() * f.length());
        f.seek(randomLocation);
        f.readLine();
        myBaodle = f.readLine();
        f.close();
    }

}
