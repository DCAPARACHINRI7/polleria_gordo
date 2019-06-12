package conexion;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Statement;
public class conexion {
    /*creamos una variable tipo conexion*/
    static Connection contacto = null;

/*metodo estatico  Indica que no es necesario crear una instancia de la clase 
  para acceder al método. Corresponde a la clase en general, mas no a una 
  intancia.tipo connection getConexion obtener el link de la conexion*/

    public static Connection getConexion() 
        {
           /* una varible donde sera almacenado esta url de la conexion*/
            String url = "jdbc:sqlserver://CP_ESCRITORIO\\INGCODE:1433;databaseName=proy_polleria [proyecto on proyecto]";/*se modificara segun a la maquina que se ponga*/
            try 
                {

		/*con el class for name cargamos el driver*/
                    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		
		/*la exception*/
                } catch (ClassNotFoundException e) 
                    {
			/*Mostrara un msj en un panel a la pantalla por si, el driver 
			  no es correcto, aparece esta exception*/
                        JOptionPane.showMessageDialog(null, "No se pudo establecer la conexion... revisar el Driver" 
			+ e.getMessage(),"Error de Conexion", JOptionPane.ERROR_MESSAGE);
                    }
                    try 
                        {
			    /*Llamamos contacto Driver... con el metodo getconnection para traer
			       los datos de la conexion*/
                            contacto = DriverManager.getConnection(url, "proyecto", "123");
                        } catch (SQLException e) 
                            {
                                JOptionPane.showMessageDialog(null, "Error:" + e.getMessage(), "Error de Conexion",JOptionPane.ERROR_MESSAGE);
                            }
            return contacto;
        }

/*esto es para realizar una consulta, creamos el metodo publico 
  tipo estatico ResultSet llamado consulta(con los parametros consulta tipo String) */
    public static ResultSet Consulta(String consulta) {

/*Creamos el obj para llamar a la conexion */
        Connection con = getConexion();
        
	Statement declara;
        try {
            /*declara es igual a createStatement como crear una consulta
	      se crear la consulta*/
            declara = con.createStatement();

            /*para realizar una consulta, y poder retornar una consulta */
            ResultSet respuesta = declara.executeQuery(consulta);
            return respuesta;

	/*Si no se cumple esta exception*/
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error:" + e.getMessage(), "Error de Conexion",
                    JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public PreparedStatement prepareStatement(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}




