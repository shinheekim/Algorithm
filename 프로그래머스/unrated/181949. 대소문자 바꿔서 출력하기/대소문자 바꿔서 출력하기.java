import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        char word ;
        
        for (int i = 0; i < a.length(); i++){
            
            word = a.charAt(i);
            
            if (Character.isUpperCase(word)==true){
                word = Character.toLowerCase(word);
                System.out.print(word);
            }
            else{
                word = Character.toUpperCase(word);
                System.out.print(word);
            }
                
            
        }

    }
}