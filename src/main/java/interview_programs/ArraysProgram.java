package interview_programs;

import java.util.Scanner;

public class ArraysProgram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array elements");

        int[] arr = new int[5];
        for(int i = 0; i < arr.length; i++){
           arr[i] = sc.nextInt();
        }
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println(arr[3]);

    }
}
