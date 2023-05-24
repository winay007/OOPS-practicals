package Practicals;

import java.util.*;

public class Practical23 {

    static int getLongestConsecutiveSeq(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        HashSet<Integer> set = new HashSet<>();
        int maxLength = 0;

        // Add all numbers to the set
        for (int num : nums) {
            set.add(num);
        }

        // Iterate through the array and check for consecutive sequences
        for (int num : nums) {
            if (!set.contains(num - 1)) { // Check if the current number is the start of a sequence
                int currentNum = num;
                int currentLength = 1;

                while (set.contains(currentNum + 1)) { // Check if the next consecutive number exists
                    currentNum++;
                    currentLength++;
                }

                maxLength = Math.max(maxLength, currentLength);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] nums = { 49, 1, 3, 200, 2, 4, 70, 5, 6 };
        int length = getLongestConsecutiveSeq(nums);

        System.out.println("Length of the longest consecutive sequence: " + length);
    }
}
