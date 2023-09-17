package magadiflo.design.patterns.creational.builder.builders;

import magadiflo.design.patterns.creational.builder.products.Manual;
import magadiflo.design.patterns.creational.builder.products.auxiliary.*;

/**
 * A diferencia de otros patrones de creación, Builder puede construir productos no relacionados,
 * que no tienen la interfaz común.
 * <p>
 * En este caso construimos un manual de usuario para un automóvil, siguiendo los mismos
 * pasos que construimos para un automóvil. Esto permite producir manuales para modelos de
 * automóviles específicos, configurados con diferentes características.
 */
public class CarManualBuilder implements IBuilder {
    private CarType carType;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    @Override
    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Manual build() {
        return new Manual(this.carType, this.seats, this.engine, this.transmission, this.tripComputer, this.gpsNavigator);
    }
}
