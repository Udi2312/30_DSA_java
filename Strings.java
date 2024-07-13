package DSA_practice;
import java.util.*;
public class Strings {
    public static void main(String[] args) {
        /*
       Scanner sc = new Scanner(System.in);
       // Takes input before space
       String s = sc.next();
       System.out.println(s);
        // Takes complete input
        String s2 = sc.nextLine();
        System.out.println(s2);

        String s = "Udit Bansal";
        System.out.println(s.length());
        char ch = s.charAt(8);
        System.out.println(ch);
        System.out.println(s.indexOf('a'));

        String s = "Hello";
        String a = "Hgllo";
        System.out.println(s.compareTo(a));

        String s = "Udit Bansal";
        System.out.println(s.contains("ansa"));
        System.out.println(s.startsWith("Udi"));
        System.out.println(s.endsWith("sal"));
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());

        String s1 = "Udit ";
        String s2 = "Bansal";
        System.out.println(s1.concat(s2));


        String s = "Udit ";
        s = s + "Bansal";
        s += 10;
        s+= 'a';
        System.out.println(s);
        System.out.println("abc" + 10+ 20);
        System.out.println("abc"+(10+20));


        String S = "Hello";
        System.out.println(S.substring(0,4));
        System.out.println(S.substring(3));


        // Given a string, print all it's substrings

        String s = "abcd";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <= s.length(); j++) {
                System.out.println(s.substring(i, j));
            }
        }



        // Given a string Hello. Change it to heylo.

        String s = "Hello";
        s = s.substring(0,2) + 'y' + s.substring(3);
        System.out.println(s);
        // By this method, we have created a new string Heylo and s is pointing on that. Strings cannot be changed in java


         */
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        // s1 is not equal to s3 as there address is different
        System.out.println(s1.equals(s3));
    }
}
