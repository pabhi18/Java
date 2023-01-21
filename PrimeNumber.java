package Java;
import java.util.*;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num, n, i;
        //Entering the limit till we have to find prime numbers
        System.out.println("Enter the Number up till we have to print Prime Numbers");
        num = sc.nextInt();
        //printing the prime numbers
        System.out.print("Prime numbers till "+num+" :");
        for(n=2; n<=num; n++){
            for(i=2; i<n/2; i++){
                if(n%i==0){
                    break;
                }
            }
            if(n%i!=0||n==2){
                System.out.print(n+",");
            }
        }

    }
}
