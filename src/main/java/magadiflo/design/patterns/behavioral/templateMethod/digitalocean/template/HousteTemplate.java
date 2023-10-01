package magadiflo.design.patterns.behavioral.templateMethod.digitalocean.template;

public abstract class HousteTemplate {

    // Template Method, final para que las subclases no puedan anularlo
    public final void buildHouse() {
        this.buildFoundation();
        this.buildPillars();
        this.buildWalls();
        this.buildWindows();
        System.out.println("La casa está construida");
    }

    // Implementación por defecto
    private void buildWindows() {
        System.out.println("Construyendo ventanas de vidrio");
    }

    // Métodos que tienen que ser implementados por las subclases
    public abstract void buildWalls();

    public abstract void buildPillars();

    private void buildFoundation() {
        System.out.println("Cimentación de edificios con cemento, varillas de hierro y arena");
    }
}
