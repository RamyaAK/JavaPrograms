package interview_programs;

public class SortWithoutTemp {
    public static void main(String[] args) {
        int a,b;

        a = 2;
        b = 5;

        System.out.println("before swapping");
        System.out.println("a and b = "+a+" "+b);

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("After swapping");
        System.out.println("a and b = "+a+" "+b);

    }
}
