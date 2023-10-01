package magadiflo.design.patterns.behavioral.templateMethod.guru.networks;

import java.util.concurrent.TimeUnit;

// Clase de red social

public class Facebook extends Network {
    public Facebook(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public boolean logIng(String username, String password) {
        System.out.println("Verificando parámetros de usuario");
        System.out.printf("Nombre: %s\n", this.username);
        System.out.println("Password:");
        for (int i = 0; i < this.password.length(); i++) {
            System.out.print("*");
        }
        this.simulateNetworkLatency();
        System.out.println("\nInicio de sesión exitoso en Facebook");
        return true;
    }

    @Override
    public boolean sendData(byte[] data) {
        boolean messagePosted = true;
        if (messagePosted) {
            System.out.printf("Mensaje: \"%s\" fue publicado en Facebook\n", new String(data));
            return true;
        }
        return false;
    }

    @Override
    public void logOut() {
        System.out.printf("Usuario: %s, fue deslogueado de Facebook", this.username);
    }

    private void simulateNetworkLatency() {
        try {
            int i = 0;
            System.out.println();
            while (i < 10) {
                System.out.print(".");
                TimeUnit.MILLISECONDS.sleep(500);
                i++;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
