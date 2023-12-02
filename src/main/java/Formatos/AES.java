package Formatos;

import java.util.Base64;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JOptionPane;

public class AES {
    String llave="proyectointegrador";   
    
    public SecretKeySpec crearClave(String llave){
        try {
            byte cadena[]=llave.getBytes("UTF-8");
            MessageDigest md =MessageDigest.getInstance("SHA-1");
            cadena=md.digest(cadena);
            cadena=Arrays.copyOf(cadena, 16);
            SecretKeySpec se=new SecretKeySpec(cadena,"AES");
            return se;
        } catch (Exception e) {
            return null;
        }
    }
    
    //ENCRIPTAR
    public String Encriptar(String encriptar){
        try {
            SecretKeySpec se=crearClave(llave);
            Cipher ci=Cipher.getInstance("AES");
            ci.init(Cipher.ENCRYPT_MODE, se);
            byte cadena[]=encriptar.getBytes("UTF-8");
            byte encriptado[]=ci.doFinal(cadena);
            String cadena_encrip=Base64.getEncoder().encodeToString(encriptado);
            return cadena_encrip;
        } catch (Exception e) {
            return null;
        }
    }
    
    //DESENCRIPTAR
    public String Desencriptar(String desencriptar){
        try {
            SecretKeySpec se=crearClave(llave);
            Cipher ci=Cipher.getInstance("AES");
            ci.init(Cipher.DECRYPT_MODE, se);
            byte[] cadena = Base64.getDecoder().decode(desencriptar);
            byte desencriptado[]=ci.doFinal(cadena);
            String cadena_desencrip=new String(desencriptado);
            return cadena_desencrip;
        } catch (Exception e) {
            return null;
        }
    }
}
