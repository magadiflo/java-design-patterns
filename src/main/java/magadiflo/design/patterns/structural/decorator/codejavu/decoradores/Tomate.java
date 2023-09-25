package magadiflo.design.patterns.structural.decorator.codejavu.decoradores;

import magadiflo.design.patterns.structural.decorator.codejavu.componentes.Combo;

public class Tomate extends AdicionalesDecorador {
    private Combo combo;

    public Tomate(Combo combo) {
        this.combo = combo;
    }

    @Override
    public int valor() {
        return this.combo.valor() + 100;
    }

    @Override
    public String getDescripcion() {
        return this.combo.getDescripcion() + ", Porción de Tomate";
    }
}
