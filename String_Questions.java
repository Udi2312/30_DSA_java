package DSA_practice;
import java.util.*;
import java.util.concurrent.ScheduledExecutorService;

public class String_Questions {
    static boolean Checkpallendrome(String s) {
        int i = 0,j=s.length()-1;
        boolean a = true;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                a = false;
                break;
            }
            i++;
            j--;
        }
        return a;
    }
    public static void main(String[] args) {
        // Given a string, change the case of all the characters
        /*
        Scanner s = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(s.nextLine());
        for(int i = 0; i<sb.length(); i++){
            int x = sb.charAt(i);
            if(65<=x && x<=90){
                x += 32;
                char d = (char)x;
                sb.setCharAt(i,d);
            }
            else if(x>=97 && x<=122){
                x-= 32;
                char d = (char)x;
                sb.setCharAt(i,d);
            }
        }
        System.out.println(sb);


        // Given a string, find out the number of pallendrome substrings in it

        String s = "hello";
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                 if(Checkpallendrome(s.substring(i, j))){
                     ans++;
                     System.out.print(s.substring(i,j)+ " ");
                 }
            }
        }
        System.out.println("\n" + ans);


        // Given a sentence in a string, reverse every word in it
        String s = "Hello World";
        String a = "";
        StringBuilder sb = new StringBuilder(a);
        for(int i = 0; i<s.length();i++) {
            if(s.charAt(i) != ' '){
                sb.append(s.charAt(i));
            }
            else{
                sb.reverse();
                a += sb;
                a += " ";
                sb = new StringBuilder("");
            }
        }
        if(!sb.isEmpty()){
            sb.reverse();
            a += sb;
        }
        System.out.println(a);

         */
        // Given a string, compress it in such a way that consecutive characters are repalced by the character
        // and followed by the number of occurances of the character
        // Example -
        // Input - aaabbbaayyddde
        // Output- a3b3a2y2d3e

        String input = "aaabbbaayydddeee";
        String ans = "" + input.charAt(0);
        int count = 1;
        for(int i = 1; i<input.length(); i++){
            char prev = input.charAt(i-1);
            char curr = input.charAt(i);
            if(curr == prev){
                count++;
            }
            else{
                if(count>1) {
                    ans += count;
                }
                count = 1;
                ans += curr;
            }
        }
        if(count>1) {
            ans += count;
        }
        System.out.println(ans);
    }
}
