package com.mycompany.sistema;

import java.awt.Desktop;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Arrays;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class CrearProductos extends javax.swing.JFrame {

    public File archivoseleccionado;
    
   public CrearProductos() {
    initComponents(); 

    txtSearch.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
        @Override
        public void insertUpdate(javax.swing.event.DocumentEvent e) {
            filterTable();
        }

        @Override
        public void removeUpdate(javax.swing.event.DocumentEvent e) {
            filterTable();
        }

        @Override
        public void changedUpdate(javax.swing.event.DocumentEvent e) {
            filterTable();
        }
    });
        
    Limpiar();

    this.setLocationRelativeTo(null);
    txtId.setEnabled(false);

    ProductosDAO objetoAlumnos = new ProductosDAO();
    objetoAlumnos.MostrarProductos(tbTotalProductos);
    
    btnExportar.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
            exportarAPDFProductos();
        }
    });
}
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtArticulo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnExportar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtUmed = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        btnExplorar = new javax.swing.JToggleButton();
        jLabel17 = new javax.swing.JLabel();
        txtrutaimagen = new javax.swing.JTextField();
        lblimagen = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbTotalProductos = new javax.swing.JTable();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Búsqueda "));
        jPanel3.setToolTipText("");

        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Productos"));

        jLabel1.setText("Artículo :");

        txtArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtArticuloActionPerformed(evt);
            }
        });

        jLabel3.setText("Precio :");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel4.setText("Id:");

        btnExportar.setText("Exportar");

        jLabel5.setText("Modelo :");

        jLabel6.setText("Marca :");

        jLabel8.setText("U.MED :");

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                    .addComponent(txtMarca, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtId)
                    .addComponent(txtArticulo)
                    .addComponent(txtModelo)
                    .addComponent(txtUmed))
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExportar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(54, 54, 54))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUmed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addGap(48, 48, 48)
                .addComponent(btnGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimpiar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExportar)
                .addGap(20, 20, 20))
        );

        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Foto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N

        btnExplorar.setText("Explorar");
        btnExplorar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExplorarActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel17.setText("Imagen Seleccionada");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblimagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtrutaimagen, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE))
                .addGap(34, 34, 34))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addComponent(btnExplorar, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(124, 124, 124))))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(btnExplorar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtrutaimagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblimagen, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        tbTotalProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbTotalProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbTotalProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbTotalProductos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtArticuloActionPerformed
      
    }//GEN-LAST:event_txtArticuloActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        
         ProductosDAO objetoAlumno =  new ProductosDAO();
         objetoAlumno.InsertarProducto(txtArticulo, txtPrecio,txtModelo,txtMarca,txtUmed,archivoseleccionado);
         objetoAlumno.MostrarProductos(tbTotalProductos);   
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        
         ProductosDAO objetoAlumno =  new ProductosDAO();
         objetoAlumno.ModificarProductos(txtId, txtArticulo,  txtPrecio,txtModelo,txtMarca,txtUmed,archivoseleccionado);
         objetoAlumno.MostrarProductos(tbTotalProductos);   
        
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
          
         ProductosDAO objetoAlumno =  new ProductosDAO();
         objetoAlumno.EliminarProductos(txtId);
         objetoAlumno.MostrarProductos(tbTotalProductos);    
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        
    }//GEN-LAST:event_txtSearchActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
       Limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnExplorarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExplorarActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        
        int result = fileChooser.showOpenDialog(null);
        
        if (result==JFileChooser.APPROVE_OPTION) {
        
            archivoseleccionado = fileChooser.getSelectedFile();
            txtrutaimagen.setText(archivoseleccionado.getName());
            
            try {
                
                Image img = ImageIO.read(archivoseleccionado);
                ImageIcon originalIcon = new ImageIcon(img);
                
                int lblanchura = lblimagen.getWidth();
                int lblaltura = lblimagen.getHeight();
                
                Image ImagenEscalada = originalIcon.getImage().getScaledInstance(lblanchura,lblaltura, Image.SCALE_SMOOTH);
                lblimagen.setIcon(new ImageIcon(ImagenEscalada));
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Error al mostrar imagen");
            } 
        }
    }//GEN-LAST:event_btnExplorarActionPerformed

    private void tbTotalProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbTotalProductosMouseClicked

        ProductosDAO objetoAlumno =  new ProductosDAO();
        objetoAlumno.SeleccionarProducto(tbTotalProductos,txtId,  txtArticulo,  txtModelo,txtMarca,txtUmed,txtPrecio,lblimagen);

    }//GEN-LAST:event_tbTotalProductosMouseClicked

    private void filterTable() {
    String searchText = txtSearch.getText().trim();
    ProductosDAO objetoAlumnos = new ProductosDAO();
    objetoAlumnos.FiltrarProductos(tbTotalProductos, searchText);
    }
    
    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CrearProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearProductos().setVisible(true);
            }
        });
    }


    
    
 

public static void exportarAPDFProductos() {
    try {
        // Establecer conexión a la base de datos
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/sistema", "root", "");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM productos");

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Productos");

        XSSFCellStyle estiloCelda = workbook.createCellStyle();
        estiloCelda.setAlignment(HorizontalAlignment.CENTER);
        estiloCelda.setVerticalAlignment(VerticalAlignment.CENTER);
        estiloCelda.setBorderTop(BorderStyle.THIN);
        estiloCelda.setBorderLeft(BorderStyle.THIN);
        estiloCelda.setBorderRight(BorderStyle.THIN);
        estiloCelda.setBorderBottom(BorderStyle.THIN);
        estiloCelda.setWrapText(true);

        XSSFFont font = workbook.createFont();
        font.setFontHeightInPoints((short) 12); 
        font.setBold(true); 
        estiloCelda.setFont(font);
        
        XSSFCellStyle estiloCeldaNoNegrita = workbook.createCellStyle();
        estiloCeldaNoNegrita.setAlignment(HorizontalAlignment.CENTER);
        estiloCeldaNoNegrita.setVerticalAlignment(VerticalAlignment.CENTER);
        estiloCeldaNoNegrita.setBorderLeft(BorderStyle.THIN);
        estiloCeldaNoNegrita.setBorderRight(BorderStyle.THIN);
        
        XSSFFont fontNoNegrita = workbook.createFont();
        fontNoNegrita.setFontHeightInPoints((short) 12);
        estiloCeldaNoNegrita.setFont(fontNoNegrita);
        estiloCeldaNoNegrita.setWrapText(true);

        // Encabezados de columnas
        String[] encabezados = {"COD", "ARTICULO", "MODELO", "MARCA", "U.MED",  "PRECIO", "FOTO"};
        int rowNum = 0; // Empieza a escribir los datos desde la fila 0

        while (resultSet.next()) {
            // Agrega un espacio después de cada conjunto de datos
            if (rowNum != 0) {
                rowNum+= 0;
            }

            // Agrega una fila para los encabezados
            Row headersRow = sheet.createRow(rowNum++);
        for (int i = 0; i < encabezados.length; i++) {
            Cell cell = headersRow.createCell(i);
            cell.setCellValue(encabezados[i]);
            cell.setCellStyle(estiloCelda); 
        }
            
            
            
            Row dataRow = sheet.createRow(rowNum++);
            dataRow.setHeightInPoints(85);
            for (int i = 0; i < encabezados.length; i++) {
                Cell cell = dataRow.createCell(i);
                String value = ""; // Inicializa el valor como cadena vacía
                switch (i) {
                    case 0:
                        value = String.valueOf(resultSet.getInt("id"));
                        break;
                    case 1:
                        value = resultSet.getString("articulo");
                        break;
                    case 2:
                        value = resultSet.getString("modelo");
                        break;
                    case 3:
                        value = resultSet.getString("marca");
                        break;
                    case 4:
                        value = resultSet.getString("umed");
                        break;
                    case 5:
                        value = String.valueOf(resultSet.getDouble("precio"));
                        break;
                    default:
                        break;
                }
                Cell newCell = dataRow.createCell(i);
                newCell.setCellValue(value);
                newCell.setCellStyle(estiloCeldaNoNegrita);
            }
            
            // Insertar imagen si está disponible
            byte[] imageData = resultSet.getBytes("foto");
            if (imageData != null) {
                int pictureIdx = workbook.addPicture(imageData, Workbook.PICTURE_TYPE_PNG);
                CreationHelper helper = workbook.getCreationHelper();
                Drawing drawing = sheet.createDrawingPatriarch();
                ClientAnchor anchor = helper.createClientAnchor();
                anchor.setCol1(6); // Coloca la imagen en la columna 8 (donde termina el último encabezado)
                anchor.setRow1(rowNum - 1); // Alinea la imagen con la fila actual de datos

                // Crear la imagen a partir del índice y el anclaje
                Picture pict = drawing.createPicture(anchor, pictureIdx);

                // Obtener dimensiones de la imagen original
                int imageWidth = pict.getImageDimension().width;
                int imageHeight = pict.getImageDimension().height;

                // Calcular el factor de escala proporcional
                double scaleFactorWidth = 1.0; // Factor de escala para el ancho
                double scaleFactorHeight = 1.0; // Factor de escala para el alto

                if (imageWidth > 0 && imageHeight > 0) {
                    double targetWidth = 160.0; // Ancho deseado en píxeles (ajústalo según tus necesidades)
                    double targetHeight = 100.0; // Alto deseado en píxeles (ajústalo según tus necesidades)

                    scaleFactorWidth = targetWidth / imageWidth;
                    scaleFactorHeight = targetHeight / imageHeight;
                }

                // Utiliza los factores de escala tanto para el ancho como para el alto
                pict.resize(scaleFactorWidth, scaleFactorHeight);
                 }
        }
        



        
        // Guardar el libro en un archivo temporal
        File tempFile = File.createTempFile("detalle", ".xlsx");
        try (FileOutputStream fileOut = new FileOutputStream(tempFile)) {
            workbook.write(fileOut);
            JOptionPane.showMessageDialog(null, "Datos exportados correctamente a Excel.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al exportar a Excel: " + e.toString());
        }

        // Abrir el archivo Excel recién creado
        Desktop.getDesktop().open(tempFile);

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error: " + e.toString());
    }
}












    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JToggleButton btnExplorar;
    private javax.swing.JButton btnExportar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblimagen;
    private javax.swing.JTable tbTotalProductos;
    private javax.swing.JTextField txtArticulo;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtUmed;
    private javax.swing.JTextField txtrutaimagen;
    // End of variables declaration//GEN-END:variables

    private void Limpiar() {
        txtId.setText("");
        txtArticulo.setText("");
        txtModelo.setText("");
        txtMarca.setText("");
        txtUmed.setText("");
        txtPrecio.setText("");
        txtrutaimagen.setText("");
    }
}
