//WAP to accept the First name , Middle Name and Last Name of a person and display full name  and Short Name 

import java.util.Scanner;
public class main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first name : ");
        String fname = in.nextLine();
        System.out.print("Enter the middle name : ");
        String mname = in.nextLine();
        System.out.print("Enter the last name : ");
        String lname = in.nextLine();
        System.out.println("Full name : " + fname + " " + mname + " " + lname);
        System.out.println("Short name :" + fname.charAt(0) + "." + mname.charAt(0) + "." +lname.charAt(0));
        in.close();
    }
}