import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int k = in.nextInt();
        int[][] arr1 = new int[n*k][n*k];
        int[][] arr3 = new int[n][n];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < n; j++) {
                arr3[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int r = i*k;
                int lenr = (i+1)*k;
                int lenc = (j+1)*k;
                for (;r<lenr;++r){
                    for (int c = j*k; c < lenc; c++) {
                        arr1[r][c] = arr3[i][j];
                    }
                }
            }
        }
        for (int i = 0; i <n*k ; i++) {
            for (int j = 0; j < n*k; j++) {
                System.out.print(arr1[i][j] +" ");
            }
            System.out.println( );
        }

    }
}
