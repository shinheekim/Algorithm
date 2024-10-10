class Solution {
    public String solution(int n) {
        StringBuilder answer = new StringBuilder();
        watermelon(n, answer);
        return answer.toString();
    }
    
    private static void watermelon(int n, StringBuilder answer){
        for(int i = 0; i < n / 2; i++){
            answer.append("수박");
        }
        if (n % 2 != 0){
            answer.append("수");
        }
    }
}