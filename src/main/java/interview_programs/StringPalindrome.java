package interview_programs;

public class StringPalindrome {
    public static void main(String[] args) {
        String original_String = "welcome";

        String reversed_String = "";

        for(int i = original_String.length()-1; i>=0;i--){
            reversed_String = reversed_String + original_String.charAt(i);
        }

        if(original_String.equals(reversed_String)){
            System.out.println(original_String+" Is a Palindrome!");
        }
        else{
            System.out.println(original_String+" Is not a Palindrome!");
        }
    }
}
