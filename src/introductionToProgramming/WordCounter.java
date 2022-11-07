package introductionToProgramming;

public class WordCounter {

    //Attribut
    private int lines;
    private int characters;
    private int numberOfWords = 0;
    private String longestWord = "";
    private String userInput;

    private boolean counter = false;

    //Methods to return attributes

    public boolean getBoolean(String text) {
        if (text.equalsIgnoreCase("stop")) {
            counter = true;
        }
        if (text.toLowerCase().contains(" stop")) {
            counter = true;
        }
        if (text.toLowerCase().contains(" stop ")) {
            counter = true;
        }
        if (text.toLowerCase().contains("stop ")) {
            counter = true;
        }
        return counter;
    }

    //Setter and getter for user input
    public void setUserInput(String text) {
        userInput = text;
    }
    public String getUserInput() {
        return userInput;
    }

    //Setter and getter for the longest word
    public void setLongestWord() {
        for (String word : userInput.split(" "))
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
    }
    public String getLongestWord() {
        return longestWord;
    }

    //Setter and getter for counting characters
    public void setCharacterCount() {
        characters += userInput.length();
    }
    public int getCharacterCount() {
        return characters;
    }

    //Setter and getter for counting lines
    public void setLines() {
        lines++;
    }
    public int getLines() {
        return lines;
    }

    //Setter and getter for number of words
    public void setNumberOfWords() {
        for (int i = 0; i < (userInput.length()); i++) {
            if (((i > 0) && (userInput.charAt(i) != ' ') && (userInput.charAt(i - 1) == ' ')) || ((userInput.charAt(i) != ' ') && (i == 0))) {
                numberOfWords++;
            }
        }
    }
    public int getNumberOfWords() {
        return numberOfWords;
    }
}