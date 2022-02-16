import org.w3c.dom.ls.LSOutput;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ScrabbleDriver {
    public static void main(String[] args) {
        ScrabbleHelper WordList = new ScrabbleHelper();
        System.out.println(ScrabbleHelper.getWordList().get(66349));
    }
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a word to test");
    String word = scan.nextLine();
    Boolean word = isValidWord(word);
        if () {
        String word = WordList(word);
        System.out.println(word + "is a word");
    } else {
        System.out.println(word + "is not a word");
    }
        System.out.println("Goob-bye");
}
