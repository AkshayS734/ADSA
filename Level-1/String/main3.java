import java.util.Scanner;
public class main3 {
    public static void main(String[] args) {
        int count = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = in.next();

        for (int i = 0; i < str.length(); i++) {
            if(Character.isUpperCase(str.charAt(i))) {
                count++;
            }
        }
        System.out.println(count);
        in.close();
    }
}