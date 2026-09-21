import java.util.Scanner;

public class Reversearr {
    public static void reverse(int arr[]){
        int first=0,last=arr.length-1;
        while(first<last){
            int temp;
            temp=arr[first];
            arr[first]=arr[last];
            arr[last]=temp;
            first++;
            last--;
        }
       
    }
        public static void main(String [] args){
            Scanner s = new Scanner(System.in);
        System.out.print("Enter the Length of array : ");
        int n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Sorted Array :");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter Element " + (i+1) + " : ");
            arr[i] = s.nextInt();
        }
        reverse(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print( arr[i]+" ");
        }
        s.close();
        }
    
}
