import java.util.Random;
import java.util.Scanner;

public class WordGuess {

    /**
     * This method will return the number of occurrences of a character in a word
     * @param c
     * @param word
     * @return
     */
    public static int countOccurence(char c, char[] word) {
        int counter=0;
        for(int i=0;i<word.length;i++){
            if(word[i]==c)
                counter++;
        }
        return counter;

    }

    public static void main(String[] args) {
        String dictionary = "snail,owl,rice,export,transition,magnetic,baseball,integration";
        String[] array = dictionary.split(",");
        Random rand = new Random();
        int index = rand.nextInt(array.length);
        String randomWord = array[index];
        char[] word = new char[44];

        word = randomWord.toCharArray();

        System.out.println(word);
        String guessedWord = "";

        int tries=0, well=0;

        for (int i = 0; i<word.length; i++) {
            guessedWord += "_";
        }

        Boolean guessed = false;
        Scanner scanner = new Scanner(System.in);

        while(!word.equals(guessedWord) && word.length != well) {

            System.out.println("Enter a letter: ");
            String input = scanner.nextLine();

            if (input.length() != 1) {

                System.out.println("Please enter only one letter!");
                continue;
            }
            char guess = input.charAt(0);

            for (int i = 0; i < word.length; i++) {

                if (word[i] == guess) {

                    guessed = true;
                    char[] guessedWordArray = guessedWord.toCharArray();
                    guessedWordArray[i] = guess;
                    guessedWord = String.valueOf(guessedWordArray);
                }
            }
            if (guessed) {

                System.out.println("Correct!");
                well+=countOccurence(guess,word);

            } else {

                System.out.println("Incorrect!");
            }

            tries++;
            System.out.println("Guessed word: " + guessedWord);
        }

        System.out.print("Congratulations, you guessed the word ");
        System.out.print(word);
        System.out.print(" in ");
        System.out.print(tries);
        System.out.print(" tries!");
    }

}