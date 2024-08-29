import java.util.Scanner;
public class main8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = in.nextLine();
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            if(Character.isUpperCase(str.charAt(i))) {
                res = res + Character.toString(str.charAt(i)).toLowerCase();
            }else {
                res = res + Character.toString(str.charAt(i)).toUpperCase();
            }
        }
        System.out.println(res);
        in.close();
    }
}