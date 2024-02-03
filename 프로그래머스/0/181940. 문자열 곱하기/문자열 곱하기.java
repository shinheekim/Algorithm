class Solution {
    public String solution(String my_string, int k) {
        String answer = "";
        int n = 1;
        while (n <= k) {
            answer += my_string;
            n++;
        }
        return answer;
    }
}