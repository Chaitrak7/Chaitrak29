import java.util.Scanner;
public class MatrixAddition {
    public static void main(String[] args) {
       int N =Integer.parseInt(args[0]);
       int[][] matrix1 =new int[N][N];
       Scanner scanner =new Scanner(System.in);
      System.out.println("Enter the elements of the first matrix:");
       for(int i=0;i<N;i++){
           for(int j=0;j<N;j++){
           matrix1[i][j]=scanner.nextInt();}}

      System.out.println("The matrix is:");
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
             System.out.print(matrix1[i][j] +"  ");
        } 
        System.out.println();
      }
    }
  } 
  