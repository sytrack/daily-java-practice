public class LeetCode_Check_Divisility_by_Digit_Sum_and_Product {
    public boolean checkDivisibility(int n) {
        int original = n;
        int sum = 0;
        int product = 1;
        while (n > 0) {
            int digit = n % 10;
            sum = sum + digit;
            product = product * digit;
            n = n/10;
        }
        if (original % (sum + product) == 0) {
            return true;
        }
        return false;
    }
}
