/**
 * @author sebassvr
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class Conexion {
    // Atributos con información de la base de datos.
    public static final String URL = "jdbc:mysql://localhost:3306/escuela?autoReconnet=true&useSSL=false";
    public static final String usuario = "root";
    public static final String contraseña = "root";
    
    // Función para conectar con la base de datos.
    public Connection getConnection(){
        
        Connection conexion = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = (Connection) DriverManager.getConnection(URL,usuario,contraseña);
            JOptionPane.showMessageDialog(null, "Conexion exitosa");
        } catch (Exception ex) {
            System.err.println("Error: "+ex);
        }
        return conexion;
    }
    
}
