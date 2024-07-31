package interview_programs;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListArrayLinkedListExample {
    public static void main(String[] args)
    {
        ArrayList<String> arrlistobj = new ArrayList<String>();
        arrlistobj.add("0. Practice.GeeksforGeeks.org");
        arrlistobj.add("1. Quiz.GeeksforGeeks.org");
        arrlistobj.add("2. Code.GeeksforGeeks.org");
        arrlistobj.remove(1);  // Remove value at index 2
        System.out.println("ArrayList object output :" +  arrlistobj);

        // Checking if an element is present.
        if (arrlistobj.contains("2. Code.GeeksforGeeks.org"))
            System.out.println("Found");
        else
            System.out.println("Not found");


        LinkedList llobj = new LinkedList();
        llobj.add("0. Practice.GeeksforGeeks.org");
        llobj.add("1. Quiz.GeeksforGeeks.org");
        llobj.add("2. Code.GeeksforGeeks.org");
        llobj.remove("0. Practice.GeeksforGeeks.org");
        System.out.println("LinkedList object output :" + llobj);

        // Checking if an element is present.
        if (llobj.contains("2. Code.GeeksforGeeks.org"))
            System.out.println("Found");
        else
            System.out.println("Not found");
    }

}
