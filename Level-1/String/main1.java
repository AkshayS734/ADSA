//WAP to accept a String from User and Display it Back on Screen

import java.util.Scanner;
public class main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the name : ");
        String name = in.next();
        System.out.println(name);
        in.close();
    }
}