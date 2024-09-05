class Solution {
    public int[] solution(long n) {
        String num = String.valueOf(n);
        int[] answer = new int[num.length()];
        for (int i = 0; i < num.length(); i++){
            answer[i] = (int) (n % 10);
            n /= (int) 10;
        }
        return answer;
    }
}