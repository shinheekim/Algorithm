import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str;
        int L, P, V, share, rest;

        int count = 0;
        while (true) {
            str = br.readLine().split(" ");
            L = Integer.parseInt(str[0]);
            if (L == 0) {
                break;
            }
            P = Integer.parseInt(str[1]);
            V = Integer.parseInt(str[2]);
            count++;

            share = V / P;
            rest = V % P;
            System.out.println("Case " + count + ": " + ((share * L) + Math.min(rest, L)));
        }
    }
}
