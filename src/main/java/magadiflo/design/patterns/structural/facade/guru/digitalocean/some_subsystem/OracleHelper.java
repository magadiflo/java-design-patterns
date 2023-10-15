package magadiflo.design.patterns.structural.facade.guru.digitalocean.some_subsystem;

import java.sql.Connection;

public class OracleHelper {
    public static Connection getOracleDBConnection() {
        // Obtiene la conexión a la base de datos Oracle utilizando los parámetros de conexión
        return null;
    }

    public void generateOraclePDFReport(String tableName, Connection conn) {
        // Obtiene datos de la tabla y genera el reporte en pdf
    }

    public void generateOracleHTMLReport(String tableName, Connection conn) {
        // Obtiene datos de la tabla y genera reporte en HTML
    }

}
