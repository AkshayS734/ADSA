//WAP to accept  word and check if it is palindrome

import java.util.Scanner;
public class main9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = in.nextLine();
        str = str.toLowerCase();
        if(isPalindrome(str)) {
            System.out.println("Given string is a palindrome");
        }else {
            System.out.println("Given string is not a plaindrome");
        }
        in.close();
    }
    public static boolean isPalindrome(String str1) {
        boolean result = true;
        if(str1.length() == 0) {
            System.out.println("Empty string");
            return false;
        }
        for (int i = 0; i < str1.length(); i++){
            if(str1.charAt(i) != str1.charAt(str1.length() - i - 1)){
                result = false;
            }
        }

        return result;
    }
}