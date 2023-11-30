package DAO;

import DAO.Interfaces.LoginDAO;
import Modelo.*;
import java.sql.*;
import javax.swing.JOptionPane;

public class DAOlogin extends ConectarBD implements LoginDAO {

    public DAOlogin() {
    }

    /*
    public Cuenta verificarCuentas(Cuenta cuen) {
        Cuenta cuentas = null;
        String consulta = "select * from trabajadores where username=? and password=?";
        try {
            ps = con.prepareStatement(consulta);
            ps.setString(1, cuen.getCuenta());
            ps.setString(2, cuen.getPassword());
            rs = ps.executeQuery();
            if (rs.next()) {
                cuentas = new Cuenta();
                cuentas.setCuenta(rs.getString("username"));
                cuentas.setPassword(rs.getString("password"));
            } else {
                JOptionPane.showMessageDialog(null, "El nombre de usuario o la contraseña es incorrecta");
            }
        } catch (Exception ex) {
            System.out.println("ERROR: Algo salio mal" + ex.getMessage());
        }
        return cuentas;
    }*/

    @Override
    public boolean verificarCuenta(Cuenta cuen) {
        Connection cn = null;
        Statement st = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            cn = new ConectarBD().getConectar();
            st = cn.createStatement();
            String consulta = "select * from trabajadores where username=? and password=?";
            ps = cn.prepareStatement(consulta);
            ps.setString(1, cuen.getCuenta());
            ps.setString(2, cuen.getPassword());
            rs = ps.executeQuery();
            return rs.next();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (cn != null) {
                    cn.close();
                }
                if (rs != null) {
                    rs.close();
                }
                if (ps!=null) {
                    ps.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
     return false;
    }
}
