//WAP of Java String Comparison 2 String

import java.util.Scanner;
public class main6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first string : ");
        String str1 = in.next();
        System.out.print("Enter second string : ");
        String str2 = in.next();
        if(str1.equalsIgnoreCase(str2)) {
            System.out.println("Equal");
        }else {
            System.out.println("Not equal");
        }
        in.close();
    }
}