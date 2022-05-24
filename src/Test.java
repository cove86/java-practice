public class Test {
    public static int findSmallestInt(int[] args) {
        // Selection sort
        int pos;
        int temp;
        for (int i = 0; i < args.length; i++) {
            pos = i;
            for (int j = i + 1; j < args.length; j++) {
                if (args[j] < args[pos])                  //find the index of the minimum element
                {
                    pos = j;
                }
            }

            temp = args[pos];            //swap the current element with the minimum element
            args[pos] = args[i];
            args[i] = temp;
        }
        return args[0];
    }
    // Sum numbers up to and including n using recursion
    public static int summation(int n) {
        System.out.println(n);
        if (n == 1)
            return 1;
        return summation(n-1) + n;
    }

    public static void main(String[] args){
        System.out.println(findSmallestInt(new int[]{78, 56, -2, 12, 8, -33}));
        System.out.println(summation(10));
    }



}

