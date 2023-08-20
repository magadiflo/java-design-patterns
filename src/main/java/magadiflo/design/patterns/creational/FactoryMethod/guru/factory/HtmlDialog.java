package magadiflo.design.patterns.creational.FactoryMethod.guru.factory;

import magadiflo.design.patterns.creational.FactoryMethod.guru.buttons.HtmlButton;
import magadiflo.design.patterns.creational.FactoryMethod.guru.buttons.IButton;

public class HtmlDialog extends Dialog {
    @Override
    public IButton createButton() {
        return new HtmlButton();
    }
}
