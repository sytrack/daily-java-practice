import java.util.HashSet;

public class LeetCode_Contains_Duplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i=0; i < nums.length; i++) {
            boolean added = set.add(nums[i]);
            // added = true 추가 성공. (중복 아님)
            // added = false 중복이라 무시됨
            if (!added) {   // added가 false일 때, 즉 중복일 때
                return true; // 중복 있음 리턴
            }
        }
        return false; // 끝까지 돌았는데 중복 없음
    }
}
