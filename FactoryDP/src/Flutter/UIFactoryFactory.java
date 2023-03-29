package Flutter;

import Flutter.Enums.SupportedPlatform;

public class UIFactoryFactory {
    public static UIFactory createUIFactory(SupportedPlatform supportedPlatform){
        if(supportedPlatform.equals(SupportedPlatform.IOS)){
            return new IOSUIFactory();
        }
        else if(supportedPlatform.equals(SupportedPlatform.ANDROID)){
            return new AndroidUIFactory();
        }
        return null;
    }
}
