package interview_programs;

public class SumOfArrayElements {
    public static void main(String[] args) {
        int[] a = {1,5,6,2,9,10};

        int sum =0;

        for(int i=0;i<a.length;i++){
            sum = sum +a[i];
        }
        System.out.println("The sum of array elements is ="+sum);
    }
}
