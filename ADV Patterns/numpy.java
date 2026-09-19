import java.util.Scanner;

public class numpy {
    public static void pyramid(int n){
    for(int i=0;i<n;i++){
        for(int j=0;j<n-i;j++){
            System.out.print(" ");
        }
        for(int k=0;k<1+i;k++){
            System.out.print(i+1 +" ");
        }
        System.out.println();
    }
}
        public static void main(String [] args){

    /* Pattern : at n=8;
        1 
       2 2 
      3 3 3 
     4 4 4 4 
    5 5 5 5 5 
   6 6 6 6 6 6 
  7 7 7 7 7 7 7 
 8 8 8 8 8 8 8 8 
            */
            Scanner s=new Scanner(System.in);
            System.out.print("Enter a No. : ");
            int n=s.nextInt();
            pyramid(n);
    s.close();
        }
}
