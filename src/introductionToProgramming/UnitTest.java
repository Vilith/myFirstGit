package introductionToProgramming;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class UnitTest {


    @Test

    public void testUserInput() {

        WordCounter myWord = new WordCounter();

        myWord.setUserInput("Några ord i en mening");


        String actual = myWord.getUserInput();
        String expected = "Några ord i en mening";

        assertEquals(expected, actual);

    }

    @Test

    public void testCountLines() {

        WordCounter myWord = new WordCounter();

        myWord.setUserInput("Hej och hå");
        myWord.setLines();
        myWord.setUserInput("gardinen den var blå");
        myWord.setLines();
        myWord.setUserInput("Krakel spektakel vad tänker du på");
        myWord.setLines();


        int actual = myWord.getLines();
        int expected = 3;

        assertEquals(expected, actual);

    }

    @Test

    public void testCountCharacters() {

        WordCounter myWord = new WordCounter();

        myWord.setUserInput("Hejsan svejsan!");
        myWord.setCharacterCount();

        int actual = myWord.getCharacterCount();
        int expected = 15;

        assertEquals(expected, actual);

    }

    @Test

    public void testLongestWord() {

        WordCounter myWord = new WordCounter();

        myWord.setUserInput("Lite kebabsås är gott");
        myWord.setLongestWord();
        myWord.setUserInput("Men kebabtallrik är godare");
        myWord.setLongestWord();
        myWord.setUserInput("Lite pommes måste man ju ha till också");
        myWord.setLongestWord();

        String actual = myWord.getLongestWord();
        String expected = "kebabtallrik";

        assertEquals(expected, actual);

    }

    @Test

    public void testWordCount() {

        WordCounter myWord = new WordCounter();

        myWord.setUserInput("Fem ord i en följd");
        myWord.setNumberOfWords();
        myWord.setUserInput("Fem ord på en rad");
        myWord.setNumberOfWords();
        myWord.setUserInput("Fem är en siffra mannen");
        myWord.setNumberOfWords();

        int actual = myWord.getNumberOfWords();
        int expected = 15;

        assertEquals(expected, actual);

    }


    @Test

    public void testBooleanTrue() {

        WordCounter myWord = new WordCounter();

        myWord.setUserInput("Några ord i en mening stop");
        myWord.setLines();


        boolean actual = myWord.getBoolean(myWord.getUserInput());
        boolean expected = true;

        assertEquals(expected, actual);

    }

    @Test

    public void testBooleanFalse() {

        WordCounter myWord = new WordCounter();

        myWord.setUserInput("Några ord i en mening");
        myWord.setLines();


        boolean actual = myWord.getBoolean(myWord.getUserInput());
        boolean expected = false;

        assertEquals(expected, actual);

    }
}
