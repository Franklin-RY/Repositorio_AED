
package vista;

import controlador.PrgCola;
import javax.swing.JOptionPane;

/**
 *
 * @author Franklin
 */
public class WinCola extends javax.swing.JInternalFrame {
    
    PrgCola refPrgCola;
    
    public WinCola() {
        initComponents();
        refPrgCola = new PrgCola();
        
        refPrgCola.inicializarCola();
        refPrgCola.mostrarEmpleados(txaIngre);
        refPrgCola.mostrarEmpleados(txaElim);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCodIngre = new javax.swing.JTextField();
        txtSueIngre = new javax.swing.JTextField();
        btnGuardarIngre = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnMostrarIngre = new javax.swing.JButton();
        txtNomIngre = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        btnInfoCola = new javax.swing.JButton();
        btnInfoOrganizacionCola = new javax.swing.JButton();
        btnInfoUso = new javax.swing.JButton();
        btnInfoDataOriginalIngre = new javax.swing.JButton();
        btnDataActualizadaIngre = new javax.swing.JButton();
        btnInfoGuardar = new javax.swing.JButton();
        btnInfoMostrarIngre = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaIngre = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtNomElim = new javax.swing.JTextField();
        txtSueElim = new javax.swing.JTextField();
        btnAtenderCola = new javax.swing.JButton();
        btnMostrarElim = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        btnInfoDataOriginalElim = new javax.swing.JButton();
        btnDataActualizadaElim = new javax.swing.JButton();
        btnInfoEliminar = new javax.swing.JButton();
        btnInfoMostrarElim = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaElim = new javax.swing.JTextArea();
        txtCodElim = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setTitle("Listas Enlazadas Simples");

        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Codigo: ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Sueldo:");

        txtCodIngre.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtCodIngre.setText("500");

        txtSueIngre.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtSueIngre.setText("5000");

        btnGuardarIngre.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnGuardarIngre.setText("GUARDAR");
        btnGuardarIngre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarIngreActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));

        btnMostrarIngre.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnMostrarIngre.setText("MOSTRAR");
        btnMostrarIngre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarIngreActionPerformed(evt);
            }
        });

        txtNomIngre.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtNomIngre.setText("Esther");

        jLabel26.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(153, 0, 0));
        jLabel26.setText("COLA (FIFO)");

        btnInfoCola.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnInfoCola.setText("TEORIA SOBRE COLA");
        btnInfoCola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoColaActionPerformed(evt);
            }
        });

        btnInfoOrganizacionCola.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnInfoOrganizacionCola.setText("¿CÓMO SE ORGANIZA UNA COLA?");
        btnInfoOrganizacionCola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoOrganizacionColaActionPerformed(evt);
            }
        });

        btnInfoUso.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnInfoUso.setText("USO");
        btnInfoUso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoUsoActionPerformed(evt);
            }
        });

        btnInfoDataOriginalIngre.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnInfoDataOriginalIngre.setText("Data Original");
        btnInfoDataOriginalIngre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoDataOriginalIngreActionPerformed(evt);
            }
        });

        btnDataActualizadaIngre.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnDataActualizadaIngre.setText("Data actualizada");
        btnDataActualizadaIngre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDataActualizadaIngreActionPerformed(evt);
            }
        });

        btnInfoGuardar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnInfoGuardar.setText("¿Qué hace el botón GUARDAR?");
        btnInfoGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoGuardarActionPerformed(evt);
            }
        });

        btnInfoMostrarIngre.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnInfoMostrarIngre.setText("¿Qué hace el botón MOSTRAR?");
        btnInfoMostrarIngre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoMostrarIngreActionPerformed(evt);
            }
        });

        txaIngre.setColumns(20);
        txaIngre.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txaIngre.setRows(5);
        jScrollPane1.setViewportView(txaIngre);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(726, 726, 726)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtCodIngre, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSueIngre)
                                    .addComponent(txtNomIngre, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(13, 13, 13)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnGuardarIngre)
                                    .addComponent(btnMostrarIngre))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnInfoGuardar)
                                    .addComponent(btnInfoMostrarIngre)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnInfoCola, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(btnInfoOrganizacionCola, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnInfoUso, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(326, 326, 326)
                        .addComponent(jLabel26))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnInfoDataOriginalIngre, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDataActualizadaIngre, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInfoCola)
                    .addComponent(btnInfoOrganizacionCola)
                    .addComponent(btnInfoUso))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtCodIngre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNomIngre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtSueIngre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuardarIngre)
                            .addComponent(btnInfoGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnMostrarIngre)
                            .addComponent(btnInfoMostrarIngre, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDataActualizadaIngre)
                    .addComponent(btnInfoDataOriginalIngre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel6)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Ingresos", jPanel1);

        jPanel3.setBackground(new java.awt.Color(255, 158, 158));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Codigo: ");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Nombre:");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Sueldo:");

        txtNomElim.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtNomElim.setForeground(new java.awt.Color(204, 0, 51));

        txtSueElim.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtSueElim.setForeground(new java.awt.Color(204, 0, 51));

        btnAtenderCola.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnAtenderCola.setText("ATENDER LA COLA");
        btnAtenderCola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtenderColaActionPerformed(evt);
            }
        });

        btnMostrarElim.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnMostrarElim.setText("MOSTRAR");
        btnMostrarElim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarElimActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(153, 0, 0));
        jLabel27.setText("COLA (FIFO)");

        btnInfoDataOriginalElim.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnInfoDataOriginalElim.setText("Data Original");
        btnInfoDataOriginalElim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoDataOriginalElimActionPerformed(evt);
            }
        });

        btnDataActualizadaElim.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnDataActualizadaElim.setText("Data Actualizada ");
        btnDataActualizadaElim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDataActualizadaElimActionPerformed(evt);
            }
        });

        btnInfoEliminar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnInfoEliminar.setText("¿Qué hace el botón Atender la Cola?");
        btnInfoEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoEliminarActionPerformed(evt);
            }
        });

        btnInfoMostrarElim.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnInfoMostrarElim.setText("¿Qué hace el botón MOSTRAR?");
        btnInfoMostrarElim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoMostrarElimActionPerformed(evt);
            }
        });

        txaElim.setColumns(20);
        txaElim.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txaElim.setRows(5);
        jScrollPane2.setViewportView(txaElim);

        txtCodElim.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtCodElim.setForeground(new java.awt.Color(204, 0, 51));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtNomElim, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSueElim, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(txtCodElim))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnMostrarElim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAtenderCola, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnInfoEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnInfoMostrarElim, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(366, 366, 366)
                        .addComponent(jLabel27))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(307, 307, 307)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btnInfoDataOriginalElim, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDataActualizadaElim, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtCodElim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtNomElim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtSueElim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAtenderCola)
                            .addComponent(btnInfoEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnMostrarElim)
                            .addComponent(btnInfoMostrarElim, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(47, 47, 47)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInfoDataOriginalElim)
                    .addComponent(btnDataActualizadaElim))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        txtNomElim.setEnabled(false);
        txtSueElim.setEnabled(false);
        txtCodElim.setEnabled(false);

        jTabbedPane1.addTab("Eliminación", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 950, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInfoMostrarElimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoMostrarElimActionPerformed
        refPrgCola.mostrarInfo(
            this,
            " ¿Qué hace el botón MOSTRAR en Eliminación?",
            "\n El botón MOSTRAR recorre la lista enlazada desde el \n" +
            " inicio hasta el fin y actualiza el área de texto \n" +
            " con los datos actuales de cada nodo. \n\n" +
            " Después de eliminar un nodo, este botón permite \n" +
            " visualizar cómo quedó la lista reorganizada. \n",
            "imagenes/mostrar_eliminacion_lista.png");
    }//GEN-LAST:event_btnInfoMostrarElimActionPerformed

    private void btnInfoEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoEliminarActionPerformed
        refPrgCola.mostrarInfo(
            this,
            "¿Qué hace el botón Atender la Cola?",
            "\nEl botón Atender la cola atiende al primer nodo.\n" +
            "Primero muestra los datos del frente de la cola.\n" +
            "Luego pide confirmación al usuario.\n" +
            "Si acepta, elimina ese nodo de la cola.\n" +
            "El frente se mueve al siguiente nodo.\n" +
            "Si era único, frente y fin quedan null.\n",
            "imagenes/eliminar_cola.png");
    }//GEN-LAST:event_btnInfoEliminarActionPerformed

    private void btnDataActualizadaElimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDataActualizadaElimActionPerformed
        refPrgCola.mostrarInfo(
            this,
            "¿Qué es la Data Actualizada?",
            " \n La Data Actualizada muestra cómo queda \n" +
            " la lista enlazada después de eliminar \n" +
            " el nodo seleccionado. \n\n" +
            " Aquí se ve los nodos reorganizados, \n" +
            " sin el empleado eliminado. \n",
            "imagenes/mostrar_eliminacion_lista.png");
    }//GEN-LAST:event_btnDataActualizadaElimActionPerformed

    private void btnInfoDataOriginalElimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoDataOriginalElimActionPerformed
        refPrgCola.mostrarInfo(
            this,
            "¿Qué es la Data Original?",
            " \n La Data Original muestra todos los nodos que \n" +
            " están actualmente en la lista enlazada \n" +
            " antes de realizar la eliminación. \n\n" +
            " Es la base de comparación para ver los \n" +
            " cambios posteriores. \n",
            "imagenes/data_original_eliminacion_lista.png");
    }//GEN-LAST:event_btnInfoDataOriginalElimActionPerformed

    private void btnMostrarElimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarElimActionPerformed
        refPrgCola.mostrarEmpleados(txaElim);
    }//GEN-LAST:event_btnMostrarElimActionPerformed

    private void btnAtenderColaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtenderColaActionPerformed
        refPrgCola.atenderCola(txtCodElim, txtNomElim, txtSueElim);

        txtCodElim.setText("");
        txtCodElim.requestFocus();

        refPrgCola.mostrarEmpleados(txaIngre);
    }//GEN-LAST:event_btnAtenderColaActionPerformed

    private void btnInfoMostrarIngreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoMostrarIngreActionPerformed
        refPrgCola.mostrarInfo(
            this,
            "¿Qué hace el botón MOSTRAR?",
            "\nEl botón MOSTRAR recorre la cola completa.\n" +
            "Empieza desde el frente hasta llegar al fin.\n" +
            "Muestra código, nombre y sueldo de nodos.\n" +
            "Actualiza el área de texto con la secuencia.\n" +
            "Permite verificar el estado actual de la cola.\n",
            "imagenes/mostrar_lista.png");
    }//GEN-LAST:event_btnInfoMostrarIngreActionPerformed

    private void btnInfoGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoGuardarActionPerformed
        refPrgCola.mostrarInfo(
            this,
            "¿Qué hace el botón GUARDAR?",
            "El botón GUARDAR crea un nuevo nodo.\n" +
            "El nodo contiene código, nombre y sueldo.\n" +
            "Si la cola está vacía, los punteros anclas\n" +
            "frente y fin apuntan al nodo 'nuevo' \n" +
            "Si no, se enlaza al último y fin se actualiza.\n" +
            "El nuevo nodo queda al final de la cola.",
            "");
    }//GEN-LAST:event_btnInfoGuardarActionPerformed

    private void btnDataActualizadaIngreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDataActualizadaIngreActionPerformed
        refPrgCola.mostrarInfo(
            this,
            "¿Qué es la Data Actualizada?",
            " \n La Data Actualizada muestra cómo queda la cola \n" +
            " después de insertar un nuevo nodo. \n\n" +
            " Aquí se ve la secuencia de empleados incluyendo \n" +
            " al recién añadido al final. \n ",
            "imagenes/mostrar_lista.png");
    }//GEN-LAST:event_btnDataActualizadaIngreActionPerformed

    private void btnInfoDataOriginalIngreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoDataOriginalIngreActionPerformed
        refPrgCola.mostrarInfo(
            this,
            "¿Qué es la Data Original?",
            " La Data Original muestra los registros que ya están \n" +
            " guardados en la cola. \n\n" +
            " Cada nodo contiene un empleado con su código, \n" +
            " nombre y sueldo.\n\n " +
            " Esta información se carga al iniciar el programa. ",
            "imagenes/data_original_lista.png");
    }//GEN-LAST:event_btnInfoDataOriginalIngreActionPerformed

    private void btnInfoUsoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoUsoActionPerformed
        refPrgCola.mostrarInfo(
            this,
            "¿Por qué se usa una Cola?",
            "Se usa cuando el orden de llegada importa.\n" +
            "Atiende primero al que llega primero (FIFO).\n" +
            "Ejemplos: colas de impresión y atención.\n" +
            "Procesamiento por turnos y tareas en espera.\n" +
            "Evita saltos injustos y mantiene secuencia.",
            "");
    }//GEN-LAST:event_btnInfoUsoActionPerformed

    private void btnInfoOrganizacionColaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoOrganizacionColaActionPerformed
        refPrgCola.mostrarInfo(
            this,
            "¿Cómo se organiza una Cola?",
            "\nLa cola tiene dos punteros principales.\n" +
            "Frente apunta al primer nodo de la cola.\n" +
            "Fin apunta al último nodo insertado.\n" +
            "Cada nodo guarda datos y un puntero sgte.\n" +
            "El último nodo apunta a null.\n",
            "imagenes/cola_basica.png");
    }//GEN-LAST:event_btnInfoOrganizacionColaActionPerformed

    private void btnInfoColaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoColaActionPerformed
        refPrgCola.mostrarInfo(
            this,
            "¿Qué es una Cola?",
            "\nUna cola es una estructura de datos FIFO.\n" +
            "FIFO significa: primero en entrar, primero en salir.\n" +
            "Los elementos se insertan al final de la cola.\n" +
            "Se eliminan desde el frente de la cola.\n",
            "imagenes/cola_basica.png");
    }//GEN-LAST:event_btnInfoColaActionPerformed

    private void btnMostrarIngreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarIngreActionPerformed
        refPrgCola.mostrarEmpleados(txaIngre);
    }//GEN-LAST:event_btnMostrarIngreActionPerformed

    private void btnGuardarIngreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarIngreActionPerformed
        int cod = Integer.parseInt(txtCodIngre.getText());
        String nom = txtNomIngre.getText();
        float sue = Float.parseFloat(txtSueIngre.getText());
        refPrgCola.insertar(cod, nom, sue);
        JOptionPane.showMessageDialog(null, "Empleado insertado correctamente");

        txtCodIngre.setText("");
        txtNomIngre.setText("");
        txtSueIngre.setText("");
        txtCodIngre.requestFocus();

        refPrgCola.mostrarEmpleados(txaElim);
    }//GEN-LAST:event_btnGuardarIngreActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtenderCola;
    private javax.swing.JButton btnDataActualizadaElim;
    private javax.swing.JButton btnDataActualizadaIngre;
    private javax.swing.JButton btnGuardarIngre;
    private javax.swing.JButton btnInfoCola;
    private javax.swing.JButton btnInfoDataOriginalElim;
    private javax.swing.JButton btnInfoDataOriginalIngre;
    private javax.swing.JButton btnInfoEliminar;
    private javax.swing.JButton btnInfoGuardar;
    private javax.swing.JButton btnInfoMostrarElim;
    private javax.swing.JButton btnInfoMostrarIngre;
    private javax.swing.JButton btnInfoOrganizacionCola;
    private javax.swing.JButton btnInfoUso;
    private javax.swing.JButton btnMostrarElim;
    private javax.swing.JButton btnMostrarIngre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea txaElim;
    private javax.swing.JTextArea txaIngre;
    private javax.swing.JTextField txtCodElim;
    private javax.swing.JTextField txtCodIngre;
    private javax.swing.JTextField txtNomElim;
    private javax.swing.JTextField txtNomIngre;
    private javax.swing.JTextField txtSueElim;
    private javax.swing.JTextField txtSueIngre;
    // End of variables declaration//GEN-END:variables
}
