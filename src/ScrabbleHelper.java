import javax.annotation.processing.Filer;
import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
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

    }

    public foundWord(){
        Enter Binary Search
    }

    public static String findMatches() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the word pattern: ");
        Enter Linear Searche
    }
}
