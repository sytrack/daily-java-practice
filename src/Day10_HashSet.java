import java.util.HashSet;
import java.util.Scanner;


public class Day10_HashSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Add words to HashSet
        HashSet<String> wordset = new HashSet<>();
        int count = 0;
        while (true) {
            System.out.println("How many words do you want to add? (max 10): ");
            try{
                count = sc.nextInt();
                if(count <=0 || count > 10) {
                    System.out.println("Please enter a number between 1 and 10. ");
                    continue;
                }
                break;
            } catch (Exception e) {
                System.out.println("Please enter an integer.");
                sc.next();
            }
        }

        // Step 2: Enter words (duplicates will be ignored)
        sc.nextLine(); // clear buffer
        for(int i=0; i <count; i++) {
            System.out.println("Enter word " + (i + 1) + ": ");
            String word = sc.nextLine();
            boolean added = wordset.add(word);
            if (!added) {
                System.out.println("\"" + word + "\" is duplicate. Ignore. ");
            }
        }

        // Step 3: Print all words
        System.out.println("=== Word Set ===");
        System.out.println("Total unique words: " + wordset.size());
        for (String word : wordset) {
            System.out.println(word);
        }

        // Step 4: Search for a word
        System.out.println("Enter a word to search: ");
        String target = sc.nextLine();
        if (wordset.contains(target)){
            System.out.println("\"" + target + "\" is in the set.");
        } else {
            System.out.println("\"" + target + "\" is not in the set.");
        }
        // Step 5: Remove a word
        System.out.println("Enter a word to remove: ");
        String toRemove = sc.nextLine();
        if(wordset.contains(toRemove)) {
            wordset.remove(toRemove);
            System.out.println("\"" + toRemove + "\" has been removed.");
        } else {
            System.out.println("\"" + toRemove + "\" is not in the set.");
        }

        // Step 6: Print final list
        System.out.println("=== Final Set ===");
        System.out.println("Total: " + wordset.size());
        for (String word : wordset) {
            System.out.println(word);
        }
    }
}
