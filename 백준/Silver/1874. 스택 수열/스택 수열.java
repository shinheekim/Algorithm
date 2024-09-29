import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Stack;

public class Main { // 스택 수열
    final static Stack<Integer> STACK = new Stack<>();  // 사용자가 원하는 수열을 만들기 위한 stack
    static StringBuilder sb = new StringBuilder();  // 출력
    static int[] INPUT; // 수열 입력 받기

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        INPUT = new int[n];

        for (int i = 0; i < n; i++) {
            INPUT[i] = Integer.parseInt(br.readLine());
        }

        int current = 1;    // the sequence 🔺
        int index = 0;  // array index 🔺

        while (index < n) {
            if (STACK.isEmpty() || STACK.peek() < INPUT[index]) {  // 🔺
                STACK.push(current++);
                sb.append("+\n");
            } else if (STACK.peek() == INPUT[index]){
                STACK.pop();
                sb.append("-\n");
                index++;
            } else {    // 🔺
                System.out.println("NO");
                return;
            }
        }
        System.out.println(sb);
    }
}
