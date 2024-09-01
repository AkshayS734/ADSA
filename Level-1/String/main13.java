//WAP to accept two strings and tell which comes later in lexicographics order(dictionary order). If equal how appropriate message.

import java.util.Scanner;
public class main13{
    public static void compareString(String str1, String str2) {
        int res = str1.compareTo(str2);
        if (res < 0) {
            System.out.println("'" + str2 + "' comes later in lexicographic order");
        } else if (res > 0) {
            System.out.println("'" + str1 + "' comes later in lexicographic order");
        } else {
            System.out.println("Both strings are equal");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first string : ");
        String s1 = in.nextLine();
        System.out.print("Enter second string : ");
        String s2 = in.nextLine();
        compareString(s1, s2);
        in.close();
    }
}