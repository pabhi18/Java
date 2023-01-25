package Java;

import java.util.Scanner;

public class OccuranceOfanElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, num, sum=0;
        int Arr[]= new int[10];
        //Entering Values in Array
        System.out.println("Enter 10 values in Array");
        for(i=0; i<10; i++){
            Arr[i] = sc.nextInt();
        }
        //Entering value which occurance have to find
        System.out.println("Enter Element:");
        num = sc.nextInt();
        for(i=0; i<10; i++){
            if(Arr[i]==num){
                sum+=1;
            }
        }
        //printing the occurance of entered value
        System.out.println("Occurance of "+num+" is "+sum);
    }
}
