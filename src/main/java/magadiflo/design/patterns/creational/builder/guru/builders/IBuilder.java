package magadiflo.design.patterns.creational.builder.guru.builders;

import magadiflo.design.patterns.creational.builder.guru.products.auxiliary.*;

/**
 * La interfaz del constructor define todas las formas posibles
 * de configurar un producto.
 */
public interface IBuilder {
    void setCarType(CarType carType);

    void setSeats(int seats);

    void setEngine(Engine engine);

    void setTransmission(Transmission transmission);

    void setTripComputer(TripComputer tripComputer);

    void setGPSNavigator(GPSNavigator gpsNavigator);
}
