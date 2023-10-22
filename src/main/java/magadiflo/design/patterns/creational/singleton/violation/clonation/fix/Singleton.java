package magadiflo.design.patterns.creational.singleton.violation.clonation.fix;

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
        if (INSTANCE != null) {
            throw new CloneNotSupportedException("Can't create instance. Please use getInstance() to create it.");
        }
        return super.clone();
    }
}