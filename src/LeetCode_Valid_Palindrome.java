public class LeetCode_Valid_Palindrome {
    Public boolean isPalindrome(String s) {

        // Step 1: 특수문자/공백 제거, 소문자로 변환
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <s.length(); i++) {
            char c = s.charAt(i); // s의 i번째 문자를 꺼냄
            if (Character.isLetterOrDigit(c)) { // 문자나 숫자인지 확인
                sb.append(Character.toLowerCase(c)); // 문자나 숫자일 때만 소문자로 바꿔서 sb에 붙임
            }
        } // for문 끝나면 특수문자와 공백은 다 사라진 소문자 문자열만 남음

        // Step 2: 앞뒤 동시에 좁혀오면서 비교
        int left = 0; // 왼쪽 끝 인덱스
        int right = sb.length() - 1; // 오른쪽 끝 인덱스 (0부터 시작하니까 1을 빼줌)
        while(left < right) {   // 둘이 만날 때까지 반복
            if (sb.charAt(left) != sb.charAt(right)) {
                return false;   // 다르면 펠린드롭 아님
            }
            left++;  // 왼쪽은 오른쪽으로
            right--; // 오른쪽은 왼쪽으로
        }
        return true; // 끝까지 같으면 팰린드롭
    }
}

