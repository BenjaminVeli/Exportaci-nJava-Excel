package com.mycompany.sistema;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField; 
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class ProductosDAO {

         private int codigo;
         String articulo;
         String modelo;
         String marca;
         String umed;
         BigDecimal precio;
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
     public String getArticulo() {
        return articulo;
    }

    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }


    public String getUmed() {
        return umed;
    }

    public void setUmed(String umed) {
        this.umed = umed;
    }


    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }
 
     public void InsertarProducto(JTextField paramArticulo,  JTextField paramPrecio, JTextField paramModelo, JTextField paramMarca,  JTextField paramUmed , File foto) {
    CConexion objetoConexion = new CConexion();
    String consulta = "INSERT INTO Productos (articulo, modelo, marca,  umed,  precio, foto) VALUES (?, ?, ?, ?, ?, ?)";

    try {
        FileInputStream fis = new FileInputStream(foto);
        CallableStatement cs = objetoConexion.estableceConexion().prepareCall(consulta);
        cs.setString(1, paramArticulo.getText());
        cs.setString(2, paramModelo.getText());
        cs.setString(3, paramMarca.getText());
        cs.setString(4, paramUmed.getText());
        cs.setBigDecimal(5, new BigDecimal(paramPrecio.getText()));
        cs.setBinaryStream(6, fis, (int) foto.length());
        cs.execute();

        JOptionPane.showMessageDialog(null, "Se insertó correctamente el producto");

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "No se insertó correctamente el producto, error: " + e.toString());
    }
}

    
    
    public void MostrarProductos(JTable paramTablaTotalProductos) {
        CConexion objetoConexion = new CConexion();
        DefaultTableModel modelo = new DefaultTableModel();

        String sql = "";

        modelo.addColumn("Id");
        modelo.addColumn("Artículo");
        modelo.addColumn("Modelo");
        modelo.addColumn("Marca");
        modelo.addColumn("UMed");
        modelo.addColumn("Precio");
        modelo.addColumn("Foto");

        paramTablaTotalProductos.setModel(modelo);
        
        sql = "SELECT * FROM Productos";
        
       try {
            Statement st = objetoConexion.estableceConexion().createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                String id = rs.getString("id");
                String articulo = rs.getString("articulo");
                String modelos = rs.getString("modelo");
                String marca = rs.getString("marca");
                String umed = rs.getString("umed");
                String precio = rs.getString("precio");
                
                byte [] imageBytes = rs.getBytes("foto");
                Image foto = null;
                if (imageBytes !=null) {
                    try{
                        ImageIcon imageIcon = new ImageIcon(imageBytes);
                        foto = imageIcon.getImage();
                    } catch (Exception e ) {

                        JOptionPane.showMessageDialog(null,"Error:"+e.toString());

                    }
                }

                modelo.addRow(new Object[]{id, articulo, modelos, marca , umed, precio, foto});
            }

            paramTablaTotalProductos.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar cuartos, error: " + e.toString());
        }
    }

public void SeleccionarProducto(JTable paramTablaProductos, JTextField paramId, JTextField paramArticulo, JTextField paramModelo, JTextField paramMarca,  JTextField paramUmed,  JTextField paramPrecio, JLabel foto) {
        try {
            int fila = paramTablaProductos.getSelectedRow();
            if (fila >= 0) {
                paramId.setText(paramTablaProductos.getValueAt(fila, 0).toString());
                paramArticulo.setText(paramTablaProductos.getValueAt(fila, 1).toString());
                paramModelo.setText(paramTablaProductos.getValueAt(fila, 2).toString());
                paramMarca.setText(paramTablaProductos.getValueAt(fila, 3).toString());
                paramUmed.setText(paramTablaProductos.getValueAt(fila, 4).toString());
                paramPrecio.setText(paramTablaProductos.getValueAt(fila, 5).toString());

                // Convertir los bytes de la imagen a BufferedImage
                Image imagen = (Image) paramTablaProductos.getValueAt(fila, 6);
                ImageIcon originalIcon = new ImageIcon(imagen);
                int lblanchura = foto.getWidth();
                int lblaltura = foto.getHeight();
                        
                        Image ImagenEscalada= originalIcon.getImage().getScaledInstance(lblanchura, lblaltura, Image.SCALE_SMOOTH);
                        foto.setIcon(new ImageIcon(ImagenEscalada));
            } else {
                JOptionPane.showMessageDialog(null, "Fila no seleccionada");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de selección, error: " + e.toString());
        }
    }
    
    public void ModificarProductos(JTextField paramCodigo, JTextField paramArticulo, JTextField paramModelo, JTextField paramMarca, JTextField paramUmed,  JTextField paramPrecio) {
        setCodigo(Integer.parseInt(paramCodigo.getText()));
        setArticulo(paramArticulo.getText());
        setModelo(paramModelo.getText());
        setMarca(paramMarca.getText());
        setUmed(paramUmed.getText());
        setPrecio(new BigDecimal(paramPrecio.getText()));

        CConexion objetoConexion = new CConexion();

        String consulta = "UPDATE Productos SET articulo=?, modelo=?, marca=?,  umed=?,  precio=? WHERE id=?";

        try {
            CallableStatement cs = objetoConexion.estableceConexion().prepareCall(consulta);
            cs.setString(1, getArticulo());
            cs.setString(2, getModelo());
            cs.setString(3, getMarca());
            cs.setString(4, getUmed());
            cs.setBigDecimal(5, getPrecio());
            cs.setInt(6, getCodigo());

            int filasAfectadas = cs.executeUpdate();

            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(null, "Modificación exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo modificar, el producto con el ID proporcionado no existe.");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo modificar, error: " + e.toString());
        }
    }
    
    public void EliminarProductos(JTextField paramCodigo) {
    setCodigo(Integer.parseInt(paramCodigo.getText()));

    CConexion objetoConexion = new CConexion(); 

    String consulta = "DELETE FROM Productos WHERE productos.id=?";

    try {
        CallableStatement cs = objetoConexion.estableceConexion().prepareCall(consulta);
        cs.setInt(1, getCodigo());
        cs.execute();

        JOptionPane.showMessageDialog(null, "Se eliminó correctamente el producto");

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "No se pudo eliminar el producto, error: " + e.toString());
    }
}
    
}
