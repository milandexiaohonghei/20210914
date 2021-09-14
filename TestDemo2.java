import java.util.Arrays;
import java.util.Scanner;

public class TestDemo2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int m = in.nextInt();
            int n = in.nextInt();
            in.nextLine();
            //Scanner inx = new Scanner(System.in);
            String str1 = in.nextLine();
            //Scanner inb = new Scanner(System.in);
            String str2 = in.nextLine();
            int[] A = new int[m + n];
            int[] B = new int[n];
            String[] cur1 = str1.split(",");
            int j = 0;
            for (String i:cur1
            ) {
                A[j] = Integer.parseInt(i);
                j++;
            }
            j= 0;
            String[] cur2 = str2.split(",");
            for (String i:cur2
            ) {
                B[j] = Integer.parseInt(i);
                j++;
            }
            System.out.println(Arrays.toString(A));
            System.out.println(Arrays.toString(B));
            int p = 0;
            int q = 0;
            int k = 0;
            int[] arr = new int[m+n];
            while(p < m && q < n){
                if(A[p] >B[q]){
                    arr[k++] = B[q++];
                }else{
                    arr[k++] = A[p++];
                }
            }
            while(p < m){
                arr[k++] = A[p++];
            }
            while(q < n){
                arr[k++] = B[q++];
            }
            for(int i = 0; i < m+n; i++){
                A[i] = arr[i];
                System.out.println(A[i]);
            }
        }
    }
}
