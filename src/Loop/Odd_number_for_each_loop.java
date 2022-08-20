package Loop;

public class Odd_number_for_each_loop {


    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        for (int each : numbers) {

            if (each % 2 != 0) { // find odd numbers
                System.out.println(each);
            }

        }

    }
}
