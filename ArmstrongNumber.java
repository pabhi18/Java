package Java;
import java.util.*;
public class ArmstrongNumber {
    public static void main(String arr[]){
        Scanner sc = new Scanner(System.in);
        int num, i, n, temp;
        int l=0, sum=0;
        //Entering the number to check whether a number is Armstrong or not
        System.out.println("Enter the number to check:");
        num= sc.nextInt();
        temp=num;
        //determining the length of number
        for(i=0; temp!=0; temp/=10){
            l++;
        }
        temp=num;
        //checking the number armstrong or not
        for(i=0; temp!=0; temp/=10){
            n= (int) Math.pow(temp%10, l);
            sum+=n;
            ;
        }
        //printing Entered number is whether Armstrong or not
        if(sum==num){
            System.out.println("Entered number is Armstrong");
        }
        else{
            System.out.println("Entered numnber is not Armstrong");
        }
    }
}
