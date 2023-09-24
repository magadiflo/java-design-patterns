package magadiflo.design.patterns.structural.decorator.decorators;

public interface IDataSource {
    void writeData(String data);

    String readData();
}
