package DSA_practice;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Collections;

public class Arraylist{
    public static void main(String[] args){
        ArrayList<Integer> l1= new ArrayList<>();
/*

        //Adding elements to arraylist
        l1.add(4);
        l1.add(5);
        l1.add(6);
        l1.add(7);

        // Getting element at ith index
        System.out.println(l1.get(0));

        // Printing the elements with loop
        for(int i = 0; i<l1.size(); i++){
            System.out.println(l1.get(i));
        }

        // Printing the list
        System.out.println(l1);

        // Adding an element at index i
        l1.add(1,99);
        System.out.println(l1);

        // Modifying element at index i
        l1.set(1,10);
        System.out.println(l1);

        // Removing element at index i
        l1.remove(1);
        System.out.println(l1);

        // Removing an element e
        l1.remove(Integer.valueOf(4));
        System.out.println(l1);

        // Checking if a number is present in list or not
        boolean ans = l1.contains(Integer.valueOf(7));
        System.out.println(ans);

        // If you don't specify class, you can add any value to arraylist
        ArrayList l2 = new ArrayList();
        l2.add("Udit");
        l2.add(7);
        l2.add(false);
        System.out.println(l2);




        // Reverse a list
        ArrayList<Integer> l3 = new ArrayList<>();
        l3.add(1);
        l3.add(2);
        l3.add(3);
        l3.add(4);
        l3.add(5);
        l3.add(6);
        System.out.println("Orignal list is: ");
        System.out.println(l3);
        int i = 0;
        int j = l3.size()-1;
        while (i<j){
            Integer temp = Integer.valueOf(l3.get(i));
            l3.set(i,l3.get(j));
            l3.set(j, temp);
            i++;
            j--;
        }
        System.out.println("Reversed list: ");
        System.out.println(l3);



        // Reverse an array( Other method )
        ArrayList<Integer> l3 = new ArrayList<>();

        l3.add(1);
        l3.add(2);
        l3.add(3);
        l3.add(4);
        l3.add(5);
        l3.add(6);
        System.out.println("Orignal list is: ");
        System.out.println(l3);
        Collections.reverse(l3);
        System.out.println("Reversed list :");
        System.out.println(l3);

 */

        // Sort an list of strings in descending order
        ArrayList< String> l = new ArrayList<>();
        l.add("My");
        l.add("name");
        l.add("is");
        l.add("Udit");
        l.add("Bansal");
        System.out.println("Orignal list is: " + l);

        // Sorting in ascending order
        Collections.sort(l);
        System.out.println("Ascending order :" + l);

        // Sorting in descending order
        Collections.sort(l,Collections.reverseOrder());
        System.out.println("Descending order : " + l);
    }
}
