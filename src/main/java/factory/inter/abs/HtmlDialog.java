package factory.inter.abs;

import factory.inter.Button;
import factory.inter.HtmlButton;

public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}