package magadiflo.design.patterns.structural.adapter.arquitecturajava.adapter;

import magadiflo.design.patterns.structural.adapter.arquitecturajava.client.IConectable;
import magadiflo.design.patterns.structural.adapter.arquitecturajava.service.LamparaInglesa;

public class AdaptadorLampara implements IConectable {

    private final LamparaInglesa lamparaInglesa = new LamparaInglesa();

    @Override
    public void encender() {
        this.lamparaInglesa.on();
    }

    @Override
    public void apagar() {
        this.lamparaInglesa.off();
    }

    @Override
    public boolean estaEncendida() {
        return this.lamparaInglesa.isOn();
    }
}
