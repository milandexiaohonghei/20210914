package paixu;

import java.util.Arrays;
import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        StringBuffer str1 = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != '[' && str.charAt(i) != ']'){
                str1.append(str.charAt(i));
            }
        }
        String[] arr = str1.toString().split(",");
        int[] arr1 = new int[arr.length];
        for (int i = 0; i <arr.length ; i++) {
            arr1[i] = Integer.parseInt(arr[i]);
        }
        System.out.println(maxPool(arr1));

    }
    public static int maxPool(int[] nums){
        Arrays.sort(nums);
        return nums[nums.length -1] * nums[nums.length -2] - nums[0] * nums[1];
    }
}
