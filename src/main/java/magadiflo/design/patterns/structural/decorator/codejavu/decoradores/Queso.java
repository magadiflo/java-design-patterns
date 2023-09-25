package magadiflo.design.patterns.structural.decorator.codejavu.decoradores;

import magadiflo.design.patterns.structural.decorator.codejavu.componentes.Combo;

public class Queso extends AdicionalesDecorador {
    private Combo combo;

    public Queso(Combo combo) {
        this.combo = combo;
    }

    @Override
    public int valor() {
        return this.combo.valor() + 1000;
    }

    @Override
    public String getDescripcion() {
        return this.combo.getDescripcion() + ", Porción de Queso";
    }
}
