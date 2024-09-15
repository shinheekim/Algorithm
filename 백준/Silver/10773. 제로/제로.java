import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        ArrayDeque<Integer> ad = new ArrayDeque<>();

        for(int i = 0; i < num; i++) {
            int number = Integer.parseInt(br.readLine());

            if(number == 0) {
                ad.pop();
            }
            else {
                ad.push(number);
            }
        }

        int sum = 0;
        for (int s : ad) {
            sum += s;
        }
        System.out.println(sum);
    }
}