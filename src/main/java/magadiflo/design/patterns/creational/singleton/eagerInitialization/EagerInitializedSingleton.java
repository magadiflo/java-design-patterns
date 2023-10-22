package magadiflo.design.patterns.creational.singleton.eagerInitialization;

/**
 * Singleton seguro para subprocesos (inicialización ansiosa)
 * **********************************************************
 * En la inicialización ansiosa, se crea una instancia en el momento de la carga de la clase.
 * No tendremos ningún problema de seguridad de subprocesos si elegimos ir con una inicialización ansiosa.
 * Si su aplicación siempre crea y usa una instancia de Singleton o los aspectos generales de creación y tiempo
 * de ejecución de Singleton no son una carga, es posible que desee crear su Singleton con entusiasmo,
 * así:
 */

public class EagerInitializedSingleton {
    private static final EagerInitializedSingleton INSTANCE = new EagerInitializedSingleton();

    // Constructor privado para evitar que las aplicaciones cliente utilicen el constructor
    private EagerInitializedSingleton() {
    }

    public static EagerInitializedSingleton getInstance() {
        return INSTANCE;
    }
}
