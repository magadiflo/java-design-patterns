package magadiflo.design.patterns.structural.facade.guru.digitalocean;

import magadiflo.design.patterns.structural.facade.guru.digitalocean.facade.DBTypes;
import magadiflo.design.patterns.structural.facade.guru.digitalocean.facade.HelperFacade;
import magadiflo.design.patterns.structural.facade.guru.digitalocean.facade.ReportTypes;
import magadiflo.design.patterns.structural.facade.guru.digitalocean.some_subsystem.MySqlHelper;
import magadiflo.design.patterns.structural.facade.guru.digitalocean.some_subsystem.OracleHelper;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        String tableName = "employees";

        // Sin usar Patrón Facade
        Connection connMysql = MySqlHelper.getMySqlDBConnection();
        MySqlHelper mySqlHelper = new MySqlHelper();
        mySqlHelper.generateMySQLHTMLReport(tableName, connMysql);

        Connection connOracle = OracleHelper.getOracleDBConnection();
        OracleHelper oracleHelper = new OracleHelper();
        oracleHelper.generateOracleHTMLReport(tableName, connOracle);

        // Usando Patrón Facade
        /***
         * Como puedes ver, el uso de la interfaz del patrón Facade es una forma mucho más fácil y limpia de evitar
         * tener mucha lógica en el lado del cliente. La clase JDBC Driver Manager para obtener la conexión a la
         * base de datos es un maravilloso ejemplo del patrón de diseño facade.
         */

        HelperFacade.generateReport(DBTypes.MYSQL, ReportTypes.HTML, tableName);
        HelperFacade.generateReport(DBTypes.ORACLE, ReportTypes.HTML, tableName);
    }
}
