
package DAO.Interfaces;
import Modelo.*;
import java.util.List;

public interface TrabajadoresDAO {
    public List ListarTrabajadores();
    public Editoriales ObtenerT(int id);
    public boolean CrearT(Trabajadores trab);
    public boolean ActualizarT(Trabajadores trab);
    public boolean EliminarT(int id);
}
