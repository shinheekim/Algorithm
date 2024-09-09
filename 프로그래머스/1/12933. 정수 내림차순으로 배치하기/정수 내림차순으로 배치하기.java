import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        String[] arr = n.toString().split("");
        
        Arrays.sort(arr);
        
        StringBuffer sbf = new StringBuffer();

        for (int i = arr.length - 1; i >= 0 ; i--){
            sbf.append(arr[i]);
        }
        
        answer = Long.parseLong(sbf.toString());
        return answer;
    }
}