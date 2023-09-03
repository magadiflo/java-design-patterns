package magadiflo.design.patterns.structural.adapter.arquitecturajava.service;

/**
 * Lamentablemente, nuestra Lámpara inglesa es un código creado por un programador ajeno a la empresa y construyó lo
 * que le dio la gana. Se refiere a este ejemplo, que construyó esta clase con métodos en inglés que son
 * totalmente incompatibles con lo que espera que tengan las clases que implementen la interfaz IConectable, esta
 * interfaz tiene los métodos en español y de algún modo queremos que esta clase LamparaInglesa pueda ser parte
 * de la interfaz IConectable y eso lo solucionamos con el AdaptadorLampara.
 */

public class LamparaInglesa {
    private boolean isOn;

    public boolean isOn() {
        return this.isOn;
    }

    public void on() {
        this.isOn = true;
    }

    public void off() {
        this.isOn = false;
    }
}
