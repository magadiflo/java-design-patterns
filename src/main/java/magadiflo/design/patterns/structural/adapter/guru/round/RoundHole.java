package magadiflo.design.patterns.structural.adapter.guru.round;

// Los agujeros redondos son compatibles con clavijas redondas.
// round peg = clavija redonda
public class RoundHole { //Agujero Redondo
    private final double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public boolean fits(RoundPeg peg) {//fits = encaja
        return this.getRadius() >= peg.getRadius();
    }
}
