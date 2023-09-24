package magadiflo.design.patterns.structural.decorator.decorators;

import java.io.*;

public class FileDataSource implements IDataSource {
    private String name;

    public FileDataSource(String name) {
        this.name = name;
    }

    @Override
    public void writeData(String data) {
        File file = new File(this.name);
        try (OutputStream fos = new FileOutputStream(file)) {
            fos.write(data.getBytes(), 0, data.length());
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }

    @Override
    public String readData() {
        char[] buffer = null;
        File file = new File(this.name);
        try (FileReader reader = new FileReader(file)) {
            buffer = new char[(int) file.length()];
            reader.read(buffer);
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
        return new String(buffer);
    }
}
