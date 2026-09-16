public class solidrhombus {
        public static void main(String [] args){
    for(int i=0;i<5;i++){
        /*i is outer Loop 
        j is the empty spaces and 
        k is printing the stars .
Pattern:        *  *  *  *  * 
             *  *  *  *  * 
          *  *  *  *  * 
       *  *  *  *  * 
    *  *  *  *  *       */
        for (int j=0;j<(4-i);j++)
        {
            System.out.print("   ");
        }
        for(int k=0;k<(1+i);k++){
            System.out.print(" * ");
        }
        for(int k=0;k<(4-i);k++){
            System.out.print(" * ");
        }
        System.out.println();
    }
        }
}
