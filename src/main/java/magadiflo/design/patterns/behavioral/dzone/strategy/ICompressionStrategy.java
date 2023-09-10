package magadiflo.design.patterns.behavioral.dzone.strategy;

import java.util.ArrayList;

/**
 * Strategy
 */
public interface ICompressionStrategy {
    void compressFiles(ArrayList<String> files);
}
