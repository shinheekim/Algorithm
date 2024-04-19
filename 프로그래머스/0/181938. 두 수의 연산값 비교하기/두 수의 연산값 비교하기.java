class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String mergeNumString = Integer.toString(a) + Integer.toString(b);
        int mergeNum = Integer.parseInt(mergeNumString);
        
        int twoMultiNum = 2 * a * b;
        if (mergeNum >= twoMultiNum) {
            answer = mergeNum;
        } else {
            answer = twoMultiNum;
        }
        return answer;
    }
}