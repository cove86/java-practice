import java.util.ArrayList;
import java.util.Arrays;

public class practice {
    public static void main(String[] args) {
        // initialise Array List
        ArrayList<String> arrList = new ArrayList<String>();
        // Initialise Array and populate
        String[] arr = {"one", "two", "three", "four"};

        // Loop through Array and add each element to Array List
        for (int i = 0; i < arr.length; i++) {
            arrList.add(arr[i]);
        }

        // For each to print each element in Array List
        for (String item : arrList) {
            System.out.println(item);
        }

        //String Methods
    /*
    We have learned some of the string methods that come with the String class:
    */

        // length()

        System.out.println(arrList.get(0).length());
        // concat()

        System.out.println(arr[0].concat(arrList.get(1)));

        // indexOf()
        System.out.println("Hello".indexOf("e"));
        // charAt()
        System.out.println("Hello".charAt(1));
        // equals() / equalsIgnoreCase()
        System.out.println("Hello".equals("Hello"));
        System.out.println(("Hello".equalsIgnoreCase("hello")));
        // substring()
        System.out.println("Hello Ashley".substring(6));
        // toUpperCase() / toLowerCase()
        System.out.println("hello".toUpperCase());
    }

}





