import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class BaodleMain {
    public static void main(String[] theArgs) throws Exception {
        //createWorldeFile();
        BaodlePicker baodle = new BaodlePicker();
        String myBaodleWord = baodle.getMyBaodle();

        System.out.println("The Baodle word is " + myBaodleWord);

        inputHandler myInput = new inputHandler(myBaodleWord);

    }

    public static void createWorldeFile(){
        try {
            File wordsText = new File("Words");
            Scanner scan = new Scanner(wordsText);
            List<String> sortedList = new ArrayList<> ();
            FileWriter writer = new FileWriter("WordleWords");

            while(scan.hasNextLine()) {
                sortedList.add(scan.nextLine());
            }

            Comparator<String> comp = (s1, s2) -> Integer.compare (s1.length(), s2.length());
            Collections.sort(sortedList, comp);

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
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
