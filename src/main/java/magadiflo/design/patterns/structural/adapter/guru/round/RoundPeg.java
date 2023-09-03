package magadiflo.design.patterns.structural.adapter.guru.round;

// Las clavijas redondas son compatibles con los agujeros redondos.
// round peg = clavija redonda
public class RoundPeg { // Clavija o pieza redonda
    private double radius;

    public RoundPeg() {
    }

    public RoundPeg(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }
}
