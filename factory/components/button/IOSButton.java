package designPatterns.factory.components.button;

public class IOSButton implements Button{

    @Override
    public int getSize() {
        return 150;
    }
}
