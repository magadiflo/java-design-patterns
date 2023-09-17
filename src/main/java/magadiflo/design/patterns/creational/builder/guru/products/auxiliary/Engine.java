package magadiflo.design.patterns.creational.builder.guru.products.auxiliary;

/**
 * Solo es una característica del carro
 */
public class Engine {
    private final double volume;
    private double mileage;//kilometraje
    private boolean started;

    public Engine(double volume, double mileage) {
        this.volume = volume;
        this.mileage = mileage;
    }

    public double getVolume() {
        return this.volume;
    }

    public double getMileage() {
        return this.mileage;
    }

    public boolean isStarted() {
        return this.started;
    }

    public void on() {
        this.started = true;
    }

    public void off() {
        this.started = false;
    }

    public void go(double mileage) {
        if (this.started) {
            this.mileage += mileage;
        } else {
            System.err.println("No puede avanzar go(), primero debes arrancar el motor");
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Engine{");
        sb.append("volume=").append(volume);
        sb.append(", mileage=").append(mileage);
        sb.append(", started=").append(started);
        sb.append('}');
        return sb.toString();
    }
}
