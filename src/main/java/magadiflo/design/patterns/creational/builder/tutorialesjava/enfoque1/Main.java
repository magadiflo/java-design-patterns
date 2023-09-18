package magadiflo.design.patterns.creational.builder.tutorialesjava.enfoque1;

public class Main {
    public static void main(String[] args) {
        // **** Creando el objeto Computer paso a paso ****
        /**
         * 1. Primero creamos la instancia de la clase interna ComputerBuilder utilizando el new Computer.ComputerBuilder("1TB", "16GB").
         *    - En este ejemplo hemos decidido que los atributos hdd y ram sean requeridos por eso es que lo pasamos por constructor.
         *    - Como vamos a crear una instancia (new) de ComputerBuilder y al ser este una clase anidada de la clase
         *      Computer, necesariamente tenemos que pasar primero por la clase externa, o sea por Computer, de tal manera
         *      que para crear la instancia de ComputerBuilder tenemos que hacerlo así: new Computer.ComputerBuilder(...)
         *      y no de esta otra manera: new ComputerBuilder(...), de esta segunda forma no se podrá, nos marcará un error.
         * 2. Ahora que ya tenemos la instancia de ComputerBuilder lo usamos para poder settear los otros valores que son opcionales.
         * 3. Finalmente, utilizamos la instancia de ComputerBuilder para poder construir una instancia de Computer
         *    llamando al método .build().
         *
         */
        Computer.ComputerBuilder computerBuilder = new Computer.ComputerBuilder("1TB", "16GB");
        computerBuilder.graphicsCardEnabled(true);
        computerBuilder.bluetoothEnabled(true);
        Computer c1 = computerBuilder.build();
        System.out.println(c1);

        // **** Creando el objeto Computer de manera directa ****
        // Esta otra forma es la más habitual de poder crear el objeto: realizando encadenamiento de los métodos
        Computer c2 = new Computer.ComputerBuilder("1TB", "16GB")
                .graphicsCardEnabled(true)
                .bluetoothEnabled(true)
                .build();
        System.out.println(c2);

        Computer c3 = new Computer.ComputerBuilder("1TB", "16GB")
                .build();
        System.out.println(c3);
    }
}
