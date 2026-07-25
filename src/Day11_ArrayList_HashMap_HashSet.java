import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Day11_ArrayList_HashMap_HashSet {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Step 1: Enter student names (no duplicates allowed)
        HashSet<String> nameSet = new HashSet<>();
        int count = 0;
        while (true) {
            System.out.println("How many students do you want to add? (max 5): ");
            try {
                count = sc.nextInt();
                if (count <= 0 || count >5) {
                    System.out.println("Please enter a number between 1 and 5.");
                    continue;
                }
                break;
            } catch (Exception e) {
                System.out.println("Please enter an integer.");
                sc.next();
            }
        }

        sc.nextLine(); // clear buffer
        for (int i = 0; i < count; i++) {
            while (true) {
                System.out.println("Enter student name " + (i + 1) + ": ");
                String name = sc.nextLine();
                boolean added = nameSet.add(name);
                if (!added) {
                    System.out.println("\"" + name + "\" already exists. Please enter a different name. ");
                } else {
                    break;
                }
            }
        }

        // Step 2: Enter scores for each student (stored in HashMap)
        HashMap<String, Integer> scoreMap = new HashMap<>();
        for(String name : nameSet) {
            while (true) {
                System.out.println("Enter " + name + "'s score (0-100): ");
                try {
                    int score = sc.nextInt();
                    if (score <=0 || score>100) {
                        System.out.println("Please enter a score between 0 and 100.");
                        continue;
                    }
                    scoreMap.put(name, score);
                    break;
                } catch (Exception e) {
                    System.out.println("Please enter an integer. ");
                    sc.next();
                }
            }
        }

        // Step 3: Store passing students in ArrayList (score >=60)
        ArrayList<String> passingStudents = new ArrayList<>();
        for (String name : scoreMap.keySet()) {
            if (scoreMap.get(name) >= 60) {
                passingStudents.add(name);
            }
        }

        // Step 4: Print results
        System.out.println("=== Score Board ===");
        for (String name : scoreMap.keySet()) {
            System.out.println(name + ": " + scoreMap.get(name));
        }

        System.out.println("=== Passing students ===");
        System.out.println("Total passing: " + passingStudents.size());
        for (String name : passingStudents) {
            System.out.println(name);
        }

        // Step 5: Find top student
        String topStudent = "";
        int highest = 0;
        for (String name: scoreMap.keySet()){
            if(scoreMap.get(name) > highest) {
                highest = scoreMap.get(name);
                topStudent = name;
            }
        }
        System.out.println("=== Top Student ===");
        System.out.println(topStudent + ": " + highest);
    }
}
