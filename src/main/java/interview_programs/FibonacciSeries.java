package interview_programs;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 7;
        int n1 = 0;
        int n2 = 1;
        int sum = 0;
        System.out.print(n1 + "\n" + n2 + "\n");

        for (int i = 2; i < n; i++) {
            sum = (n1 + n2);
            System.out.println(sum);
            n1 = n2;
            n2 = sum;
        }
    }
}
