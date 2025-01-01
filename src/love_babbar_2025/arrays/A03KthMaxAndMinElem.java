package love_babbar_2025.arrays;

import java.util.Collections;
import java.util.PriorityQueue;

public class A03KthMaxAndMinElem {
    public static int findKthSmallest(int[] nums, int k) {
        // Create a max-heap using PriorityQueue with reverse order comparator
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        // Add elements to the heap
        for (int num : nums) {
            maxHeap.add(num);
            // Keep heap size limited to k
            if (maxHeap.size() > k) {
                maxHeap.poll(); // Remove the largest element
            }
        }

        // The root of the heap is the kth smallest element
        return maxHeap.peek();
    }

    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;
        System.out.println("The " + k + "th smallest element is: " + findKthSmallest(arr, k));
    }
}
