import java.util.ArrayList;
import java.util.Arrays;

public class ZuixiaoKheshu {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] arr = new int[]{4,5,1,6,2,7,3,8};
        arr = GetLeastNumbers_Solution(arr,arr.length);
//        for (int i:list
//             ) {
//            System.out.println(i);
//        }
        System.out.println(Arrays.toString(arr));

    }
//    public static int[] GetLeastNumbers_Solution(int [] arr, int k) {
//        heapSort(arr);
//        ArrayList<Integer> list = new ArrayList<>();
//        for(int i = 0; i < k-1; i++){
//            int tmp = arr[arr.length - 1-i];
//            arr[arr.length - 1-i] = arr[0];
//            arr[0] = tmp;
//            adjustDown(arr, 0,arr.length-2-i);
//        }
//        return arr;
//    }
//
//    public static void heapSort(int[] arr){
//        for(int i = (arr.length -1-1)/2; i>= 0; i--){
//            adjustDown(arr,i,arr.length-1);
//        }
//    }
//
//    public static void adjustDown(int[] arr, int k,int len){
//        int left = 2*k +1;
//        while(left <= len){
//            if(left +1 <= len && arr[left +1] > arr[left]){
//                left++;
//            }
//            if(arr[k] < arr[left]){
//                int cur = arr[left];
//                arr[left] = arr[k];
//                arr[k] = cur;
//                k = left;
//                left = 2*k+1;
//            }else{
//                break;
//            }
//        }
//    }
public static int[] GetLeastNumbers_Solution(int [] input, int k) {
    heapSort(input);
    ArrayList<Integer> list = new ArrayList<>();
    for(int i = 0; i < k-1; i++){
        int tmp = input[input.length - 1-i];
        input[input.length - 1-i] = input[0];
        input[0] = tmp;
        adjustDown(input, 0,input.length-2-i);
    }
//    if(k >= input.length){
//        for(int i :input){
//            list.add(i);
//        }
//    }else{
//        for(int i = 0; i<k; i++){
//            list.add(input[i]);
//        }
//    }
    return input;
}

    public static void heapSort(int[] arr){
        for(int i = (arr.length -1-1)/2; i>= 0; i--){
            adjustDown(arr,i,arr.length-1);
        }
    }

    public static void adjustDown(int[] arr, int k,int len){
        int left = 2*k +1;
        while(left <= len){
            if(left +1 <= len && arr[left +1] > arr[left]){
                left++;
            }
            if(arr[k] < arr[left]){
                int cur = arr[left];
                arr[left] = arr[k];
                arr[k] = cur;
                k = left;
                left = 2*k+1;
            }else{
                break;
            }
        }
    }

}
