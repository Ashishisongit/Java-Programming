import java.util.Scanner;

public class DtoB {
    public static int dtob(int n){
        int bin=0,pow=0;
        while(n!=0){
int rem=n%2;
bin=bin+(rem*(int)Math.pow(10,pow));
pow++;
n/=2;
        }
        return bin;
    }
        public static void main(String [] args){
            Scanner s=new Scanner(System.in);
            System.out.println("Enter the Binary : ");
            int D=s.nextInt();
            System.out.println("The Binary form of Given Decimal is : "+dtob(D));
        }
}
