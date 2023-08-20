package magadiflo.design.patterns.creational.FactoryMethod.guru;

import magadiflo.design.patterns.creational.FactoryMethod.guru.factory.Dialog;
import magadiflo.design.patterns.creational.FactoryMethod.guru.factory.HtmlDialog;
import magadiflo.design.patterns.creational.FactoryMethod.guru.factory.WindowsDialog;

public class Main {
    public static void main(String[] args) {
        Dialog dialogWindows = new WindowsDialog();
        dialogWindows.renderWindow();

        Dialog dialogHtml = new HtmlDialog();
        dialogHtml.renderWindow();
    }
}

