import java.util.Scanner;

public class Day5_StringMethod {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Step 1: Enter a sentence
        System.out.println("Enter a sentence: ");
        String s = sc.nextLine();

        // Step 2: Basic String methods
        System.out.println("===String Info ===");
        System.out.println("Length: " + s.length());
        System.out.println("Uppercase: " + s.toUpperCase());
        System.out.println("Lowercase: " + s.toLowerCase());
        System.out.println("Second character: " + s.charAt(1));
        System.out.println("Contains 'y': " + s.contains("y"));

        // Step 3: Split into words and print each one
        System.out.println("=== Words ===");
        String[] words = s.split(" ");
        System.out.println("Word count: " + words.length);
        for (String word : words){
            System.out.println(word);
        }
    }
}
