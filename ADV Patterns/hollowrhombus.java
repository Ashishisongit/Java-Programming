public class hollowrhombus {
        public static void main(String [] args){

            /*
            Pattern :           *  *  *  *  * 
                               *           * 
                              *           * 
                             *           * 
                            *  *  *  *  * 
            */ 
    for (int i=0;i<5;i++){
        for (int j=0;j<(4-i);j++)
        {
            System.out.print("   ");
        }
        if(i==0 || i==4){
            System.out.print(" *  *  *  *  * ");
        }
        else{
            System.out.print(" *           * ");
        }
        System.out.println();
    }
        }
}
