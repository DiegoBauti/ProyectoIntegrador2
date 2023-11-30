package DAO;
import DAO.Interfaces.*;
import Modelo.Editoriales;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class DAOeditoriales implements EditorialesDAO {
    
    ConectarBD conexion = new ConectarBD();
    Connection cnt;
    PreparedStatement pstt;
    ResultSet rst;
    Editoriales editoriales = new Editoriales();

    @Override
    public List ListarEditoriales() {
        ArrayList<Editoriales> listaedit = new ArrayList();
        String consulta = "select editorial_id, nombre, pais, telefono ,email, año_fundacion from editoriales";
        try {
            cnt = conexion.getConnection();
            pstt = cnt.prepareStatement(consulta);
            rst = pstt.executeQuery();
            while(rst.next()) {
                Editoriales edi = new Editoriales();
                edi.setEditorial_id(rst.getInt("editorial_id"));
                edi.setNombre(rst.getString("nombre"));
                edi.setPais(rst.getString("pais"));
                edi.setTelefono(rst.getInt("telefono"));
                edi.setEmail(rst.getString("email"));
                edi.setAño_fundacion(rst.getInt("año_fundacion"));
                listaedit.add(edi);
            }
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null, "No se pueden mostrar las Editoriales. \n"+ex);
        }
        return listaedit;
       
    }

    @Override
    public Editoriales Obtener(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean Crear(Editoriales edi) {
        String consulta= "insert into editoriales(editoria_id,nombre,pais,telefono,email,año_fundacion) value(?,?,?,?,?,?)";
        try{
            cnt = conexion.getConnection();
            pstt = cnt.prepareStatement(consulta);                  
            pstt.setInt(1, edi.getEditorial_id());
            pstt.setString(2, edi.getNombre());
            pstt.setString(3, edi.getPais());
            pstt.setInt(4, edi.getTelefono());
            pstt.setString(5, edi.getEmail());
            pstt.setInt(6, edi.getEditorial_id());
            pstt.executeUpdate();  
        }catch(Exception e){
        }
        return false;
        
    }

    @Override
    public boolean Actualizar(Editoriales edi) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean Eliminar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
