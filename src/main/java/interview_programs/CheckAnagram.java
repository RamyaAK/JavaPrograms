package interview_programs;

import java.util.Arrays;

public class CheckAnagram {
    public static void main(String[] args) {
        String str1, str2;

        str1 = "silent";
        str2 = "Listen";

        int str1Length = str1.length();
        int str2Length = str2.length();

        if (str1Length != str2Length) {
            System.out.println("The given Strings are not Anagrams");
        }

        char[] ch1 = str1.toLowerCase().toCharArray(); // convert given string to lowercase and to charArray
        char[] ch2 = str2.toLowerCase().toCharArray();


// Arrays.sort(ch1);
        char temp;
        for (int i = 0; i < ch1.length; i++) {
            for (int j = i + 1; j < ch1.length; j++) {
                if (ch1[i] >= ch1[j]) {
                    temp = ch1[i];
                    ch1[i] = ch1[j];
                    ch1[j] = temp;
                }
            }
        }
        System.out.println("ch1 Array contents sorted");
        for (int i = 0; i < ch1.length; i++) {
            System.out.println(ch1[i]);
        }

// Arrays.sort(ch2);
        for (int i = 0; i < ch2.length; i++) {
            for (int j = i + 1; j < ch2.length; j++) {
                if (ch2[i] >= ch2[j]) {
                    temp = ch2[i];
                    ch2[i] = ch2[j];
                    ch2[j] = temp;
                }
            }
        }
        System.out.println("ch2 Array contents sorted");
        for (int i = 0; i < ch2.length; i++) {
            System.out.println(ch2[i]);
        }

        if (Arrays.equals(ch1, ch2)) {
            System.out.println("The given Strings are Anagrams");
        } else {
            System.out.println("The given Strings are not Anagrams");
        }

    }
}
