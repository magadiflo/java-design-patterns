package magadiflo.design.patterns.structural.proxy.digitalocean;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CommandExecutorImpl implements ICommandExecutor {
    @Override
    public void runCommand(String cmd) throws Exception {
        // Alguna implementación pesada
        Process process = Runtime.getRuntime().exec(cmd);

        // Procesa la salida del proceso para obtener la lista de directorios
        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }

        // Espera a que el proceso termine
        int exitCode = process.waitFor();
        System.out.println("El proceso ha terminado con código de salida: " + exitCode);
        System.out.println("El comando ejecutado '" + cmd + "' ha finalizado");
    }
}
