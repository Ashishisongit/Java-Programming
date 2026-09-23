import java.util.*;

public class Stocks {
    public static int buysell(int a[]){
        int buyp=Integer.MAX_VALUE,sellp=0,profit=0;
        for(int i=0;i<a.length;i++){
            int current=a[i];
            if(buyp>current){
                buyp=current;
            }
            if(i>0){
                if(sellp<current){
                    sellp=current;
                }
            }
            int p=sellp-buyp;
            if(profit<p){
                profit=p;
            }
        }
        return profit;
    } 
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Length of array : ");
        int n = s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter Element " + (i + 1) + " : ");
            arr[i] = s.nextInt();
        }
        System.out.print("Max Profit is : "+buysell(arr));
        s.close();
    }
}
