package magadiflo.design.patterns.creational.singleton.violation.reflection.fix;

import java.lang.reflect.Constructor;

public class MainFix {
    public static void main(String[] args) throws Exception {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println("s1 = " + s1.hashCode());
        System.out.println("s2 = " + s2.hashCode());

        Class clazz = Class.forName("magadiflo.design.patterns.creational.singleton.violation.reflection.fix.Singleton");
        Constructor<Singleton> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);

        Singleton s3 = constructor.newInstance();//Tratará de crear una nueva instancia en tiempo de ejecución pero se lanzará una excepción
        System.out.println("s3 = " + s3.hashCode());
    }
}