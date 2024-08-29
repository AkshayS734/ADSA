import java.util.Arrays;
import java.util.Scanner;

public class main5{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter size of first array : ");
        int len1 = in.nextInt();
        int[] arr1 = new int[len1];
        System.out.print("Enter the array elements : ");
        for(int i = 0; i < len1; i++){
            arr1[i] = in.nextInt();
        }
        System.out.print("Enter size of second array : ");
        int len2 = in.nextInt();
        int[] arr2 = new int[len2];
        System.out.print("Enter the array elements : ");
        for(int j = 0; j < len2; j++){
            arr2[j] = in.nextInt();
        }
        System.out.println(" ");
        int[] result = new int[len1 + len2];
        int l = 0, m = 0, n = 0;
        while (l < len1 && m < len2) {
            if(arr1[l] <= arr2[m]) {
                result[n] = arr1[l];
                l++;
            }else{
                result[n] = arr2[m];
                m++;
            }
            n++;
        }
        while (l < len1) {
            result[n] = arr1[l];
            l++;
            n++;
        }
        while (m < len2) {
            result[n] = arr2[m];
            m++;
            n++;
        }
        System.out.println("Merged array : " + Arrays.toString(result));
        in.close();
    }
}