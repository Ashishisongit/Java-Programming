import java.util.*;

public class subarrsum {
    public static int subarr(int arr[]) {
        int sum = 0, maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            sum = 0;
            System.out.print("(");
            for (int j = i; j < arr.length; j++) {
                System.out.print(arr[j] + " ");
                sum = sum + arr[j];
                if (sum > maxsum) {
                    maxsum = sum;
                }
            }
            System.out.print(")");

            // System.out.print(",");
            System.out.println();
        }
        return maxsum;
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
        // subarr(arr);
        System.out.println("The max possible sum of sub array is: " + subarr(arr));
        s.close();
    }

}
