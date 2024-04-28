package DSA_practice;

import java.util.Scanner;

public class Recursion1 {
    static int Powerfumction2(int p, int q){
        if(q==0){
            return 1;
        }
        int ans = Powerfumction2(p,q/2);
        if(q%2==0){
            return ans * ans;
        }
        else{
            return ans * ans * p;
        }
    }
    static int Powerfumction(int p, int q){
        if(q==0){
            return 1;
        }
     return Powerfumction(p,q-1) * p;
    }
    static int Numberofdigits(int n ){
        if(n==0){
            return 0;
        }
        return Numberofdigits(n/10) + 1;
    }
    static int Sumofdigits(int n){
        if(n==0){
            return 0;
        }
      return  Sumofdigits(n/10) + n%10 ;

    }
    static int fibonaccinumber(int n ){
        if(n==1){
            return 0;
        }
        if(n==2){
            return 1;
        }
        return fibonaccinumber(n-1)+ fibonaccinumber(n-2);
    }
    static int factorialofanumber(int n ){
        if(n==0){
            return 1;
        }
        int ans = n * factorialofanumber(n-1);
        return ans;
    }
    static void PrintNumbersinreverseorder(int n ){
        if(n==1) {
            System.out.print(1+ " ");
            return;
        }
        System.out.print(n + " ");
        PrintNumbersinreverseorder(n-1);
    }
    static void PrintNumbers(int n ){
        if(n==1) {
            System.out.print(1+ " ");
            return;
        }
        PrintNumbers(n-1);
        System.out.print(n+ " ");
    }
    public static void main(String[] args) {

/*
        // Write a method to print n natural numbers
        System.out.println("Enter the number n: ");
        Scanner S = new Scanner(System.in);
        int n  = S.nextInt();
        PrintNumbers(n);



        // Write a method to print numbers from n to 1
        System.out.println("Enter the number n: ");
        Scanner S = new Scanner(System.in);
        int n  = S.nextInt();
        PrintNumbersinreverseorder(n);



        // Write a method to print factorial of a number
        System.out.println("Enter the number: ");
        Scanner S = new Scanner(System.in);
        int n  = S.nextInt();
    int ans = factorialofanumber(n);
        System.out.println("Factorial of the given number is: "+ ans);



        // Write a method to print n fibonacci number
        System.out.println("Enter the number: ");
        Scanner S = new Scanner(System.in);
        int n  = S.nextInt();
      int ans =  fibonaccinumber(n);
        System.out.println(n+ "th fibonacci number is :"+ ans);



        // Printing fibonacci series upto n terms
        System.out.println("Enter the number: ");
        Scanner S = new Scanner(System.in);
        int n  = S.nextInt();
        for(int i = 1; i<n+1; i++){
            System.out.print(fibonaccinumber(i)+ " ");
        }



        // Sum of digits using recursion
        System.out.println("Enter the number: ");
        Scanner S = new Scanner(System.in);
        int n  = S.nextInt();
        System.out.print("Sum of the digits of given number is: ");
        System.out.println(Sumofdigits(n));



        // Number of digits in a given number
        System.out.println("Enter the number: ");
        Scanner S = new Scanner(System.in);
        int n  = S.nextInt();
        System.out.print("Number of digits in the given number are: ");
        System.out.println(Numberofdigits(n));



        // Calculate p^q using recursion
        System.out.println("Enter p: ");
        Scanner S = new Scanner(System.in);
        int p  = S.nextInt();
        System.out.println("Enter q: ");
        int q  = S.nextInt();
        System.out.print("p raised to the power q is: ");
        System.out.println(Powerfumction(p,q));

 */

        // Method 2
        System.out.println("Enter p: ");
        Scanner S = new Scanner(System.in);
        int p  = S.nextInt();
        System.out.println("Enter q: ");
        int q  = S.nextInt();
        System.out.print("p raised to the power q is: ");
        System.out.println(Powerfumction2(p,q));
    }
}
