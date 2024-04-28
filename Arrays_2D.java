package DSA_practice;

import java.util.Scanner;

public class Arrays_2D {
    static int[] makeprefixsumarray(int arr[]) {
        int pref[] = new int[arr.length];
        pref[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            pref[i] = pref[i - 1] + arr[i];
        }
        return pref;
    }

    static void Transposeofmatrix(int arr[][]) {
        int ans[][] = new int[arr[1].length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[1].length; j++) {
                ans[j][i] = arr[i][j];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[1].length; j++) {
                arr[i][j] = ans[i][j];
            }
        }
    }

    static int[][] Swaparrayelements(int arr[][], int r1, int c1, int r2, int c2) {
        int c = arr[r1][c1];
        arr[r1][c1] = arr[r2][c2];
        arr[r2][c2] = c;
        return arr;
    }

    static void print2Darray(int arr[][]) {
        Scanner S = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] take2Darrayinput() {
        System.out.println("Enter number of Rows: ");
        Scanner S = new Scanner(System.in);
        int r = S.nextInt();
        System.out.println("Enter number of Columns: ");
        int c = S.nextInt();
        int arr[][] = new int[r][c];
        System.out.println("Enter " + r * c + " elements");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = S.nextInt();
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        /*
        // Addition of 2 matrices
        int arr1[][] = take2Darrayinput();
        int arr2[][] = take2Darrayinput();
        int r = arr1.length;
        int c = arr1[1].length;
        int ans[][] = new int[r][c];
        if(arr1.length != arr2.length || arr1[1].length != arr2[1].length){
            System.out.println("Wrong Input");
        }
        else{
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                ans[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
            System.out.println("Addition of these matrices is: ");
            print2Darray(ans);
        }



        // Multiply 2 matrices
        int arr1[][] = take2Darrayinput();
        int arr2[][] = take2Darrayinput();
        int ans[][] = new int[arr1.length][arr2[1].length];
        if(arr1[1].length == arr2.length) {
            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr2[1].length; j++) {
                    for (int k = 0; k < arr1[1].length; k++) {
                        ans[i][j] += arr1[i][k] * arr2[k][j];
                    }
                }
            }
        }
        else{
            System.out.println("Wrong input - Matrices can't be multiplied");
        }
        System.out.println("Answer Matrix is: ");
        print2Darray(ans);



        // Transpose of a matrix
        int[][] arr = take2Darrayinput();
        int ans [][] = new int[arr[1].length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[1].length; j++) {
                ans[j][i] = arr[i][j];
            }
        }
        System.out.println("Transpose of given matrix is: ");
        print2Darray(ans);




        // Transpose of given matrix inplace( without creating different matrix)
        int[][] arr = take2Darrayinput();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr[1].length; j++) {
              Swaparrayelements(arr,i,j,j,i);
            }
        }
        System.out.println("Transpose of given matrix is: ");
        print2Darray(arr);
        // This method works only for square matrices




        // Rotate a matrix by 90 degrees
        int arr[][] = take2Darrayinput();
        Transposeofmatrix(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[1].length/2; j++) {
                Swaparrayelements(arr, i, j, i, arr.length - j - 1);
            }
        }
        System.out.println("Rotated matrix is: ");
        print2Darray(arr);




        // Print n rows of Pascal's triangle
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the number of rows you want to be printed: ");
        int n = S.nextInt();
        int ans[][] = new int[n][];
        for (int i = 0; i < n; i++) {
            ans[i] = new int[i + 1];
            ans[i][0] = ans[i][i] = 1;
            for (int j = 1; j < i; j++) {
                    ans[i][j] = ans[i - 1][j] + ans[i - 1][j - 1];

            }
        }
        System.out.println("Pascal's triangle of " + n + " rows is: ");
        print2Darray(ans);


        // Print elements of matrix in spiral form
        int arr[][] = take2Darrayinput();
        int tr = 0;
        int rc = arr[1].length - 1;
        int br = arr.length - 1;
        int lc = 0;
        int totalelements = 0;
        System.out.println("Spiral of given matrix is: ");
        while(totalelements< arr.length*arr[0].length){
            for(int j = lc; j<=rc && totalelements< arr.length*arr[0].length; j++){
                System.out.print(arr[tr][j] + " ");
                totalelements++;
            }
            tr++;
            for(int i = tr; i<=br && totalelements< arr.length*arr[0].length; i++){
                System.out.print(arr[i][rc] + " ");
                totalelements++;
            }
            rc--;
            for(int j = rc; j>=lc && totalelements< arr.length*arr[0].length; j--){
                System.out.print(arr[br][j] + " ");
                totalelements++;
            }
            br--;
            for(int i = br; i>=tr && totalelements< arr.length*arr[0].length; i--){
                System.out.print(arr[i][lc] + " ");
                totalelements++;
            }
            lc++;
        }




        // Given an integer n. Generate a n*n matrix and fill numbers from 1 to n^2 in spiral order.
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = S.nextInt();
        int arr[][] = new int[n][n];
        int num = 1;
        int tr = 0;
        int br = arr.length - 1;
        int rc = arr[1].length - 1;
        int lc = 0;
        int totalelements = 0;
        while (totalelements < arr.length * arr[1].length) {
            for (int i = lc; i <= rc && totalelements < arr.length * arr[1].length;i++ ){
                arr[tr][i] = num;
                num++;
                totalelements++;
            }
            tr++;

            for (int i = tr; i <= br && totalelements < arr.length * arr[1].length;i++ ){
                arr[i][rc] = num;
                num++;
                totalelements++;
            }
            rc--;

            for (int i = rc; i >= lc && totalelements < arr.length * arr[1].length;i-- ){
                arr[br][i] = num;
                num++;
                totalelements++;
            }
            br--;

            for (int i = br; i >= tr && totalelements < arr.length * arr[1].length;i-- ){
                arr[i][lc] = num;
                num++;
                totalelements++;
            }
            lc++;
        }
        System.out.println("Answer array is: ");
        print2Darray(arr);



        // Given a matrix of r*c. Take two points as inputs and calculate the sum of numbers inside the triangle formed by those points.
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int r = S.nextInt();
        System.out.println("Enter the number of columns: ");
        int c = S.nextInt();
        int num = 1;
        System.out.println("Enter the first coordinate: ");
        int r1 = S.nextInt();
        int c1 = S.nextInt();

        System.out.println("Enter the second coordinate: ");
        int r2 = S.nextInt();
        int c2 = S.nextInt();


        int arr[][] = new int[r][c];
        for(int i = 0; i<r; i++){
            for(int j =0; j<c; j++){
                arr[i][j] = num;
                num++;
            }
        }
        int sum = 0;
        for(int i = r1; i<=r2; i++) {
            for (int j = c1; j <= c2; j++) {
                sum = arr[i][j] + sum ;
            }
        }
        System.out.println("Orignal array is: ");
        print2Darray(arr);
        System.out.println();
        System.out.println("Sum of the elements of rectangle formed by given coordinates is: "+ sum);



        // Other Method( Prefix Sum of horizontal rows)
        Scanner S = new Scanner(System.in);
        int arr[][] = take2Darrayinput();
        System.out.println("Enter the first coordinate: ");
        int r1 = S.nextInt();
        int c1 = S.nextInt();

        System.out.println("Enter the second coordinate: ");
        int r2 = S.nextInt();
        int c2 = S.nextInt();
        for(int i = r1; i<=r2 ; i++){
            arr[i] = makeprefixsumarray(arr[i]);
        }
        int ans = 0;
        for(int i = r1 ; i<=r2 ; i++){
            ans = ans + arr[i][c2]- arr[i][c1-1] ;
        }
        System.out.println("Sum of the elements of rectangle formed by given coordinates is: "+ ans);

         */


        // Other Method (Using prefix sum both row wise and column wise)
        Scanner S = new Scanner(System.in);
        int arr[][] = take2Darrayinput();
        System.out.println("Enter the first coordinate: ");
        int r1 = S.nextInt();
        int c1 = S.nextInt();

        System.out.println("Enter the second coordinate: ");
        int r2 = S.nextInt();
        int c2 = S.nextInt();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = makeprefixsumarray(arr[i]);
        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = arr[i][j] + arr[i - 1][j];
            }
        }
        if (r1 >= 1 && c1 >= 1) {
            int ans = arr[r2][c2] - arr[r1 - 1][c2] - arr[r2][c1 - 1] + arr[r1 - 1][c1 - 1];
            System.out.println("Sum of the elements of rectangle formed by given coordinates is: " + ans);
        }

        else{
            int ans = arr[r2][c2] ;
            System.out.println("Sum of the elements of rectangle formed by given coordinates is: " + ans);
        }
    }
}