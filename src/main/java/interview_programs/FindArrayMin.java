package interview_programs;

import java.util.Arrays;

public class FindArrayMin {
    public static void main(String[] args) {
        int[] a = {20, 15, -30, 2, 5};

        int min = a[0];// assign value of first array element for comparing
        int second_min = a[0];
        int third_min = a[0];

        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                second_min = min; // Update second_min before updating min
                min = a[i]; //assign
            } else if (a[i] < second_min && a[i] != min) {
                third_min = second_min; // Update second_min before updating min
                second_min = a[i]; //assign
            } else if (a[i] < third_min && a[i] != second_min) {
                third_min = a[i];
            }
        }
        System.out.println("The min element is " + min);
        System.out.println("The second min element is " + second_min);
        System.out.println("The Third min element is " + third_min);

        Arrays.sort(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
