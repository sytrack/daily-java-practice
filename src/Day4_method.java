import java.util.Scanner;

public class Day4_method {
    // Method declared outside main
    public static double add(double a, double b){
        return a + b;
    }
    public static double subtract(double a, double b){
        return a - b;
    }
    public static double multiply(double a, double b){
        return a * b;
    }
    public static double divide(double a, double b){
        return a / b;
    }
    public static boolean isEven(int n){
        return n % 2 == 0;
    }

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        // Step 1: Select menu
        int choice = 0;
        while (true){
            System.out.println("=== Calculator ===");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("Select an operation (1~4): ");
            choice = sc.nextInt();

            if (choice < 1 || choice > 4){
                System.out.println("Please enter a number between 1 and 4.");
                continue;
            } else{
                break;
            }
        }

        // Step 2: Enter two numbers
        System.out.println("Enter the first number: ");
        double a = sc.nextDouble();

        double b = 0;
        while(true){
            System.out.println("Enter the second number: ");
            b = sc.nextDouble();

            if (choice ==4 && b == 0){
                System.out.println("Can't divide by zero. Please enter again.");
                continue;
            } else {
                break;
            }
        }

        // Step 3: Call method based on selected operation
        double result = 0;
        if (choice == 1){
            result = add(a, b);
            System.out.println("Addition result: " + result);
        } else if (choice == 2){
            result = subtract(a, b);
            System.out.println("Subtraction result: " + result);
        } else if (choice == 3){
            result = multiply(a, b);
            System.out.println("Multiplication result: " + result);
        } else if (choice == 4) {
            result = divide(a, b);
            System.out.println("Division result: " + result);
        }

        // Step 4: Even or odd check
        System.out.println("\n=== Even/Odd Check ===");
        int n = 0;
        while (true){
            System.out.println("Enter an integer: ");
            try{
                n = sc.nextInt();
                // If we reach here, input was valid
                System.out.println(n + " is "+ (isEven(n) ? "even" : "odd")+ ".");
                break;
            } catch (Exception e){
                // Input was not an integer
                System.out.println("Please enter a valid integer. ");
                sc.next(); // Clear the invalid input from scanner
            }
        }
    }


}