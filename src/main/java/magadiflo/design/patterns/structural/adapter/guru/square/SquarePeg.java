package magadiflo.design.patterns.structural.adapter.guru.square;

/**
 * Las clavijas cuadradas no son compatibles con los agujeros redondos (que fueron implementadas por el equipo de
 * desarrollo anterior). Pero tenemos que integrarlos en nuestro programa.
 */
public class SquarePeg { // Clavija o pieza cuadrada
    private double width;

    public SquarePeg(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getSquare() {
        return Math.pow(this.width, 2);
    }
}
