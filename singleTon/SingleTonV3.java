package designPatterns.singleTon;

public class SingleTonV3 {

    /*
     * Issue with the SingleTonV2
     * - V2 is not thread safe, multiple threads can create object in the initial instantiation
     */


    /*
     * We are using eager loading here, instance of V3 will be created at the time of class loading
     */
    private static final SingleTonV3 singleTon = new SingleTonV3();

    private SingleTonV3(){

    }

    public static SingleTonV3 getInstance(){
        return singleTon;
    }

}
