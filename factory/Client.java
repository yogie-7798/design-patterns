package designPatterns.factory;

public class Client {

    /*
    * we are going to implement a factory design pattern.
    * Use case we are going to consider here is, Android and IOS Component creation.
    * Requirement : create component of button, menu , dropdown , checkbox
    * Acceptance criteria : SRP and OCP and DIP should be followed
    */

    public static void main(String[] args) {

        //Loosely coupled : DIP is Achieved here
        //SRP and OCP is achieved in further levels down
        Platform p1 = new IOS();

        UIComponentFactory factory = p1.createUIComponentFactory();

        factory.createButton();
        factory.createCheckBox();
        factory.createMenu();
        factory.createDropDown();

    }

}
