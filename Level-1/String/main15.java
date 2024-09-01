//WAP of  Trim    “          hi      ”                    ----- “hi”.


import java.util.Scanner;
public class main15{
    public static String trim(String str){
        if (str == null || str.isEmpty()) {
            return str;
        }
        int start = 0;
        while (start < str.length() && Character.isWhitespace(str.charAt(start))) {
            start++;
        }
        if (start == str.length()) {
            return "";
        }
        int end = str.length() - 1;
        while (end > start && Character.isWhitespace(str.charAt(end))) {
            end--;
        }
        return str.substring(start, end + 1);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String og = in.nextLine();
        String res = trim(og);
        System.out.println("Trimmed string : " + res);
        in.close();
    }
}