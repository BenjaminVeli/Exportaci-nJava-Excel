package com.mycompany.sistema;


public class inicio {

    public static void main(String[] args) {
        ProductosDAO objetoFormulario = new ProductosDAO();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CrearProductos formularioAlumno = new CrearProductos();
                formularioAlumno.setVisible(true);
            }
        });
    }
}
