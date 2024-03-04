package designPatterns.singleTon;

import java.util.concurrent.locks.ReentrantLock;

public class SingleTonV5 {

    /*
     * Issues with SingleTonV4
     *  - We made getInstance() method to synchronized
     *  - Performance decreased
     */


    private static SingleTonV5 singleTon = null;
    private static ReentrantLock lock = new ReentrantLock();

    private SingleTonV5(){

    }

    /*
     * We have introduced locking mechanism before the object creation
     */

    public static SingleTonV5 getInstance(){
        if(singleTon == null){
            lock.lock();
            singleTon = new SingleTonV5();
            lock.unlock();
        }
        return singleTon;
    }


}
