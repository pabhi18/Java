package Java;
import java.util.*;

//Main Function or Formula for Insertion Sort
public class InsertionSort{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len, i, n, key, temp;
        int Arr[]= new int[10];
        //Entering Values in Array
        System.out.println("Enter 10 values in Array");
        for(i=0; i<10; i++){
            Arr[i] = sc.nextInt();
        }
        //Sorting Array
        for(i=1; i<10; i++) {
            key = Arr[i];
            for (n = i - 1; n >= 0; n--) {
                if(key<Arr[n]) {
                    temp = Arr[i];
                    Arr[i] = Arr[n];
                    Arr[n] = temp;
                    i = n;
                }
            }
        }
        //Printing Sorting Array
        System.out.print("Sorted Array:");
        for(i=0; i<10; i++){
            System.out.print(Arr[i]+" ");
        }
    }
}

