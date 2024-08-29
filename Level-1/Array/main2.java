import java.util.Scanner;

public class main2{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of array : ");
        int len = in.nextInt();
        int[] arr = new int[len];
        int sum = 0;
        System.out.print("Enter the array elements : ");
        for(int i = 0; i < len; i++) {
            arr[i] = in.nextInt();
            sum += arr[i];
        }
        int avg = sum/len;
        System.out.println("Average : "+ avg);
        in.close();
    }
}