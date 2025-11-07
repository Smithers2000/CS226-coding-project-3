import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("GCD/LCM Calculator (Euclidean Algorithm)");
        System.out.println("----------------------------------------");

        System.out.println("enter the first positive integer");
        int num1 = keyboard.nextInt();
        System.out.println("enter the second positive integer");
        int num2 = keyboard.nextInt();

        int g = findGCD(num1, num2);
        long l = findLCM(num1, num2);

        if (num1 > 0 && num2 > 0) {
            System.out.println(g);
            System.out.println(l + "\n");
            System.out.printf("Inputs: a = %d, b = %d%n", num1, num2);
            System.out.printf("Greatest Common Divisor (gcd): %d%n", g);
            System.out.printf("Least Common Multiple (lcm): %d%n", l);
        } else {
            System.out.println("both numbers must be positive. please re-run the program");
        }
    }

    /**
     * Iterative Euclidean Algorithm.
     * Returns gcd(a, b) >= 1 for a, b > 0.
     */
    public static int findGCD(int num1, int num2) {
        int larger = 0;
        int q = 0;
        int a = num1;
        int b = num2;
        int r = 1;// this will be the remainder
        int result = 0;
        /// psudocode for the algorithm ///
        //int[] arrR = new int[];
            /*while (arrR[0] != 0) {
                if (num1 > num2) {
                    q = a / b;//calc the value of q
                    arrR[0] = a - (q * b);//calc the value of r
                    a = q * b + arrR[0];// this is the line in the euclidian algorithm
                    q = b / arrR[0];//calc the next value of q
                    arrR[1] = b - (q * arrR[0]);//calculate the new value of the remainder
                    b = q * arrR[0] + arrR[1];//this is the next line in the euclidian algorithm
                    q = arrR[0] / arrR[1];
                    //do to this in a dymanic way that removes having to find a new remainder each time i can use mod/(%)
                }
                return arrR[];//this needs to return the secons last R
                //for eg. if 13=1*8+5
                //8=1*5+3
                //5=1*3+2
                //3=1*2+1
                //2=2*1+0 *stop here


                //here the greatest common denom is the 2nd last of the calc remainder ie.GCD(13,8)=1 which makes sense cause 13 is prime
            }*/
        while (b != 0) {
            r = a % b;
            a = b;
            b = r;
        }
        return a;//this needs to return the second last R
    }



    /**
    * Computes lcm(a, b) using gcd(a, b).
    * Uses long to reduce overflow risk: lcm = (a / gcd) * b.
    *
    * @param num1 the first parameter of the 2 numbers who we want the lcm for
    * @param num2 the second parameter of the 2 numbers who we want the lcm for
    * @return value of the expression of a*b/gcd(a,b)
    */
    public static long findLCM(int num1, int num2) {
        int g = findGCD(num1, num2);
        return ((num1 * num2) / g);
    }
}