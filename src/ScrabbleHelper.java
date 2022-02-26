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

    public void foundWord(String[] elements, String word) {
        int left = 0;
        int right = elements.length - 1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (word.compareTo(elements[middle]) < 0) {
            }
            return true;
        }
        else if (word.compareTo(elements[middle]) > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void findMatches(String[] elements, String pattern) {
        for (int j = 0; j < elements.length; j++) {
            if (elements[j].equals(pattern)) {
                return j;
            }
        }
    }
}

