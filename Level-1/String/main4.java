import java.util.Scanner;
public class main4 {
    public static void main(String[] args) {
        int count = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = in.next();
        str = str.toLowerCase();
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' ||ch == 'u') {
                count++;
            }
        }
        System.out.println(count);
        in.close();
    }
}