/*
单例模式-饿汉模式
 */
public class SingleTon {
    private SingleTon(){};
    private static SingleTon singleTon = new SingleTon();
    public static SingleTon getInstance(){
        return singleTon;
    }


}
