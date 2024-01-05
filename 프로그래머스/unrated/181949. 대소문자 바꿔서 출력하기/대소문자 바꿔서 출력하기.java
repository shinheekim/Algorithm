import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        for (int i = 0; i <a.length; i++){
            if (a[i].isUpperCase()){
                a[i] = a[i].toLowerCase();
            }
            else{
                a[i] = a[i].toUpperCase();
            }
                
            
        }
        System.out.print(a);
    }
}