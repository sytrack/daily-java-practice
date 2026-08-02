import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Day14 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: 학생 이름 입력
        // Step 2: 점수입력
        // Step 3: 60점 이상 합격자
        // Step 4: 전체 점수 출력
        // Step 5: 합격자 목록 출력
        // Step 6: 최고점 학생 출력

        int count = 0;
        while (true) {
            System.out.println("How many students do you want to add? (max 5): ");
            count = sc.nextInt();
            try {
                if (count <= 0 || count > 5) {
                    System.out.println("Please enter the number between 0 and 5. ");
                    continue;
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Please enter an integer. ");
                sc.next();
            }
        }

        sc.nextLine();
        HashSet<String> nameSet = new HashSet<>();
        for (int i = 0; i < count; i++) {
            while (true) {
                System.out.println("Please enter " + (i + 1) + " student's name: ");
                String name = sc.nextLine();
                boolean added = nameSet.add(name);
                if (!added) {
                    System.out.println(name + " is already in the list. Please enter different name.");
                    continue;
                }
                break;
            }
        }
        System.out.println(nameSet);

        System.out.println("=== Name and score ===");
        HashMap<String, Integer> scoreMap = new HashMap<>();
        int score = 0;
        for (String name : nameSet) {
            System.out.println("Please enter" + name + "'s score (between 0-100) : ");
            while (true) {
                try {
                    score = sc.nextInt();
                    if (score < 0 || score > 100) {
                        System.out.println("Please enter score between 0 to 100.");
                        continue;
                    } else {
                        scoreMap.put(name, score);
                        break;
                    }
                } catch (Exception e) {
                    System.out.println("Please enter an integer.");
                    sc.next();
                }
            }
        }
        System.out.println(scoreMap);

        System.out.println("=== pass students ===");
        ArrayList<String> passStudent = new ArrayList<>();
        for (String name : scoreMap.keySet()) {
            if (scoreMap.get(name) >= 60) {
                passStudent.add(name);
            }
        }
        System.out.println(passStudent);

        String topStudent = "";
        int highest = 0;
        for (String name : scoreMap.keySet()) {
            if (scoreMap.get(name) > highest) {
                highest = scoreMap.get(name);
                topStudent = name;
            }
        }
        System.out.println("Top Student: " + topStudent);
        System.out.println("Highest score: " + highest);
    }
}
