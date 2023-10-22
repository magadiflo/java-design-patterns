package magadiflo.design.patterns.creational.singleton.BillPugh;

/**
 * Antes de Java 5, el modelo de memoria de Java tenía muchos problemas, y los enfoques
 * anteriores solían fallar en ciertos escenarios en los que demasiados hilos intentaban
 * obtener la instancia de la clase singleton simultáneamente. Así que Bill Pugh ideó un
 * enfoque diferente para crear la clase singleton utilizando una clase helper estática
 * interna.
 * <p>
 * Observa la clase estática interna privada que contiene la instancia de la clase singleton.
 * Cuando se carga la clase singleton, la clase SingletonHelper no se carga en memoria y solo
 * cuando alguien llama al método getInstance(), esta clase se carga y crea la instancia de la
 * clase singleton. Este es el enfoque más utilizado para la clase singleton, ya que no requiere
 * sincronización.
 * <p>
 * Este es un ejemplo de la implementación Singleton de Bill Pugh:
 */
public class BillPughSingleton {
    private BillPughSingleton() {
        System.out.println("creado la instancia");
        if (SingletonHelper.INSTANCE != null) {
            throw new RuntimeException("Can't create instance. Please use getInstance() to create it.");
        }
    }

    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

}
