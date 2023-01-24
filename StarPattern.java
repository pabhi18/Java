package Java;
import java.util.Scanner;

public class StarPattern {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int i,j;
        System.out.println("Enter number of rows in odd:");
        int r= sc.nextInt();
        for(i=1; i<=(r+1)/2; i++) {
            for (j = 1; j <= ((r + 1) / 2 - i); j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(i=(r-1)/2; i>=1; i--) {
            for (j = 1; j <= ((r + 1) / 2 - i); j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
