package Controlador;

import DAO.*;
import Modelo.Editoriales;
import Vista.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;


public class ControladorEditoriales implements ActionListener{
    
    vistaEditoriales vista;   
    DefaultTableModel model;
    static DAOeditoriales daoedit =  new DAOeditoriales();
    static List<Editoriales>  listedit =  daoedit.ListarEditoriales();
 
    public ControladorEditoriales(vistaEditoriales view){
        this.vista=view;
        vista.btnAgregar_Edit.addActionListener(this);
        vista.btnEliminar_Edit.addActionListener(this);
        vista.btnActualizar_Edit.addActionListener(this);
        this.vista.btnEditar_Edit.addActionListener(this);
        MostrarTabla(vista.tblEditoriales);
        EliminarResaltado(vista);
    }
    public static Editoriales CapturarDatos(vistaEditoriales ve){    
        Editoriales edi = new Editoriales();
        edi.setEditorial_id(listedit.size()+1);
        edi.setNombre(ve.txtNombre_editorial.getText());
        edi.setPais(ve.txtPais_editorial.getText());
        edi.setTelefono(Integer.parseInt(ve.txtTelefono_editorial.getText()));
        edi.setEmail(ve.txtEmail_editorial.getText()); 
        edi.setAño_fundacion(Integer.parseInt(ve.txtAño_editorial.getText()));
        return edi;
    }
    
    public void LimpiarEntradas(vistaEditoriales ve) {  
        ve.txtNombre_editorial.setText("");
        ve.txtPais_editorial.setText("");
        ve.txtTelefono_editorial.setText("");
        ve.txtEmail_editorial.setText("");
        ve.txtAño_editorial.setText("");
    }
    public void MostrarTabla(JTable tabla) {
        DAOeditoriales daoedit =  new DAOeditoriales();
        List<Editoriales>  listaedit =  daoedit.ListarEditoriales();
        String titulos[]={"ID","NOMBRE","PAIS","TELEFONO","EMAIL","AÑO"};
        model = new DefaultTableModel(null,titulos);
        tabla.setModel(model);
        for(int i=0; i<listaedit.size();i++){
            model.addRow(listaedit.get(i).ListaEditoriales());
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==vista.btnAgregar_Edit) {
            Editoriales edi = CapturarDatos(vista);
            daoedit.Crear(edi);
            LimpiarEntradas(vista);
            MostrarTabla(vista.tblEditoriales);
        }
        if(e.getSource()==vista.btnEliminar_Edit) {
            int fila= vista.tblEditoriales.getSelectedRow();
            if(fila!=-1) {
                int idtrab = (int) model.getValueAt(fila, 0);
                daoedit.Eliminar(idtrab);
                LimpiarEntradas(vista);
                MostrarTabla(vista.tblEditoriales);
            }
        }
        /*if (e.getSource() == vista.btnEditar_Edit) {
            int fila = vista.tblEditoriales.getSelectedRow();
            if (fila == -1) {
                JOptionPane.showMessageDialog(null, "Debe seleccionar una fila");
            }else {
                Editoriales edi = CapturarDatos(vista);
                vista.txtId_editorial.setText(String.valueOf(edi.getEditorial_id()));
                vista.txtNombre_editorial.setText(edi.getNombre());
                vista.txtPais_editorial.setText(edi.getPais());
                vista.txtTelefono_editorial.setText(String.valueOf(edi.getTelefono()));
                vista.txtEmail_editorial.setText(edi.getEmail());
                vista.txtAño_editorial.setText(String.valueOf(edi.getAño_fundacion()));
                LimpiarEntradas(vista);
                MostrarTabla(vista.tblEditoriales);
            }
        }*/
        if (e.getSource() == vista.btnEditar_Edit) {
            int fila = vista.tblEditoriales.getSelectedRow();
            if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fila");
            } else {
                int id = Integer.parseInt(vista.tblEditoriales.getValueAt(fila, 0).toString());
                String nom = (String) vista.tblEditoriales.getValueAt(fila, 1);
                String pais = (String) vista.tblEditoriales.getValueAt(fila, 2);
                String email = (String) vista.tblEditoriales.getValueAt(fila, 3);
                int tele = Integer.parseInt(vista.tblEditoriales.getValueAt(fila, 4).toString());
                int year = Integer.parseInt(vista.tblEditoriales.getValueAt(fila, 5).toString());
                vista.txtId_editorial.setText(String.valueOf(""+id));
                vista.txtNombre_editorial.setText(nom);
                vista.txtPais_editorial.setText(pais);
                vista.txtEmail_editorial.setText(email);
                vista.txtTelefono_editorial.setText(String.valueOf(tele));
                vista.txtAño_editorial.setText(String.valueOf(year));
            }
        }
            
        
}
        
        
            //LimpiarEntradas(vista);
            //MostrarTabla(vista.tblEditoriales);  
        
       
    //Metodo que elimina el resaltado del Boton
    void EliminarResaltado(JInternalFrame iframe) {
        vista.btnEditar_Edit.setFocusPainted(false);
        vista.btnAgregar_Edit.setFocusPainted(false);
        vista.btnEliminar_Edit.setFocusPainted(false);
    }
    
}//Final