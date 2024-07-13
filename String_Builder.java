package DSA_practice;
import java.util.*;
public class String_Builder {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("Hello");
        /*
        // Adding another string in the end of orignal string
        s.append(" Bansal");
        System.out.println(s);


        // We can also append intergers, float, boolean, etc
        s.append(10);
        s.append(true);
        System.out.println(s);


        // Replacing a character of orignal string with other
        s.setCharAt(1,'n');
        System.out.println(s);


        // Insering character in between the string
        s.insert(3,'y');
        System.out.println(s);


        // Deleting character in between the string
        s.deleteCharAt(0);
        System.out.println(s);


        // Reversing the string
        s.reverse();
        System.out.println(s);

         */
        // Deleting a range of characters
        s.delete(2,4);
        System.out.println(s);

    }
}
