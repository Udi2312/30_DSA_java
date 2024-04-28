package DSA_practice;
import java.lang.reflect.Array;
import java.util.Scanner;
public class Arrays2 {
    static int sumofarray(int arr[]){
        int j =0;
        for(int i =0; i<arr.length; i++){
            j = j+ arr[i];
        }
        return j;
    }
    static int[] makesuffixsumarray(int arr[]){
        int suff[] = new int[arr.length];
        suff[arr.length-1] = arr[arr.length-1];
        for(int i = arr.length-2 ; i>= 0 ; i--){
            suff[i] = suff[i+1] + arr[i];
        }
        return suff;
    }
    static int[] makeprefixsumarray(int arr[]){
        int pref[] = new int[arr.length];
        pref[0] = arr[0];
        for(int i = 1; i< arr.length; i++){
            pref[i] = pref[i-1] + arr[i];
        }
        return pref;
    }
    static void swap(int[] arr, int i, int j) {
        int c = arr[i];
        arr[i] = arr[j];
        arr[j] = c;
    }

    static void reversinganarray(int arr[], int i, int j) {

        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }

    }

    static int[] inputarray() {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the number of elements in array :");
        int x = S.nextInt();
        System.out.println("Enter the array elements");
        int[] y = new int[x];
        for (int i = 0; i < y.length; i++) {
            y[i] = S.nextInt();
        }
        return y;
    }

    static void printarray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
    }

    static boolean checknumber(int arr[], int a) {
        boolean x = false;
        for (int i = 0; i < arr.length; i++) {
            if (a == arr[i]) {
                x = true;
                break;
            }
        }
        return x;
    }

    public static void main(String[] args) {
        // To find out how many element pairs in an array give sum equal to entered number
/*
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the number:");
        int x = S.nextInt();
        int ans = 0;
        int arr[] = {10, 22, 3, 5, 14, 15, 56, 77, 11, 6, 9};
        for (int i = 0; i < arr.length; i++) {
            int y = x - arr[i];
            boolean a = checknumber(arr, y);
            if (a == true) {
                ans = ans + 1;
            }

        }
        System.out.println("Number of pairs that would add to to give " + x + " are " + ans / 2);


        // other approach
        int arr[] = {10, 22, 3, 5, 14, 15, 56, 77, 11, 6, 9};
        Scanner S1 = new Scanner(System.in);
        System.out.println("Enter the number:");
        int x1 = S1.nextInt();
        int ans1 = 0;
        for (int i = 0; i < arr.length; i++) {
            for(int j = i+1; j< arr.length; j++){
                if( arr[i] + arr[j] == x1){
                 ans1++;
                }
            }
        }
        System.out.println(ans1);



        // In the given array only 1 number is there which is not repeated twice. Find that number.
        int [] arr = {40,3,5,1,3,1,5};
        int sumarray = 0;

        for(int i =0; i< arr.length; i++){
            sumarray = sumarray + arr[i];
        }
            int sum = 0;
        for(int i =0; i< arr.length; i++){
            for(int j = i+1; j< arr.length; j++){
                if(arr[i] == arr[j]){
                    sum = sum + arr[i];
                }
            }
        }
        int ans = sumarray- 2* sum;
        System.out.println(ans);


        // Other approach
        int [] arr = {4,3,5,1,3,1,5,4,9};
        for(int i = 0; i< arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        for(int i = 0; i< arr.length; i++){
            if(arr[i] > 0){
                System.out.println(arr[i]);
            }
        }




        // Find the second largest element in an array
        int arr[] = {10, 22, 3, 5, 14, 15, 56, 77, 11, 6, 9};
        int maxvalue = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxvalue) {
                maxvalue = arr[i];
            }
        }
        System.out.println("Maximum value of array is: " + maxvalue);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == maxvalue) {
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int secondmaxvalue = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secondmaxvalue) {
                secondmaxvalue = arr[i];
            }
        }
        System.out.println("Second Maximum value of array is: " + secondmaxvalue);




        // Reversing an array
        int arr[] = {1,2,33,4,5,64,78,55,8};
        int ans [] = new int[arr.length];
        for(int i = arr.length - 1; i >= 0; i--){
             ans [arr.length-i-1] = arr[i];
        }
        printarray(ans);




        // Rotating an array by k steps
        int arr[] = inputarray();
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the number by which you want to rotate the array:");
        int k = S.nextInt();
        int n = arr.length;
        int j = 0;
        int u = k%n;
        int ans[] = new int[n];
        for (int i = n - u; i < n; i++) {
            ans[j++] = arr[i];
        }
        for (int i = 0; i < n-u; i++) {
            ans[j++] = arr[i];
        }
        System.out.println("Rotated array is: " + " ");
        printarray(ans);





        // Rotate the array by k steps without using new array
        int arr[] = inputarray();
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the number by which you want to rotate the array:");
        int k = S.nextInt();
        int n = arr.length;
        int u = k%n;
        reversinganarray(arr , 0 , n - u  -1);
        reversinganarray(arr, n- u , n - 1);
        reversinganarray(arr , 0 , n-1);
        printarray(arr);



        // Given an array and queries which are to be checked if present in array or not.
        int arr [] = {1,2,4,5,6,7,7,85,6,8,98,76};
        Scanner S = new Scanner(System.in);
        System.out.println("Enter number of queries to be searched: ");
        int q = S.nextInt();
        int frearr [] = new int [100001];
        for(int i = 0; i< arr.length; i++){
            frearr[arr[i]]++;
        }
        for(int i = 0; i<q ; i++){
            System.out.println("Enter the number to be searched: ");
            int k = S.nextInt();
            if(frearr[k] > 0){
                System.out.println("Entered number is present in array: ");
            }
            else{
                System.out.println("Given number not present in array: ");
            }
        }




        // Sort an array consisting of 0s and 1s
        int arr[] = inputarray();
        int zeros = 0;
        for(int i = 0; i< arr.length; i++) {
            if (arr[i] == 0) {
                zeros++;
            }
        }
            for(int i = 0; i< zeros; i++){
                arr[i] = 0;
            }
        for(int i = zeros; i< arr.length; i++){
            arr[i] = 1;
        }
        System.out.println("Sorted array is: ");
        printarray(arr);




        // Other approach
        int arr[] = inputarray();
        int left = 0;
        for (int right = arr.length - 1; left < right; ) {
            if (arr[left] == 1 && arr[right] == 0) {
                swap(arr, left, right);
                left++;
                right--;
            }
            if (arr[left] == 0) {
                left++;
            }
            if (arr[right] == 1) {
                right--;
            }
        }
        System.out.println("Sorted array is: ");
        printarray(arr);





        // Given an array. Return after putting all even integers before odd integers.
        int arr[] = inputarray();
        int left = 0;
        int right = arr.length -1 ;
        while(left < right){
            if (arr[left]%2 != 0 && arr[right]%2 == 0) {
                swap(arr, left, right);
                left++;
                right--;
            }
            if (arr[left]%2 == 0) {
                left++;
            }
            if (arr[right]%2 != 0) {
                right--;
            }
        }
        printarray(arr);




        // A sorted array is given in non decreasing order(including negitive numbers). Return an array consisting of squares of elemets in array in non decreasing order.
        int arr[] =inputarray();
        int left = 0;
        int right = arr.length-1;
        int ans [] = new int[arr.length];
        int k = 0;
        while(left <= right) {
            if (arr[left] * arr[left] > arr[right] * arr[right]) {
                ans[k] = arr[left] * arr[left];
                left++;
                k++;

            }
            else {
                ans[k] = arr[right] * arr[right];
                right--;
                k++;
            }
        }
        System.out.println("Orignal Array is: ");
        printarray(arr);
        System.out.println("Answer array is: ");
        printarray(ans);



        // Return the prefix sum array of a given array
        int arr[] = inputarray();
        int pref[] = new int[arr.length];
        pref[0] = arr[0];
        for(int i = 1; i< arr.length; i++){
            pref[i] = pref[i-1] + arr[i];
        }
        System.out.println("Input Array is: ");
        printarray(arr);
        System.out.println("Prefix sum array is: ");
        printarray(pref);



        // Other approach (Without creating a new array)
        int arr[] = inputarray();
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i-1] + arr [i];
        }
        System.out.println("Prefix Sum array is: ");
        printarray(arr);



        // Given an array of size n. Answer q queries in which you need to print the sum of values from given indexes l to r ( both included)
        // NOTE - l and r follow 1 based indexing.
        int arr[] = inputarray();
        System.out.println("Enter the number of queries to be answered: ");
        Scanner S = new Scanner(System.in);
        int q = S.nextInt();
        int pref [] = makeprefixsumarray(arr);
        for(int i = 0; i<q; i++){
            System.out.println("Enter l");
            int l = S.nextInt();
            System.out.println("Enter r");
            int r = S.nextInt();
            int ans = pref[r-1] - pref[l-1] + arr[l-1];
            System.out.println("Sum of the numbers from l to r indices is: " + ans);
        }


        // Tell that if an array could be divided into 2 subarrays of equal sum.
        int arr[] = inputarray();
        int pref[] = makeprefixsumarray(arr);
        int suff[] = makesuffixsumarray(arr);
        int j = 0;
        for(int i = 0; i< arr.length; i++){
            if(pref[i] == suff[i] - arr[i]){
                j++;
            }
        }
        if(j>0){
            System.out.println("Array is dividable");
        }
        else{
            System.out.println("Array cannot be divided");
        }

 */

        // Other approach
        int arr[] = inputarray();
        int pref[] = makeprefixsumarray(arr);
        int sum = sumofarray(arr);
        int j = 0;
        for(int i = 0; i< arr.length; i++){
            if(pref[i] == sum/2){
                j++;
            }
        }
        if(j>0){
            System.out.println("Array is dividable");
        }
        else{
            System.out.println("Array cannot be divided");
        }

        }

}





