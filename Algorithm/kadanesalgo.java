import java.util.*;

public class kadanesalgo {
    public static int kadane(int arr[]) {
        int sum = 0, ms = Integer.MIN_VALUE;
        int stat=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                stat=1;
            }
        }
        if(stat==1){
            for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            if (sum < 0) {
                sum = 0;
            }
            ms = Math.max(sum, ms);
        }
        return ms;
        }
        
            for(int i=0;i<arr.length;i++){
                if(ms<arr[i]){
                    ms=arr[i];
                }
            }
        
        return ms;
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
        System.out.println("The max possible sum of sub array is: " + kadane(arr));

        s.close();
    }
}
