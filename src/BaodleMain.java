import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * Main called
 */
public class BaodleMain {
    public static void main(String[] theArgs) {
//        createWorldeFile();
        System.out.println("Test");
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new Display().setVisible(true);
            } catch(Exception e) {
                e.printStackTrace();
            }
        });
    }

    /**
     * Use large (size) words file and sorted them by word length and
     * then copy them into wordle file for usage.
     */
    public static void createWorldeFile(){
        try {
            File wordsText = new File("Words");
            Scanner scan = new Scanner(wordsText);
            List<String> sortedList = new ArrayList<> ();
            FileWriter writer = new FileWriter("WordleWords");

            while(scan.hasNextLine()) {
                sortedList.add(scan.nextLine());
            }

            Comparator<String> comp = Comparator.comparingInt(String::length);
            sortedList.sort(comp);

            for(String s : sortedList){
                if (s.length() == 5) {
                    Pattern pattern = Pattern.compile("[^a-zA-Z0-9]");
                    Matcher matcher = pattern.matcher(s);
                    if (!matcher.find()) {
                        writer.write(s.toLowerCase(Locale.ROOT));
                        writer.write("\n");
                    }
                }
            }

            writer.close();
            scan.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
