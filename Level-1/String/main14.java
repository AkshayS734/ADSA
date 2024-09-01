//WAP to replace “15 august” with “26 january” and  “independence” with “republic” in the string “15 august is independence day”

public class main14{
    public static void main(String[] args) {
        String str = "15 august is independance day";
        str = str.replace("15 august", "26 january");
        str = str.replace("independance", "republic");
        System.out.println("New string is " + "'" + str + "'");
    }
}