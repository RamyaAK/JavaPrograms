package interview_programs;

import java.util.HashMap;
import java.util.Map;

public class DuplicateWordsInASentence {
    public static void main(String[] args) {
        String str = "what is my name my name is what";

        Map<String,Integer> map = new HashMap<String,Integer>();

        String[] input_str = str.split(" ");

        for(String s:input_str) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }

        System.out.println(map);
    }

}
