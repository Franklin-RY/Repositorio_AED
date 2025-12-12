
package vista;

import controlador.PrgListaCircular;
import javax.swing.JOptionPane;

/**
 *
 * @author Franklin
 */
public class WinListaCircular extends javax.swing.JInternalFrame {
    
    PrgListaCircular refPrgListaCircular;
    
    public WinListaCircular() {
        initComponents();
        refPrgListaCircular = new PrgListaCircular();
        
        refPrgListaCircular.inicializarListaCircular();
        refPrgListaCircular.mostrar(txaIngre);
        refPrgListaCircular.mostrar(txaElim);
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
        btnInfoListaCircular = new javax.swing.JButton();
        btnInfoOrganizacionListaCircular = new javax.swing.JButton();
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
        txtCodElim = new javax.swing.JTextField();
        txtNomElim = new javax.swing.JTextField();
        txtSueElim = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        btnMostrarElim = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        btnInfoDataOriginalElim = new javax.swing.JButton();
        btnDataActualizadaElim = new javax.swing.JButton();
        btnInfoEliminar = new javax.swing.JButton();
        btnInfoMostrarElim = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaElim = new javax.swing.JTextArea();

        setClosable(true);
        setIconifiable(true);
        setTitle("Lista Enlazada Circular");

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
        jLabel26.setText("LISTA ENLAZADA CIRCULAR");

        btnInfoListaCircular.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnInfoListaCircular.setText("TEORIA SOBRE LISTA CIRCULAR");
        btnInfoListaCircular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoListaCircularActionPerformed(evt);
            }
        });

        btnInfoOrganizacionListaCircular.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnInfoOrganizacionListaCircular.setText("¿CÓMO SE ORGANIZA UNA LISTA CIRCULAR?");
        btnInfoOrganizacionListaCircular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoOrganizacionListaCircularActionPerformed(evt);
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
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnInfoListaCircular)
                                .addGap(18, 18, 18)
                                .addComponent(btnInfoOrganizacionListaCircular, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnInfoUso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(135, 135, 135)
                                .addComponent(jLabel26))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(303, 303, 303)
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
                    .addComponent(btnInfoListaCircular)
                    .addComponent(btnInfoOrganizacionListaCircular)
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
                    .addComponent(btnInfoDataOriginalIngre)
                    .addComponent(btnDataActualizadaIngre))
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

        txtCodElim.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtCodElim.setText("100");

        txtNomElim.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        txtSueElim.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        btnEliminar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
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
        jLabel27.setText("LISTA ENLAZADA CIRCULAR");

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
        btnInfoEliminar.setText("¿Qué hace el botón ELIMINAR?");
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
                            .addComponent(txtCodElim, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSueElim, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnMostrarElim)
                            .addComponent(btnEliminar))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnInfoEliminar)
                            .addComponent(btnInfoMostrarElim)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(jLabel27))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(305, 305, 305)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btnInfoDataOriginalElim, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDataActualizadaElim, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
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
                            .addComponent(btnEliminar)
                            .addComponent(btnInfoEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnMostrarElim)
                            .addComponent(btnInfoMostrarElim, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(42, 42, 42)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInfoDataOriginalElim)
                    .addComponent(btnDataActualizadaElim))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        txtNomElim.setEnabled(false);
        txtSueElim.setEnabled(false);

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
        refPrgListaCircular.mostrarInfo(
            this,
            "¿Qué hace el botón MOSTRAR?",
            " \n El botón MOSTRAR recorre la lista circular.\n" +
            " Usa un bucle do-while para visitar nodos.\n" +
            " Se muestran los datos en el área de texto.\n\n" +
            " Después de eliminar, refleja la lista actual.\n",
            "imagenes/mostrar_eliminacion_lista.png");
    }//GEN-LAST:event_btnInfoMostrarElimActionPerformed

    private void btnInfoEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoEliminarActionPerformed
        refPrgListaCircular.mostrarInfo(
            this,
             "¿Qué hace el botón ELIMINAR?",
            " \n El botón ELIMINAR busca el nodo con el código.\n" +
            " Si lo encuentra, elimina ese nodo de la lista.\n" +
            " Si es el único nodo, la lista queda vacía.\n" +
            " Si es el primero, inicio apunta al siguiente.\n" +
            " Si es el último, fin apunta al anterior.\n" +
            " Si está en medio, se reconectan los punteros.\n",
            "");
    }//GEN-LAST:event_btnInfoEliminarActionPerformed

    private void btnDataActualizadaElimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDataActualizadaElimActionPerformed
        refPrgListaCircular.mostrarInfo(
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
        refPrgListaCircular.mostrarInfo(
            this,
            "¿Qué es la Data Original?",
            "\nLa Data Original muestra la lista completa.\n" +
            "Son los nodos antes de realizar eliminación.\n" +
            "Es la base para comparar cambios posteriores.\n",
            "imagenes/data_original_eliminacion_lista.png");
    }//GEN-LAST:event_btnInfoDataOriginalElimActionPerformed

    private void btnMostrarElimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarElimActionPerformed
        refPrgListaCircular.mostrar(txaElim);
    }//GEN-LAST:event_btnMostrarElimActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int cod = Integer.parseInt(txtCodElim.getText());
        refPrgListaCircular.eliminarXcodigo(cod);

        txtCodElim.setText("");
        txtCodElim.requestFocus();

        refPrgListaCircular.mostrar(txaIngre);
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnInfoMostrarIngreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoMostrarIngreActionPerformed
        refPrgListaCircular.mostrarInfo(
            this,
            "¿Qué hace el botón MOSTRAR?",
            "El botón MOSTRAR recorre la lista circular desde el nodo\n" +
            "'inicio' hasta volver a él.\n" +
            "Gracias al enlace circular, se usa un bucle especial\n" +
            "(do-while) que garantiza\n" +
            "que todos los nodos se visiten al menos una vez.\n\n" +
            "El resultado se muestra en el área de texto, con los\n" +
            "datos de cada empleado.",
            "imagenes/mostrar_lista_circular.png");
    }//GEN-LAST:event_btnInfoMostrarIngreActionPerformed

    private void btnInfoGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoGuardarActionPerformed
        refPrgListaCircular.mostrarInfo(
            this,
            "¿Qué hace el botón GUARDAR?",
            " El botón GUARDAR crea un nuevo nodo con los datos ingresados \n" +
            " en los campos de texto (Código, Nombre y Sueldo) y lo añade al \n" +
            " final de la lista circular. \n\n" +
            " Si la lista está vacía, el nuevo nodo se convierte en inicio y fin, \n" +
            " y se enlaza consigo mismo. \n\n " +
            " Si ya hay nodos, se enlaza al último y se actualiza el puntero fin, \n" +
            " manteniendo el enlace circular (fin.sgte = inicio).",
            "imagenes/guardar_lista_circular.png");
    }//GEN-LAST:event_btnInfoGuardarActionPerformed

    private void btnDataActualizadaIngreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDataActualizadaIngreActionPerformed
        refPrgListaCircular.mostrarInfo(
            this,
            "¿Qué es la Data Actualizada?",
            " \n La Data Actualizada muestra cómo queda la lista \n" +
            " circular después de insertar un nuevo nodo. \n\n" +
            " Aquí se ve la secuencia de empleados incluyendo \n" +
            " al recién añadido al final. \n ",
            "imagenes/mostrar_lista.png");
    }//GEN-LAST:event_btnDataActualizadaIngreActionPerformed

    private void btnInfoDataOriginalIngreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoDataOriginalIngreActionPerformed
        refPrgListaCircular.mostrarInfo(
            this,
            "¿Qué es la Data Original?",
            " La Data Original muestra los registros que ya están \n" +
            " guardados en la lista enlazada circular. \n\n" +
            " Cada nodo contiene un empleado con su código, \n" +
            " nombre y sueldo.\n\n " +
            " Esta información se carga al iniciar el programa. ",
            "imagenes/data_original_lista.png");
    }//GEN-LAST:event_btnInfoDataOriginalIngreActionPerformed

    private void btnInfoUsoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoUsoActionPerformed
        refPrgListaCircular.mostrarInfo(
            this,
            "¿Por qué se usan las listas circulares?",
            "Se usan porque permiten recorrer los datos de manera continua.\n" +
            "Son útiles en aplicaciones donde se necesita un ciclo repetitivo,\n" +
            "como sistemas de turnos, juegos.\n\n" +
            "Además, facilitan operaciones que requieren volver al inicio sin \n" +
            "reiniciar el recorrido.",
            "");
    }//GEN-LAST:event_btnInfoUsoActionPerformed

    private void btnInfoOrganizacionListaCircularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoOrganizacionListaCircularActionPerformed
        refPrgListaCircular.mostrarInfo(
            this,
            "¿Cómo se organiza una lista circular?",
            "La lista circular tiene dos punteros anclas:\n" +
            "- 'inicio': apunta al primer nodo.\n" +
            "- 'fin': apunta al último nodo.\n\n" +
            "La clave es que 'fin.sgte' apunta nuevamente a 'inicio'.\n" +
            "Así, al recorrer la lista, después del último nodo se \n" +
            "vuelve al primero. ",
            "imagenes/lista_circular.png");
    }//GEN-LAST:event_btnInfoOrganizacionListaCircularActionPerformed

    private void btnInfoListaCircularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoListaCircularActionPerformed
        refPrgListaCircular.mostrarInfo(
            this,
            "¿Qué es una lista circular?",
            "Una lista circular es una variante de la lista enlazada.\n" +
            "En ella, el último nodo no apunta a null, sino que se enlaza nuevamente\n" +
            "con el primer nodo, formando un círculo.\n\n" +
            "Esto permite recorrer la lista de manera continua, sin un final definido.\n" +
            "Cada nodo contiene los datos (ej. código, nombre, sueldo) y una \n" +
            "referencia al siguiente.",
            "imagenes/lista_circular.png");
    }//GEN-LAST:event_btnInfoListaCircularActionPerformed

    private void btnMostrarIngreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarIngreActionPerformed
        refPrgListaCircular.mostrar(txaIngre);
    }//GEN-LAST:event_btnMostrarIngreActionPerformed

    private void btnGuardarIngreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarIngreActionPerformed
        int cod = Integer.parseInt(txtCodIngre.getText());
        String nom = txtNomIngre.getText();
        float sue = Float.parseFloat(txtSueIngre.getText());
        refPrgListaCircular.insertar(cod, nom, sue);
        JOptionPane.showMessageDialog(null, "Empleado insertado correctamente");

        txtCodIngre.setText("");
        txtNomIngre.setText("");
        txtSueIngre.setText("");
        txtCodIngre.requestFocus();

        refPrgListaCircular.mostrar(txaElim);
    }//GEN-LAST:event_btnGuardarIngreActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDataActualizadaElim;
    private javax.swing.JButton btnDataActualizadaIngre;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardarIngre;
    private javax.swing.JButton btnInfoDataOriginalElim;
    private javax.swing.JButton btnInfoDataOriginalIngre;
    private javax.swing.JButton btnInfoEliminar;
    private javax.swing.JButton btnInfoGuardar;
    private javax.swing.JButton btnInfoListaCircular;
    private javax.swing.JButton btnInfoMostrarElim;
    private javax.swing.JButton btnInfoMostrarIngre;
    private javax.swing.JButton btnInfoOrganizacionListaCircular;
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
