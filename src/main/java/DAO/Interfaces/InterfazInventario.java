package DAO.Interfaces;

import Modelo.*;
import java.util.List;
import javax.swing.JTable;

public interface InterfazInventario {
    public List ListarComic();
    public Comic Obtener(int id);
    public boolean Crear(Comic cmc);
    //public boolean Actualizar(Comic cmc);
    public boolean Eliminar(int id);
     void listaComicxNombre(String nombre,JTable tabla);
}
