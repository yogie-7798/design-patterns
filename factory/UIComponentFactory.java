package designPatterns.factory;

import designPatterns.factory.components.button.Button;
import designPatterns.factory.components.checkBox.CheckBox;
import designPatterns.factory.components.dropDown.DropDown;
import designPatterns.factory.components.menu.Menu;

public interface UIComponentFactory {

    public Button createButton();

    public CheckBox createCheckBox();

    public Menu createMenu();

    public DropDown createDropDown();
}
