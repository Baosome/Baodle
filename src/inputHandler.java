import java.util.*;

public class inputHandler {
    String myBaodle;
    int myTotalTries = 5;
    boolean myCompleted = false;

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String GREEN_BACKGROUND = "\u001B[42m";
    public static final String YELLOW_BACKGROUND = "\u001B[43m";



    public inputHandler(String theBaodle) {
        this.myBaodle = theBaodle;
        System.out.println("Welcome to Baodle!");
        System.out.println("Enter a 5 letters word: ");
        enterInput();
    }

    private void enterInput(){
        while(myTotalTries >= 0 && !myCompleted) {
            Scanner scan = new Scanner(System.in);
            checkWord(scan.nextLine().toLowerCase());
            myTotalTries--;
        }
        if(myTotalTries == 0) {
            System.out.println("You have used up all 6 tries.");
        }
    }

    private void checkWord(String recievedWord){
        if(recievedWord.toLowerCase().equals(myBaodle)) {
            System.out.println("Good job! You got the word correct");
            System.out.println("You got it in " + (6 - myTotalTries) + " tries");
            myCompleted = true;
        } else {
            hasLettersOrLocations(recievedWord);
        }
    }

    private void hasLettersOrLocations(String recievedWord){
        char[] baodleArr = myBaodle.toCharArray();
        char[] recieChars = recievedWord.toCharArray();
        System.out.println("___________________________\n");

        for (int i = 0; i < baodleArr.length; i++) {
            for (int j = 0; j < recieChars.length; j++) {

                if(i == j && baodleArr[i] == recieChars[j]) { //Correct location
                    System.out.print(GREEN_BACKGROUND + baodleArr[i] + ANSI_RESET);
                } else if (baodleArr[i] == recieChars[j]) { // Correct letter
                    System.out.print(YELLOW_BACKGROUND + baodleArr[i] +ANSI_RESET);
                } else if (i == j) {
                    System.out.print("_");
                }
            }
        }
        System.out.println("\n");
    }

}
