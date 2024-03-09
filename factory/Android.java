package designPatterns.factory;

public class Android implements Platform{

    @Override
    public UIComponentFactory createUIComponentFactory() {
        return new AndroidUIComponentFactory();
    }
}
