package magadiflo.design.patterns.structural.adapter.guru;

// En algún lugar del código del cliente...

// Round Peg: clavija redonda
// Round Hole: agujero redondo

import magadiflo.design.patterns.structural.adapter.guru.adapters.SquarePegAdapter;
import magadiflo.design.patterns.structural.adapter.guru.round.RoundHole;
import magadiflo.design.patterns.structural.adapter.guru.round.RoundPeg;
import magadiflo.design.patterns.structural.adapter.guru.square.SquarePeg;

public class Main {
    public static void main(String[] args) {
        // Redondo encaja redondo, no es ninguna sorpresa.
        RoundHole hole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(5);
        if (hole.fits(roundPeg)) {
            System.out.println("La clavija redonda r5 encaja en el orificio redondo r5.");
        }

        // Square Peg: Clavija cuadrada
        SquarePeg smallSqPeg = new SquarePeg(2);
        SquarePeg largeSqPeg = new SquarePeg(20);
        //hole.fits(smallSqPeg); // No compila, espera un Round Peg y se le está mandando un Square Peg

        // El adaptador resuelve el problema
        SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSqPeg);
        SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSqPeg);

        if (hole.fits(smallSqPegAdapter)) {
            System.out.println("La clavija cuadrada w2 encaja en el orificio redondo r5.");
        }

        if (!hole.fits(largeSqPegAdapter)) {
            System.out.println("La clavija cuadrada w20 no encaja en el orificio redondo r5.");
        }

    }
}
