import java.util.Scanner;

public class DashuXiangcheng {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String str = sc.nextLine();
            int len = str.length();
            int[] res = new int[2*len -1];
            for(int i = 0; i < len; i++){
                for (int j = 0; j < len; j++) {
                    int temp = i+j;
                    res[temp] += (str.charAt(i) -'0') *(str.charAt(j) -'0');
                }
            }
            for (int i = res.length-1; i >0 ; i--) {
                if (res[i] > 9) {
                    res[i - 1] += (res[i] / 10);
                    res[i] %= 10;
                }
            }
            StringBuffer str1 = new StringBuffer();
            for (int i: res
                 ) {
                str1.append(i);
            }
            System.out.println(str1.toString());
        }
    }
}
