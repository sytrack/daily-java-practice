import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Day12_Review {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Enter student name
        int count = 0;
        while (true) {
            System.out.println("How many student you want to add? (max 5): ");
            try {
                count = sc.nextInt();
                if(count <= 0 || count >5) {
                    System.out.println("Please enter the number between 0 and 5. ");
                    continue;
                }
                break;
            } catch (Exception e) {
                System.out.println("Please enter an integer. ");
                sc.next();
            }
        }
        sc.nextLine(); // clear buffer
        System.out.println("===HashSet ===");
        HashSet<String> nameSet = new HashSet<>();
        for(int i = 0 ; i < count; i ++) {
            while (true) {
                System.out.println("Please enter the student name" + (i+1) + ": ");
                String name = sc.nextLine();
                boolean added = nameSet.add(name);
                if (!added) {
                    System.out.println( name + " is already exist. Please enter a different name. ");
                } else {
                    break;
                }
            }
        }
        System.out.println(nameSet);

        //Step 2: Enter scores
        int score = 0;
        HashMap <String, Integer> scoreMap = new HashMap<>();
        for (String name: nameSet) {
            System.out.println("Enter " + name + "'s score: ");
            while (true) {
                try {
                    score = sc.nextInt();
                    if (score < 0 || score > 100) {
                        System.out.println("Please enter the score between 0 and 100. ");
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
        System.out.println(scoreMap);
        //sc.nextLine(); // clear buffer

        // Step 3: Pass student
        ArrayList<String> passStudent= new ArrayList<>();
        for (String name : scoreMap.keySet()) {
            if (scoreMap.get(name) >= 60) {
                passStudent.add(name);
            }
        }
        System.out.println("Pass Student: " + passStudent);

        // Step 4: print all score.
        System.out.println("=== Score Board ===");
        for (String name : scoreMap.keySet()) {
            System.out.println(name + "'s score: " + scoreMap.get(name));
        }

        // Step 5: Pass Student
        System.out.println("=== Pass Student ===");
        for (String name : passStudent) {
            System.out.println(name);
        }

        // Step 6: Highest Student
        String topStudent = "";
        int highest = 0;
        for (String name : scoreMap.keySet()) {
            if (scoreMap.get(name) > highest) {
                highest = scoreMap.get(name);
                topStudent = name;
            }
        }
        System.out.println("Top Student: " + topStudent + " / score is: " + highest);
    }
}
