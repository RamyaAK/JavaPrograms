package interview_programs;

public class NumberPalindrome {
    public static void main(String[] args) {
        int original_number = 12121;
        int number = original_number;
        int rev_number = 0;
        while (number != 0) {
            int digit = number % 10;
            rev_number = rev_number * 10 + digit;
            number = number / 10;
        }

        if (original_number == rev_number) {
            System.out.print(original_number + " Is a Plaindrome!");
        } else {
            System.out.print(original_number + " Not a Plaindrome!");
        }
    }
}
