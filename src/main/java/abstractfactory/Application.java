package abstractfactory;

import abstractfactory.factory.GUIFactory;
import abstractfactory.inter.Button;
import abstractfactory.inter.Checkbox;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint(){
        button.paint();
        checkbox.paint();
    }
}
