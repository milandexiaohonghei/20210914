import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.print(num+"=");
        for (int i = 2; i <= num ; i++) {
            while (num%i == 0){
                System.out.print(i);
                num/=i;
                if(num != 1){
                    System.out.print("*");
                }
            }
        }
        System.out.println("\n");
    }
}
