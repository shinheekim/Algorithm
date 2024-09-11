import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static int[] cardNum;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        cardNum = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            cardNum[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(cardNum);   // 정렬

        M = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < M; i++) {
            int num = Integer.parseInt(st.nextToken());
            sb.append(binarySearch(num)).append(" ");
        }

        System.out.println(sb);
    }
    public static int binarySearch(int num){
        int left = 0;
        int right = N - 1;
        while (left <= right) {
            int middle = (left + right) / 2;
            int middleValue = cardNum[middle];

            if (num > middleValue) {
                left = middle + 1;
            } else if (num < middleValue) {
                right = middle - 1;
            } else {
                return 1;
            }
        }
        return 0;
    }
}