package Controlador;
import DAO.*;
import Modelo.Trabajadores;
import Vista.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JTable;

public class ControladorTrabajadores implements ActionListener{
    vistaTrabajadores vista;  
        
 
    public ControladorTrabajadores(vistaTrabajadores view){
        this.vista=view;
        vista.btnAgregar_Tra.addActionListener(this);
        vista.btnEliminar_Tra.addActionListener(this);
        vista.btnActualizar_Tra.addActionListener(this);
        MostrarTabla(vista.tblTrabajadores);
    }
    public void MostrarTabla(JTable tabla) {
        DAOtrabajadores daoedit =  new DAOtrabajadores();
        List<Trabajadores>  listaedit =  daoedit.ListarTrabajadores();
        String titulos[]={"ID","NOMBRE","APELLIDO","TELEFONO","EMAIL","DNI","USERNAME","SUELDO"};
        DefaultTableModel modelo = new DefaultTableModel(null,titulos);
        tabla.setModel(modelo);
        for(int i=0; i<listaedit.size();i++){
            modelo.addRow(listaedit.get(i).ListaTrabajdores());
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }
}
    
