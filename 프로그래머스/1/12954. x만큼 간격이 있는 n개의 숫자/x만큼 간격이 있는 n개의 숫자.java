class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        for (int i = 0; i < n; i++){
            answer[i] = (long) x * (i + 1);    // 2 * 1, 2 * 2, 2 * 3,....
        }
        return answer;
    }
}