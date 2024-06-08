package interview_programs;

public class ReverseWordsAndOrder {
    public static void main(String[] args) {
        // my name = eman ym
        String str = "nayan aka nipin okey";
        String rev = "";

        char[] ch = str.toCharArray();
        for (int i = ch.length - 1; i >= 0; i--) {
            System.out.print(ch[i]);
        }

        String[] input_str = str.split(" ");
        for (int i = input_str.length - 1; i >= 0; i--) {
            rev = rev + input_str[i] + " ";
        }
    }
}
