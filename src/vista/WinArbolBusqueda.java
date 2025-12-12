
package vista;

import controlador.PrgArbolBusqueda;
import javax.swing.JOptionPane;

/**
 *
 * @author Franklin
 */
public class WinArbolBusqueda extends javax.swing.JInternalFrame {
    
    PrgArbolBusqueda refPrgArbolBinarioBusqueda;
    
    public WinArbolBusqueda() 
    {
        initComponents();
        refPrgArbolBinarioBusqueda = new PrgArbolBusqueda();
        refPrgArbolBinarioBusqueda.inicializarArbol();
        refPrgArbolBinarioBusqueda.inOrden(txaIngre);
        refPrgArbolBinarioBusqueda.inOrden(txaElim);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaIngre = new javax.swing.JTextArea();
        btnMostrarIngre = new javax.swing.JButton();
        txtSue = new javax.swing.JTextField();
        btnGuardarIngre = new javax.swing.JButton();
        txtNom = new javax.swing.JTextField();
        txtCod = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        btnInfoGuardar = new javax.swing.JButton();
        btnTeoriaArbolBinarioBusqueda = new javax.swing.JButton();
        btnInfoMostrar = new javax.swing.JButton();
        btnTeoriaOrganizacionArbolBinarioBusqueda1 = new javax.swing.JButton();
        btnDataActualizadaIngre = new javax.swing.JButton();
        btnDataOriginalIngre = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaElim = new javax.swing.JTextArea();
        btnMostrarElim = new javax.swing.JButton();
        txtSueElim = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        txtNomElim = new javax.swing.JTextField();
        txtCodElim = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        btnInfoEliminar = new javax.swing.JButton();
        btnInfoMostrar1 = new javax.swing.JButton();
        btnDataActualizadaIElim = new javax.swing.JButton();
        btnDataOriginalElim = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Listas Enlazadas Simples");

        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Codigo");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Sueldo");

        txaIngre.setColumns(20);
        txaIngre.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txaIngre.setForeground(new java.awt.Color(0, 0, 0));
        txaIngre.setRows(5);
        jScrollPane1.setViewportView(txaIngre);

        btnMostrarIngre.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnMostrarIngre.setText("Mostrar");
        btnMostrarIngre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarIngreActionPerformed(evt);
            }
        });

        txtSue.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtSue.setText("5000");

        btnGuardarIngre.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnGuardarIngre.setText("Guardar");
        btnGuardarIngre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarIngreActionPerformed(evt);
            }
        });

        txtNom.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtNom.setText("Esther");

        txtCod.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtCod.setText("500");

        jLabel26.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(153, 0, 0));
        jLabel26.setText("ARBOL BINARIO DE BUSQUEDA");

        btnInfoGuardar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnInfoGuardar.setText("¿Que hace el boton guardar?");
        btnInfoGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoGuardarActionPerformed(evt);
            }
        });

        btnTeoriaArbolBinarioBusqueda.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnTeoriaArbolBinarioBusqueda.setText("TEORIA ARBOL BINARIO DE BUSQUEDA");
        btnTeoriaArbolBinarioBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTeoriaArbolBinarioBusquedaActionPerformed(evt);
            }
        });

        btnInfoMostrar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnInfoMostrar.setText("¿Que hace el boton Mostrar?");
        btnInfoMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoMostrarActionPerformed(evt);
            }
        });

        btnTeoriaOrganizacionArbolBinarioBusqueda1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnTeoriaOrganizacionArbolBinarioBusqueda1.setText("¿CÓMO SE ORGANIZA EL ÁRBOL?");
        btnTeoriaOrganizacionArbolBinarioBusqueda1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTeoriaOrganizacionArbolBinarioBusqueda1ActionPerformed(evt);
            }
        });

        btnDataActualizadaIngre.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnDataActualizadaIngre.setText("DATA ACTUALIZADA");
        btnDataActualizadaIngre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDataActualizadaIngreActionPerformed(evt);
            }
        });

        btnDataOriginalIngre.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnDataOriginalIngre.setText("DATA ORIGINAL");
        btnDataOriginalIngre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDataOriginalIngreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtCod)
                            .addComponent(txtNom, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSue, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGuardarIngre)
                            .addComponent(btnMostrarIngre))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnInfoGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnInfoMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(180, 180, 180))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnTeoriaArbolBinarioBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(btnTeoriaOrganizacionArbolBinarioBusqueda1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(163, 163, 163))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(726, 726, 726)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(jLabel26))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnDataOriginalIngre, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnDataActualizadaIngre, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTeoriaArbolBinarioBusqueda)
                    .addComponent(btnTeoriaOrganizacionArbolBinarioBusqueda1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCod, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuardarIngre)
                            .addComponent(btnInfoGuardar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnMostrarIngre)
                            .addComponent(btnInfoMostrar))))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDataActualizadaIngre)
                    .addComponent(btnDataOriginalIngre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel6)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Ingresos", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 158, 158));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Codigo");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Nombre");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Sueldo");

        txaElim.setColumns(20);
        txaElim.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txaElim.setForeground(new java.awt.Color(0, 0, 0));
        txaElim.setRows(5);
        jScrollPane2.setViewportView(txaElim);

        btnMostrarElim.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnMostrarElim.setText("MOSTRAR");
        btnMostrarElim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarElimActionPerformed(evt);
            }
        });

        txtSueElim.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtSueElim.setText("1000");

        btnEliminar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        txtNomElim.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtNomElim.setText("Ana");

        txtCodElim.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtCodElim.setText("100");

        jLabel27.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(153, 0, 0));
        jLabel27.setText("ARBOL BINARIO DE BUSQUEDA");

        btnInfoEliminar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnInfoEliminar.setText("¿Que hace el boton ELIMINAR?");
        btnInfoEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoEliminarActionPerformed(evt);
            }
        });

        btnInfoMostrar1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnInfoMostrar1.setText("¿Que hace el boton MOSTRAR?");
        btnInfoMostrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoMostrar1ActionPerformed(evt);
            }
        });

        btnDataActualizadaIElim.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnDataActualizadaIElim.setText("DATA ACTUALIZADA");
        btnDataActualizadaIElim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDataActualizadaIElimActionPerformed(evt);
            }
        });

        btnDataOriginalElim.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnDataOriginalElim.setText("DATA ORIGINAL");
        btnDataOriginalElim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDataOriginalElimActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(726, 726, 726)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(jLabel27))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnDataOriginalElim, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnDataActualizadaIElim, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNomElim)
                                .addComponent(txtSueElim, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtCodElim, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEliminar)
                            .addComponent(btnMostrarElim))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnInfoMostrar1, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                            .addComponent(btnInfoEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodElim, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNomElim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSueElim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEliminar)
                            .addComponent(btnInfoEliminar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnMostrarElim)
                            .addComponent(btnInfoMostrar1))
                        .addGap(28, 28, 28)))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDataActualizadaIElim)
                    .addComponent(btnDataOriginalElim))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel7)
                .addContainerGap())
        );

        txtSueElim.setEnabled(false);
        txtNomElim.setEnabled(false);

        jTabbedPane1.addTab("Eliminación", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMostrarIngreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarIngreActionPerformed
        txaIngre.setText("");
        refPrgArbolBinarioBusqueda.inOrden(txaIngre);
    }//GEN-LAST:event_btnMostrarIngreActionPerformed

    private void btnGuardarIngreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarIngreActionPerformed
        int cod = Integer.parseInt(txtCod.getText());
        String nom = txtNom.getText();
        float sue = Float.parseFloat(txtSue.getText());
        refPrgArbolBinarioBusqueda.insertar(cod, nom, sue);
        txtCod.setText("");
        txtNom.setText("");
        txtSue.setText("");
        txtCod.requestFocus();
        txaElim.setText("");
        refPrgArbolBinarioBusqueda.inOrden(txaElim);
    }//GEN-LAST:event_btnGuardarIngreActionPerformed

    private void btnInfoGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoGuardarActionPerformed
        refPrgArbolBinarioBusqueda.mostrarInfo(
            this,
            "¿Qué hace el botón GUARDAR?",
            "\nEl botón GUARDAR inserta un nuevo nodo.\n" +
            "El nodo guarda código, nombre y sueldo.\n" +
            "Si el árbol está vacío, será la raíz.\n" +
            "Si no, se compara con códigos existentes.\n" +
            "Menor va a la izquierda, mayor a la derecha.\n" +
            "Mantiene estructura ordenada del árbol.\n",
            "imagenes/organizacion_arbol.png");
    }//GEN-LAST:event_btnInfoGuardarActionPerformed

    private void btnTeoriaArbolBinarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTeoriaArbolBinarioBusquedaActionPerformed
        refPrgArbolBinarioBusqueda.mostrarInfo(
            this,
            "¿Qué es un Árbol Binario de Búsqueda?",
            "Un árbol binario de búsqueda organiza datos.\n" +
            "Cada nodo contiene un empleado con su info.\n" +
            "El nodo guarda código, nombre y sueldo.\n" +
            "La raíz es el primer nodo insertado.\n" +
            "Si el código es menor, va a la izquierda.\n" +
            "Si el código es mayor, va a la derecha.\n" +
            "La regla se aplica recursivamente en ramas.\n" +
            "Así se mantiene el árbol siempre ordenado.\n" +
            "Permite búsquedas rápidas por el código.\n" +
            "También facilita recorridos ordenados.",
            "imagenes/guardar_arbol.png");
    }//GEN-LAST:event_btnTeoriaArbolBinarioBusquedaActionPerformed

    private void btnInfoMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoMostrarActionPerformed
        refPrgArbolBinarioBusqueda.mostrarInfo(
            this,
            "¿Qué hace el botón MOSTRAR?",
            "\nEl botón MOSTRAR usa el método inOrden.\n" +
            "Este método recorre el árbol en orden.\n" +
            "Primero visita hijo izquierdo del nodo.\n" +
            "Luego muestra el nodo actual en pantalla.\n" +
            "Después visita hijo derecho del nodo.\n" +
            "El recorrido se hace con inOrdenRec.\n" +
            "Los datos se muestran en el JTextArea.\n" +
            "Se listan código, nombre y sueldo ordenados.\n",
            "imagenes/guardar_arbol.png");
    }//GEN-LAST:event_btnInfoMostrarActionPerformed

    private void btnTeoriaOrganizacionArbolBinarioBusqueda1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTeoriaOrganizacionArbolBinarioBusqueda1ActionPerformed
        refPrgArbolBinarioBusqueda.mostrarInfo(
            this,
            "¿Cómo se organiza el Árbol?",
            "La organización depende del código insertado.\n" +
            "El primer nodo creado se convierte en la raíz.\n" +
            "Cada nuevo nodo se compara con la raíz.\n" +
            "Si el código es menor, baja por la izquierda.\n" +
            "Si el código es mayor, baja por la derecha.\n" +
            "El proceso continúa de forma recursiva.\n" +
            "Así cada nodo encuentra su posición exacta.\n" +
            "La estructura se adapta con cada inserción.\n" +
            "El árbol refleja jerarquía y orden natural.\n",
            "imagenes/organizacion_arbol.png");
        
    }//GEN-LAST:event_btnTeoriaOrganizacionArbolBinarioBusqueda1ActionPerformed

    private void btnDataActualizadaIngreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDataActualizadaIngreActionPerformed
        refPrgArbolBinarioBusqueda.mostrarInfo(
            this,
            "¿Qué es la Data Actualizada?",
            "\nLa Data Actualizada muestra árbol final.\n" +
            "Incluye nodos insertados o eliminados.\n" +
            "Refleja cambios tras operaciones recientes.\n" +
            "Permite validar que acción fue correcta.\n" +
            "Confirma estado actual del árbol binario.\n",
            "imagenes/mostrar_lista.png");
    }//GEN-LAST:event_btnDataActualizadaIngreActionPerformed

    private void btnDataOriginalIngreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDataOriginalIngreActionPerformed
        refPrgArbolBinarioBusqueda.mostrarInfo(
            this,
            "¿Qué es la Data Original?",
            "\nLa Data Original muestra el árbol inicial.\n" +
            "Son los nodos insertados antes de cambios.\n" +
            "Se listan en orden según sus códigos.\n" +
            "Permite comparar antes de nuevas acciones.\n" +
            "Sirve como referencia del estado previo.\n",
            "imagenes/data_original_lista.png");
    }//GEN-LAST:event_btnDataOriginalIngreActionPerformed

    private void btnMostrarElimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarElimActionPerformed
        txaElim.setText("");
        refPrgArbolBinarioBusqueda.inOrden(txaElim);
    }//GEN-LAST:event_btnMostrarElimActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try 
        {
            int cod = Integer.parseInt(txtCodElim.getText());
            refPrgArbolBinarioBusqueda.eliminar(cod);     
            JOptionPane.showMessageDialog(this,
                    "Nodo con código " + cod + " eliminado correctamente.");
        } 
        catch (NumberFormatException ex) 
        {
            JOptionPane.showMessageDialog(this,
                    "Ingrese un código válido.", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
        
        txtCodElim.setText("");
        txtNomElim.setText("");
        txtSueElim.setText("");
        txaIngre.setText("");
        refPrgArbolBinarioBusqueda.inOrden(txaIngre);
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnInfoEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoEliminarActionPerformed
        refPrgArbolBinarioBusqueda.mostrarInfo(
            this,
            "¿Qué hace el botón ELIMINAR?",
            "\nEl botón ELIMINAR quita un nodo del árbol.\n" +
            "Se busca el nodo por su código único.\n" +
            "Si no tiene hijos, se elimina directo.\n" +
            "Si tiene un hijo, se conecta ese hijo.\n" +
            "Si tiene dos hijos, se usa el sucesor.\n" +
            "El sucesor es el menor de la rama derecha.\n" +
            "Así se mantiene orden en el árbol.\n",
            "imagenes/mostrar_eliminacion_arbol.png");
    }//GEN-LAST:event_btnInfoEliminarActionPerformed

    private void btnInfoMostrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoMostrar1ActionPerformed
        refPrgArbolBinarioBusqueda.mostrarInfo(
            this,
            "¿Qué hace el botón MOSTRAR?",
            "\nEl botón MOSTRAR recorre el árbol en orden.\n" +
            "Visita izquierda, luego nodo actual.\n" +
            "Después recorre la rama derecha.\n" +
            "Muestra código, nombre y sueldo ordenados.\n" +
            "El área de texto refleja la secuencia.\n" +
            "Permite ver el árbol actualizado.\n",
            "imagenes/guardar_arbol.png");
    }//GEN-LAST:event_btnInfoMostrar1ActionPerformed

    private void btnDataActualizadaIElimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDataActualizadaIElimActionPerformed
        refPrgArbolBinarioBusqueda.mostrarInfo(
            this,
            "¿Qué es la DATA ACTUALIZADA?",
            "\nLa Data Actualizada muestra árbol final.\n" +
            "Refleja cambios tras eliminar un nodo.\n" +
            "Permite comparar con la Data Original.\n" +
            "Confirma estado actual del árbol binario.\n",
            "imagenes/mostrar_eliminacion_lista.png");
    }//GEN-LAST:event_btnDataActualizadaIElimActionPerformed

    private void btnDataOriginalElimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDataOriginalElimActionPerformed
        refPrgArbolBinarioBusqueda.mostrarInfo(
            this,
            "¿Qué es la DATA ORIGINAL?",
            "\nLa Data Original muestra el árbol inicial.\n" +
            "Son los nodos antes de eliminar nada.\n" +
            "Se listan en orden según sus códigos.\n" +
            "Sirve como referencia del estado previo.\n",
            "imagenes/data_original_eliminacion_lista.png");
    }//GEN-LAST:event_btnDataOriginalElimActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDataActualizadaIElim;
    private javax.swing.JButton btnDataActualizadaIngre;
    private javax.swing.JButton btnDataOriginalElim;
    private javax.swing.JButton btnDataOriginalIngre;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardarIngre;
    private javax.swing.JButton btnInfoEliminar;
    private javax.swing.JButton btnInfoGuardar;
    private javax.swing.JButton btnInfoMostrar;
    private javax.swing.JButton btnInfoMostrar1;
    private javax.swing.JButton btnMostrarElim;
    private javax.swing.JButton btnMostrarIngre;
    private javax.swing.JButton btnTeoriaArbolBinarioBusqueda;
    private javax.swing.JButton btnTeoriaOrganizacionArbolBinarioBusqueda1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea txaElim;
    private javax.swing.JTextArea txaIngre;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtCodElim;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtNomElim;
    private javax.swing.JTextField txtSue;
    private javax.swing.JTextField txtSueElim;
    // End of variables declaration//GEN-END:variables
}
