//Summary of what to do
//1. Scan text and send it to another class that counts the amount of lines and characters.
//2. Until the word stop is written.
//3. Every word written on the same line as "stop" are not to be counted.
//4. The control to see if the word stop is written should preferably be in the second class.
//5. At least 3 different JUnit testcases shall be written.
//6. The tests must test different parts of the program.

//Bonus
//7. Counting each words and writing the amount of words excluding spaces.
//8. Writing the longest word
//9. The stop-word must be in the second class.

package introductionToProgramming;

import java.util.Scanner;

public class WordCounterMain {

    static WordCounter wC = new WordCounter();

    public static void main(String[] args) {

        System.out.println("Input any word/words, quit program by typing the word \"stop\"");

        Scanner scan = new Scanner(System.in);

        String text = "";

        while (!wC.getBoolean(text)) {
            text = scan.nextLine();
            wC.setUserInput(text);
            if (!wC.getBoolean(text)) {
                wC.setLines();
                wC.setCharacterCount();
                wC.setLongestWord();
                wC.setNumberOfWords();
            }
        }

        System.out.println("Antalet tecken: " + wC.getCharacterCount());
        System.out.println("Antalet rader: " + wC.getLines());
        System.out.println("Längsta skrivna ordet är: " + wC.getLongestWord());
        System.out.println("Antal skrivna ord: " + wC.getNumberOfWords());
    }
}