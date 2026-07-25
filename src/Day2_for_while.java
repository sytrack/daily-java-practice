import java.util.Scanner;

public class Day2_for_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //for문 버전
        System.out.println("=============for 문=================== ");
        int n = 0;
        while (true) {
            System.out.println("반복할 횟수를 입력하세요 (최대 10회): ");
            n = sc.nextInt();
            if (n > 10) {
                System.out.println("최대 10번 까지 반복 가능합니다. 다시 입력하세요.");
                continue;
            } else {
                break;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
        // while문 버전
        System.out.println("=============while 문=================== ");
        int m;
        while (true) {
            System.out.println("반복할 횟수를 다시 입력하세요. (최대 10회): ");
            m = 0;
            m = sc.nextInt();

            if (m > 10) {
                System.out.println("최대 10번 까지 반복 가능합니다. 다시 입력하세요.");
                continue;
            } else {
                break;
            }
        }
        int i = 0;
        while (i < m) {
            System.out.println("i :" + i);
            i++;
        }
    }
}
