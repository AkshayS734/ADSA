//WAP to accept a String and Display it in Title Case.(eq- My name is covid----- My Name Is Covid)


import java.util.Scanner;
public class main19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = in.nextLine();
        String[] words = str.split("\\s+");
        StringBuilder titleCase = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                String capitalizedWord = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
                titleCase.append(capitalizedWord).append(" ");
            }
        }
        System.out.println("Title Case String: " + titleCase.toString().trim());
        in.close();
    }
}