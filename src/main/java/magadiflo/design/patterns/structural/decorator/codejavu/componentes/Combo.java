package magadiflo.design.patterns.structural.decorator.codejavu.componentes;

public abstract class Combo {
    String descripcion = "";

    public String getDescripcion() {
        return this.descripcion;
    }

    public abstract int valor();
}
