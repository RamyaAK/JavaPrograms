package interview_programs;

import java.util.Arrays;

public class MoveZerosToEnd {

    public static void main(String[] args) {

        int[] arr = {0, 1, 0, 3, 0, 12, 0, 2, 1, 0};
        System.out.println("Original array: " + Arrays.toString(arr));

        int n = arr.length;
        int j = 0; // index for placing non-zero elements

        // Traverse the array and if the element is not zero, put it in the next position of the result array
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[j] = arr[i];
                j++;
            }
        }

        // Fill the remaining positions with zeros
        while (j < n) {
            arr[j] = 0;
            j++;
        }
        System.out.println("Array after moving zeros to the end: " + Arrays.toString(arr));
    }


}
