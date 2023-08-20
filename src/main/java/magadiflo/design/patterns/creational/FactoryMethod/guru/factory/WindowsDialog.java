package magadiflo.design.patterns.creational.FactoryMethod.guru.factory;

import magadiflo.design.patterns.creational.FactoryMethod.guru.buttons.IButton;
import magadiflo.design.patterns.creational.FactoryMethod.guru.buttons.WindowsButton;

public class WindowsDialog extends Dialog {
    @Override
    public IButton createButton() {
        return new WindowsButton();
    }
}
