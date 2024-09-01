//WAP to accept String and Convert its individual characters to capital and Small alternately.


import java.util.Scanner;
public class main17{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = in.nextLine();
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char temp = str.charAt(i);
            if (i % 2 == 0) {
                res.append(Character.toUpperCase(temp));
            } else {
                res.append(Character.toLowerCase(temp));
            }
        }
        System.out.println("Result : " + res.toString());
        in.close();
    }
}