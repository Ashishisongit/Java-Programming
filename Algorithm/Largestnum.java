import java.util.Scanner;

public class Largestnum {
    public static int largeint (int a[]){
        int l=Integer.MIN_VALUE;  // this is the -infinity value , for + infinity use Integer.MAX_VALUE
        int s=Integer.MAX_VALUE;  // this is the -infinity value , for + infinity use Integer.MAX_VALUE
        for(int i=0;i<a.length;i++){
           if(l<a[i]){
            l=a[i];
           }
           if(a[i]<s){
            s=a[i];
           }
        }
        System.out.println("Smallest Value is : "+s );
      return l; 
    }
        public static void main(String [] args){
     Scanner s = new Scanner(System.in);
     System.out.print("Enter Length of Array : ");
        int n = s.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter the Element "+(i+1)+" : ");
            a[i] = s.nextInt();
        }
        System.out.println("Largest Integer is : "+largeint(a));
        s.close();
        }
    
}
