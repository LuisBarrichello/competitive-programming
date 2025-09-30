package GfG_160.MoveAllZerosToEndOfArray;

public class MoveAllZerosToEndOfArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
        usingTemporaryArray(arr);
        twoTraversals(arr);
        oneTraversal(arr);
    }

    public static void usingTemporaryArray(int[] arr) {
        int n = arr.length;
        int[] arrTemp = new int[n];
        int track = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arrTemp[track] = arr[i];
                track++;
            }
        }

        while (track < n) {
            arrTemp[track++] = 0;
        }

        for (int i = 0; i < n; i++) {
            arr[i] = arrTemp[i];
        }
    }

    public static void twoTraversals(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }

        while (count < arr.length) {
            arr[count++] = 0;
        }
    }

    public static void oneTraversal(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
        }
    }
}
