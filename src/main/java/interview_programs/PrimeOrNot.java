package interview_programs;

public class PrimeOrNot {
    public static void main(String[] args) {
        int n = 9;

        boolean is_prime=true;

        if((n==0)||(n==1)){
           is_prime=false;
        }

        for(int i=2;i<n/2;i++){
            if(n%i==0){
                is_prime=false;
                break;
            }
        }

        if(is_prime==true){
            System.out.println(n+" The given number is prime number");
        }
        else{
            System.out.println(n+ "The given number is not a prime number");
        }

    }
}
