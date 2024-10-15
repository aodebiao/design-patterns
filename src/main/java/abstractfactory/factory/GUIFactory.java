package abstractfactory.factory;

import abstractfactory.inter.Button;
import abstractfactory.inter.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
