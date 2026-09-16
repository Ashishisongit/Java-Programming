import java.util.Scanner;

public class numul {
    public static void Numpat(int a){

        for(int i=a;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print(" "+j+" ");
            }
            System.out.println();
        }
    }
        public static void main(String [] args){
Scanner s=new Scanner(System.in);
System.out.print("Enter the Number : ");
int n=s.nextInt();
Numpat(n);
s.close();
        }
}
