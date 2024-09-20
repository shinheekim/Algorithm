import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num = br.readLine();

        String[] arr = num.split("");  // 입력받은 숫자를 개별 숫자로 분할
        Arrays.sort(arr, Collections.reverseOrder());  // 내림차순 정렬

        long sum = 0;  // 자릿수의 합을 저장할 변수
        StringBuilder sb = new StringBuilder();  // 가장 큰 수를 만들기 위한 문자열

        // 숫자에 '0'이 포함되어 있는지 확인
        if (num.contains("0")) {
            for (String i : arr) {
                sum += Integer.parseInt(i);  // 모든 자릿수를 더함
            }

            // 자릿수의 합이 3으로 나누어떨어지면 가장 큰 수를 만듦
            if (sum % 3 == 0) {
                for (String i : arr) {
                    sb.append(i);  // 내림차순으로 정렬된 숫자를 이어 붙임
                }
                System.out.println(sb.toString());  // 결과 출력
            } else {
                System.out.println("-1");  // 3으로 나누어떨어지지 않으면 -1 출력
            }
        } else {
            System.out.println("-1");  // '0'이 없으면 -1 출력
        }
    }
}
