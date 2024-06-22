package DSA_practice;

import java.util.ArrayList;

public class Sorting2 {
    static void Question3(int arr[]){
        int n = 0;
        int n2 = arr.length-1;
        for(int i = 0;i<=n2;){
            if(arr[i] == 0){
                swap(arr,i,n);
                n++;
                i++;
            }
           else if(arr[i] == 1){
                i++;
            }
                else{
                swap(arr,i,n2);
                n2--;

            }
        }
    }
    static void swap(int arr[], int x, int y){
        int z = arr[x];
        arr[x] = arr[y];
        arr[y] = z;
    }
    static void Question2(int arr[]){
        int n = 0;
        for(int i = 0; i< arr.length; i++){
            if(arr[i] < 0){
                swap(arr,n,i);
                n++;
            }
        }
    }

    public static void main(String[] args) {
        /*


        // Question 1
        // Given an array which is in ascending order except for 2 elements which are swapped.Sort in linear time.
        // Assume no duplicates in the array

        int arr[] = {3,8,6,7,5,9,10};
        ArrayList<Integer> Indexs = new ArrayList<>();
        for(int i = 0; i< arr.length-1;i++){
            if(arr[i] > arr[i+1]){
                Indexs.add(i);
            }
        }
        int c = arr[Indexs.get(0)];
        arr[Indexs.get(0)] = arr[Indexs.get(1)+1];
        arr[Indexs.get(1)+1] = c;
        for (int i :
             arr) {
            System.out.println(i + " ");
        }



        // More optimal Approach

        int arr[] = {3,8,6,7,5,9,10};
        int x = -1;
        int y = 0;
        for(int i = 0; i< arr.length -1; i++) {
            if (arr[i] > arr[i + 1]) {
                if (x == -1) {
                    x = i;
                } else {
                    y = i + 1;
                }
            }
        }
        if(arr.length > 1) {
            int c = arr[x];
            arr[x] = arr[y];
            arr[y] = c;

            for (int i :
                    arr) {
                System.out.print(i + " ");
            }
        }
        else{
            for (int i :
                    arr) {
                System.out.print(i + " ");
            }
        }



        // Question 2
        // Given an array of positive and negitive integers. Segrigate them in linear time and constant space.
        // Negitive numbers first followed by the positive numbers.

        int arr[] = {19,-20,7,-4,-13,11,-5,3};
        Question2(arr);
        for (int i :
                arr) {
            System.out.print(i + " ");
        }

         */

        // Question 3
        // Given an array of only 0s, 1s and 2s. Sort in ascending order.

        int arr[] = {0,2,1,2,0,0,1,2,1,2,0,0,2,0,1};
        Question3(arr);
        for (int i :
                arr) {
            System.out.print(i + " ");
        }
    }
        }


