import java.util.*;

class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int length = phone_number.length();
        int star = length - 4;
        answer = phone_number.substring(star, length);
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < star; i++){
            sb.append("*");
        }
        sb.append(answer);
        return sb.toString();
    }
}