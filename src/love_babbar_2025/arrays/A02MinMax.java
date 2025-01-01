package love_babbar_2025.arrays;

import java.util.Arrays;

public class A02MinMax {
    public static void main(String[] args) {
        int[] arr = {2, 5, 4, 3, 1, 6};

        int[] res = findMinMax(arr);

        System.out.println(Arrays.toString(res));
    }

    private static int[] findMinMax(int[] arr) {
        int[] res = new int[2];
        res[0] = Integer.MAX_VALUE;
        res[1] = Integer.MIN_VALUE;

        for (int j : arr) {
            res[0] = Math.min(res[0], j);
            res[1] = Math.max(res[1], j);
        }

        return res;
    }
}
