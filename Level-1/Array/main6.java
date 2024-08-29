import java.util.Scanner;

public class main6{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = 10;
        int[] arr = new int[len];
        System.out.print("Enter 10 numbers : ");
        for(int i = 0; i < len; i++) {
            arr[i] = in.nextInt();
        }
        System.out.print("Enter number to find : ");
        int num = in.nextInt();
        int result = findNum(arr, num);
        if(result == -1) {
            System.out.println("Number not found");
        }else {
            System.out.println("Number found at index : " + result);
        }
        in.close();
    }
    public static int findNum(int[] arr1, int n) {
        int ans = -1;
        for(int i = 0; i < arr1.length; i++) {
            if(arr1[i] == n) {
                ans = i;
            }
        }
        return ans;
    }
}