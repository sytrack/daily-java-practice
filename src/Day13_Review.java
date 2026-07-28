import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Day13_Review {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: 학생 이름 입력
        // Step 2: 점수입력
        // Step 3: 60점 이상 합격자
        // Step 4: 전체 점수 출력
        // Step 5: 합격자 목록 출력
        // Step 6: 최고점 학생 출력

        int count = 0;
        System.out.println("How many students do you want to enter? (max 5): ");
        while (true) {
            try {
                count = sc.nextInt();
                if (count <= 0 || count > 5) {
                    System.out.println("Please enter a number between 0 and 5.");
                    continue;
                }
                break;
            } catch (Exception e) {
                System.out.println("Please enter an integer.");
                sc.next();
            }
        }

        sc.nextLine(); // clear buffer
        HashSet<String> nameSet = new HashSet<>();

        for (int i = 0; i <count; i++) {
            while (true) {
                System.out.println("Enter the student name " + (i+1) + ": " );
                String name = sc.nextLine();
                boolean added = nameSet.add(name);
                if (!added) {
                    System.out.println(name + "is duplicated name. Please re-enter the name.");
                } else {
                    break;
                }
            }
        }
        System.out.println(nameSet);

        int score = 0;
        HashMap<String, Integer> scoreMap = new HashMap<>();
        for (String name : nameSet) {
            System.out.println(name + "'s score (0-100): ");
            while (true) {
                try{
                    score = sc.nextInt();
                    if (score < 0 || score >100) {
                        System.out.println("Please enter a score between 0 and 100.");
                        continue;
                    }
                    scoreMap.put(name, score);
                    break;
                } catch (Exception e) {
                    System.out.println("Please enter an integer.");
                    sc.next();
                }
            }
        }
        System.out.println(scoreMap);

        System.out.println("=== Pass Student ===");
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
                topStudent = name;
                highest = scoreMap.get(name);
            }
        }
        System.out.println("=== Top Student ===");
        System.out.println(topStudent + "'s score: " + highest);

    }
}
