import java.util.Scanner;

public class Day3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // 1단계: 배열 크기 입력(유효성 검사)
        int size = 0;
        while (true){
            System.out.println("배열 크기를 입력하세요: ");
            size = sc.nextInt();
            if(size > 10 || size <=0){
                System.out.println("0부터 10까지 숫자만 입력하세요.");
                continue;
            } else{
                break;
            }
        }
        // 2단계: 배열 만들고 값 채우기
        int[] nums = new int[size];
        System.out.println("숫자를"+size+"개 입력하세요.");
        for(int i=0; i< nums.length; i++){
            nums[i] = sc.nextInt();
        }
        // 3단계: 배열 출력
        System.out.println("===입력한 배열===");
        for(int num: nums){
            System.out.println(num);
        }
        // 4단계: 배열로 계산하기
        int sum=0;
        int max = nums[0];
        int min = nums[0];

        for(int num:nums){
            sum += num;
            if(num>max){
                max = num;
            }
            if(num<min){
                min = num;
            }
        }
        double average = (double) sum/ nums.length;
        System.out.println("===계산 결과===");
        System.out.println("합계: " + sum);
        System.out.println("최댓값: " + max);
        System.out.println("최솟값: " + min);
        System.out.println("평균: " + average);
    }
}