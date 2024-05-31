package interview_programs;

import java.util.Arrays;

public class FindCharacterInGivenArray {
    public static void main(String[] args) {
        char[] a = {'a','g','f','b','o','k'};
        char element = 'k';
        int position =0;

        for(int i=0;i<a.length;i++){
            if(element == a[i]){
                position = i;
            }
            else{
                position =-1;
            }
        }
        if(position!=-1){
            System.out.println("The character "+element+" is found in the array at the position= "+position);
        }
        else{
            System.out.println("The character "+element+" is not found in the array");
        }

        Arrays.sort(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
