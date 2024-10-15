package abstractfactory;

import abstractfactory.factory.GUIFactory;
import abstractfactory.factory.MacosFactory;
import abstractfactory.factory.WindowsFactory;

import java.util.Locale;

public class Demo {
    public static void main(String[] args) {
        Application application;
        GUIFactory factory;
        var osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("win")) {
            factory = new WindowsFactory();
        }else {
            factory = new MacosFactory();
        }
        application = new Application(factory);
        application.paint();
    }
}
