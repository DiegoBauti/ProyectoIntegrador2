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

public class DAOinventario implements InterfazInventario {
    
    ConectarBD conexion = new ConectarBD();
    Connection cnt;
    PreparedStatement pstt;
    ResultSet rst;
    Comic comic = new Comic();
    
    @Override
    public List ListarComic() {
        ArrayList<Comic> listacmc = new ArrayList();
        String consulta = "SELECT c.comic_id, e.nombre, c.titulo, c.ubicacion_estante, c.clasificacion, c.formato, c.num_pagina, c.ejemplares, c.costo FROM comics c INNER JOIN editoriales e ON c.editorial_id = e.editorial_id WHERE ind='V'";
        try {
            cnt = conexion.getConnection();
            pstt = cnt.prepareStatement(consulta);
            rst = pstt.executeQuery();
            while(rst.next()) {
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
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null, "No se puede mostrar los comics. \n"+ex);
        }
        return listacmc;
    }

    @Override
    public Comic Obtener(int id) {
        Connection cn=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        try {
            cn=new ConectarBD().getConectar();
            String consulta="SELECT * FROM comiccrown.comics where comic_id=?;";
            ps=cn.prepareStatement(consulta);
            ps.setInt(1, id);
            rs=ps.executeQuery();
            while (rs.next()) {
                Comic cm=new Comic();
                cm.setComic_id(rs.getInt(consulta));
                return cm;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }finally{
            try{
                if(cn!=null){cn.close();}
                if(rs!=null){rs.close();}
                if(ps!=null){ps.close();}
                documento.close();
            }catch(Exception ex){
                ex.printStackTrace();
            }
        }
    }

    @Override
    public boolean Crear(Comic cmc) {
        String consulta = "INSERT INTO comics(comic_id, editorial_id, titulo, ubicacion_estante, clasificacion, formato, num_pagina, ejemplares, costo, ind) VALUES (?,?,?,?,?,?,?,?,?,'V')";
        try{
            cnt =  conexion.getConnection();
            pstt =  cnt.prepareStatement(consulta);
            pstt.setInt(1, cmc.getComic_id());
            pstt.setInt(2, cmc.getEditorial_id());
            pstt.setString(3, cmc.getTitulo());
            pstt.setString(4, cmc.getUbicacion_estante());
            pstt.setString(5, cmc.getClasificacion());
            pstt.setString(6, cmc.getFormato());
            pstt.setInt(7, cmc.getNum_pagina());
            pstt.setInt(8, cmc.getEjemplares());
            pstt.setDouble(9, cmc.getCosto());
            pstt.executeUpdate();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "No se pudo agregar los datos al inventario. \n"+ex);
        }  
        return false;
    }

    @Override
    public boolean Actualizar(Comic cmc) {
        
    }

    @Override
    public boolean Eliminar(int id) {
        String consulta="update comics set ind='N' where comic_id=?;";
        try{
            cnt =  conexion.getConnection();
            pstt = cnt.prepareStatement(consulta);
            pstt.setInt(1, id);
            pstt.executeUpdate();
        }catch(Exception ex){
          JOptionPane.showMessageDialog(null, "No se pudo eliminar los datos del cliente \n"+ex); 
        }  
        return false;
    }
    
}
