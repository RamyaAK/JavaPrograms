package interview_programs;

import java.util.LinkedHashMap;
import java.util.Map;

public class LongestSubStringLength {
    public static void main(String[] args) {
        String str = "accah";

        char[] arr = str.toCharArray();

        String longest_substring = null;
        int longest_substring_length=0;

        Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();

        for(int i = 0; i<=arr.length-1;i++){
            char ch = arr[i];
            if(!map.containsKey(arr[i])){
                map.put(ch,1);
            }
            else {
             i = map.get(ch);
             map.clear();
            }
        }
        if(map.size()>longest_substring_length){
            longest_substring_length = map.size();
            longest_substring= map.keySet().toString();
        }
        System.out.println(longest_substring);
        System.out.println(longest_substring_length);
    }
}
