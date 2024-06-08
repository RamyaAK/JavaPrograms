package interview_programs;

public class StringReversalUsingRecursion {
    public static void main(String[] args) {
        String str = "gqyugfaeif";

        String reverse_Str = reverseUsingrecursion(str);
        System.out.println(reverse_Str);
    }


    static String reverseUsingrecursion(String str){
        //base condition
        if(str.isEmpty() || str.length()==1){
            return str;
        }

        // recursion logic
            return str.charAt(str.length()-1)+reverseUsingrecursion(str.substring(0,str.length()-1));
        }


}
