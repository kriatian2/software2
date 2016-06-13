package app;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JButton;


public class ConexionConOracle {

    private Connection conexion;

    /**
     * Conecta la base de datos.
     */
    public void conectar() {
        if (this.conexion == null) {
            try {
                Class.forName("oracle.jdbc.OracleDriver");
                String BaseDeDatos = "jdbc:oracle:thin:@localhost:1521:XE";               
                this.conexion = DriverManager.getConnection(BaseDeDatos, "CRISTIAN", "b0cfaef9");
            } catch (ClassNotFoundException | SQLException e) {
            }
        }
    }

    /**
     * Desconecta la base de datos.
     */
    public void desconectar() {
        try {
            this.conexion.close();
            this.conexion = null;
        } catch (SQLException ex) {
        }
    }

    /**
     * Selecciona datos de una tabla.
     * @param tabla de la que se quieren obtener datos.
     * @param columna dato a obtener.
     * @param where condicion para obtener el dato.
     * @param order forma de ordenar los datos consultados.
     * @return una matriz con los datos obtenidos
     */
    public String[][] seleccionar(String tabla, String columna, String where, String order) {
        int registros = 0;
        String colname[] = columna.split(",");

        String q = "SELECT " + columna + " FROM " + tabla;
        String q2 = "SELECT count(*) as total FROM " + tabla;
        if (where != null) {
            q += " WHERE " + where;
            q2 += " WHERE " + where;
        }
        if (order != null) {
            q += " ORDER BY " + order;
        }
        //ejecuta la sentencia

        try {
            PreparedStatement pstm = this.conexion.prepareStatement(q2);
            try (ResultSet res = pstm.executeQuery()) {
                res.next();
                registros = res.getInt("total");
            }
        } catch (SQLException e) {
            
        }

        //rellena la tabla
        String[][] data = new String[registros][colname.length];
        try {
        	this.conectar();
            PreparedStatement pstm = this.conexion.prepareStatement(q);
            try (ResultSet res = pstm.executeQuery()) {
                int i = 0;
                while (res.next()) {
                    for (int j = 0; j <= colname.length - 1; j++) {
                        data[i][j] = res.getString(colname[j]);
                    }
                    i++;
                }
            }
        } catch (SQLException e) {
            
        }

        return data;
    }
    


    /**
     * Sentencia para insertar datos en la base de datos.
     * @param tabla en la que se quieren insertar datos.
     * @param campos datos en los que se quieren insertar datos,
     * @param valores para el dato.
     * @return verdadero si la sentencia se ha ejecutado.
     */
    public boolean insertar(String tabla, String campos, String valores) {
        boolean resultado = false;

        String q = " INSERT INTO " + tabla + " ( " + campos + " ) VALUES ( " + valores + " ) ";

        //ejecuta la sentencia
        try {
            try (PreparedStatement pstm = this.conexion.prepareStatement(q)) {
                pstm.execute();
            }
            resultado = true;
        } catch (SQLException e) {
        }
        return resultado;
    }

    /**
     * Sentencia para actualizar datos en la base de datos.
     * @param tabla en la que cambiar los datos.
     * @param columna campo en el que cambiar el dato.
     * @param valor para cambiar.
     * @param condicion para obtener los datos.
     * @return verdadero si la sentencia se ejecuta correctamente.
     */
    public boolean actualizar(String tabla, String columna, String valor, String condicion) {
        boolean r = false;
        String u = " UPDATE " + tabla + " SET " + columna + "=" + valor + " where " + condicion;

        try {
            try (PreparedStatement pstm = this.conexion.prepareStatement(u)) {
                pstm.execute();
            }
            r = true;
        } catch (SQLException e) {
        }
        return r;
    }

    /**
     * Sentencia para eliminar datos de la base de datos.
     * @param tabla en la que eliminar datos.
     * @param condicion para eliminar datos.
     * @return verdadero si la sentencia se ha ejecutado correctamente.
     * 
     * No lo usamos pero lo dejamos implementado por si en un futuro hay que utilizarlo
     */
    public boolean eliminar(String tabla, String condicion) {
        boolean resultado = false;
        String d = " DELETE FROM " + tabla + " where " + condicion;

        try {
            try (PreparedStatement pstm = this.conexion.prepareStatement(d)) {
                pstm.executeUpdate();
            }
            resultado = true;
        } catch (SQLException e) {
        }
        return resultado;
    }
}		