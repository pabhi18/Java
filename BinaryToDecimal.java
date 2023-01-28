package Java;
import java.util.*;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, i, dnum=0,d;
        //Entring Binary Number
        System.out.println("Enter Binary Number:");
        num = sc.nextInt();
        //Converting Binary Number to Decimal
        for(i=0; num!=0;num/=10){
            d = (int) Math.pow(2,i);
            dnum = dnum + d*(num%10);
            i++;
        }
        //Printing Decimal Number of Entered Binary Number
        System.out.println("Decimal Number: "+dnum);
    }
}
