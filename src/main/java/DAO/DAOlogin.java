package DAO;

import Modelo.*;
import javax.swing.JOptionPane;

public class DAOlogin extends ConectarBD {
    public DAOlogin(){};
    public Cuenta verificarCuentas(Cuenta cuen){
        Cuenta cuentas=null;
        String consulta="select * from trabajadores where username=? and password=?";
        try{
            ps = con.prepareStatement(consulta);
            ps.setString(1, cuen.getCuenta());
            ps.setString(2, cuen.getPassword());
            rs = ps.executeQuery();
            if(rs.next()){
               cuentas = new Cuenta();
               cuentas.setCuenta(rs.getString("username"));
               cuentas.setPassword(rs.getString("password"));
            } else {
                JOptionPane.showMessageDialog(null, "El nombre de usuario o la contraseña es incorrecta");
            }
        }catch(Exception ex){
            System.out.println("ERROR: Algo salio mal" + ex.getMessage());
        }
        return cuentas;
    } 
}
