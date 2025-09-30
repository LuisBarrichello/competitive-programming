// Problem: 349. Intersection of Two Arrays
// Source: https://leetcode.com/problems/intersection-of-two-arrays/description/
// Difficulty: easy
// Tags: Array, Hash Table, Two Pointers, Binary Search, Sorting
// Approach: Built-in Set Intersection. There are built-in intersection facilities, which provide O(n+m) time complexity in the average case and O(n×m) time complexity in the worst case.
// Time limit per test:
// Memory limit per test:
// Input: 2 arrays int
// Output: 1 array with intersection

import java.util.HashSet;
import java.util.Set;

class Intersection {
    public int[] SolutionIntersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }

        Set<Integer> set2 = new HashSet<>();
        for (int num : nums2) {
            set2.add(num);
        }

        set1.retainAll(set2);

        int[] result = new int[set1.size()];
        int i = 0;
        for (int num : set1) {
            result[i++] = num;
        }

        return result;
    }
}