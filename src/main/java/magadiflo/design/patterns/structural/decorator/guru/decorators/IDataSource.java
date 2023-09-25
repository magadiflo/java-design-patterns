package magadiflo.design.patterns.structural.decorator.guru.decorators;

public interface IDataSource {
    void writeData(String data);

    String readData();
}
