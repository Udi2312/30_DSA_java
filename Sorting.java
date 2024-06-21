package DSA_practice;

import java.util.ArrayList;

public class Sorting {
    static void StableCountsortfordigits(int arr[] , int place){
        int n = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > n) {
                n = arr[i];
            }
        }

        int frequecyarr[] = new int[10];
        for (int i = 0; i < arr.length; i++){
            frequecyarr[(arr[i]/place)%10]++;
        }
        for(int i = 1; i<frequecyarr.length; i++) {
            frequecyarr[i] += frequecyarr[i-1];
        }
        int ans[] = new int[arr.length];
        for(int i = arr.length-1; i>=0; i--){
            int idx =frequecyarr[(arr[i]/place)%10] - 1;
            ans[idx]= arr[i];
            frequecyarr[(arr[i]/place)%10]--;

        }
        for(int i = 0; i< arr.length; i++){
             arr[i] = ans[i];
        }
    }
    static void Radixsort(int arr[]) {
        int n = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > n) {
                n = arr[i];
            }
        }

        for (int place = 1; n / place > 0; place *= 10) {
             StableCountsortfordigits(arr, place);
        }

    }
    static int[] StableCountsort(int arr[]){
        int n = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > n) {
                n = arr[i];
            }
        }

        int frequecyarr[] = new int[n + 1];
        for (int i = 0; i < arr.length; i++){
            frequecyarr[arr[i]]++;
        }
        int presumoffrearr[] = new int[n+1];
        presumoffrearr[0] = frequecyarr[0];
        for(int i = 1; i<frequecyarr.length; i++){
            presumoffrearr[i] = frequecyarr[i] + presumoffrearr[i-1];
        }
        int ans[] = new int[arr.length];
        for(int i = arr.length-1; i>-1; i--){
            int n1 = arr[i];
           ans[presumoffrearr[n1]-1] = arr[i];
           presumoffrearr[n1]--;
        }
        return ans;
    }
    static void Countsort(int arr[]) {
        int n = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > n) {
                n = arr[i];
            }
        }

        int frequecyarr[] = new int[n + 1];
        for (int i = 0; i < arr.length; i++){
            frequecyarr[arr[i]]++;
        }
        int k = 0;
        for (int i = 0; i < frequecyarr.length; i++){
            for (int j = 0; j < frequecyarr[i]; j++){
                arr[k]= i;
                k++;
            }
        }
    }
    static int Partition(int arr[], int st, int end) {
        int n = 0;
        int pi = arr[st];
        for (int i = st+1; i <= end; i++) {
            if ( pi > arr[i]) {
                n++;
            }
        }
        swap(arr, st, st + n);
        int i = st;
        int j = end;
        while(i<=n-1 && j>=st+n+1){
            while(arr[i]<=pi){
                i++;
            }
            while(arr[j]>pi){
                j--;
            }
            if(i<=n-1 && j>=st+n+1){
                swap(arr,i,j);
                i++;
                j--;
            }
        }
        return n;
    }
    static void Quicksort(int arr[] , int st, int end){
        if(st>=end){
            return;
        }
      int n = Partition(arr,st,end);
        Quicksort(arr, st,st + n-1);
        Quicksort(arr,st + n+1,end);
    }
    static void Merge(int arr[], int l, int mid, int r){
        int i = 0;
        int j = 0;
        int k = l;
        int left[] = new int[mid-l+1];
        int[] right = new int[r-mid];
        for(int h = 0; h< left.length; h++){
            left[h] = arr[l+h];
        }
        for(int h = 0; h< right.length; h++){
            right[h] = arr[h+mid+1];
        }
        while(i< left.length && j< right.length){
            if(left[i] <= right[j]){
                arr[k] = left[i] ;
                i++;
                k++;
            }
            else{
                arr[k] = right[j] ;
                j++;
                k++;
            }
        }
        while(i< left.length){
            arr[k] = left[i];
            k++;
            i++;
        }
        while(j< right.length){
            arr[k] = right[j];
            k++;
            j++;
        }
    }
    static void Mergesort(int arr[], int l ,int r){
        if(l>=r){
            return;
        }
        int mid = (l+r)/2;
        Mergesort(arr,l,mid);
        Mergesort(arr,mid+1,r);
        Merge(arr,l,mid,r);
    }
    static void Arrangefruits(String fruits[]) {
        for (int i = 0; i < fruits.length - 1 ; i++) {
            int minindex = i;
            for (int j = i + 1; j < fruits.length; j++) {
                if (fruits[j].compareTo(fruits[minindex]) < 0 ) {
                    minindex = j;
                }
            }
            String temp = fruits[i];
            fruits[i] = fruits[minindex];
            fruits[minindex] = temp;
        }
    }
    static void Moveallzerostoend(int arr[]) {
        for (int i = 0; i < arr.length -1; i++) {
                for (int j = 0; j < arr.length - 1 - i; j++) {
                    if (arr[j] == 0 && arr[j+1] != 0) {
                        swap(arr,j,j+1);
                }
            }
        }
    }
    static void swap(int[] arr, int i, int j) {
        int c = arr[i];
        arr[i] = arr[j];
        arr[j] = c;
    }
    static void Insertionsortinascendingorder(int arr[]) {
        for (int i = 1; i < arr.length; i++){
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j-1]){
                    swap(arr,j-1,j);
                }
            }
        }
    }
    static void Selectionsortinascendingorder(int arr[]){
        for(int i = 0; i< arr.length-1; i++){
                int minindex = i;
                for(int k = i+1; k< arr.length;k++){
                    if(arr[k]<arr[minindex]){
                        minindex = k;
                    }
                }
                swap(arr,minindex,i);
            }
        }


    static void Bubblesortinascendingorder(int arr[]){
        for(int i = 0; i< arr.length;i++){
            boolean flag = false;
            for(int j = 0; j< arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if(!flag){
                return;
            }
        }
    }
    public static void main(String[] args) {
        /*
        // Bubble Sort in ascending order
        int arr[] = {7,5,6,4,8,2,3,1};
        Bubblesortinascendingorder(arr);
        for (int i:arr){
            System.out.println(i);
        }



        // Selection sort in ascending order
        int arr[] = {7,5,6,4,8,2,3,1};
        Selectionsortinascendingorder(arr);
        for (int i : arr
             ) {
            System.out.println(i);
        }



        // Insertion sort in ascending order
        int arr[] = {7,5,6,4,8,2,3,1};
        Insertionsortinascendingorder(arr);
        for (int i : arr
        ) {
            System.out.print(i + " ");
        }



        // Move all zeros to the end of the array, maintaining the relative order of the non-zero elements
        int arr[] = {0,5,0,0,3,42};
        Moveallzerostoend(arr);
        for (int i: arr
             ) {
            System.out.print(i+ " ");
        }



        // Given an array of fruits. Arrange them in alphabetical order
        String fruits[] = {"papaya","lime","watermelon","apple","mango","kiwi"};
        Arrangefruits(fruits);
        for (String s: fruits
             ) {
            System.out.println(s);
        }



        // Merge sort

        // 1) Divide the array into 2 equal parts
        // 2) Sort the two subarrays seprately using recursion
        // 3) Merge the two sorted subarrays to get the final sorted array

        // Merge sort in ascending order
        int arr[] = {7,5,6,4,8,2,3,1};
        Mergesort(arr,0,arr.length-1);
        for (int i:
             arr) {
            System.out.print(i+" ");
        }



        // Quick sort

        // Choose a pivot element and place it in it's right place
        // Make sure that the elements before pivot element are less than pivot element and after are greater.
        // Use recursion on elements before and after pivot element seprately to get disired array

        // Quick sort in ascending order
        int arr[] = {7,5,6,4,8,2,3,1};
        Quicksort(arr,0,arr.length-1);
        for (int i:
                arr) {
            System.out.print(i+" ");
        }



        // Count sort

        // make a frequency array of the given array
        // Overwrite the orignal array with the answer

        // Count sort in ascending order
        int arr[] = {7,5,6,4,8,2,3,1};
        Countsort(arr);
        for (int i:
                arr) {
            System.out.print(i+" ");
        }



        // Stability in count sort
        int arr[] = {7,5,6,4,8,2,3,1};
       int ans[] =  StableCountsort(arr);
        for (int i:
                ans) {
            System.out.print(i+" ");
        }



        // Radix Sort

        // Count the number of digits in maximum number of the array
        // Sort the array by only seeing the 1s digits. Then 10s digits, 1000s etc
        // last sorting will give the disired sorted array
        int arr[] = {7,5,6,4,8,2,3,1};
        Radixsort(arr);
        for (int i:
                arr) {
            System.out.print(i+" ");
        }
         */
    }
}
