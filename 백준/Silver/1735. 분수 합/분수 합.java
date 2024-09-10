import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strArr1 = br.readLine().split(" ");
        String[] strArr2 = br.readLine().split(" ");

        int[] A = new int[]{Integer.parseInt(strArr1[0]), Integer.parseInt(strArr1[1])};
        int[] B = new int[]{Integer.parseInt(strArr2[0]), Integer.parseInt(strArr2[1])};

        int numerator = A[0] * B[1] + B[0] * A[1];
        int denominator = A[1] * B[1];
        int gcmNum = 0;

        gcmNum = gcm(numerator, denominator);
        numerator /= gcmNum;
        denominator /= gcmNum;
        System.out.println(numerator + " " + denominator);
    }

    public static int gcm(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        return gcm(num2, num1 % num2);
    }
}