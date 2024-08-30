//WAP for substring

import java.util.Scanner;

public class main10{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = in.nextLine();
        char[] arr = str.toCharArray();
        System.out.print("Enter the starting index of substring : ");
        int start = in.nextInt();
        System.out.print("Enter the ending index of substring : ");
        int end = in.nextInt();
        if(start < 0) {
            start = 0;
        }
        if(end > str.length() - 1){
            end = str.length();
        }
        if(start > str.length() || end < 0 || start > end || start > end || start == end) {
            System.out.println("Invalid input");
            in.close();
            return;
        }
        char[] res = new char[end - start + 1];
        for (int i = start; i <= end; i++) {
            res[i] = arr[i];
        }
        System.out.println("Substring : " + new String(res));
        in.close();
    }
}