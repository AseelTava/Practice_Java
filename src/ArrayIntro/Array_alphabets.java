package ArrayIntro;

import java.util.Arrays;

public class Array_alphabets {
    public static void main(String[] args) {

        char[] ascending = new char[26]; // index: 0~25
        char[] descending = new char[26]; // index: 0~25


        for (int i = 0, j = 'A', k ='Z' ; i < ascending.length; i++, j++, k--) {
            ascending[i] = (char) j; // A ~ Z
            descending[i] = (char) k; // Z ~ A
        }

        System.out.println(Arrays.toString(ascending));
        System.out.println(Arrays.toString(descending));

    }

    }
