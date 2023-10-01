package magadiflo.design.patterns.behavioral.templateMethod.guru.networks;

// Clase base de red social
public abstract class Network {
    protected String username;
    protected String password;

    // Publique los datos en cualquier red
    // Método de plantilla, final para que las subclases no puedan anularse
    public final boolean post(String message) {
        // Autenticar antes de publicar. Cada red utiliza un método de autenticación diferente
        if (this.logIng(this.username, this.password)) {
            // Enviar los datos de la publicación
            boolean result = this.sendData(message.getBytes());
            this.logOut();
            return result;
        }
        return false;
    }

    public abstract boolean logIng(String username, String password);

    public abstract boolean sendData(byte[] data);

    public abstract void logOut();
}
