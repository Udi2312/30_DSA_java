package DSA_practice;
import java.util.Scanner;
public class Recursion2 {
    static int GCD( int x , int y){
        if(y==0){
            return x;
        }
      return GCD(y,x%y);

    }
    static int FindGCDbyLongdivision(int x, int y) {
        if (x > y && y > 0) {
            while (x % y != 0) {
                int rem = x % y;
                x = y;
                y = rem;
            }
            return y;
        }


        if (x < y && x > 0) {
            while (y % x != 0) {
                int rem = y % x;
                y = x;
                x = rem;
            }
            return x;
        }
        return 0;


    }
    static int SumofSerieswithalternatingsigns(int n){
        if(n==0){
            return 0;
        }
        if(n%2==0){
            return SumofSerieswithalternatingsigns(n-1) - n;
        }

            return SumofSerieswithalternatingsigns(n-1) + n;
        }


    static void PrintMultiples(int k, int n){
        if(k==0){
            return ;
        }
        PrintMultiples(k-1,n);
        System.out.print(n*k + " ");
    }
    public static void main(String[] args) {
/*
        // Print k multiples of n
        Scanner S = new Scanner(System.in);
        System.out.println("Enter n");
        int n = S.nextInt();
        System.out.println("Enter k");
        int k = S.nextInt();
        PrintMultiples(k,n);



        // Find the sum of series with alternating sign ( 1-2+3-4+5...n)
        Scanner S = new Scanner(System.in);
        System.out.println("Enter n");
        int n = S.nextInt();
        System.out.println(SumofSerieswithalternatingsigns(n));



        // Find GCD ( Greatest Common Disvisor)
        // Brute force approach
        Scanner S = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int x = S.nextInt();
        System.out.println("Enter Second Number: ");
        int y = S.nextInt();
        if(x < y){
            for(int i = x; i > 0; i--){
                if(x%i==0 && y%i==0){
                    System.out.println(i + " is the GCD of "+ x +" and "+ y);
                    break;
                }
            }
        }
        if(y < x){
            for(int i = y; i > 0; i--){
                if(x%i==0 && y%i==0){
                    System.out.println(i + " is the GCD of "+ x +" and "+ y);
                    break;
                }
            }
        }



        // Find GCD ( Long division method )
        Scanner S = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int x = S.nextInt();
        System.out.println("Enter Second Number: ");
        int y = S.nextInt();
        System.out.println("GCD of given numbers is: " +FindGCDbyLongdivision(x,y));

 */

        // Find GCD ( Euclid's Algorithm Method )
        Scanner S = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int x = S.nextInt();
        System.out.println("Enter Second Number: ");
        int y = S.nextInt();
        System.out.println("GCD of given numbers is: " + GCD(x,y));
    }
}
