package magadiflo.design.patterns.behavioral.templateMethod.digitalocean.template;

// Casa de madera
public class WoodenHouse extends HousteTemplate {
    @Override
    public void buildWalls() {
        System.out.println("Construyendo muros de madera");
    }

    @Override
    public void buildPillars() {
        System.out.println("Construyendo pilares con revestimiento de madera");
    }
}
