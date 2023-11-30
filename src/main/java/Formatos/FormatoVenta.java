package Formatos;

import DAO.MysqlVentasDAO;
import Vista.vistaVenta;
import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import javax.swing.ListSelectionModel;

public class FormatoVenta {
    public static void formatoTabla(vistaVenta vv){
        //Metodo que permite solo 1 selección
        ListSelectionModel sele=vv.tblComic_venta.getSelectionModel();
        ListSelectionModel sele1=vv.tblListaVender.getSelectionModel();
        sele.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        sele1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        vv.tblComic_venta.setDefaultEditor(Object.class, null);
        vv.tblListaVender.setDefaultEditor(Object.class, null);
    }
    public static void formatoInicial(vistaVenta vv){
        vv.btnEliminar.setEnabled(false);
        vv.btnEditar.setEnabled(false);
        vv.btnVaciar.setEnabled(false);
        vv.btnVender.setEnabled(false);
        vv.spnCantidad2.setEnabled(false);
        vv.btnActualizar.setEnabled(false);
        vv.txfNombreBuscar.requestFocus();
    }
    public static void formato1(vistaVenta vv){
        vv.btnEliminar.setEnabled(true);
        vv.btnEditar.setEnabled(true);
        vv.btnVaciar.setEnabled(true);
        vv.btnVender.setEnabled(true);
        vv.spnCantidad2.setEnabled(false);
        vv.btnActualizar.setEnabled(false);
        vv.tblListaVender.setEnabled(true);
        vv.txfNombreBuscar.setEnabled(true);
        vv.spnCantidad.setEnabled(true);
        vv.tblComic_venta.setEnabled(true);
        vv.btnAgregar.setEnabled(true);
        vv.txfNombreBuscar.requestFocus();
    }
    public static void formato2(vistaVenta vv){
        vv.btnEditar.setEnabled(false);
        vv.btnEliminar.setEnabled(false);
        vv.btnVaciar.setEnabled(false);
        vv.btnVender.setEnabled(false);
        vv.txfNombreBuscar.setEnabled(false);
        vv.tblComic_venta.setEnabled(false);
        vv.btnAgregar.setEnabled(false);
        vv.spnCantidad.setEnabled(false);
        vv.spnCantidad2.setEnabled(true);
        vv.btnActualizar.setEnabled(true);
        vv.tblListaVender.setEnabled(false);
    }
    public static void LimpiarCampos(vistaVenta vv){
        vv.txfNombreBuscar.setText("");
        vv.spnCantidad.setValue(0);
        vv.spnCantidad2.setValue(0);
        vv.tblListaVender.clearSelection();
        vv.tblComic_venta.clearSelection();
        vv.txfNombreBuscar.requestFocus();
    }
    public static void generarPdf(int cod,MysqlVentasDAO mv) {
        Document doc = new Document();
        try {
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(doc, new FileOutputStream(ruta + "/Documents/I. Sistemas/6° CICLO/Integrador 1/2° PROYECTO/ComicCrown/ProyectoIntegrador2/src/main/java/facturaspdf/factura" + cod + ".pdf"));
            doc.open();
            PdfPTable tabla = new PdfPTable(3);
            tabla.addCell("Nombre del Comic");
            tabla.addCell("Precio");
            tabla.addCell("Cantidad");
            mv = new MysqlVentasDAO();
            mv.consultapdf(tabla, doc, cod);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
