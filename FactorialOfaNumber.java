package Java;
import java.util.*;

public class FactorialOfaNumber {
    //Method to find Factorial of a number
    static int fact(int n){
        int i, f=1;
        for(i=1; i<=n; i++){
            f=f*i;
        }
        return f;
    }
    //Main Function
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num, F;
        System.out.println("Enter a number");
        num=sc.nextInt();
        F=fact(num);
        System.out.println("Factorial of "+num+" is "+F);
    }
}
