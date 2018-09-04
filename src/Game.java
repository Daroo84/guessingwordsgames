import java.util.Random;
import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        String[] words = {"zegar", "lampa", "obrazek", "kwiat"};
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String response;
        while (true){
            String word = words[random.nextInt(words.length)];
            String hashWord = word;

            char randomChar = hashWord.charAt(random.nextInt(hashWord.length()));
            hashWord = hashWord.replaceFirst(String.valueOf(randomChar), "*");

            System.out.println("Twoje wylosowane slowo: " + hashWord);
            System.out.print("Podaj slowo: ");
            response = scanner.nextLine();

            if (word.equalsIgnoreCase(response)){
                System.out.println("Congratulations");
            }

        }

    }
}
