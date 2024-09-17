package interview_programs;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // In hashmap for key only 1 null key is allowed. for value, multiple null values are allowed.
        HashMap<String,String> hm = new HashMap<>(); //dclr.
        hm.put("username","value1");//assignment
        hm.put("user","value2");
        hm.put("usr","");//null val
        hm.put("","value4"); //1 null key
        hm.put("ggg",""); // null val

        Hashtable<String,String> ht = new Hashtable<>();
        ht.put("ggh","value1");
        ht.put("hhh","value5");
        ht.put("aaa","value4");
        ht.put("user3","");
        ht.put("stuer2","");
        System.out.println(ht);



        //System.out.println(hm);

        for(Map.Entry m: hm.entrySet()){
            System.out.println(m.getKey()+" , "+m.getValue());
        }
    }
}
