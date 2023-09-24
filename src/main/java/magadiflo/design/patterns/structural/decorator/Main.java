package magadiflo.design.patterns.structural.decorator;

import magadiflo.design.patterns.structural.decorator.decorators.*;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        Path path = Paths.get(System.getProperty("user.dir") + "/out/OutputDemo.txt");
        String salaryRecords = "Name,Salary\nJohn Smith, 100_000\nSteven Jobs, 912_000";

        FileDataSource fileDataSource = new FileDataSource(path.toAbsolutePath().toString());
        EncryptionDecorator encryptionDecorator = new EncryptionDecorator(fileDataSource);
        DataSourceDecorator encoded = new CompressionDecorator(encryptionDecorator);

        encoded.writeData(salaryRecords);
        IDataSource plain = new FileDataSource(path.toAbsolutePath().toString());

        System.out.println("- Input");
        System.out.println(salaryRecords);

        System.out.println("\n- Encoded");
        System.out.println(plain.readData());

        System.out.println("\n- Decoded");
        System.out.println(encoded.readData());
    }
}
