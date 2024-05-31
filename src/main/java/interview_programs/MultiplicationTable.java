package interview_programs;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("Welcome");
        int a = 3, b = 5;
        System.out.println("the value of a is " + a);
        for (int i = 1; i <= 10; i++) {
            //  1*1=1
            System.out.println(a + " * " + i + " = " + (a * i));
        }
        System.out.println("the value of b is " + b);
        for (int i = 1; i <= 10; i++) {
            //  1*1=1
            System.out.println(b + " * " + i + " = " + (b * i));
        }
    }
}
