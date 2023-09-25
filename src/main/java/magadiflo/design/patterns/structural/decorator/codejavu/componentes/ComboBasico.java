package magadiflo.design.patterns.structural.decorator.codejavu.componentes;

public class ComboBasico extends Combo {

    public ComboBasico() {
        this.descripcion = "Porción de papas fritas, salsa, queso, " +
                           "hamburguesa sencilla, gaseosa";
    }

    @Override
    public int valor() {
        return 6200;
    }
}
