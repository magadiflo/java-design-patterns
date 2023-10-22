package magadiflo.design.patterns.creational.singleton.violation.reflection.fix;

public class Singleton {

    private static Singleton INSTANCE = new Singleton();

    private Singleton() {
        System.out.println("creating instance...");
        if (INSTANCE != null) {
            throw new RuntimeException("Can't create instance. Please use getInstance() to create it.");
        }
    }

    public static Singleton getInstance() {
        return INSTANCE;
    }

}