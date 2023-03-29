package Flutter;

import Flutter.Enums.SupportedPlatform;
import Flutter.components.Button.Button;
import Flutter.components.DropDown.DropDown;
import Flutter.components.Menu.Menu;

public class Client {

    public static void main(String[] args) {
        Flutter flutter = new Flutter(SupportedPlatform.IOS);
        UIFactory uiFactory = flutter.createUIFactory();
        Menu menu = uiFactory.createMenu();
        DropDown dropDown = uiFactory.createDownDown();
        Button button = uiFactory.createButton();


    }
}
