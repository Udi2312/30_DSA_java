package DSA_practice;
public class Binary_Search {
    static boolean Question_6(int arr[] , int target){
        int st = 0;
        int end = arr.length-1;
        while(st <= end){
            int mid = st + (end - st)/2;
            if(arr[mid] == target){
                return true;
            }
            else if (arr[mid] == arr[st] && arr[mid] == arr[end]) {
                st++;
                end--;
            }
            else if(arr[mid] <= arr[end]) {
                if (arr[mid] < target && target <= arr[end]) {
                    st = mid + 1;
                }

                else{
                    end = mid -1;
                }
            }
            else{
                if(arr[st] <= target && target < arr[mid]){
                    end = mid - 1;
                }
                else{
                    st = mid + 1;
                }
            }

        }
        return false;
    }
    static int Question_5(int arr[], int target){
        int st = 0;
        int end = arr.length-1;
        while(st <= end){
            int mid = st + (end - st)/2;
            if(arr[mid] == target){
                return mid;
            }
           else if(arr[mid] < arr[end]) {
                if (arr[mid] < target && target <= arr[end]) {
                    st = mid + 1;
                }

                else{
                    end = mid -1;
                }
            }
            else{
                if(arr[st] <= target && target < arr[mid]){
                    end = mid - 1;
                }
                else{
                    st = mid + 1;
                }
            }

            }
        return -1;
    }
    static int Question_4(int arr[]){
        int st = 0;
        int end = arr.length-1;
        int ans = -1;
        while(st<= end) {
            int mid = st + (end - st) / 2;
            if (arr[mid] <= arr[end]) {
                ans = mid;
                end = mid - 1;
            }
            else{
                st = mid + 1;
            }
        }
        return ans;
    }
    static int Question_3(int x ){
        int st = 0;
        int end = x;
        int ans = -1;
        while (st<=end){
            int mid = st + (end-st)/2;
            int value = mid*mid;
            if(value == x){
                return mid;
            }
            else if(value < x){
                st = mid + 1;
                ans = mid;
            }
            else{
                end = mid - 1;
            }

        }
        return ans;
    }
    static int Question_2(int arr[] , int target){
        int st = 0;
        int end = arr.length-1;
        int last_occurance = -1;
        while(st <= end){
            int mid = st + (end-st)/2;
            if(arr[mid] == target){
                last_occurance = mid;
                st = mid + 1;
            }
            else if(arr[mid] < target){
                st = mid +1;
            }
            else{
                end = mid - 1;
            }
        }
        return last_occurance;
    }

    static int Question_1(int arr[] , int target){
        int st = 0;
        int end = arr.length-1;
        int first_occurance = -1;
        while(st <= end){
            int mid = st + (end-st)/2;
            if(arr[mid] == target){
                first_occurance = mid;
                end = mid - 1;
            }
            else if(arr[mid] < target){
                st = mid +1;
            }
            else{
                end = mid - 1;
            }
        }
        return first_occurance;
    }
    static boolean Recursive_Binary_Search(int arr[],int st, int end, int target){
        if(st > end){
            return false;
        }
        int mid = st + (end-st)/2;

         if(arr[mid] == target){
            return true;
        }
       else if(arr[mid] < target){
          return Recursive_Binary_Search(arr,mid+1,end,target);
        }
        else{
            return Recursive_Binary_Search(arr,st,mid-1,target);
        }
    }
    static boolean Binary_search(int arr[], int target){
        int st = 0;
        int end = arr.length-1;
        while(st<=end){
            int mid = st + (end-st)/2;
            if(target == arr[mid]){
                return true;
            }
            else if(target < arr[mid]){
                end = mid -1;
            }
            else{
                st = mid + 1;
            }
        }
        return false;
    }
    static void Printarray(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {

        /*

        // Given a Sorted array. Find out if a given target integer is present in the array or not.
        // ( Recursive Binary Search )

        int arr[] = {2,4,5,7,15,24,20,45,50,77};
     boolean b = Recursive_Binary_Search(arr,0,9,24);
        System.out.println(b);



        // ( Iterative Binary Search)
        int arr[] = {2,4,5,7,15,24,20,45,50,77};
        boolean b = Binary_search(arr,24);
        System.out.println(b);

        // We use st + (end-st)/2 instead of (st+end)/2 to avoid reaching the max int value in case (st+end)
        // becomes greater than int max.



        // Question 1
        // Find the first occurance of the given element in a sorted array. Return -1 if element is not present

        int arr[] = {1,2,2,5,5,5,5,6,6,6};
      int ans = Question_1(arr,5);
        System.out.println(ans);



        // Question 2
        // Find the last occurance of the given element in a sorted array. Return -1 if element is not present

        int arr[] = {1,2,8,2,5,5,5,5,6,6,6,8};
        int ans = Question_2(arr,5);
        System.out.println(ans);




        // Question 3
        // Find the square root of a non negitive given number.

        int x = 48;
        int ans = Question_3(x);
        System.out.println(ans);



        // Question 4
        // Given a rotated sorted array, find the index of the minimum element. All elements are unique.
        int arr[] = {15,24,34,45,50,77,2,4,5,7};
        System.out.println(Question_4(arr));



        // Question 5
        // Given a rotated sorted array, find the index of the target element. All elements are unique.
        int arr[] = {15,24,34,45,50,77,2,4,5,7};
        System.out.println(Question_5(arr,34));




        // Question 6
        // Given a rotated sorted array. Find if the target is present in it or not. Duplicates are present
        int arr[] = {15,24,24,34,45,50,50,77,2,4,5,5,7,7};
        System.out.println(Question_6(arr, 50));

         */

    }
}
