package Controlador;

import Vista.*;
import DAO.*;
import Formatos.encriptación;
import Modelo.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ControladorLogin implements MouseListener {
    vistaLogin vista;
    MysqLoginDAO dl;
    public ControladorLogin(vistaLogin view){
        this.vista=view;
        dl=new MysqLoginDAO();
        vista.btnIngresar.addMouseListener(this);
        vista.btnCerr.addMouseListener(this);
        vista.btnMin.addMouseListener(this);
        vista.btnIngresar.setFocusPainted(false);
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
            String user=vista.txtUser.getText();
            String pass=vista.txtPass.getText();
            Cuenta cuen=new Cuenta();
            cuen.setCuenta(user);
            encriptación en=new encriptación();
            cuen.setPassword(en.Encriptar(pass));
            boolean resultado=dl.verificarCuenta(cuen);
            if (user.isEmpty()||pass.isEmpty()) {
                vista.lblError.setText("Rellene los campos faltantes!!");
            }else if(resultado==true){
                vista.lblError.setText("");
                JOptionPane.showMessageDialog(null, "Bienvenido al sistema", 
                        "Inicio exitoso", JOptionPane.WARNING_MESSAGE);
                vistaHerramienta vb=new vistaHerramienta();
                ControladorHerramienta ch=new ControladorHerramienta(vb);
                vista.dispose();
            }else if(resultado==false){
                vista.lblError.setText("Los datos no coinciden");
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
