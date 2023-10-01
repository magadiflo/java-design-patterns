package magadiflo.design.patterns.behavioral.templateMethod.guru;

import magadiflo.design.patterns.behavioral.templateMethod.guru.networks.Facebook;
import magadiflo.design.patterns.behavioral.templateMethod.guru.networks.Network;
import magadiflo.design.patterns.behavioral.templateMethod.guru.networks.Twitter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Network network = null;

        System.out.println("Ingrese un username: ");
        String username = reader.readLine();

        System.out.println("Ingrese un password: ");
        String password = reader.readLine();

        // Ingrese el mensaje
        System.out.println("Ingrese mensaje: ");
        String message = reader.readLine();

        System.out.println("\nElije una red social para publicar tu mensaje: \n1 - Facebook\n2 - Twitter");
        int choice = Integer.parseInt(reader.readLine());

        // Cree el objeto de red adecuado y envíe el mensaje.
        if (choice == 1) {
            network = new Facebook(username, password);
        } else if (choice == 2) {
            network = new Twitter(username, password);
        }
        network.post(message);
    }
}
