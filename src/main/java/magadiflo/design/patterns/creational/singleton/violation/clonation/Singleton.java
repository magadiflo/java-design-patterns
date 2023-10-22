package magadiflo.design.patterns.creational.singleton.violation.clonation;

/**
 * Violación de Singleton en la clonación de objetos
 * **************************************************
 * Si intentamos crear una instancia clonándola, el código hash generado
 * de la copia clonada no coincide con el objeto real, por lo que también
 * viola el principio de Singleton.
 */

public class Singleton implements Cloneable {

    private static Singleton INSTANCE = new Singleton();

    private Singleton() {
        System.out.println("creating instance.....");
    }

    public static Singleton getInstance() {
        return INSTANCE;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}