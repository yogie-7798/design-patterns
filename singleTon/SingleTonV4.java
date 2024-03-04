package designPatterns.singleTon;

public class SingleTonV4 {

    /*
     * Issues with the SingleTonV3
     *  - We can't pass the method params to SingleToneV3 as it is Eager loading
     *  - It may increase the Application load time
     */

    private static final SingleTonV4 singleTon = null;

    private SingleTonV4(){

    }

    /*
     * Making getInstance() method to synchronized to make it thread safe
     */
    public static synchronized SingleTonV4 getInstance(){
        if(singleTon == null){
            return new SingleTonV4();
        }
        return singleTon;
    }
}
