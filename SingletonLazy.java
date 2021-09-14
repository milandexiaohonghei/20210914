/**
 *为保证线程执行安全，需要进行以下两步骤：
 *  *  1、双重效验锁
 *  *      当两个线程同时访问 getInstance() 时，首先会进行判空，这是肯定两个线程获取到的都是为空
 *  *      此时两个线程就排队执行锁里的内容，在这个过程中，哪个线程先获取到了锁，就会率先进行实例化对象
 *  *      当实例化结束后，第二个线程进入锁后就会发现singletonLazy对象不为空已经实例化了，会直接返回singletonLazy对象
 *  *  2、解决指令重排序问题
 *  *      因为在 singletonLazy = new SingletonLazy(); 这句代码并非是原子性的，理论上它的流程应该是：
 *  *          (1)现在内存中开辟空间
 *  *         （2）初始化操作
 *  *         （3）引用变量指向内存区域
 *  *      但是由于指令重排序问题，可能会变成（1）（3）（2）的执行顺序
 *  *      这样会导致：
 *  *          当线程1开辟内存空间，然后将变量指向了内存空间，此时线程1时间片用完
 *  *          线程2执行程序时发现singletonLazy对象不为空，直接返回此时singletonLazy指向的内存空间
 *  *          但此时，singletonLazy指向的内存空间还未初始化，所以会直接返回一个Null
 *  *      为了解决这个问题 在 创建私有类对象时使用 volatile 解决指令重排序的问题
 *  *      即 ——>   private static SingletonLazy singletonLazy = null;
 *
 *
 *
 *
 */

public class SingletonLazy {
    private SingletonLazy(){};
    private static volatile SingletonLazy singletonLazy = null;
    public static SingletonLazy getInstance(){
        if(singletonLazy == null){
            synchronized (SingletonLazy.class){
                if(singletonLazy == null){
                   singletonLazy = new SingletonLazy();
                }
            }
        }
        return singletonLazy;
    }

}

