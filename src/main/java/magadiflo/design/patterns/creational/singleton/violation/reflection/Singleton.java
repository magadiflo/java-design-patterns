package magadiflo.design.patterns.creational.singleton.violation.reflection;

public class Singleton {

    private static Singleton INSTANCE = new Singleton();

    private Singleton() {
        System.out.println("creating instance...");
    }

    public static Singleton getInstance() {
        return INSTANCE;
    }

}