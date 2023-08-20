package magadiflo.design.patterns.creational.FactoryMethod.guru.buttons;

public class HtmlButton implements IButton {
    @Override
    public void render() {
        System.out.println("<button class='btn btn-primary'>Aceptar</button>");
        this.onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click! Botón dice - 'Hola Mundo!'");
    }
}
