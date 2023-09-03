package magadiflo.design.patterns.structural.adapter.guru.adapters;

import magadiflo.design.patterns.structural.adapter.guru.round.RoundPeg;
import magadiflo.design.patterns.structural.adapter.guru.square.SquarePeg;

// El adaptador permite colocar clavijas cuadradas (square pegs) en agujeros redondos (round holes).
public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    // Calcule el radio mínimo del círculo que pueda caber en esta clavija.
    @Override
    public double getRadius() {
        double pow = Math.pow(this.peg.getWidth() / 2, 2);
        return Math.sqrt(pow * 2);
    }
}
