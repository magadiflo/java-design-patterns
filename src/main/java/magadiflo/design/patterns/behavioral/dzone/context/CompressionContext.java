package magadiflo.design.patterns.behavioral.dzone.context;

import magadiflo.design.patterns.behavioral.dzone.strategy.ICompressionStrategy;

import java.util.ArrayList;

/**
 * Context
 */
public class CompressionContext {
    private ICompressionStrategy strategy;

    // Esto se puede configurar en tiempo de ejecución mediante las preferencias de la aplicación.
    public void setCompressionStrategy(ICompressionStrategy strategy) {
        this.strategy = strategy;
    }

    // Usamos la estrategia
    public void createArchive(ArrayList<String> files) {
        this.strategy.compressFiles(files);
    }
}
