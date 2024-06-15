package DSA_practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Recursion4 {
    static void KeypadCombination(String digit, String result, String[] keypad){
        if(digit.length() == 0 ){
            System.out.println(result+ " ");
            return;
        }
        int currNum = digit.charAt(0)- '0';
       String currchoices = keypad[currNum];
       for(int i = 0; i<currchoices.length(); i++){
           KeypadCombination(digit.substring(1), result + currchoices.charAt(i), keypad);
       }
    }
    static int FrogJump(int[] height, int index){
        if(index == height.length-1){
            return 0;
        }
        int a =  FrogJump(height,index+1);
        int ans1 = a + Math.abs(height[index]- height[index+1]);
        if(index == height.length-2){
            return ans1;
        }
        int b = FrogJump(height, index+2);
        int ans2 = b + Math.abs(height[index] -  height[index+2]);
        if(ans1> ans2){
            return ans2;
        }
        return ans1;
    }
    static void Printsumofsubsets(int[]arr, int ans){
        if(arr.length == 0){
            System.out.print(ans+ " ");
            return;
        }
        int curr = arr[0];
        int remarr[] = new int[arr.length-1];
        for(int i = 1; i< arr.length; i++){
            remarr[i-1] = arr[i];
        }
        Printsumofsubsets(remarr,ans+curr);
        Printsumofsubsets(remarr,ans);
    }
   static void  PrintSSQ( String s, String currans){
       if(s.length()==0){
           System.out.println(currans);
           return;
       }
       char curr = s.charAt(0);
       String rem = s.substring(1);
       PrintSSQ(rem,currans + curr);
       PrintSSQ(rem, currans);
       
   }
    static ArrayList<String> Returnsubsequences(String s){
        ArrayList<String> ans = new ArrayList<>();
        if(s.length() == 0){
            ans.add(" ");
            return ans;
        }
        char a = s.charAt(0);
        ArrayList<String> Smallans = new ArrayList<>();
        Smallans = Returnsubsequences(s.substring(1));
        for(String s1: Smallans){
            ans.add(s1);
            ans.add(a + s1);
        }
                return ans;
    }
    static boolean Pallendromecheck2(String S , int left, int right){
        if(left >= right){
            return true;
        }
        boolean ans = false;
        if(S.charAt(left) == S.charAt(right)){
            ans = Pallendromecheck2(S, left + 1, right - 1);
        }
        return ans;
    }

    static boolean Pallendromecheck(String S , int index){
        if(index == S.length()){
            return false;
        }
       String Rev =  Reverseastring(S,0);
        if(Rev.equals(S)){
            return true;
        }
        return false;
    }
    static String Reverseastring(String S , int index){
        if(index == S.length()){
            return "";
        }
        String A = "";
         A = A + S.charAt(index);
       return  Reverseastring(S,index+1) + A;
    }
    static String RemoveOccrenceswithoutindex(String S, char target ){
        if( S.length() == 0){
            return "";
        }
        String ans ="";
        if(target != S.charAt(0)){
            ans = ans + S.charAt(0);
        }
        ans = ans + RemoveOccrenceswithoutindex(S.substring(1), target);
        return ans;
    }
    static String RemoveOccurences(String S , char target, int index){
        if(index == S.length()){
            return "";
        }
        String ans = "";
        if(target != S.charAt(index)){
            ans = ans + S.charAt(index);
        }
       ans = ans +  RemoveOccurences(S,target,index+1);
        return ans;
    }
    public static void main(String[] args) {
        /*
        // To remove all occurances of given character from given string
        Scanner S = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String s = S.nextLine();
        System.out.println("Enter the target character to be removed: ");
        char ch = S.next().charAt(0);
        System.out.println(RemoveOccurences(s,ch,0));



        // Method 2 of above question
        Scanner S = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String s = S.nextLine();
        System.out.println("Enter the target character to be removed: ");
        char ch = S.next().charAt(0);
        System.out.println(RemoveOccrenceswithoutindex(s,ch));



        // Reverse a string using recursion
        Scanner S = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String s = S.nextLine();
        System.out.println(Reverseastring(s,0));



        // To tell if a given string is pallendrome or not
        Scanner S = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String s = S.nextLine();
        if(Pallendromecheck(s,0)){
            System.out.println("Given string is pallendrome");
        }
        else{
            System.out.println("Given string is not pallendrome");
        }



        // Pallendrome check method 2
        Scanner S = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String s = S.nextLine();
        System.out.println(Pallendromecheck2(s, 0 ,s.length() -1));



        // Return subsequences of a given string in an arraylist
        Scanner S = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String s = S.nextLine();
        System.out.println(Returnsubsequences(s));




        // Print SSQ( Subsequences ) of a given string
        Scanner S = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String s = S.nextLine();
        PrintSSQ( s, "");


        // Print the sum of all subsets of a given array
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the number of elements in array :");
        int x = S.nextInt();
        System.out.println("Enter the array elements");
        int[] y = new int[x];
        for (int i = 0; i < y.length; i++) {
            y[i] = S.nextInt();
        }
        int ans = 0 ;
        Printsumofsubsets(y,ans);



        // Frog Jump. To find out minimum cost for the frog to travel from starting to end stone
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the number of stones :");
        int x = S.nextInt();
        System.out.println("Enter the height of stones: ");
        int[] y = new int[x];
        for (int i = 0; i < y.length; i++) {
            y[i] = S.nextInt();
        }
        System.out.println("Minimum cost is: " + FrogJump(y, 0));

         */

        // Keypad Combinations that the number could represent
        String s = "253";
        String[] keypad = {"","", "abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        KeypadCombination(s,"",keypad);
    }
}
