/*WAP to accept the name of a person and guess the gender based on following Table.
Condition	            Gender
Start with “mr.”	    Male
Start with “miss”	    Female
Start with “mrs”	    Married Female
Ends with “Kumari”	    Female
Else	                Cannot Determine
*/


import java.util.Scanner;
public class main12{
    public static String guessGender(String name) {
        String name1 = name.toLowerCase();
        if (name1.startsWith("mr.")) {
            return "Male";
        }else if (name1.startsWith("miss")) {
            return "Female";
        }else if (name1.startsWith("mrs")) {
            return "Married Female";
        }else if (name1.endsWith("kumari")) {
            return "Female";
        }else {
            return "Cannot Determine";
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String str = in.nextLine();
        String gender = guessGender(str);
        System.out.println("Gender: " + gender);
        in.close();
    }
}