package magadiflo.design.patterns.structural.adapter.arquitecturajava;

import magadiflo.design.patterns.structural.adapter.arquitecturajava.adapter.AdaptadorLampara;
import magadiflo.design.patterns.structural.adapter.arquitecturajava.client.IConectable;
import magadiflo.design.patterns.structural.adapter.arquitecturajava.client.Lampara;
import magadiflo.design.patterns.structural.adapter.arquitecturajava.client.Ordenador;

public class Main {
    public static void main(String[] args) {
        IConectable lamp = new Lampara();
        encenderAparato(lamp);

        IConectable ordenador = new Ordenador();
        encenderAparato(ordenador);

        IConectable adaptadorLamparaInglesa = new AdaptadorLampara();
        encenderAparato(adaptadorLamparaInglesa);
    }

    private static void encenderAparato(IConectable conectable) {
        conectable.encender();
        System.out.println(conectable.getClass().getSimpleName() + " ¿Está encendido?: " + conectable.estaEncendida());
    }
}
