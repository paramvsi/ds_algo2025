package love_babbar_2025.arrays;


import java.util.ArrayList;
import java.util.List;

public class A05FindUandIofSortedArrays {
    public static List<Integer> findUnion(int[] arr1, int[] arr2) {
        List<Integer> union = new ArrayList<>();
        int i = 0, j = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                union.add(arr1[i]);
                i++;
            } else if (arr1[i] > arr2[j]) {
                union.add(arr2[j]);
                j++;
            } else {
                union.add(arr1[i]);
                i++;
                j++;
            }
        }

        // Add remaining elements
        while (i < arr1.length) {
            union.add(arr1[i]);
            i++;
        }
        while (j < arr2.length) {
            union.add(arr2[j]);
            j++;
        }

        return union;
    }

    public static List<Integer> findIntersection(int[] arr1, int[] arr2) {
        List<Integer> intersection = new ArrayList<>();
        int i = 0, j = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else {
                intersection.add(arr1[i]);
                i++;
                j++;
            }
        }

        return intersection;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 5};
        int[] arr2 = {2, 3, 5};

        System.out.println("Union: " + findUnion(arr1, arr2));
        System.out.println("Intersection: " + findIntersection(arr1, arr2));
    }
}

