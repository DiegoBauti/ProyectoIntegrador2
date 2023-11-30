package Controlador;

import Vista.*;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class ControladorHerramienta implements MouseListener{
    vistaHerramienta vista;
    public ControladorHerramienta(vistaHerramienta view){
        this.vista=view;
        vista.lblCerrar.addMouseListener(this);
        vista.lblMinimizar.addMouseListener(this);
        vista.btnVentas.addMouseListener(this);
        vista.bntHistorial.addMouseListener(this);
        vista.btnInventario.addMouseListener(this);
        view.setLocationRelativeTo(null);
        EliminarResaltado(view);
        view.setVisible(true);
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource()==vista.lblCerrar) {
            System.exit(0);
        }
        if (e.getSource()==vista.lblMinimizar) {
            vista.setExtendedState(JFrame.ICONIFIED);
        }
        if (e.getSource()==vista.btnVentas) {
            vistaVenta vv=new vistaVenta();
            ControladorVentas cv=new ControladorVentas(vv);
            MostrarInternal(vv);
        }
        if (e.getSource()==vista.btnInventario) {
            vistaInventario vi=new vistaInventario();
            ControladorInventario cv=new ControladorInventario(vi);
            MostrarInternal(vi);
        }
        if (e.getSource()==vista.bntHistorial) {
            vistaHistorial_Venta vh=new vistaHistorial_Venta();
            ControladorHistorial_Venta ch=new ControladorHistorial_Venta(vh);
            MostrarInternal(vh);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource()==vista.btnVentas) {
            vista.btnVentas.setBackground(new Color(178, 191, 138));
        }
        if (e.getSource()==vista.bntHistorial) {
            vista.bntHistorial.setBackground(new Color(178, 191, 138));
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource() == vista.btnVentas) {
            vista.btnVentas.setBackground(new Color(191, 204, 148));
        }
        if (e.getSource() == vista.bntHistorial) {
            vista.bntHistorial.setBackground(new Color(191, 204, 148));
        }
    }
    //Metodo para mostrar los JInternal en los desktop
    void MostrarInternal(JInternalFrame iframe){
        vista.jdpEscritorio.removeAll();
        vista.jdpEscritorio.repaint();
        removerDecorado(iframe);
        vista.jdpEscritorio.add(iframe);
        iframe.setVisible(true);
    }
    //Metodo para eliminar el decorado del JInternalFrame
    void removerDecorado(JInternalFrame internalFrame) {
        BasicInternalFrameUI ui = (BasicInternalFrameUI) internalFrame.getUI();
        ui.setNorthPane(null);
    }
    //Metodo que elimina el resaltado del Boton
    void EliminarResaltado(JFrame frame) {
        vista.btnVentas.setFocusPainted(false);
        vista.bntHistorial.setFocusPainted(false);
        //vista.btnResumen.setFocusCycleRoot(false);
    }
    
}
