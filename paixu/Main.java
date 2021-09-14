package paixu;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

    }
    public int longs(String s, int k){
        if(s.length() < k){
            return 0;
        }
        HashMap<Character,Integer> count = new HashMap<>();
        for (int i = 0; i <s.length() ; i++) {
            count.put(s.charAt(i),count.getOrDefault(s.charAt(i),0)+1);
        }
        for (char c:count.keySet()
             ) {
            if(count.get(c) < k){
                int result = 0;
                for(String t:s.split(String.valueOf(c))){
                    result = Math.max(result,longs(t,k));
                }
                return result;
            }
        }
        return s.length();
    }
}
