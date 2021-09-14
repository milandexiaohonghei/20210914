package paixu;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(compressB(str));

    }

    public static String compressB(String str){
        int size = count(str);
        if(size >= str.length() ){
            return str;
        }
        StringBuffer mystr = new StringBuffer();
        char last = str.charAt(0);
        int count = 0;
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i) == last){
                count++;
            }else{
                mystr.append(last);
                mystr.append(count);
                last = str.charAt(i);
                count = 1;
            }
        }
        mystr.append(last);
        mystr.append(count);
        return mystr.toString();
    }
    public static int count(String str){
        if(str == null || str.isEmpty()){
            return  0;
        }
        char last = str.charAt(0);
        int size = 0;
        int count = 1;
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i) == last){
                count++;
            }else{
                last = str.charAt(i);
                size += 1 + String.valueOf(count).length();
                count = 1;
            }
        }
        size += 1 + String.valueOf(count).length();
        return size;
    }
}
