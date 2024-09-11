import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());

        int num3 = (num2 % 10);
        int num4 = (num2 % 100 - num3) / 10;
        int num5 = (num2 % 1000 - num4) / 100;

        int num6 = num1 * num3 + num1 * num4 * 10 + num1 * num5 * 100;
        System.out.println(num1 * num3);
        System.out.println(num1 * num4);
        System.out.println(num1 * num5);
        System.out.println(num6);
    }
}