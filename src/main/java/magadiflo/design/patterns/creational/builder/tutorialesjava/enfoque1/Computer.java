package magadiflo.design.patterns.creational.builder.tutorialesjava.enfoque1;

/**
 * Producto: Computer
 * <p>
 * 1. En primer lugar, necesita crear una clase anidada estática y luego copiar todos los argumentos de la clase externa
 * a la clase Builder. Debemos seguir la convención de nomenclatura y si el nombre de la clase es Computer,
 * entonces la clase constructora debe denominarse ComputerBuilder.
 * <p>
 * 2. La clase Java Builder debe tener un constructor público con todos los atributos requeridos como parámetros.
 * <p>
 * 3. La clase Java Builder debe tener métodos para establecer los parámetros opcionales y debe devolver el mismo
 * objeto Builder después de configurar el atributo opcional.
 * <p>
 * 4. El último paso es proporcionar un método build() en la clase constructora que devolverá el objeto que necesita
 * programa cliente. Para esto necesitamos tener un constructor privado en la Clase con la clase Builder como
 * argumento.
 */
public class Computer {
    // *************** Parámetros requeridos ***************
    private String hdd;
    private String ram;

    // *************** Parámetros opcionales ***************
    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;

    //*************** Constructor privado ***************
    private Computer(ComputerBuilder computerBuilder) {
        this.hdd = computerBuilder.hdd;
        this.ram = computerBuilder.ram;
        this.isGraphicsCardEnabled = computerBuilder.isGraphicsCardEnabled;
        this.isBluetoothEnabled = computerBuilder.isBluetoothEnabled;
    }

    // *************** Getters y Setters ***************

    public String getHdd() {
        return hdd;
    }

    public void setHdd(String hdd) {
        this.hdd = hdd;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public boolean isGraphicsCardEnabled() {
        return isGraphicsCardEnabled;
    }

    public void setGraphicsCardEnabled(boolean graphicsCardEnabled) {
        isGraphicsCardEnabled = graphicsCardEnabled;
    }

    public boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }

    public void setBluetoothEnabled(boolean bluetoothEnabled) {
        isBluetoothEnabled = bluetoothEnabled;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Computer{");
        sb.append("hdd='").append(hdd).append('\'');
        sb.append(", ram='").append(ram).append('\'');
        sb.append(", isGraphicsCardEnabled=").append(isGraphicsCardEnabled);
        sb.append(", isBluetoothEnabled=").append(isBluetoothEnabled);
        sb.append('}');
        return sb.toString();
    }

    // *************** Clase Builder: Clase anidada o clase interna ***************
    public static class ComputerBuilder {
        private String hdd;
        private String ram;
        private boolean isGraphicsCardEnabled;
        private boolean isBluetoothEnabled;

        public ComputerBuilder(String hdd, String ram) {
            this.hdd = hdd;
            this.ram = ram;
        }

        public ComputerBuilder graphicsCardEnabled(boolean graphicsCardEnabled) {
            this.isGraphicsCardEnabled = graphicsCardEnabled;
            return this;
        }

        public ComputerBuilder bluetoothEnabled(boolean bluetoothEnabled) {
            this.isBluetoothEnabled = bluetoothEnabled;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
