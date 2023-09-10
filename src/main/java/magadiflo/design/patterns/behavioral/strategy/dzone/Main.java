package magadiflo.design.patterns.behavioral.strategy.dzone;

import magadiflo.design.patterns.behavioral.strategy.dzone.context.CompressionContext;
import magadiflo.design.patterns.behavioral.strategy.dzone.strategy.RarCompressionStrategy;
import magadiflo.design.patterns.behavioral.strategy.dzone.strategy.ZipCompressionStrategy;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> fileList = new ArrayList<>();
        fileList.add("word.docx");
        fileList.add("mi-presentacion.ppt");

        CompressionContext context = new CompressionContext();

        // Podríamos asumir que el contexto ya está establecido por las preferencias
        context.setCompressionStrategy(new ZipCompressionStrategy());
        context.createArchive(fileList);

        context.setCompressionStrategy(new RarCompressionStrategy());
        context.createArchive(fileList);
    }
}
