import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        in.nextLine();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextLine();
        }

        for (int i = 0; i < n; i++) {
            //String str = String.valueOf(arr[i]);
            StringBuffer str2 = new StringBuffer();
            for (int j = 0; j < arr[i].length(); j++) {
                if(arr[i].charAt(j) == '1'  ||arr[i].charAt(j) == '2' ||arr[i].charAt(j)  == '3'){
                    str2.append(arr[i].charAt(j));
                }else if(arr[i].charAt(j) == '0'){

                }else{
                    str2.append(3);
                }
            }
            System.out.println(str2.toString());
        }
    }
}
