package designPatterns.factory;

import designPatterns.factory.components.button.Button;
import designPatterns.factory.components.button.IOSButton;
import designPatterns.factory.components.checkBox.CheckBox;
import designPatterns.factory.components.checkBox.IOSCheckBox;
import designPatterns.factory.components.dropDown.DropDown;
import designPatterns.factory.components.dropDown.IOSDropDown;
import designPatterns.factory.components.menu.IOSMenu;
import designPatterns.factory.components.menu.Menu;

public class IOSUIComponentFactory implements UIComponentFactory{

    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new IOSCheckBox();
    }

    @Override
    public DropDown createDropDown() {
        return new IOSDropDown();
    }

    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }
}
