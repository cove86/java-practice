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
    }
}
