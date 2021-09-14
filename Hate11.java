import java.util.Scanner;

public class Hate11 {
    public static void main(String[] args) {
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] number = new int[n];
        for (int i = 0; i < number.length; i++) {
            number[i] = scanner.nextInt();
        }
        for (int i = 0; i <number.length ; i++) {
            int temp = number[i];
            while (temp>0){
                int len = (temp+"").length();
                if (len==1){
                    break;
                }
                int k = 1;
                int result = 1;
                for (int j =0; j < len-1; j++) {
                    k = 10*k;
                    result = result+k;
                }
                temp = temp - result;
                if (temp==0){
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
