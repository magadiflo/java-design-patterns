package magadiflo.design.patterns.structural.facade.guru.digitalocean.facade;

import magadiflo.design.patterns.structural.facade.guru.digitalocean.some_subsystem.MySqlHelper;
import magadiflo.design.patterns.structural.facade.guru.digitalocean.some_subsystem.OracleHelper;

import java.sql.Connection;

public class HelperFacade {
    public static void generateReport(DBTypes dbType, ReportTypes reportType, String tableName) {
        Connection connection = null;

        switch (dbType) {
            case MYSQL -> {
                connection = MySqlHelper.getMySqlDBConnection();
                MySqlHelper mySqlHelper = new MySqlHelper();

                switch (reportType) {
                    case HTML -> mySqlHelper.generateMySQLHTMLReport(tableName, connection);
                    case PDF -> mySqlHelper.generateMySQLPDFReport(tableName, connection);
                }
            }
            case ORACLE -> {
                connection = OracleHelper.getOracleDBConnection();
                OracleHelper oracleHelper = new OracleHelper();

                switch (reportType) {
                    case HTML -> oracleHelper.generateOracleHTMLReport(tableName, connection);
                    case PDF -> oracleHelper.generateOraclePDFReport(tableName, connection);
                }
            }
        }
    }
}
