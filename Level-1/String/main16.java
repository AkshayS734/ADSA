//WAP in java to accept 5 String/Name and Display the names that start with a Vowel


import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class main16{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String vowels = "aeiou";
        String[] name = new String[5];
        List<String> res = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            System.out.print("Enter name " + (i+1) + " : ");
            name[i] = in.nextLine();
            if (vowels.indexOf(Character.toLowerCase(name[i].charAt(0))) != -1) {
                res.add(name[i]);
            }
        }
        if(res.isEmpty()){
            System.out.println("All names start with consonants");
            in.close();
            return;
        }
        for(int i = 0; i < res.size(); i++) {
            System.out.println(res.get(i));
        }
        in.close();
    }
}