package magadiflo.design.patterns.creational.singleton.violation.clonation.fix;

public class Main {
    public static void main(String[] args) throws Exception {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println("s1 = " + s1.hashCode());
        System.out.println("s2 = " + s2.hashCode());

        //Código hash generado de la copia clonada NO COINCIDE
        Singleton s3 = (Singleton) s2.clone();//Al querer clonar, lanzará la excepción
        System.out.println("s3 = " + s3.hashCode());
    }
}