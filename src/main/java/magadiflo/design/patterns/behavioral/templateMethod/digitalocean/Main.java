package magadiflo.design.patterns.behavioral.templateMethod.digitalocean;

import magadiflo.design.patterns.behavioral.templateMethod.digitalocean.template.GlassHouse;
import magadiflo.design.patterns.behavioral.templateMethod.digitalocean.template.HousteTemplate;
import magadiflo.design.patterns.behavioral.templateMethod.digitalocean.template.WoodenHouse;

public class Main {
    public static void main(String[] args) {
        HousteTemplate woodenHouse = new WoodenHouse();
        woodenHouse.buildHouse();

        System.out.println();

        HousteTemplate glassHouse = new GlassHouse();
        glassHouse.buildHouse();
    }
}
