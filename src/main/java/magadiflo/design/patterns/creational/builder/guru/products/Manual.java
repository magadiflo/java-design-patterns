package magadiflo.design.patterns.creational.builder.guru.products;

import magadiflo.design.patterns.creational.builder.guru.products.auxiliary.*;

/**
 * El manual del carro es otro producto.
 * Tenga en cuenta que no tiene el mismo antepasado que un Coche.
 * No están relacionados.
 */
public class Manual {
    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;

    public Manual(CarType carType, int seats, Engine engine, Transmission transmission, TripComputer tripComputer,
                  GPSNavigator gpsNavigator) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;
    }

    public String print() {
        String info = "";
        info += "Tipo de carro: " + carType + "\n";
        info += "Número de asientos: " + seats + "\n";
        info += "Motor: volumen - " + engine.getVolume() + "; kilometraje - " + engine.getMileage() + "\n";
        info += "Transmisión: " + transmission + "\n";
        if (this.tripComputer != null) {
            info += "Computadora de viaje: Funcional" + "\n";
        } else {
            info += "Computadora de viaje: N/A" + "\n";
        }
        if (this.gpsNavigator != null) {
            info += "Navegador GPS: Funcional" + "\n";
        } else {
            info += "Navegador GPS: N/A" + "\n";
        }
        return info;
    }
}
