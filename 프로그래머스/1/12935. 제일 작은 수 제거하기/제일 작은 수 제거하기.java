import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = arr.length != 1 ? new int[arr.length - 1] : new int[]{-1};
        
        int index = 0;
        for (int i = 1; i < arr.length; i++){
            if (arr[index] > arr[i]){
                index = i;
            }
        }
        
        int answerIndex = 0;
        for(int i = 0; i < arr.length; i++){
            if (i != index){
                answer[answerIndex] = arr[i];
                answerIndex++;
            }
        }
        return answer;
    }
}