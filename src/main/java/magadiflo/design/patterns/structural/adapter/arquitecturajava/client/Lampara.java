package magadiflo.design.patterns.structural.adapter.arquitecturajava.client;

public class Lampara implements IConectable {

    private boolean encendida;

    @Override
    public boolean estaEncendida() {
        return this.encendida;
    }

    @Override
    public void encender() {
        this.encendida = true;
    }

    @Override
    public void apagar() {
        this.encendida = false;
    }
}
