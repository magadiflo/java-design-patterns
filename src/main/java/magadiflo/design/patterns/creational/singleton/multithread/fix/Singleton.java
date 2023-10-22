package magadiflo.design.patterns.creational.singleton.multithread.fix;

public class Singleton {

    /**
     * Para el bloqueo verificado doble
     * *********************************
     * En casos raros, el bloqueo verificado dos veces también rompe el Principio de Singleton.
     * Java runtime publica la mitad de la variable inicializada. Para ilustrar,
     * supongamos que 2 subprocesos thread1 y thread2 están entrando en el código que pasa
     * por la línea # 2 a la línea # 3 y creó la instancia. Además, al mismo tiempo entra
     * el subproceso 2 y sabe que hay algo en la variable llamado 'instancia'
     * (ya que está en estado medio inicializado) y devuelve lo mismo de la línea # 9.
     * Por lo tanto, el principio de Singleton se rompe.
     * <p>
     * Para abordar la situación anterior, utilice la palabra clave volátil en el
     * momento de la declaración de la instancia.
     * <p>
     * El valor de la variable volátil se publicará solo cuando se complete el cambio.
     * La operación de cambio a escritura ocurre antes de la operación de
     * lectura en una variable volátil. De hecho, todos los subprocesos
     * verán el mismo valor de variable.
     */
    private static volatile Singleton instance = null; //lazy initialization

    private Singleton() {
        System.out.println("Creating...");
    }

    /**
     * Hilo seguro de singleton
     * ************************
     * Usando synchronized, sincronizamos este método, de tal forma que al estar en
     * un entorno multiproceso, cuando un hilo cree esta instancia, el siguiente ya
     * no podrá crear porque están sincronizados, solo recibirá la instancia ya creada
     * por el primer hilo.
     *
     * La forma más fácil de crear una clase singleton segura para subprocesos es sincronizar
     * el método de acceso global, de modo que solo un subproceso pueda ejecutar este método a la vez.
     *
     * Esta implementación funciona bien y proporciona seguridad de subprocesos, pero reduce
     * el rendimiento debido al costo asociado con el método sincronizado, aunque lo necesitamos solo para
     * los primeros subprocesos que podrían crear las instancias separadas.
     *
     */

//    public static synchronized Singleton getInstance() {
//        if (instance == null) {
//            instance = new Singleton();
//        }
//        return instance;
//    }

    /** Para evitar esta sobrecarga adicional cada vez, se utiliza el principio de bloqueo verificado dos veces.
     * En este enfoque, el bloque sincronizado se utiliza dentro de la condición if con una comprobación adicional
     * para garantizar que solo se cree una instancia de una clase singleton. A cotinuación, sigamos leyendo
     * y veamos cómo se implementa el bloqueo de doble comprobación.
     * */

    /**
     * Bloque de código de sincronización
     * **********************************
     * Después de aplicar la palabra clave synchronize en el método getInstance(),
     * el programa puede ejecutarse correctamente sin ningún problema, pero en java,
     * en lugar de sincronizar todo el método, como en el método anterior,
     * podemos sincronizar solo el bloque de código que se ve afectado al crear la instancia para
     * escapar la sobrecarga adicional como se muestra a continuación
     * <p>
     * Bloqueo verificado doble
     * ************************
     * Ahora, a partir del código anterior, hemos reducido el alcance de la sincronización
     * por razones de rendimiento. Observe que si un subproceso en la línea # 2 nota que la
     * instancia es nula y luego obtiene el bloqueo del objeto en la línea # 3.
     * Al mismo tiempo, si otro subproceso ya tiene el bloqueo, creará la instancia.
     * Así que para asegurarnos de que ningún otro hilo ya ha adquirido el bloqueo aplicaremos
     * una comprobación más después de adquirir el bloqueo como se muestra a continuación.
     * Esta técnica se denomina bloqueo de doble comprobación.
     * Con el bloqueo de doble verificación, primero verificamos si se crea una instancia y,
     * si no, luego sincronizamos.
     * De esta manera, solo sincronizamos la primera vez, justo lo que queremos.
     * <p>
     * Si el rendimiento es un problema en el uso del método getInstance(),
     * entonces este método de implementación de Singleton puede reducir drásticamente la
     * sobrecarga.
     */
    public static Singleton getInstance() {
        if (instance == null) { //check 1
            synchronized (Singleton.class) {
                if (instance == null) { //check 2
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    static void useSingleton() {
        Singleton singleton = Singleton.getInstance();
        System.out.println("Hashcode of singleton object: " + singleton.hashCode());
    }


}