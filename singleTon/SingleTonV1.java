package designPatterns.singleTon;

public class SingleTonV1 {

    /*
     * What is Singleton?
     * Singleton is a class which can have only one instance of itself.
     */

    /*
     * Making the constructor private to restrict the object creation from other classes
     */
    private SingleTonV1(){

    }

    /*
     * Making getInstance() method to static method to get the instance of SingleTon class
     */
    public static SingleTonV1 getInstance(){
        return new SingleTonV1();
    }


}

