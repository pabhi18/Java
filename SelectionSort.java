package Java;
import java.util.*;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Arr[] = new int[10];
        int i, j, temp;
        //Entering element in Array
        System.out.println("Enter 10 numbers in Array");
        for(i=0; i<10; i++){
            Arr[i] = sc.nextInt();
        }
        //Sorting Array 
        for(i=0; i<9; i++){
            for(j=i+1; j>0; j--){
                if(Arr[j]<Arr[j-1]){
                    temp= Arr[j-1];
                    Arr[j-1]=Arr[j];
                    Arr[j]=temp;
                }
                else{
                    break;
                }
            }
        }
        //Printing Sorted Array
        System.out.println("Sorted Array:");
        for(i=0; i<10; i++){
            System.out.println(Arr[i]+" ");
        }
    }
}
