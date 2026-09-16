public class Hollowrect {
    public static void hrect(int a,int b){
        /*Pattern : 
        
         *  *  *  *  * 
         *           * 
         *           * 
         *  *  *  *  * 
        
        */
            // Alternative Option 
        for(int i=1;i<=a;i++){
        for(int j=1;j<=b;j++){
        if(i==1 || i==a || j==1 || j==b){ //logic #2
        System.out.print(" * ");

        }
        else{
        System.out.print("   ");
        }

        }
        System.out.println();
        }
    }
    public static void main(String[] args) {


        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                if (((i == 1) || (i == 2)) && ((j > 0) && (j < (4)))) { //logic #1
                    System.out.print("   ");
                } else {
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }
//    hrect(4,5);
    }
}
