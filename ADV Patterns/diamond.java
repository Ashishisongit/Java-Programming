import java.util.Scanner;
public class diamond {
    public static void dmnd(int a){
        int n=a;
        if(a!=0){
          for(int i=0;i<n;i++){
    for(int j=0;j<(n-1-i);j++){
        System.out.print("   ");
    }
    for(int k=0;k<1+i;k++){
        System.out.print(" * ");
    }
    for(int k=0;k<i;k++){
        System.out.print(" * ");
    }
    System.out.println();
}
for(int i=0;i<n;i++){
   for(int j=0;j<=i;j++){
    System.out.print("   ");
   }
   for(int k=0;k<(n-1-i);k++){
    System.out.print(" * ");
   }
   for(int k=0;k<(n-2-i);k++){
    System.out.print(" * ");
   }
    System.out.println();
}  
        }
    }
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the No.of stars Side of Diamond Consist of :");
        int h=s.nextInt();
        // int n=(int)Math.ceil(h / 2);
        dmnd(h);
s.close();
    }    
}
