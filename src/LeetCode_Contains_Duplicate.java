import java.util.HashSet;

public class LeetCode_Contains_Duplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            boolean added = set.add(nums[i]);
            if (!added) {
                return true;
            }
        }
        return false;
    }
}
