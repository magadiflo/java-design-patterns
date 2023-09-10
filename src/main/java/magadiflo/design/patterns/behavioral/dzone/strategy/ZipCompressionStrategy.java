package magadiflo.design.patterns.behavioral.dzone.strategy;

import java.util.ArrayList;

public class ZipCompressionStrategy implements ICompressionStrategy {
    @Override
    public void compressFiles(ArrayList<String> files) {
        System.out.println("Comprimiendo archivos en formato .zip");
    }
}
