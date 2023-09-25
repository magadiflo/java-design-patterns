package magadiflo.design.patterns.structural.decorator.codejavu.decoradores;

import magadiflo.design.patterns.structural.decorator.codejavu.componentes.Combo;

public class Carne extends AdicionalesDecorador {
    private Combo combo;

    public Carne(Combo combo) {
        this.combo = combo;
    }

    @Override
    public int valor() {
        return this.combo.valor() + 2500;
    }

    @Override
    public String getDescripcion() {
        return this.combo.getDescripcion() + ", Porción de Carne";
    }
}
