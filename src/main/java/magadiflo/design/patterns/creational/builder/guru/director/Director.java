package magadiflo.design.patterns.creational.builder.guru.director;

import magadiflo.design.patterns.creational.builder.guru.builders.IBuilder;
import magadiflo.design.patterns.creational.builder.guru.products.auxiliary.*;

/**
 * El director define el orden de los pasos de construcción. Funciona con un objeto constructor
 * a través de la interfaz común del constructor. Por lo tanto, es posible que no sepa qué
 * producto se está construyendo.
 */
public class Director {
    public void constructSportsCar(IBuilder builder) {
        builder.setCarType(CarType.SPORTS_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(3.0, 0));
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructCityCar(IBuilder builder) {
        builder.setCarType(CarType.CITY_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(1.2, 0));
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructSUV(IBuilder builder) {
        builder.setCarType(CarType.SUV);
        builder.setSeats(4);
        builder.setEngine(new Engine(2.5, 0));
        builder.setTransmission(Transmission.MANUAL);
        builder.setGPSNavigator(new GPSNavigator());
    }
}
