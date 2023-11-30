package Controlador;

import Vista.*;
import DAO.*;
import Modelo.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ControladorLogin implements MouseListener {
    vistaLogin vista;
    public ControladorLogin(vistaLogin view){
        this.vista=view;
        vista.btnIngresar.addMouseListener(this);
        vista.btnCerr.addMouseListener(this);
        vista.btnMin.addMouseListener(this);
        view.setLocationRelativeTo(null);
        view.setVisible(true);
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource()==vista.btnCerr) {
            System.exit(0);
        }
        if (e.getSource()==vista.btnMin) {
            vista.setExtendedState(JFrame.ICONIFIED);
        }
        if (e.getSource()==vista.btnIngresar) {
            DAOlogin dalog;
            Cuenta cuent = new Cuenta();
            cuent.setCuenta(vista.txtUser.getText());
            cuent.setPassword(vista.txtPass.getText());
            dalog = new DAOlogin();
            Cuenta cuentas = dalog.verificarCuentas(cuent);
            if(cuentas!=null) {
                vistaHerramienta vb=new vistaHerramienta();
                ControladorHerramienta ch=new ControladorHerramienta(vb);
                vista.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "El nombre de usuario o la contraseña es incorrecta");
            }
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
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
    
}
