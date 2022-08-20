package Loop;

import java.util.Arrays;

public class Reverse_numbers {

    public static void main(String[] args) {

        // Way One
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};

        int[] reverse = new int[array.length]; // {5, 4, 3, 2, 1}

        for (int i = array.length - 1, j = 0; i >= 0; i--) {
            reverse[j++] = array[i];
        }

        System.out.println(Arrays.toString(reverse));

    }
}
