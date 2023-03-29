package Flutter;

import Flutter.components.Button.Button;
import Flutter.components.Button.IOSButton;
import Flutter.components.DropDown.DropDown;
import Flutter.components.DropDown.IOSDropDown;
import Flutter.components.Menu.IOSMenu;
import Flutter.components.Menu.Menu;

public class IOSUIFactory implements UIFactory{
    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }

    @Override
    public DropDown createDownDown() {
        return new IOSDropDown();
    }

    @Override
    public Button createButton() {
        return new IOSButton();
    }
}
