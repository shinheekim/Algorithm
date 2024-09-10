import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            String[] input = br.readLine().split(" ");
            int A = Integer.parseInt(input[0]);
            int B = Integer.parseInt(input[1]);
            sb.append(lcm(A, B)).append("\n");
            }
        System.out.println(sb);
        }

    public static int lcm(int A, int B) { 
        return A * B / gcm(A, B);
    }
    public static int gcm(int A, int B) { 
        if (B == 0) {
            return A;
        }
        return gcm(B, A % B);
    }
}