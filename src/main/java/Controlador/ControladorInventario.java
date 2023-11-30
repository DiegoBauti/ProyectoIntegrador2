package Controlador;

import DAO.*;
import Modelo.*;
import Vista.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JTable;

public class ControladorInventario implements ActionListener {
    vistaInventario vista;
    DefaultTableModel modelo;
    static DAOinventario daoinv =  new DAOinventario();
    static List<Comic>  listcmc =  daoinv.ListarComic();
    
    public ControladorInventario(vistaInventario vist){
        this.vista=vist;
        vista.btnAgregar.addActionListener(this);
        vista.btnEliminar.addActionListener(this);
        vista.btnActualizar.addActionListener(this);
        MostrarTabla(vista.tblInventario);
    }
    
    public static int EditorialID(String edit) {
        int editid = 0;
        if(edit.equalsIgnoreCase("MARVEL")) {
            editid = 1;
        }
        if(edit.equalsIgnoreCase("DC")) {
            editid = 2;
        }
        if(edit.equalsIgnoreCase("IDW")) {
            editid = 5;
        }
        return editid;
    }
    
    public static Comic CapturarDatos(vistaInventario vi){
        
        String editorial = vi.cbxEdit.getSelectedItem().toString();
        int editid =EditorialID(editorial);
        Comic cmc = new Comic();
        cmc.setComic_id(listcmc.size()+1);
        cmc.setEditorial_id(editid);
        cmc.setTitulo(vi.txtSer.getText());
        cmc.setUbicacion_estante(vi.txtUbi.getText());
        cmc.setClasificacion(vi.cbxRes.getSelectedItem().toString());
        cmc.setFormato(vi.cbxFor.getSelectedItem().toString());
        cmc.setNum_pagina((int) vi.spnNum.getValue());
        cmc.setEjemplares((int) vi.spnSto.getValue());
        cmc.setCosto((Double) Double.parseDouble(vi.txtPre.getText()));
        return cmc;
    }
    
    public void LimpiarEntradas(vistaInventario vi) {
        vi.cbxEdit.setSelectedItem(0);
        vi.txtSer.setText("");
        vi.txtUbi.setText("");
        vi.cbxRes.setSelectedItem(0);
        vi.cbxFor.setSelectedItem(0);
        vi.spnNum.setValue(0);
        vi.spnSto.setValue(0);
        vi.txtPre.setText("");
    }
    
    public void MostrarTabla(JTable tabla) {
        DAOinventario daoinv =  new DAOinventario();
        List<Comic>  listcmc =  daoinv.ListarComic();
        String titulos[]={"ID","EDITORIAL","SERIE","UBICACION","RESTRICCION","FORMATO","NUMERO","STOCK","PRECIO"};
        modelo = new DefaultTableModel(null,titulos);
        tabla.setModel(modelo);
        for(int i=0; i<listcmc.size();i++){
            modelo.addRow(listcmc.get(i).ListaInventario());
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==vista.btnAgregar) {
            Comic cmc = CapturarDatos(vista);
            daoinv.Crear(cmc);
            LimpiarEntradas(vista);
            MostrarTabla(vista.tblInventario);
        }
        if(e.getSource()==vista.btnEliminar) {
            int fila= vista.tblInventario.getSelectedRow();
            int idcmc = (int) modelo.getValueAt(fila, 0);
            daoinv.Eliminar(idcmc);
            LimpiarEntradas(vista);
            MostrarTabla(vista.tblInventario);
        }
        if (e.getSource()==vista.btnActualizar) {
            int fila= vista.tblInventario.getSelectedRow();
            
        }
    }
}
