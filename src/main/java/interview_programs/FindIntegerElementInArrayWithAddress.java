package interview_programs;

public class FindIntegerElementInArrayWithAddress {
    public static void main(String[] args) {
        int[] a = {1, 4, 2, 8, 6};
        int element = 10;
        int position=0;

        for (int i = 0; i < a.length; i++) {
            if (element == a[i]) {
                  position =i;
                  break;
            }
            else{
                position =-1;
            }
        }

        if(position !=-1) {
            System.out.println("The element "+element+" is present at location = "+position);
        }
        else {
            System.out.println("The element "+element+" is not present in the array provided.");
        }
    }
}
