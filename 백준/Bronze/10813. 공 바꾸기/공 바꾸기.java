import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        int basketNum = Integer.parseInt(str[0]);
        int changeNum = Integer.parseInt(str[1]);

        int [] basket = new int[basketNum];

        for (int i = 0; i < basketNum; i++) {
            basket[i] = i + 1;
        }
        for (int i = 0; i < changeNum; i++) {
            String[] nextReadLineArray = br.readLine().split(" ");

            int ball1 = Integer.parseInt(nextReadLineArray[0]);
            int ball2 = Integer.parseInt(nextReadLineArray[1]);

            // 교환
            int temp = basket[ball1 - 1];
            basket[ball1 - 1] = basket[ball2 -1];
            basket[ball2 - 1] = temp;
        }

        StringBuilder sb = new StringBuilder();
        for (int printNum : basket) {
            sb.append(printNum).append(" ");
        }
        System.out.print(sb.toString());

    }
}