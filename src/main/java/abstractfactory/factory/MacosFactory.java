package abstractfactory.factory;

import abstractfactory.inter.Button;
import abstractfactory.inter.Checkbox;
import abstractfactory.inter.MacOSButton;
import abstractfactory.inter.MacOSCheckbox;

public class MacosFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
