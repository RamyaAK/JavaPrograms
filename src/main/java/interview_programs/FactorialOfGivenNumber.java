package interview_programs;

public class FactorialOfGivenNumber {
    public static void main(String[] args) {
        int n = 4;
        int fact = 1;

        //  1*2*3*4=24

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("The factorial of " + n + " is " + fact);
    }
}
