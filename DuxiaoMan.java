import java.util.Scanner;

public class DuxiaoMan {
    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        int x = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (k + arr[i] <= arr[j]){
                    x++;
                }
            }
            sum += arr.length - i+1;
        }
        System.out.println(x + "/" + sum);
    }

    public static void main(String[] args) {

        int[] arr = new int[]{10,10,9,9,8,7,5,6,4,3,4,2};
        int a = findKth(arr,12,3);
        System.out.println(a);
    }


    public static int findKth(int[] a, int n, int K) {
        // write code here
        quickSort(a,0,n-1);
        return a[K-1];
    }
//    public static void quickSort(int[] arr,int left,int right){
//        if(right -left < 1){
//            return;
//        }
//        int mid = arr[left];
//        int start = left;
//        int end = right;
//        boolean ssr = true;
//        while(true){
//            if(ssr){
//                if(arr[end] <= arr[mid]){
//                    end--;
//                }else{
//                    arr[start] = arr[end];
//                    ssr = false;
//                }
//            }else{
//                if(arr[start]>= mid){
//                    start++;
//                }else{
//                    arr[end] = arr[start];
//                    ssr = true;
//                }
//            }
//            if(start == end){
//                arr[start] = mid;
//                break;
//            }
//        }
//        quickSort(arr,left,start-1);
//        quickSort(arr,start+1,right);
//    }
public static void quickSort(int[] arr,int low, int high){
    if(high - low < 1){
        return;
    }
    boolean flag =true;
    int start = low;
    int end = high;
    int midValue = arr[low];
    while (true){
        if(flag){
            if(arr[high] <= midValue){
                high--;
            }else{
                arr[low] = arr[high];
                flag = false;
            }
        }else{
            if(arr[low] >= midValue){
                low++;
            }else{
                arr[high] = arr[low];
                flag = true;
            }
        }
        if(low == high){
            arr[low] = midValue;
            break;
        }
    }
    quickSort(arr,start,low-1);
    quickSort(arr,low+1,end);
}
}
