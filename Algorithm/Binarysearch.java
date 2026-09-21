import java.util.*;

public class Binarysearch {
    public static int bsearch(int arr[], int key) {
        int start = 0, end = arr.length - 1; // pointers
        while (start <= end) {
             int mid = (start + end) / 2;
            if (key == arr[mid]) {
                return mid;
            } else if (key > arr[mid]) {

                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Length of array : ");
        int n = s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter Element " + i+1 + " : ");
            arr[i] = s.nextInt();
        }
        System.out.print("Enter Key to Search for : ");
        int key = s.nextInt();
        if (bsearch(arr, key) == -1) {
            System.out.print("Key not Found !");
        } else {
            System.out.print("Key Found at index : " + bsearch(arr, key));
        }
        s.close();
    }
}
