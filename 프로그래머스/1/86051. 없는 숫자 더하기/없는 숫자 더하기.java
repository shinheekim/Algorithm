class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
                
        for (int i = 0; i <= 9; i++){
            for (int j = 0; j < numbers.length; j++){
                if (i == numbers[j]){
                    break;
                }
                if (j == numbers.length-1 && numbers[j] != i){
                    answer+= i;
                }
            }
        }

        return answer;
    }
}