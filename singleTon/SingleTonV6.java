package designPatterns.singleTon;

import java.util.concurrent.locks.ReentrantLock;

public class SingleTonV6 {

    /*
     * Issues with SingleTonV5
     *  - We have introduced locking mechanism before the object creation, still it is not thread safe
     *  - before locking the object creation multiple threads can enter inside the if condition
     */

    private static SingleTonV6 singleTon = null;
    private static final ReentrantLock lock = new ReentrantLock();

    private SingleTonV6(){

    }

    /*
     * we have introduced double-checking along with locking mechanism
     * This will resolve the Thread Synchronization issue
     * This will resolve the multiple object creation issue
     * Eager loading not required
     */

    public static SingleTonV6 getInstance(){
        if (singleTon == null){
            lock.lock();
            if (singleTon == null){
                singleTon = new SingleTonV6();
            }
            lock.unlock();
        }
        return singleTon;
    }
}
