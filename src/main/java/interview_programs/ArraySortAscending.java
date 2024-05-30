package interview_programs;

public class ArraySortAscending {
    public static void main(String[] args) {
        int[] arr = {2,1,4,6,8,9,1,0};

        //sorting
        int temp;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i]= arr[j];
                    arr[j]= temp;
                }
            }
        }
        for(int i = 0 ;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}
