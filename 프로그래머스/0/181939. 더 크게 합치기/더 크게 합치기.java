class Solution {
    public int solution(int a, int b) {
        int answer = 0;

        String str1 = Integer.toString(a);
        String str2 = Integer.toString(b);
        
        String str1sum = str1 + str2;
        String str2sum = str2 + str1;
        
        int num1 = Integer.parseInt(str1sum);
        int num2 = Integer.parseInt(str2sum);
        
        if (num1 >= num2){
            answer = num1;
        }
        else{
            answer = num2;
        }
        
        return answer;
    }
}