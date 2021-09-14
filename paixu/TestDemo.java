package paixu;

public class TestDemo {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1; i <= 1000; i++){
            if(num(i)){
               sum++;
               if(sum % 8 == 0){
                   System.out.println(i);
               }else{
                   System.out.print(i +" ");
               }
            }
        }
    }
    public static boolean num(int i) {
        if(i == 1){
            return  false;
        }
        for (int j = 2; j <= i; j++) {
            if (i % j == 0 && i != j) {
                break;
            }
            if (j == i) {
                return true;
            }
        }
        return false;
    }
}
