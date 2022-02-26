import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ScrabbleHelper {
    private ArrayList<String> wordList = new ArrayList<>();

    public ScrabbleHelper() throws FileNotFoundException {
        File file = new File("enable.txt");
        Scanner scan = new Scanner(file);

        while (scan.hasNextLine())
            System.out.println(scan.nextLine());
    }

    public ArrayList getWordList() {
        return wordList;
    }

    public void foundWord(String[] word){

    }

    public static String findMatches() {


    }
}
