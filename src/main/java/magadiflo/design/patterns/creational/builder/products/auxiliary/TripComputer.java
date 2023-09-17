package magadiflo.design.patterns.creational.builder.products.auxiliary;

import magadiflo.design.patterns.creational.builder.products.Car;

public class TripComputer {
    private Car car;

    public void setCar(Car car) {
        this.car = car;
    }

    public String showFuelLevel() {
        return "Nivel de combustible: " + this.car.getFuel();
    }

    public String showStatus() {
        if (this.car.getEngine().isStarted()) {
            return "El carro está encendido";
        }
        return "El carro no está encendido";
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TripComputer{");
        sb.append("showFuelLevel()=").append(this.showFuelLevel());
        sb.append(", ");
        sb.append("showStatus()=").append(this.showStatus());
        sb.append('}');
        return sb.toString();
    }
}
