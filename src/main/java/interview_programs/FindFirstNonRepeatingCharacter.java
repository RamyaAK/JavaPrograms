package interview_programs;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindFirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String str ="gfhfeyyswhwg";
        char c = 0;

        char[] charArray = str.toCharArray();
        Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();

        for(char ch:charArray){
           map.put(ch,map.getOrDefault(ch,0)+1);
            }
        for(char ch:charArray) {
            if (map.get(ch) == 1) {
                c = ch;
            }
        }
            System.out.println(c);

    }
}
