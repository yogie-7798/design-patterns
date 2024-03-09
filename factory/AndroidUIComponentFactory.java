package designPatterns.factory;

import designPatterns.factory.components.button.AndroidButton;
import designPatterns.factory.components.button.Button;
import designPatterns.factory.components.checkBox.AndroidCheckBox;
import designPatterns.factory.components.checkBox.CheckBox;
import designPatterns.factory.components.dropDown.AndroidDropDown;
import designPatterns.factory.components.dropDown.DropDown;
import designPatterns.factory.components.menu.AndroidMenu;
import designPatterns.factory.components.menu.Menu;

public class AndroidUIComponentFactory implements UIComponentFactory{
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new AndroidCheckBox();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public DropDown createDropDown() {
        return new AndroidDropDown();
    }
}
