import java.util.Scanner;

public class BtoD {
    public static int btod(int n){
        // int bin=n;
        int dec=0,pow=0;
        if(n==0){
            return 0;
        }
        while(n>0){
            int rem=n%10;
            dec=dec+(rem*(int)Math.pow(2,pow));
            pow++;
            n/=10;
        }
        return dec;
    }
    public static void main(String [] args){
    Scanner s=new Scanner(System.in);
    System.out.print("Enter The Binary No. : ");
    int B=s.nextInt();
        System.out.println("The decimal form of Entered Binary is : "+btod(B));
}
}
