import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        int[] chess = {1, 1, 2, 2, 2, 8};
        int[] pieces = new int[6];

        for (int i = 0; i < chess.length; i++) {
            pieces[i] = Integer.parseInt(str[i]);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chess.length; i++) {
            sb.append(chess[i] - pieces[i]).append(" ");
        }
        System.out.println(sb);
    }
}