package magadiflo.design.patterns.creational.singleton.multithread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/***
 * Inicialización perezosa
 * ************************
 * El siguiente código muestra el comportamiento de la instancia de Singleton,
 * cuando se ejecutan dos subprocesos comparando sus valores de código hash.
 * Tenga cuidado al ejecutar el siguiente código, ya que solo funcionará en Java 8
 * y versiones posteriores. Además, hemos utilizado Method Reference en el código.
 */
public class MainThread {
    public static void main(String[] args) {

        /**
         * Al ejecutar los dos hilos se obtienen códigos Hash distintos
         * (a veces el mismo, pero por lo general siempre distinto)
         * Esto sucede porque como estamos en un entorno multiproceso,
         * varios procesos (en este caso 2 hilos) tratan de crear la instancia
         * y lo logran en procesos distintos
         */
        ExecutorService service = Executors.newFixedThreadPool(2);
        service.submit(Singleton::useSingleton);
        service.submit(Singleton::useSingleton);
        service.shutdown();

        /**
         * Ejemplo de salida
         * -----------------
         * Creating...
         * Creating...
         * Hashcode of singleton object: 1891726531
         * Hashcode of singleton object: 446664225
         */
    }
}