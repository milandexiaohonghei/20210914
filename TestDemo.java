import java.util.*;

public class TestDemo {
    public static void main1(String[] args) {
        ArrayList<Integer> result = new ArrayList<Integer>(0);
        result.add(0);
        System.out.println(result.get(0));
        ArrayList<Integer> result2 = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
        System.out.println(result2.get(0));
    }

    public static void main2(String[] args) {
        Scanner in=new Scanner(System.in);
        int a = in.nextInt();
        int[] array = new int[a];
        for(int i = 0; i < a; i++){
            array[i] = in.nextInt();
        }
        for(int i = 0; i < array.length-1; i++){
            for(int j = 0; j < array.length -1-i;j++){
                if(array[j] > array[j+1]){
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
        String cur = Arrays.toString(array);
        System.out.println(cur);
//        for (int i = 0; i < a; i++) {
//            System.out.println(array[i]);
//        }

    }

    public static void main3(String[] args) {
        int arr[] = {7, 5, 3, 2, 4};
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0 ; j--) {
                if(arr[j] < arr[j-1]){
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }else{
                    break;
                }
            }
        }
    }

    public static void main4(String[] args) {
        int arr[] = {7, 5, 3, 2, 4};
        for (int i = arr.length/2; i > 0 ; i/=2) {
            for(int j = i; j < arr.length; j++){
                for (int k = j; k > 0 && k-i >= 0; k-=i) {
                    if (arr[k] < arr[k - i]) {
                        int temp = arr[k - i];
                        arr[k - i] = arr[k];
                        arr[k] = temp;
                    } else {
                        break;
                    }
                }
            }
        }
    }

    public static void main5(String[] args) {
        int arr[] = {7, 5, 3, 2, 4, 1, 7, 9, 6};
        int high = arr.length - 1;
        int low = 0;
        quickSort(arr,low,high);
        System.out.println(Arrays.toString(arr));
    }

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
                if(arr[high] >= midValue){
                    high--;
                }else{
                    arr[low] = arr[high];
                    flag = false;
                }
            }else{
                if(arr[low] <= midValue){
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

    public static void main1111(String[] args) {
        int arr[] = { 27,15,19,18,28,34,65,49,25,37};
        creatHeap(arr);
        for (int i = 0; i < arr.length - 1 ; i++) {
            int tmp = arr[arr.length - 1-i];
            arr[arr.length - 1-i] = arr[0];
            arr[0] = tmp;
            adjustdown(arr,0,arr.length - 1-i);
        }
        System.out.println(Arrays.toString(arr));

    }
    public static void creatHeap(int[] arr){
        for (int i = (arr.length-1-1)/2; i >= 0 ; i--) {
            adjustdown(arr,i,arr.length);
        }

    }

    private static void adjustdown(int[] arr, int i, int length) {
        int child = 2 * i + 1;
        while(child < length){
            if(child +1 < length && arr[child] < arr[child +1]){
                child++;
            }
            if(arr[i] < arr[child]){
                int tmp = arr[i];
                arr[i] = arr[child];
                arr[child] = tmp;
                i = child;
                child = 2 * i + 1;
            }else{
                break;
            }
        }
    }

    public static void main7(String args[]){
        Scanner in = new Scanner(System.in);
        int a= in.nextInt();
        int[] arr1 = new int[a];
        for(int i = 0;i< a;i++){
            arr1[i] = in.nextInt();
        }
        int[] arr2 = new int[a];
        for(int i = 0;i< a;i++){
            arr2[i] = in.nextInt();
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int result = 1;
        for(int i = 0; i< a;i++){
            int b= comp(arr1,arr2[i]);
            result = result * (b-i);
        }

        System.out.println(result);
    }
    public static int comp(int[] arr1,int x){
        int j = 0;
        for(int i = 0; i<arr1.length;i++){
            if(arr1[i]<= x){
                j++;
            }else{
                break;
            }
        }
        return j;
    }

    public static void main10(String args[]){
        Scanner in = new Scanner(System.in);
        int a= in.nextInt();
        int[] arr = new int[a];
        for(int i = 0;i< a;i++){
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);
        int n= 0;
        int cur = 0;
        int result = 0;
        for(int i = 1;i< arr.length;i++){
            if(arr[i] > arr[i-1]){
                 cur = n * (arr[i] - arr[i-1]) + (arr[i] - arr[i-1]);
                 n++;
            }
            result = result + cur;
        }
        System.out.println(result);
    }

    public static void main11(String[] args) {
        int[] a = { 5,2,3,1,4 };
        int tmp[] = new int [a.length];
        mergeSort(a, 0, a.length-1,tmp);

        System.out.println("排好序的数组：");
        for (int e : a)
            System.out.print(e+" ");
    }

    public static void mergeSort(int[] a,int start,int end,int[] tmp){
        if(start < end){
            int mid =start + (end - start)/2;
            mergeSort(a,start,mid,tmp);
            mergeSort(a,mid+1,end,tmp);
            merge(a,start,mid,end,tmp);
        }
    }

    private static void merge(int[] a, int start, int mid, int end,int[] tmp) {
        int p1 = start;
        int p2 = mid +1;
        int k = start;
        while (p1 <= mid && p2 <= end){
            if(a[p1] <= a[p2]){
                tmp[k++] = a[p1++];
            }else{
                tmp[k++] = a[p2++];
            }
        }
        while (p1 <= mid){
            tmp[k++] = a[p1++];
        }
        while (p2 <= end){
            tmp[k++]=a[p2++];
        }
        k = 0;
        for (int i = start; i <= end; i++) {
            a[i] = tmp[i];
        }
    }

    public static void main13(String[] args) {
        Stack<Integer> stack = new Stack<>();
        System.out.println(stack.isEmpty());
        Queue<Integer> queue = new LinkedList<>();
        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
        System.out.println(stack.size());
        queue.offer(1);
        queue.offer(1);
        for (int i:queue
             ) {
            System.out.println(i);
        }
        StringBuffer str = new StringBuffer();
        str.append(3);
        str.append('4');

    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        in.nextLine();
        String str1 = in.nextLine();
        String str2 = in.nextLine();
        int[] A = new int[m+n];
        int[] B = new int[n];
        for(int i =0; i<str1.length();i++){
            if(str1.charAt(i) != ','){
                A[i] = str1.charAt(i) -'0';
            }
        }
        for(int i =0; i<str2.length();i++){
            if(str2.charAt(i) != ','){
                B[i] = str2.charAt(i)-'0';
            }
        }
        System.out.println(Arrays.toString(A));

//        int p = 0;
//        int q = 0;
//        int k = 0;
//        int[] arr = new int[m+n];
//        while(p < m && q < n){
//            if(A[p] >B[q]){
//                arr[k++] = B[q++];
//            }else{
//                arr[k++] = A[p++];
//            }
//        }
//        while(p < m){
//            arr[k++] = A[p++];
//        }
//        while(q < n){
//            arr[k++] = B[q++];
//        }
//        for(int i = 0; i < m+n; i++){
//            A[i] = arr[i];
//            System.out.println(A[i]);
//        }
    }

}

