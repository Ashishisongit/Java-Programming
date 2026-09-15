
import java.util.Scanner;

public class TheCalc {
    public static float add(float a, float b) {
        float sum = a + b;
        return sum;
    }

    public static float sub(float a, float b) {
        float dif = a + b;
        return dif;
    }

    public static float mult(float a, float b) {
        float mult = a + b;
        return mult;
    }

    public static float div(float a, float b) {
        if (b != 0) {
            float div = a / b;
            return div;
        } else {
            return 0;
        }
    }

    public static float mod(float a, float b) {
        float mod = a + b;
        return mod;
    }

    public static void def() {
        System.out.println("Invalid Operation");
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true) {
            // System.out.println("Entert k to exit : ");
            System.out.print("\nEnter First Num : ");
            float a = s.nextFloat();
            System.out.print(" Press 'q' to Quit\nEnter Operation(+,-,x,/,%) :");
            char op = s.next().charAt(0);
             if (op == 'q' || op == 'Q') {
                System.out.println("Exiting application...");
                break; 
            }
            System.out.print("Enter Second Num : ");
            float b = s.nextFloat();
            switch (op) {
                case '+':
                    float sum = add(a, b);
                    System.out.println("Sum is : " + sum);
                    break;
                case '-':
                    float dif = sub(a, b);
                    System.out.println("Sub is : " + dif);
                    break;
                case 'x':
                    float mult = mult(a, b);
                    System.out.println("Product is : " + mult);
                    break;
                case '/':
                    float div = div(a, b);
                    if (b == 0) {
                        System.out.println("Division by Zero Error !");
                    } else {
                        System.out.println("Division is : " + div(a, b));
                    }
                    break;
                case '%':
                    float mod = mod(a, b);
                    System.out.println("Remainder is : " + mod);
                // case 'k':
                //     exit();
                default:
                    def();
                    // break;
            }
        }
    }
}