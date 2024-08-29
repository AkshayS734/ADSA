import java.util.Scanner;

public class main3{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the month number : ");
        int month = in.nextInt();
        if(month > 12 || month <= 0){
            System.out.println("Invalid month");
        }else if (month == 4 || month == 6 ||month == 9 ||month == 11) {
            System.out.println("Days : 30");
        }else if (month == 2) {
            System.out.println("Days : 28 or 29");
        }else{
            System.out.println("Days : 31");
        }
        in.close();
    }
}