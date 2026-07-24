import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Day6 {
    public static boolean isEven(int n){ return n% 2 == 0; }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Step 1: Enter your name and age
        System.out.println("Please enter your name: ");
        String name = sc.nextLine();

        int age = 0;
        while(true){
            System.out.println("Please enter your age: ");
            try{
                age = sc.nextInt();
                if (age <= 0 || age>150){
                    System.out.println("Please enter a valid age. ");
                    continue;
                } break;
            } catch (Exception e) {
                System.out.println("Please enter an integer.");
                sc.next();
            }
        }

        // Step 2: Enter personal info
        System.out.println("=== Personal Info ===");
        System.out.println("Name: " + name.toUpperCase());
        System.out.println("Age: " + age);
        System.out.println("Is your age even? " + (isEven(age) ? "yes" : "No"));

        // Step 3: Count down from age to 1
        System.out.println("=== Countdown from your age ===");
        for(int i=age; i>=1; i--){
            System.out.println(i);
        }
        // Step 4: Enter a sentence and analyze it
        sc.nextLine(); // Clear scanner buffer
        System.out.println("Enter a sentence about yourself: ");
        String sentence = sc.nextLine();

        String[] words = sentence.split(" ");
        System.out.println("=== Sentence Info ===");
        System.out.println("Word count: " + words.length);
        System.out.println("Uppercase: " + sentence.toUpperCase());
        System.out.println("Contains your name? " + sentence.contains(name));
    }
}
