package Flutter;

import Flutter.Enums.SupportedPlatform;

public class Flutter {

    private SupportedPlatform platform;

    public Flutter(SupportedPlatform supportedPlatform) {
        this.platform=supportedPlatform;
    }

    public void setTheme(){
        System.out.println("Setting Theme for the App");
    }

    public void setRefreshrate(){
        System.out.println("Setting a refresh rate for the app");
    }

    public UIFactory createUIFactory(){
        return UIFactoryFactory.createUIFactory(this.platform);
    }
}
