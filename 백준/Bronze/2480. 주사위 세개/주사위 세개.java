import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int[] dices = new int[3];

        for (int i = 0; i < 3; i++) {
            dices[i] = Integer.parseInt(str[i]);
        }
        int prize = 0;

        if (dices[0] == dices[1] && dices[1] == dices[2]) {
            prize = 10000 + dices[0] * 1000;
        } else if (dices[0] == dices[1] || dices[1] == dices[2]) {
            prize = 1000 + dices[1] * 100;
        } else if (dices[0] == dices[2] && dices[0] != dices[1]) {
            prize = 1000 + dices[0] * 100;
        } else {
            int M = dices[0];
            if (M < dices[1]) M = dices[1];
            if (M < dices[2]) M = dices[2];
            prize = M * 100;
        }
        System.out.println(prize);
    }
}