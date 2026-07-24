import java.util.HashMap;
import java.util.Scanner;

public class Day9 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Add students and their scores
        HashMap<String, Integer> scores = new HashMap<>();
        int count = 0;
        while (true) {
            System.out.println("How many students do you want to add? (max 5): ");
            try {
                count = sc.nextInt();
                if(count <= 0 || count > 5) {
                    System.out.println("Please enter a number between 1 and 5.");
                    continue;
                }
                break;
            } catch (Exception e) {
                System.out.println("Please enter an integer.");
                sc.next();
            }
        }
        // Step 2: Enter student name and scores
        sc.nextLine(); // clear buffer
        for (int i = 0; i < count; i++){
            System.out.println("Enter student name: ");
            String name = sc.nextLine();

            int score = 0;
            while (true) {
                System.out.println("Enter " + name + "'s score (0~100): ");
                try{
                    score = sc.nextInt();
                    if (score < 0 || score > 100) {
                        System.out.println("Please enter a score between 0 and 100.");
                        continue;
                    }
                    break;
                } catch (Exception e) {
                    System.out.println("Please enter an integer.");
                    sc.next();
                }
            }
            sc.nextLine(); // clear buffer
            scores.put(name, score); // add to HashMap
        }
        // Step 3: Print all students and scores
        System.out.println("=== Score Board ===");
        for (String name : scores.keySet()) {
            System.out.println(name + ": " + scores.get(name));
        }
        // Step 4: Search for a student
        System.out.println("Enter a student name to search: ");
        String target = sc.nextLine();
        if (scores.containsKey(target)) {
            System.out.println(target + "'s score: " + scores.get(target));
        } else {
            System.out.println(target + " is not in the list.");
        }

        // Step 5: Find the highest score
        int highest = 0;
        String topStudent = "";
        for (String name : scores.keySet()){
            if(scores.get(name) > highest) {
                highest = scores.get(name);
                topStudent = name;
            }
        }
        System.out.println("=== Top Student ===");
        System.out.println(topStudent + ": " + highest);
    }
}
