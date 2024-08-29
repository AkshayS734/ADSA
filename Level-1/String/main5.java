//WAP to accept a string and count number of Words Present in it

import java.util.Scanner;
public class main5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = in.nextLine();
        int count = countWords(str);
        System.out.println(count);
        in.close();
    }
    public static int countWords(String str1) {
        if (str1.length() == 0 || str1.isEmpty()) {
            return 0;
        }
        String[] words = str1.split("\\s");
        return words.length;
    }
}