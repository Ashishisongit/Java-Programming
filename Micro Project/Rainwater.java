import java.util.*;

public class Rainwater {
    public static int RW(int a[],int b[],int c[]) {
        int water=0;
        for(int i=0;i<a.length;i++){
            int l=b[i],r=c[c.length-1-i];
            if(l>r){
                water=water+(r-a[i]);
            }
            else if(r>l){
                water = water+(l-a[i]);
            }
            else{
                water = water + 0;
            }
        }
        return water;
    }
    public static void bound(int b[],int c[]){
        int l=b[0],r=c[0];
        for (int i=0;i<b.length;i++){
            if(l>b[i]){
                b[i]=l;
            }
            else{
                l=b[i];
            }
            if(r>c[i]){
                c[i]=r;
            }
            else{
                r=c[i];
            }

        }
    }
//Try Testing by Enetering Chronological Array 
// (Ascending/Descending) , water stored at slopy plane is 0.
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Length of array : ");
        int n = s.nextInt();
        int arr[] = new int[n];
        int lmax[] = new int[n];
        int rmax[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter Element " + (i + 1) + " : ");
            int temp=s.nextInt();
            arr[i] = temp;
            lmax[i] = temp;
            rmax[arr.length-1-i] = temp;
        }
        bound(lmax, rmax);
       System.out.print("Water Stored is : "+ RW(arr,lmax,rmax));
        s.close();
    }

}
