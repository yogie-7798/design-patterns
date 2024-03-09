package designPatterns.factory;

public class IOS implements Platform{

    @Override
    public UIComponentFactory createUIComponentFactory() {
        return new IOSUIComponentFactory();
    }
}
