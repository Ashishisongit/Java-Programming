import java.util.*;

public class linearsearch {
    public static int search(int a[], int key) {

        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("==== Linear Search Algorithm ====\nEnter the Length of Array : ");
        int n = s.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter the index " + i + " Element : ");
            a[i] = s.nextInt();
        }
        System.out.print("Enter the Key to Find : ");
        int key = s.nextInt();
        if (search(a, key) > -1) {
            System.out.println("Key Found at index " + search(a, key)+" !");
        } else {
            System.out.println("Key "+key+" not Found in the Array !");
        }
        s.close();
    }
}
