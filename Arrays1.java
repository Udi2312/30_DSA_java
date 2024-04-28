package DSA_practice;
import java.util.Arrays;
import java.util.Scanner;

public class Arrays1 {

    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Sum of elements of a given array
        /*
        int arr [] = {1,2,3,4,5};
        int sum = 0;
        for(int i = 0; i < arr.length; i++ ){
            sum = sum + arr[i];
        }
        System.out.println(sum);


        // Find out the maximum element in the given array

        int arr []  = {10,22,3,14,5,56,77,11,9};
        int max = 0;
        for(int i = 0; i < arr.length ; i++){
            if(max < arr[i]){
                 max = arr[i];
            }
        }
        System.out.println(max);





        // Find the given element in the array. If present return index, if not present return -1

        int arr []  = {10,22,3,14,5,56,77,11,9};
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the element you want to search");
        int a = S.nextInt();
        int ans = -1;
        for(int i = 0; i < arr.length; i++){
            if(a == arr[i]){
                ans = i;
                System.out.println("The given number is present in the array. Index is:"+ ans);

            }
        }
        if(ans == -1){
            System.out.println(-1);
        }





        // Deep copy - Reference is not copied but new memory is alocated in Heap

        int arr []  = {10,22,3,14,5,56,77,11,9};
        int arr1 [] = Arrays.copyOfRange(arr, 2,5);
        int arr2[] = Arrays.copyOf(arr, arr.length);
        int arr3 [] = arr.clone();
        printArray(arr1);
        printArray(arr2);
        printArray(arr3);

        // Shallow copy - New variable is created in Stack but Reference to Heap memory is same

        int arr4 [] = arr;
        printArray(arr4);





        // To calculate the no. of occurances of a given element in array. Given element in this case is 5

        int arr []  = {10,22,3,5,14,5,56,77,11,5,9};
        int ans = 0;
        for(int i =0; i< arr.length; i++){
            if(arr[i]==5){
                ans = ans + 1;
            }
        }
        System.out.println(ans);


        // To calculate the last occurence of given element in array. Given element is 5
        int arr[] = {10, 22, 3, 5, 14, 5, 56, 77, 11, 5, 9};
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 5) {
                ans = i;
            }
        }
        System.out.println("Last index at which 5 is found in given array is: "+ ans);



        // count the number of elements greater than given element in array.
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the number");
        int x = S.nextInt();
        int ans = 0;
        int arr[] = {10, 22, 3, 5, 14, 5, 56, 77, 11, 5, 9};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > x ){
                ans = ans + 1;
            }
        }
        System.out.println("Number of elements greater than entered number are: "+ ans);

         */


        // check if the given array is sorted or not
        int arr[] = {10, 22, 3, 5, 14, 5, 56, 77, 11, 5, 9};
        int arr1 [] = {1,2,4,4,4,56,67,78};
        int n = 0;
        for (int i = 0; i < arr1.length -1 ; i++) {
            if (arr1[i] <= arr1[i + 1]) {
                n = n + 1;
            }
        }
            if(n==arr1.length - 1){
                System.out.println("Array is sorted");
            }
            else{
                System.out.println("Array is not sorted");
            }

        }

        }

