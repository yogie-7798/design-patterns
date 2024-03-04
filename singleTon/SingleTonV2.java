package designPatterns.singleTon;

public class SingleTonV2{

    /*
     * Issues with SingleTonV1
     *  - Objects will be created all the time when getInstance is called
     */

    private static SingleTonV2 singleTon = null;

    private SingleTonV2(){

    }

    /*
     * New Instance will be created only if the singleTon reference is null
     */
    public static SingleTonV2 getInstance(){
        if(singleTon == null){
            return new SingleTonV2();
        }
        return singleTon;
    }
}
