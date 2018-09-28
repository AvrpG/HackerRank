import java.util.Scanner;

public class MatrixRotation {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int n = input.nextInt();
        int r = input.nextInt();
        int[][] matrix = new int[m][n];
        for (int i =1; i<=m; i++){
            for (int j=1; j<=n; j++){
                matrix[i][j]=input.nextInt();
            }
        }
        resultMatrix(m,n,r,matrix);
    }
    static int[][] resultMatrix(int m, int n, int r, int[][] matrix){
        if(m==n){
            if (m%2==0){
                for (int i =0; i<=r; i++){

                }
            }
        }
    }
}
