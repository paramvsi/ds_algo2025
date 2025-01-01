package love_babbar_2025.arrays;

import java.util.Arrays;

// reverse an array
public class A01ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(reverseArray(arr)));
    }

    private static int[] reverseArray(int[] arr) {
        int[] res = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            res[i] = arr[arr.length - 1 - i];
        }

        return res;
    }
}
