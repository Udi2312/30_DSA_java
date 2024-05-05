package DSA_practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Recursion3 {
    static ArrayList<Integer> Returningindicesinarraylist(int [] arr, int target, int index){
        if(index == arr.length){
            return new ArrayList<Integer>();
        }
        ArrayList<Integer> ans = new ArrayList<>();
        if(target == arr[index]){
            ans.add(index);
        }
        ArrayList<Integer> sa = Returningindicesinarraylist(arr,target,index+1);
        ans.addAll(sa);
        return ans;
    }
    static void Returnallindices(int [] arr, int target, int index){
        if(index == arr.length){
            return;
        }
        if(target == arr[index]){
            System.out.println(index);
        }
        Returnallindices(arr,target,index+1);
        }
    static int ReturnIndex(int arr[], int target , int index){
        if(index == arr.length){
            return -1;
        }
        if(target == arr[index]){
            return index;
        }
        return ReturnIndex(arr,target,index+1);
    }
    static boolean Checkelement(int[] arr, int index , int target){
        if(index == arr.length){
            return false;
        }
        if(target==arr[index]){
            return true;
        }
        return Checkelement(arr,index+1,target);

    }
    static int Sumofelements(int[] arr, int index){
        if(index == arr.length){
            return 0;
        }
       int a = Sumofelements(arr,index+1);
        return a+arr[index];
    }
    static int Maximumofarray(int [] arr, int index){
        if(index == arr.length){
            return 0;
        }
      int a =  Maximumofarray(arr,index+1);
        if(arr[index] > a){
            return arr[index];
        }
        return a;
    }
    static void Printelements(int [] arr, int index){
        if(index == arr.length){
            return;
        }
        System.out.print(arr[index] + " ");
        Printelements(arr, index+1);
    }
    public static void main(String[] args) {
        /*
        // Printing the elements of array using recursion
        Scanner S = new Scanner(System.in);
        int arr [] = {1,3,5,7,9};
        int index = 0;
        Printelements(arr,index);



        // Finding the maximum in a given array using recursion
        int arr [] = {1,3,5,7,92,89,55,24,0,0,1};
        System.out.println(Maximumofarray(arr,0));



        // Finding the sum of elements in array
        int arr[] = {1,2,3,4,5,8,7,6};
        System.out.println(Sumofelements(arr,0));



        // Check if the given element is present in array or not
        Scanner S = new Scanner(System.in);
        System.out.println("Enter length of array");
        int n = S.nextInt();
        System.out.println("Enter target element");
        int x = S.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter n elements");
        for(int i = 0; i<n; i++){
            arr[i]= S.nextInt();
        }
        if(Checkelement(arr,0,x)){
            System.out.println("Element is present");
        }
        else{
            System.out.println("Element is not present");
        }



        // To return the index if given number is present in an array
        Scanner S = new Scanner(System.in);
        System.out.println("Enter length of array");
        int n = S.nextInt();
        System.out.println("Enter target element");
        int x = S.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter n elements");
        for(int i = 0; i<n; i++){
            arr[i]= S.nextInt();
        }
        System.out.println(ReturnIndex(arr,x,0));



        // To return all indices if the number is present in array
        Scanner S = new Scanner(System.in);
        System.out.println("Enter length of array");
        int n = S.nextInt();
        System.out.println("Enter target element");
        int x = S.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter n elements");
        for(int i = 0; i<n; i++){
            arr[i]= S.nextInt();
        }
        Returnallindices(arr,x,0);

         */

        // Returning all indices in an arraylist ( Continuation to upper problem )
        Scanner S = new Scanner(System.in);
        System.out.println("Enter length of array");
        int n = S.nextInt();
        System.out.println("Enter target element");
        int x = S.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter n elements");
        for(int i = 0; i<n; i++){
            arr[i]= S.nextInt();
        }
      ArrayList<Integer> ans =  Returningindicesinarraylist(arr,x,0);
        System.out.println(ans);
    }
}
