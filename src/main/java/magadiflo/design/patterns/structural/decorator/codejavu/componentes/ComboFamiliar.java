package magadiflo.design.patterns.structural.decorator.codejavu.componentes;

public class ComboFamiliar extends Combo {
    public ComboFamiliar() {
        descripcion = "Doble Porción de Papas Fritas, " +
                      "salsa,doble queso, hamburguesa " +
                      "Familiar,doble tomate, gaseosa";
    }

    @Override
    public int valor() {
        return 7500;
    }

}
