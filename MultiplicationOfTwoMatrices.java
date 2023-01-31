package Java;
import java.util.*;

public class MultiplicationOfTwoMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, k, sum,n, S;
        int A[][]= new int[10][10];
        int B[][]= new int[10][10];
        int C[][]= new int[10][10];
        System.out.println("Enter Order of Matrix");
        n = sc.nextInt();
        //Taking input in 1st Matrix
        System.out.println("Enter Elements in 1st Matrix");
        for(i=0; i<n; i++){
            for(j=0; j<n; j++){
                System.out.print("a"+(i+1)+(j+1)+" = ");
                A[i][j]=sc.nextInt();
            }
        }
        //Taking input in 2nd Matrix
        System.out.println("Enter Elements in 2nd Matrix");
        for(i=0; i<n; i++){
            for(j=0; j<n; j++){
                System.out.print("b"+(i+1)+(j+1)+" = ");
                B[i][j]=sc.nextInt();
            }
        }
        //Multiplying Matrix A to Matrix B
        for(i=0; i<n; i++){
            for(j=0; j<n; j++){
                S=0;
                for(k=0; k<n; k++) {
                    S = S + A[i][j] * B[k][j];
                }
                C[i][j] = S;
            }
        }
        //Printing the Matrix C(A*B)
        System.out.println("Multiplication Of Matrix A and B:");
        for(i=0; i<n; i++){
            for(j=0; j<n; j++){
                System.out.print(C[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
