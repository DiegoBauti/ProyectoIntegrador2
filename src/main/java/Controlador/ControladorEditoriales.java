
package Controlador;

import DAO.*;
import Modelo.Editoriales;
import Vista.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JInternalFrame;
import javax.swing.JTable;


public class ControladorEditoriales implements ActionListener{
    
    vistaEditoriales vista;   
    
 
    public ControladorEditoriales(vistaEditoriales view){
        this.vista=view;
        vista.btnAgregar_Edit.addActionListener(this);
        vista.btnEliminar_Edit.addActionListener(this);
        vista.btnActualizar_Edit.addActionListener(this);
        EliminarResaltado(vista);
        MostrarTabla(vista.tblEditoriales);
    }
    public void MostrarTabla(JTable tabla) {
        DAOeditoriales daoedit =  new DAOeditoriales();
        List<Editoriales>  listaedit =  daoedit.ListarEditoriales();
        String titulos[]={"ID","NOMBRE","PAIS","TELEFONO","EMAIL","AÑO"};
        DefaultTableModel modelo = new DefaultTableModel(null,titulos);
        tabla.setModel(modelo);
        for(int i=0; i<listaedit.size();i++){
            modelo.addRow(listaedit.get(i).ListaEditoriales());
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
    }
    //Metodo que elimina el resaltado del Boton
    void EliminarResaltado(JInternalFrame iframe) {
        vista.btnActualizar_Edit.setFocusPainted(false);
        vista.btnAgregar_Edit.setFocusPainted(false);
        vista.btnEliminar_Edit.setFocusPainted(false);
    }
    
    
    
}
