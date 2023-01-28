package Java;
import java.util.*;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, i, bnum=0, d;
        //Entring Decimal Number
        System.out.println("Enter Decimal Number");
        num = sc.nextInt();
        //Converting Decimal Number to Binary
        for(i=0; num!=0; num/=2){
            d = (int)Math.pow(10,i);
            bnum = bnum+(num%2)*d;
            i++;
        }
        //Printing Binary Number of Entered Number
        System.out.println("Binary Number: "+bnum);


    }
}
