import java.util.Scanner;

public class Day1_if {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("a 값을 입력하세요: ");
       float a = sc.nextFloat();
       System.out.println("b 값을 입력하세요: ");
       float b = sc.nextFloat();

       if(a>b){
           System.out.println("a가 더 큼");
       } else if(a==b){
           System.out.println("같음");
       } else{
           System.out.println("b가 더 큼");
       }
    }
}