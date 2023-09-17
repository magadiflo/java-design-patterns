package magadiflo.design.patterns.creational.builder;

import magadiflo.design.patterns.creational.builder.builders.CarBuilder;
import magadiflo.design.patterns.creational.builder.builders.CarManualBuilder;
import magadiflo.design.patterns.creational.builder.director.Director;
import magadiflo.design.patterns.creational.builder.products.Car;
import magadiflo.design.patterns.creational.builder.products.Manual;

/**
 * Clase cliente, aquí todo se junta
 */
public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        /**
         * El director obtiene el objeto constructor concreto del cliente
         * (código de aplicación). Esto se debe a que la aplicación sabe mejor
         * qué constructor usar para obtener un producto específico.
         */
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);
        /**
         * El producto final a menudo se recupera de un objeto constructor, ya que
         * Director no conoce ni depende de constructores ni productos concretos.
         */
        Car car = builder.build();
        System.out.println("Carro construido: " + car);


        System.out.println("");

        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.constructSportsCar(manualBuilder);
        Manual manual = manualBuilder.build();
        System.out.println("Manual del carro construido: " + manual.print());
    }
}
