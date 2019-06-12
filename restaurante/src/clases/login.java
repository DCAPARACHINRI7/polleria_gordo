package clases;

import static dao.Conexion.getConexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class login extends usuario {

      public boolean login() {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();

        String sql = "SELECT USU.USUARIO, USU.CONTRASEÑA \n"
                + "FROM USUARIOS USU \n"
                + "WHERE USU.USUARIO =?";

        try {
            ps = con.prepareStatement(sql);

            ps.setString(1, this.getUsuario());
            rs = ps.executeQuery();

            if (rs.next()) {
                
                if (this.getPassword().equals(rs.getString(2))) {
                    
                    this.setUsuario(rs.getString(1));
                    this.setPassword(rs.getString(2));

                    return true;
                }
                return false;
            }

            return false;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.toString());
            }
        }
    }
      
    public boolean registrar() {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "INSERT INTO USUARIOS (USUARIO, NOMBRE, APELLIDO, FECHA_NAC, SEXO, DIRECCION, CORREO, CONTRASEÑA, FECHA_ACC, IDTIPOUSU) VALUES(?,?,?,?,?,?,?,?,?,?)";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, getUsuario());
            ps.setString(2, getNombre());
            ps.setString(3, getApellido());
            ps.setString(4, getFecha_nac());
            ps.setString(5, getSexo());
            ps.setString(6, getCorreo());
            ps.setString(7, getPassword());

            ps.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.toString());
            }
        }
    }
    
    
    
    public int existeUsuario(String tipousuario) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();

        String sql = "SELECT count(IDUSUARIO) FROM dbo.USUARIOS WHERE USUARIO = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, tipousuario);
            rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getInt(1);
            }

            return 1;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return 1;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.toString());
            }
        }
    }
    
    
    public boolean esEmail(String correo) {

        // Patrón para validar el email
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

        Matcher mather = pattern.matcher(correo);

        return mather.find();

    }

}
