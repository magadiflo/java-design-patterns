package magadiflo.design.patterns.behavioral.templateMethod.digitalocean.template;

// Casa de vidrio
public class GlassHouse extends HousteTemplate {
    @Override
    public void buildWalls() {
        System.out.println("Construyendo muros de vidrio");
    }

    @Override
    public void buildPillars() {
        System.out.println("Construyendo pilares con revestimiento de vidrio");
    }
}
