import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strSplit = str.strip().split(" ");

        System.out.println(printLength(strSplit));
    }

    static long printLength(String[] strSplit){
        if (strSplit[0].isEmpty()) {
            return strSplit.length - 1;
        }
        return strSplit.length;
    }
}