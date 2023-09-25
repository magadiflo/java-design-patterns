package magadiflo.design.patterns.structural.decorator.guru.decorators;

public class DataSourceDecorator implements IDataSource {
    private IDataSource wrapper;

    public DataSourceDecorator(IDataSource source) {
        this.wrapper = source;
    }

    @Override
    public void writeData(String data) {
        this.wrapper.writeData(data);
    }

    @Override
    public String readData() {
        return this.wrapper.readData();
    }
}
