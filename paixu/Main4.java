package paixu;

import java.util.ArrayList;
import java.util.Arrays;

public class Main4 {
    public static void main(String[] args) {
        int[] num = {1,2,30,4,5,6,8,8,9,10};
        int len = 10;
        int k = 3;
        int[] arr = sub(num,len,k);
        System.out.println(Arrays.toString(arr));

    }
    public static int[] sub(int[] Array, int arrayLen,int subArrayLen){
        if(arrayLen <= subArrayLen){
            return  null;
        }
        int index = 0;
        int result = 0;
        for (int i = 0; i <= arrayLen-subArrayLen ; i++) {
            if(Array[i]+Array[i+1]+Array[i+2] > result){
                result = Math.max(Array[i]+Array[i+1]+Array[i+2],result);
                index = i;
            }
        }
        int[] arr1 = new int[2];
        arr1[0] = result;
        arr1[1] = index;
        return arr1;
    }

}

