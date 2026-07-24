import java.util.Scanner;

public class Day7 {
    public static boolean isEven(int n){
        return n % 2 == 0;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Step 1: Enter your name and age
        System.out.println("Please enter your name: ");
        String name = sc.nextLine();
        int age = 0;
        while (true){
            try{
                System.out.println("Please enter your age: ");
                age = sc.nextInt();
                if(age <= 0 || age >150) {
                    System.out.println("Please enter the valid age. ");
                    continue;
                } break;
            } catch (Exception e) {
                System.out.println("Please enter an integer.");
                sc.next();
            }
        }
        // Step 2: isEven
        System.out.println("=== Is your age even? ===");
        System.out.println("Your age is "+ (isEven(age) ? "even" : "odd"));

        // Step 3: Countdown your age
        System.out.println("=== Countdown your age.===");
        for (int i= age; i >= 1; i--){
            System.out.println(i);
        }

        // Step 4: Enter the sentence.
        sc.nextLine();
        System.out.println("=== Enter the sentence.===");
        System.out.println("Please introduce yourself: ");
        String sentence = sc.nextLine();
        String[] words = sentence.split(" ");
        System.out.println("Count the words: " + words.length);
        System.out.println("Uppercase: " + sentence.toUpperCase());
        System.out.println("Does your name include? " + (sentence.contains(name)? "yes" : "no"));
    }
}
