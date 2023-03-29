package Flutter;

import Flutter.components.Button.Button;
import Flutter.components.DropDown.DropDown;
import Flutter.components.Menu.Menu;

public interface UIFactory {

    Menu createMenu();
    DropDown createDownDown();
    Button createButton();

}
