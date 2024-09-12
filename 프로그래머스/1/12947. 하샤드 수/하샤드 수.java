import java.util.*;

class Solution {
    public boolean solution(int x){
        boolean answer = true;
        ArrayList<Integer> arr = new ArrayList<>();
        int realX = x;
        
        while(x > 0){
            arr.add(x % 10);
            x /= 10;
        }
        
        int sum = 0;
        for (Integer i: arr){
            sum += i;
        }
         
        if (realX % sum != 0){
            answer = false;
        }
        
        return answer;
    }
}