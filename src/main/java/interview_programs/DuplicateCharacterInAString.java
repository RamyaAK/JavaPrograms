package interview_programs;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacterInAString {
    public static void main(String[] args) {
        String str = "pooja";
        Map<Character,Integer> map = new HashMap<Character,Integer>();

        char[] chars = str.toCharArray();

        for(char ch:chars){
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else {
                map.put(ch,1);
            }
        }
        System.out.println(map);
    }
}
