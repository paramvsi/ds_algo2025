package love_babbar_2025.arrays;

import java.util.Arrays;

public class A06CyclicallyRotateArrayByOne {

    public static void rotateRightByOne(int[] arr) {
        int n = arr.length;
        int last = arr[n - 1];

        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = last;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        rotateRightByOne(arr);
        System.out.println("Array after right rotation by one: " + Arrays.toString(arr));
    }
}
