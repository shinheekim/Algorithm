class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        boolean yesOrNo;
        
        if (ineq.equals(">") && eq.equals("=")){
            yesOrNo = n >= m;
        } else if (ineq.equals(">") && eq.equals("!")){
            yesOrNo = n > m;
        } else if (ineq.equals("<") && eq.equals("=")){
            yesOrNo = n <= m;
        } else {
            yesOrNo = n < m;
        }
        
        if (yesOrNo){
            answer = 1;
        }
        return answer;
    }
}