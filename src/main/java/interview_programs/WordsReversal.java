package interview_programs;

public class WordsReversal {
    public static void main(String[] args) {
        String str = "cow is white is milk";

        String[] input_str = str.split(" ");

        for(int i=input_str.length-1;i>=0;i--){
            System.out.print(input_str[i]+" ");
        }
    }
}
