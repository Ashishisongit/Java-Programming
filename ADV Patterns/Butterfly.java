public class Butterfly {
    public static void main(String[] args) { // i is outer loop to maintain the rows ,
        // j are the spaces
        // k are the stars
        /*
        Pattern :       

         *                    * 
         *  *              *  * 
         *  *  *        *  *  * 
         *  *  *  *  *  *  *  * 
         *  *  *  *  *  *  *  * 
         *  *  *        *  *  * 
         *  *              *  * 
         *                    * 

        */
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" * ");
            }
            for (int k = (0 + i); k < 3; k++) {
                System.out.print("   ");
            }
            for (int j = 0; j < (3 - i); j++) {
                System.out.print("   ");
            }
            for (int k = 0; k < i + 1; k++) {
                System.out.print(" * ");
            }

            System.out.println();
        }
        for (int i = 0; i < 4; i++) {
            for (int k = 0; k < 4 - i; k++) {
                System.out.print(" * ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("   ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("   ");
            }
            for (int k = 0; k < (4 - i); k++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
