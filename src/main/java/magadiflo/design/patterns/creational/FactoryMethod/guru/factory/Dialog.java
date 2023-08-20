package magadiflo.design.patterns.creational.FactoryMethod.guru.factory;

import magadiflo.design.patterns.creational.FactoryMethod.guru.buttons.IButton;

public abstract class Dialog {
    public void renderWindow() {
        // Other code
        IButton button = this.createButton();
        button.render();
    }

    public abstract IButton createButton();
}
