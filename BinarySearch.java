package Java;
import java.util.Arrays;
import java.util.Scanner;


public class BinarySearch {
    //method to search element in array
    static int search(int arr[],int num, int last){
        int first=0;
        int mid=0, i;

        for(i=0; first<last; i++) {
            mid = (first + last) / 2;
            if (num > arr[mid]) {
                first = mid + 1;
            }
            else if (num < arr[mid]) {
                last = mid - 1;
            }
            else {
                break;
            }
        }
        if(arr[mid]!=num) {
            mid=-1;
        }
        return mid;
    }
    //Main Function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Arr_num[] = new int[10];
        int n, i, index;
        System.out.println("Enter the values in Array in ascending order");
        //Taking values in array in ascending order
        for(i=0; i<10; i++){
            Arr_num[i]=sc.nextInt();
        }
        System.out.println("Enter the searching element");
        //Taking searching element
        n=sc.nextInt();
        index=search(Arr_num,n,9);
        //print the position of element in array
        if(index==-1){
            System.out.println("Not FOUND!!");
        }
        else{
            System.out.println("index of "+n+" is "+index);
        }
    }
}
