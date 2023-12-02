package Controlador;
import DAO.*;
import Modelo.Trabajadores;
import Vista.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JInternalFrame;
import javax.swing.JTable;

public class ControladorTrabajadores implements ActionListener{
    vistaTrabajadores vista; 
    DefaultTableModel model;
    static DAOtrabajadores daotra =  new DAOtrabajadores();
    static List<Trabajadores>  listtra =  daotra.ListarTrabajadores();
 
    public ControladorTrabajadores(vistaTrabajadores view){
        this.vista=view;
        vista.btnAgregar_Tra.addActionListener(this);
        vista.btnEliminar_Tra.addActionListener(this);
        vista.btnActualizar_Tra.addActionListener(this);
        MostrarTabla(vista.tblTrabajadores);
        EliminarResaltado(vista);
    }
    
    public static Trabajadores CapturarDatos(vistaTrabajadores vt){    
        Trabajadores tra = new Trabajadores();
        tra.setTrabajador_id(listtra.size()+1);
        tra.setNombre(vt.txtNombre_trabajadores.getText());
        tra.setApellido(vt.txtApellidos_trabajadores.getText());
        tra.setTelefono(vt.txtTelefono_trabajadores.getText());
        tra.setEmail(vt.txtEmail_trabajadores.getText()); 
        tra.setDni(Integer.parseInt(vt.txtDni_trabajadores.getText()));
        tra.setUsername(vt.txtUsername_trabajadores.getText());
        tra.setSueldo((Double)Double.parseDouble(vt.txtSueldo_trabajadores.getText()));
        return tra;
    }
    
    public void LimpiarEntradas(vistaTrabajadores vt) {  
        vt.txtNombre_trabajadores.setText("");
        vt.txtApellidos_trabajadores.setText("");
        vt.txtTelefono_trabajadores.setText("");
        vt.txtEmail_trabajadores.setText("");
        vt.txtDni_trabajadores.setText("");
        vt.txtUsername_trabajadores.setText("");
        vt.txtSueldo_trabajadores.setText("");
    }
    
    public void MostrarTabla(JTable tabla) {
        DAOtrabajadores daoedit =  new DAOtrabajadores();
        List<Trabajadores>  listtra =  daoedit.ListarTrabajadores();
        String titulos[]={"ID","NOMBRE","APELLIDO","TELEFONO","EMAIL","DNI","USERNAME","SUELDO"};
        model = new DefaultTableModel(null,titulos);
        //DefaultTableModel modelo = new DefaultTableModel(null,titulos);
        //tabla.setModel(modelo);
        //for(int i=0; i<listaedit.size();i++){
            //modelo.addRow(listaedit.get(i).ListaTrabajdores());
        //}
        tabla.setModel(model);
        for(int i=0; i<listtra.size();i++){
            model.addRow(listtra.get(i).ListaTrabajdores());
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==vista.btnAgregar_Tra) {
            Trabajadores tra = CapturarDatos(vista);
            daotra.CrearT(tra);
            LimpiarEntradas(vista);
            MostrarTabla(vista.tblTrabajadores);
        }
        if(e.getSource()==vista.btnEliminar_Tra) {
            int fila= vista.tblTrabajadores.getSelectedRow();
            if(fila!=-1) {
                int idtrab = (int) model.getValueAt(fila, 0);
                daotra.EliminarT(idtrab);
                LimpiarEntradas(vista);
                MostrarTabla(vista.tblTrabajadores);
            }
        }
        if (e.getSource()==vista.btnActualizar_Tra) {
            int fila= vista.tblTrabajadores.getSelectedRow();
            
        }
    }
    //Metodo que elimina el resaltado del Boton
    void EliminarResaltado(JInternalFrame iframe) {
        vista.btnActualizar_Tra.setFocusPainted(false);
        vista.btnAgregar_Tra.setFocusPainted(false);
        vista.btnEliminar_Tra.setFocusPainted(false);
    }
}