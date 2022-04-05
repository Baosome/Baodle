import java.util.Locale;
import java.util.Scanner;

public class inputHandler {
    String myBaodle;
    int myTotalTries = 5;
    boolean myCompleted = false;

    public inputHandler(String theBaodle) {
        this.myBaodle = theBaodle;
        enterInput();
    }

    private void enterInput(){
        while(myTotalTries >= 0 && !myCompleted) {
            System.out.println("Enter a 5 letters word: ");
            Scanner scan = new Scanner(System.in);
            checkWord(scan.nextLine());
        }
    }

    private void checkWord(String recievedWord){
        if(recievedWord.toLowerCase(Locale.ROOT).equals(myBaodle)) {
            System.out.println("Good job! You got the word correct");
            System.out.println("You got it in " + (6 - myTotalTries) + " tries");
            myCompleted = true;
        }
    }

    private void hasWord(){

    }

    private void hasPosition(){

    }

}
