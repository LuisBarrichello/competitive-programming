package GfG_160.SecondLargest;

import java.util.*;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        usingSorting(arr);
        twoPassSearch(arr);
        onePassSearch(arr);
    }

    public static int usingSorting(int[] arr) {
        int n = arr.length;

        Arrays.sort(arr);

        int largest = arr[n - 1];
        int secondLargest;

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] != largest) {
                secondLargest = arr[i];
                return secondLargest;
            }
        }

        return -1;
    }

    public static int twoPassSearch(int[] arr) {
        int n = arr.length;

        int largest = -1, secondLargest = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] > largest)
                largest = arr[i];
        }

        for (int i = 0; i < n; i++) {
           if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

    public static int onePassSearch(int[] arr) {
        int n = arr.length;

        int largest = -1, secondLargest = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }

        return secondLargest;
    }
}
