import java.util.Scanner;

public class Main4 {
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
                int r = k*i;
                int x= r+k;
                for (; r < x; r++) {
                    int l = j*k;
                    int y = l+k;
                    for (; l < y ; l++) {
                        arr1[r][l] = arr3[i][j];
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
