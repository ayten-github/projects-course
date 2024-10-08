package algorithms;

import java.util.Arrays;

public class MergeSortArrays {
    private static int[] mergeSortedArrays(int[] a, int[] b) {
        int[] mergedArray = new int[a.length + b.length];
        int size_a = 0, size_b = 0, currentSizeMerged = 0;
        while (size_a < a.length && size_b < b.length) {
            if (a[size_a] <= b[size_b]) mergedArray[currentSizeMerged++] = a[size_a++];
            else mergedArray[currentSizeMerged++] = b[size_b++];
        }
        while (size_a < a.length) mergedArray[currentSizeMerged++] = a[size_a++];
        while (size_b < b.length) mergedArray[currentSizeMerged++] = b[size_b++];
        return mergedArray;
    }

    public static void main(String[] args) {
        int[] array1 = {4, 5, 7, 11, 13};
        int[] array2 = {2, 8, 10, 12};
        System.out.println(Arrays.toString(mergeSortedArrays(array1, array2)));
    }
}
