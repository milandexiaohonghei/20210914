package paixu;

import java.util.ArrayList;
import java.util.HashMap;

public class Main3 {
    public static void main(String[] arg) {
        int[] arr = new int[]{1,1,4,7,7};
        System.out.println(find(arr));

    }
    public static int[] find(int[] arg){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arg.length; i++) {
            if(map.containsKey(arg[i])){
                map.put(arg[i],2);
            }else{
                map.put(arg[i],1);
            }
        }
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < arg.length; i++) {
            if(map.get(i) == 1){
                arr.add(arg[i]);
            }
        }
        int[] result = new int[arr.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = arr.get(i);
        }
        return result;
    }
}
