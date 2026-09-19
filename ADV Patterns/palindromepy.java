import java.util.*;
public class palindromepy {
        public static void palindrome(int n){
            for(int i=0;i<n;i++){
                for(int j=0;j<n-i;j++){
                    System.out.print(" ");
                }
                for(int k=i+1;k>0;k--){
                    // int m=
                System.out.print(k);
                }
                for(int l=2;l<i+2;l++){
                    System.out.print(l);
                }
                System.out.println();
            }
        }
        public static void main(String [] args){

            /*
         O/P :   Enter a Num : 5
             1
            212
           32123
          4321234
         543212345
            */
            Scanner s=new Scanner(System.in);
            System.out.print("Enter a Num : ");
            int n=s.nextInt();
            
           palindrome(n);
            s.close();
        }
}
