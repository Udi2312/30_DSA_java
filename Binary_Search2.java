package DSA_practice;

public class Binary_Search2 {
    static boolean Distancebtwstudents(int arr[], int numofstudents, int mindistance){
        int kidsplaced = 1;
        int lastkid = arr[0];
        for(int i = 1; i< arr.length; i++){
           if(arr[i] - lastkid >= mindistance){
               kidsplaced++;
               lastkid = arr[i];
           }
        }
        return kidsplaced >= numofstudents;
    }
    static int Question_6(int arr[] , int students ){
        if(students > arr.length){
            return -1;
        }
        int st =1;
        int end = (int) 1e9;
        int ans = 0;
        while(st <= end){
            int mid = st +(end -st)/2;
            if(Distancebtwstudents(arr,students,mid)){
                ans = mid;
                st = mid+1;
            }
            else{
                end = mid-1;
            }

        }
        return ans;
    }
    static boolean DistributingChocolates(int arr[], int numofstu, int maxchocoallowed){
        int currnumofstu = 1;
        int currchoco = 0;
        for(int i = 0;i< arr.length;i++){
            if(arr[i] > maxchocoallowed){
                return false;
            }
            if(arr[i] + currchoco <= maxchocoallowed){
                currchoco = currchoco+ arr[i];
            }
            else{
                currnumofstu++;
                currchoco=arr[i];
            }
        }
        if(currnumofstu > numofstu){
            return false;
        }
        return true;
    }
    static int Question_5(int arr[] , int numofstu){
        int st = 1;
        int end = (int) 1e9;
        int ans = 0;
        while(st<=end){
            int mid = st + (end-st)/2;
            if(DistributingChocolates(arr,numofstu,mid)){
                ans = mid;
                end = mid-1;
            }
            else{
                st = mid+1;
            }
        }
        return ans;
    }
    static int Question_4(int arr[]) {
        int st = 0;
        int end = arr.length - 1;
        int ans = -1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if((mid == arr.length-1 || arr[mid] > arr[mid+1]) && (mid == 0 ||arr[mid] > arr[mid-1])){
                return mid;
            }
            else if(arr[mid] > arr[mid+1]){
                end = mid-1;
            }
            else if(arr[mid] < arr[mid+1]){
                st = mid+1;
            }
        }
        return ans;
    }
    static int Question_3(int arr[]) {
        int st = 0;
        int end = arr.length - 1;
        int ans = -1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (arr[mid] < arr[mid + 1]) {
                st = mid + 1;
                ans = mid + 1;
            } else if (arr[mid] > arr[mid + 1]) {
                end = mid - 1;
            }
        }
        return ans;
    }

    static boolean Question_2(int arr[][], int target) {
        int i = 0;
        int j = arr[0].length - 1;
        while (i < arr.length && j >= 0) {
            if (arr[i][j] == target) {
                return true;
            } else if (arr[i][j] < target) {
                i++;
            } else {
                j--;
            }
        }
        return false;
    }

    static boolean Question_1(int arr[][], int target) {
        int st = 0;
        int end = arr[0].length * arr.length - 1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            int row = mid / arr[0].length;
            int column = mid % arr[0].length;
            if (arr[row][column] == target) {
                return true;
            } else if (arr[row][column] < target) {
                st = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        /*
       //  Question_1
         You are given a 2D array in which
         1) All rows are sorted
         2) First element of each row is greater than last element of previous row
         Find if the given target is present in array or not


        int arr[][] = {{1,3,5,7} , {10,11,16,20} , {23,30,34,60}};
        System.out.println(Question_1(arr,16));



        // Question 2
        You are given a 2D array in which
        1) All rows are sorted
        2) All columns are sorted
        Find if the given target is present in array or not

         int arr[][] = {{1,4,7,11,15}, {2,5,8,12,19}, {3,6,9,16,22}, {10,13,14,17,24},{18,21,23,26,30}};
        System.out.println(Question_2(arr,0));



        // Question 3
        An array is a mountain array if the following properties hold
        1) arr.length = 3
        2) There exists an i in 0 <i< arr.length-1 such that
        arr[0]< arr[1]< arr[2]<......arr[i-1]< arr[i]
        arr[i] > arr[i+1] > arr[i+2] >.......arr[arr.length-1]

        i is called peak index. Given a mountain array, return peak index

        int arr[] = {1,2,4,6,8,10,11,87,77,65,7,5,3,0};
        System.out.println(Question_3(arr));


        // Question 4
        A peak is defined as an element which is strictly greater than it's neighbours
        Given an array, find peak element. There can be more than one peaks, in that case return any one
        It is also given that no adjecent elements are not equal.

        int arr[] = {1,2,3,1,4,6,5};
        System.out.println(Question_4(arr));


        // Question 5
        You have n(<10^5) boxes of chocolates, and you have to distribute them to m(<10^4) children so that the
        maximum no. of chocolates a student gets is minimum.

        1) 1 box should be alocated to exactle one student.
        2) All boxes should be allocated.
        3) Each student has to be alloted atleast 1 box.
        4) Boxes must be allocated in contiguos order.

        Calculate and return the minimum possible number.


        int arrofchoco[] = {12,34,67,90};
        int numberofstudents = 2;
        System.out.println(Question_5(arrofchoco,numberofstudents));


        // Question 6



        int distancebtwspots[] = {1,2,4,8,9};
        int numofstudents = 3;
        System.out.println(Question_6(distancebtwspots,numofstudents));
        
         */
    }
}