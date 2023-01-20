package Java;
import java.util.*;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Arr_num[]= new int[10];
        int i, step, temp;
        System.out.println("Enter 10 values in Array");
        //taking values in array
        for(i=0; i<10; i++){
            Arr_num[i]= sc.nextInt();
        }
        //print entered values
        System.out.print("Unsorted Array:");
        for(i=0; i<10; i++){
            System.out.print(Arr_num[i]+" ");
        }
        //sorting the entered values
        for(step=0; step<9; step++) {
            for (i = 0; i < (9 - step); i++) {
                if (Arr_num[i] > Arr_num[i + 1]) {
                    temp=Arr_num[i+1];
                    Arr_num[i+1]=Arr_num[i];
                    Arr_num[i]=temp;
                }
            }
        }
        //print sorted array
        System.out.print("Sorted Array:"+" ");
        for(i=0; i<10; i++){
            System.out.print(Arr_num[i]+" ");
        }

    }

}
