
package DAO;
import DAO.Interfaces.*;
import Modelo.Editoriales;
import Modelo.Trabajadores;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class DAOtrabajadores implements TrabajadoresDAO{
    ConectarBD conexion = new ConectarBD();
    Connection cnt;
    PreparedStatement pstt;
    ResultSet rst;
    Trabajadores trabajadores = new Trabajadores();

    @Override
    public List ListarTrabajadores() {
        ArrayList<Trabajadores> listatrab = new ArrayList();
        String consulta = "select trabajador_id, nombre, apellido, telefono, email, dni, username, sueldo from trabajadores";
        try {
            cnt = conexion.getConnection();
            pstt = cnt.prepareStatement(consulta);
            rst = pstt.executeQuery();
            while(rst.next()) {
                Trabajadores tra = new Trabajadores();
                tra.setTrabajador_id(rst.getInt("trabajador_id"));
                tra.setNombre(rst.getString("nombre"));
                tra.setApellido(rst.getString("apellido"));
                tra.setTelefono(rst.getString("telefono"));
                tra.setEmail(rst.getString("email"));
                tra.setDni(rst.getInt("dni"));
                tra.setUsername(rst.getString("username"));
                tra.setSueldo(rst.getDouble("sueldo"));
                listatrab.add(tra);
            }
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null, "No se pueden mostrar los Trabajadores. \n"+ex);
        }
        return listatrab;
    }

    @Override
    public Editoriales ObtenerT(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean CrearT(Trabajadores trab) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean ActualizarT(Trabajadores trab) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean EliminarT(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}