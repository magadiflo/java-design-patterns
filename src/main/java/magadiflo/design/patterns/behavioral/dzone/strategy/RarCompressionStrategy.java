package magadiflo.design.patterns.behavioral.dzone.strategy;

import java.util.ArrayList;

public class RarCompressionStrategy implements ICompressionStrategy {
    @Override
    public void compressFiles(ArrayList<String> files) {
        System.out.println("Comprimiendo archivos en formato .rar");
    }
}
