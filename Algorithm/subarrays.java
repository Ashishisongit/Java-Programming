import java.util.*;

public class subarrays {
    public static void subarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("  -> ");
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Length of array : ");
        int n = s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter Element " + (i + 1) + " : ");
            arr[i] = s.nextInt();

        }
        subarr(arr);
        s.close();
    }

}
