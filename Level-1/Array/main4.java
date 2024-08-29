import java.util.Scanner;
import java.util.Arrays;

public class main4{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int len = in.nextInt();
        int[] arr = new int[len];
        int[] rev = new int[len];
        System.out.print("Enter array elements : ");
        for (int i = 0; i < len; i++) {
            arr[i] = in.nextInt();
            rev[len- i -1] = arr[i];
        }
        
        System.out.println("Array in reverse : "+ Arrays.toString(rev));
        in.close();
    }
}