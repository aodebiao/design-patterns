package factory.inter.abs;

import factory.inter.Button;
import factory.inter.WindowsButton;

public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}