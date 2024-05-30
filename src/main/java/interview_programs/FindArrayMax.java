package interview_programs;

public class FindArrayMax {
    public static void main(String[] args) {
        int[] a = {20, 11, 3,101, 4, 0, -2,100};
        int max = a[0];
        int second_max = a[0];

        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                second_max = max;
                max = a[i];
            } else if (a[i]>second_max && a[i]!=max) {
                second_max = a[i];

            }
        }
        System.out.println("The maximum element in array is "+max);
        System.out.println("The second maximum element in array is "+second_max);
    }
}
