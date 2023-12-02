package DAO;

import DAO.Interfaces.*;
import Modelo.Comic;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class DAOinventario implements InterfazInventario {

    ConectarBD conexion = new ConectarBD();
    Connection cnt;
    PreparedStatement pstt;
    ResultSet rst;
    Comic comic = new Comic();

    @Override
    public List ListarComic() {
        ArrayList<Comic> listacmc = new ArrayList();
        String consulta = "SELECT c.comic_id, e.nombre, c.titulo, c.ubicacion_estante, c.clasificacion, c.formato, c.num_pagina, c.ejemplares, c.costo FROM comics c INNER JOIN editoriales e ON c.editorial_id = e.editorial_id WHERE c.ind='V'";
        try {
            cnt = conexion.getConnection();
            pstt = cnt.prepareStatement(consulta);
            rst = pstt.executeQuery();
            while (rst.next()) {
                Comic cmc = new Comic();
                cmc.setComic_id(rst.getInt(1));
                cmc.setEditorial(rst.getString(2));
                cmc.setTitulo(rst.getString(3));
                cmc.setUbicacion_estante(rst.getString(4));
                cmc.setClasificacion(rst.getString(5));
                cmc.setFormato(rst.getString(6));
                cmc.setNum_pagina(rst.getInt(7));
                cmc.setEjemplares(rst.getInt(8));
                cmc.setCosto(rst.getDouble(9));
                listacmc.add(cmc);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "No se puede mostrar los comics. \n" + ex);
        }
        return listacmc;
    }

    @Override
    public Comic Obtener(int id) {
        Connection cn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            cn = new ConectarBD().getConectar();
            String consulta = "SELECT * FROM comiccrown.comics where comic_id=?;";
            ps = cn.prepareStatement(consulta);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                Comic cm = new Comic();
                cm.setComic_id(rs.getInt(consulta));
                return cm;
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
    public boolean Crear(Comic cmc) {
        String consulta = "INSERT INTO comics(editorial_id, titulo, ubicacion_estante, clasificacion, formato, num_pagina, ejemplares, costo, ind) VALUES (?,?,?,?,?,?,?,?,'V')";
        try {
            cnt = conexion.getConnection();
            pstt = cnt.prepareStatement(consulta);
            pstt.setInt(1, cmc.getEditorial_id());
            pstt.setString(2, cmc.getTitulo());
            pstt.setString(3, cmc.getUbicacion_estante());
            pstt.setString(4, cmc.getClasificacion());
            pstt.setString(5, cmc.getFormato());
            pstt.setInt(6, cmc.getNum_pagina());
            pstt.setInt(7, cmc.getEjemplares());
            pstt.setDouble(8, cmc.getCosto());
            pstt.executeUpdate();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "No se pudo agregar los datos al inventario. \n" + ex);
        }
        return false;
    }

   

    @Override
    public boolean Eliminar(int id) {
        String consulta = "update comics set ind='N' where comic_id=?;";
        try {
            cnt = conexion.getConnection();
            pstt = cnt.prepareStatement(consulta);
            pstt.setInt(1, id);
            pstt.executeUpdate();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "No se pudo eliminar los datos del cliente \n" + ex);
        }
        return false;
    }
    //Metodo para filtrar los comics
    @Override
    public void listaComicxNombre(String nombre,JTable tabla) {
        Connection cn=null;
        PreparedStatement pstm=null;
        ResultSet rs=null;
        DefaultTableModel modelo=(DefaultTableModel) tabla.getModel();
        tabla.setModel(modelo);
        modelo.setRowCount(0);
        try{
            cn=new ConectarBD().getConectar();
            String consulta="SELECT c.comic_id, e.nombre, c.titulo, c.ubicacion_estante, c.clasificacion, c.formato, c.num_pagina, c.ejemplares, c.costo \n" +
                            "FROM comics c \n" +
                            "INNER JOIN editoriales e ON c.editorial_id = e.editorial_id \n" +
                            "WHERE c.titulo LIKE ? AND ejemplares > 0 AND c.ind = 'V'; ";
            pstm=cn.prepareStatement(consulta);
            pstm.setString(1, nombre+"%");
            rs=pstm.executeQuery();
            while (rs.next()) {
                Comic cm=new Comic();
                cm.setComic_id(rs.getInt(1));
                cm.setEditorial(rs.getString(2));
                cm.setTitulo(rs.getString(3));
                cm.setUbicacion_estante(rs.getString(4));
                cm.setClasificacion(rs.getString(5));
                cm.setFormato(rs.getString(6));
                cm.setNum_pagina(rs.getInt(7));
                cm.setEjemplares(rs.getInt(8));
                cm.setCosto(rs.getDouble(9));
                modelo.addRow(cm.ListaInventario());
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            try{
                if(cn!=null)cn.close();
                if(pstm!=null)pstm.close();
                if(rs!=null)cn.close();
            }catch(Exception e2){
                e2.printStackTrace();
            }
        }
    }

}
