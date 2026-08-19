import java.util.HashMap;

public class LeetCode_Valid_Anagram {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();

        // Step 1: s의 문자 개수 저장
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i); // s의 i번째 문자를 꺼냄
            if(map.containsKey(c)) { // 이 문자가 map에 있는지 확인
                map.put(c, map.get(c) + 1); // 있으면 기존 개수에 +1 해서 덮어씀
            } else {
                map.put(c, 1); // 없으면 처음 보는 문자니까 1로 저장
            }
        }

        // Step 2: t랑 비교
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if(!map.containsKey(c)) { // t의 문자가 map에 없으면 s에 없는 문자가 t에 있다는 뜻. 애너그램 아님. false
                return false;
            }
            map.put(c, map.get(c)-1); // 있으면 개수를 -1함. t에서 이 문자 하나 썼다는 표시
            if (map.get(c) == 0) { // 개수가 0이 되면 map에서 제거함. 나중에 map.isEmpty()로 확인하려면 0인거 지워야함
                map.remove(c);
            }
        }
        return map.isEmpty(); // map이 완전히 비어있으면 s와 t의 문자가 완전히 일치. 아니면 불일치
    }
}
