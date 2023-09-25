package magadiflo.design.patterns.structural.decorator.codejavu.componentes;

public class ComboEspecial extends Combo {
    public ComboEspecial() {
        this.descripcion = "Doble Porción de Papas Fritas,3 tipos " +
                           "de salsa,doble queso, hamburguesa Especial " +
                           "Doble Carne, Doble tomate, gaseosa";
    }

    @Override
    public int valor() {
        return 10400;
    }
}
