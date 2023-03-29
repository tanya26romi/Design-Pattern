package Flutter;

import Flutter.components.Button.AndroidButton;
import Flutter.components.Button.Button;
import Flutter.components.DropDown.AndroidDropDown;
import Flutter.components.DropDown.DropDown;
import Flutter.components.Menu.AndroidMenu;
import Flutter.components.Menu.Menu;

public class AndroidUIFactory implements  UIFactory{
    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public DropDown createDownDown() {
        return new AndroidDropDown();
    }

    @Override
    public Button createButton() {
        return new AndroidButton();
    }
}
