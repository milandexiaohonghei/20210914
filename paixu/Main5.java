package paixu;

import java.util.*;

public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        Stack<Character> stack = new Stack<>();
        int len = 0;
        while (len < str.length()){
            stack.add(str.charAt(len));
            len++;
        }
        ArrayList<Character> arrayList = new ArrayList<>();
        while (!stack.isEmpty()){
            if(Character.isDigit(stack.peek())){
                arrayList.add(0,stack.pop());
            }
            stack.pop();
        }
        int leng = arrayList.size()/2;
        int[][] inter = new int[leng][2];
        int i = 0;
        int tmp = 0;
        while(i < inter.length){
            for(int j= 0; j < 2; j++){
                inter[i][j] = arrayList.get(tmp) - 48;
                tmp++;
            }
            i++;
        }
        System.out.println();



    }

    public static int find(int[][] arr){
        if(arr.length == 0){
            return 0;
        }
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        int n= arr.length;
        int[] arr1 = new int[n];
        Arrays.fill(arr1,1);
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if(arr[j][1] <= arr[i][0]){
                    arr1[i] = Math.max(arr1[i],arr1[j]+1);
                }
            }
        }
        return n-Arrays.stream(arr1).max().getAsInt();
    }

//    public static int counter (int n){
//        Map<Integer, Integer> map = new HashMap<>();
//        int max=0;
//        int res= 0;
//        for (int i = 1; i <=n ; i++) {
//            int k = 0;
//            int t = i;
//            while (t!=0){
//                k += t%10;
//                t/=10;
//            }
//            map.put(k,map.getOrDefault(k,0)+1);
//        }
//        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
//            if(max == entry.getValue()){
//                res++;
//            }
//        }
//        return res++;
//    }
}
