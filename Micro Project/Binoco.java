import java.util.Scanner;

public class Binoco {

    public static int factorial(int f){
     int sum=1;
    for(int i=2;i<=f;i++){
        sum*=i;
    }
    return sum;
    }
    public static int binomial(int a ,int b,int c){
        int f = factorial(a)/(factorial(b)*factorial(c));
        return f;
    }
        public static void main(String [] args){
            System.out.println("-- Program to Find Binomial Coeffiecient --");
            Scanner s=new Scanner(System.in);
            System.out.print("Enter n : ");
            int n=s.nextInt();
            System.out.print("Enter r (r<n) : ");
            int r=s.nextInt();
            int R=n-r;
            if(r<=n){
                System.out.println("Binomial Coeffiecient is : "+binomial(n,r,R));
            }
            else{
                System.out.println("Invalid Inputs !");
            }
        }
}
