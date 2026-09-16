public class floyd {
        public static void main(String [] args){
            // Pattern : 
            /*
              1 
              2   3 
              4   5   6 
              7   8   9   10 
              11  12  13  14  15 
            
            */
            int n=1;
            for(int i=1;i<=5;i++)
            {
                for(int j=0;j<i;j++){
                    if(i!=5){
                        System.out.print(" ");
                    }
                    System.out.print(" "+n+" ");
                    n++;
                }
                System.out.println();
            }
        }
}
