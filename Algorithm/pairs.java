import java.util.*;

public class pairs {
    public static void Pair(int arr[]){
        for(int i=0;i<arr.length;i++){
           int curr=arr[i];
            for(int j=i+1;j<arr.length;j++){
              System.out.print("("+ curr +","+ arr[j] +") ");
            }
            System.out.println();
        }
    }
        public static void main(String [] args){
            Scanner s = new Scanner(System.in);
            System.out.print("Enter the Length of array : ");
            int n = s.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < arr.length; i++) {
                System.out.print("Enter Element " + (i + 1) + " : ");
                arr[i] = s.nextInt();
                
            }
            Pair(arr);
                s.close();
        }
    
}
