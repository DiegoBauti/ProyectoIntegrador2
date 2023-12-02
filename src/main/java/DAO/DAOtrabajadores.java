package DAO;
import DAO.Interfaces.*;
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
        String consulta = "select trabajador_id, nombre, apellido, telefono, email, dni, username, sueldo from trabajadores WHERE ind='V' ";
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
    public Trabajadores ObtenerT(int id) {
        Connection cn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            cn = new ConectarBD().getConectar();
            String consulta = "SELECT * FROM trabajadores where trabajador_id=?;";
            ps = cn.prepareStatement(consulta);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                Trabajadores tr = new Trabajadores();
                tr.setTrabajador_id(rs.getInt(consulta));
                return tr;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                if (cn != null) {
                    cn.close();
                }
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                //documento.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public boolean CrearT(Trabajadores trab) {
        String consulta = "INSERT INTO trabajadores(trabajador_id, nombre, apellido, telefono, email, dni, username, sueldo, ind) VALUES (?,?,?,?,?,?,?,?,'V')";
        try {
            cnt = conexion.getConnection();
            pstt = cnt.prepareStatement(consulta);
            pstt.setInt(1, trab.getTrabajador_id());
            pstt.setString(2, trab.getNombre());
            pstt.setString(3, trab.getApellido());
            pstt.setString(4, trab.getTelefono());
            pstt.setString(5, trab.getEmail());
            pstt.setInt(6, trab.getDni());
            pstt.setString(7, trab.getUsername());
            pstt.setDouble(8, trab.getSueldo());
            pstt.executeUpdate();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "No se pudo agregar los datos del nuevo trabajador. \n" + ex);
        }
        return false;
    }

    @Override
    public boolean ActualizarT(Trabajadores trab) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean EliminarT(int id) {
        String consulta = "update trabajadores set ind='N' where trabajador_id=?;";
        try {
            cnt = conexion.getConnection();
            pstt = cnt.prepareStatement(consulta);
            pstt.setInt(1, id);
            pstt.executeUpdate();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "No se pudo eliminar los datos del Trabajador \n" + ex);
        }
        return false;
    }
    
    
    
}