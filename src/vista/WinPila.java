
package vista;

import controlador.PrgPila;
import javax.swing.JOptionPane;

/**
 *
 * @author Franklin
 */
public class WinPila extends javax.swing.JInternalFrame {
    
    PrgPila refPrgPila;
    
    public WinPila() {
        initComponents();
        refPrgPila = new PrgPila();
        
        refPrgPila.inicializarPila();
        refPrgPila.mostrar(txaIngre);
        refPrgPila.mostrar(txaElim);
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
        btnPushIngre = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnMostrarIngre = new javax.swing.JButton();
        txtNomIngre = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        btnInfoPila = new javax.swing.JButton();
        btnInfoOrganizacionPila = new javax.swing.JButton();
        btnInfoDataOriginalIngre = new javax.swing.JButton();
        btnDataAGuardarIngre = new javax.swing.JButton();
        btnDataActualizadaIngre = new javax.swing.JButton();
        btnInfoGuardar = new javax.swing.JButton();
        btnInfoMostrarIngre = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaIngre = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        btnPop = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        btnMostrarElim = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        btnInfoDataOriginalElim = new javax.swing.JButton();
        btnDataAEliminar = new javax.swing.JButton();
        btnDataActualizadaElim = new javax.swing.JButton();
        btnInfoPop = new javax.swing.JButton();
        btnInfoMostrarElim = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaElim = new javax.swing.JTextArea();

        setClosable(true);
        setIconifiable(true);
        setTitle("Pilas");

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

        btnPushIngre.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnPushIngre.setText("PUSH");
        btnPushIngre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPushIngreActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setText("Código:       500");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel8.setText("Nombre:     Esther");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel9.setText("Sueldo:        5000.00");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addContainerGap(36, Short.MAX_VALUE))
        );

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
        jLabel26.setText("Pila (lifo)");

        btnInfoPila.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnInfoPila.setText("TEORIA SOBRE PILA");
        btnInfoPila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoPilaActionPerformed(evt);
            }
        });

        btnInfoOrganizacionPila.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnInfoOrganizacionPila.setText("¿CÓMO SE ORGANIZA UNA PILA?");
        btnInfoOrganizacionPila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoOrganizacionPilaActionPerformed(evt);
            }
        });

        btnInfoDataOriginalIngre.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnInfoDataOriginalIngre.setText("Data Original");
        btnInfoDataOriginalIngre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoDataOriginalIngreActionPerformed(evt);
            }
        });

        btnDataAGuardarIngre.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnDataAGuardarIngre.setText("Data a guardar");
        btnDataAGuardarIngre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDataAGuardarIngreActionPerformed(evt);
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
        btnInfoGuardar.setText("¿Qué hace el botón PUSH?");
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
                        .addGap(372, 372, 372)
                        .addComponent(jLabel26))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnInfoPila, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btnDataAGuardarIngre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(btnInfoDataOriginalIngre, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnDataActualizadaIngre, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jScrollPane1)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtCodIngre, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtSueIngre)
                                            .addComponent(txtNomIngre, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(13, 13, 13)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnInfoOrganizacionPila, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(btnMostrarIngre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(btnPushIngre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(btnInfoMostrarIngre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(btnInfoGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInfoPila)
                    .addComponent(btnInfoOrganizacionPila))
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
                            .addComponent(btnPushIngre)
                            .addComponent(btnInfoGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnMostrarIngre)
                            .addComponent(btnInfoMostrarIngre, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnInfoDataOriginalIngre)
                            .addComponent(btnDataAGuardarIngre))
                        .addGap(6, 6, 6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnDataActualizadaIngre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(31, 31, 31)
                .addComponent(jLabel6)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Ingresos", jPanel1);

        jPanel3.setBackground(new java.awt.Color(255, 158, 158));

        btnPop.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnPop.setText("POP");
        btnPop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPopActionPerformed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel16.setText("Código:       400");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel17.setText("Nombre:     Daniel");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel18.setText("Sueldo:       4000.0");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE))
                    .addComponent(jLabel18))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addComponent(jLabel18)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        btnMostrarElim.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnMostrarElim.setText("MOSTRAR");
        btnMostrarElim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarElimActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(153, 0, 0));
        jLabel27.setText("Pila (lifo)");

        btnInfoDataOriginalElim.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnInfoDataOriginalElim.setText("Data Original");
        btnInfoDataOriginalElim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoDataOriginalElimActionPerformed(evt);
            }
        });

        btnDataAEliminar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnDataAEliminar.setText("Data a Eliminar ");
        btnDataAEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDataAEliminarActionPerformed(evt);
            }
        });

        btnDataActualizadaElim.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnDataActualizadaElim.setText("Data Actualizada ");
        btnDataActualizadaElim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDataActualizadaElimActionPerformed(evt);
            }
        });

        btnInfoPop.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnInfoPop.setText("¿Qué hace el botón POP?");
        btnInfoPop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoPopActionPerformed(evt);
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
                        .addGap(145, 145, 145)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnDataAEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(btnInfoDataOriginalElim, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnDataActualizadaElim, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane2)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(243, 243, 243)
                                .addComponent(jLabel27))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnPop, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMostrarElim, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnInfoMostrarElim, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                            .addComponent(btnInfoPop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(156, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPop)
                    .addComponent(btnInfoPop, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMostrarElim)
                    .addComponent(btnInfoMostrarElim, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInfoDataOriginalElim)
                    .addComponent(btnDataAEliminar)
                    .addComponent(btnDataActualizadaElim))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addGap(36, 36, 36))
        );

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
        refPrgPila.mostrarInfo(
            this,
            "¿Qué hace el botón MOSTRAR?",
            "El botón MOSTRAR recorre la pila completa.\n" +
            "Empieza desde el tope y baja nodo a nodo.\n" +
            "Muestra código, nombre y sueldo en el txa.\n" +
            "Permite ver el estado actual tras POP.\n",
            "imagenes/mostrar_pila.png");
    }//GEN-LAST:event_btnInfoMostrarElimActionPerformed

    private void btnInfoPopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoPopActionPerformed
        refPrgPila.mostrarInfo(
            this,
            "¿Qué hace el botón POP?",
            "\n El botón POP elimina el nodo en el tope. \n" +
            " Si la pila está vacía, muestra mensaje. \n" +
            " Si hay nodos, quita el último ingresado. \n" +
            " El puntero tope se mueve al nodo inferior. \n" +
            " El empleado eliminado se muestra al usuario. \n",
            "imagenes/pop_pila.png");
    }//GEN-LAST:event_btnInfoPopActionPerformed

    private void btnDataActualizadaElimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDataActualizadaElimActionPerformed
        refPrgPila.mostrarInfo(
            this,
            "¿Qué es la Data Actualizada?",
            " \n La Data Actualizada muestra pila tras POP. \n" +
            " El nodo eliminado ya no aparece listado. \n" + 
            " Confirma que el tope fue actualizado. \n",
            "imagenes/data_actualizada_pila.png");
    }//GEN-LAST:event_btnDataActualizadaElimActionPerformed

    private void btnDataAEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDataAEliminarActionPerformed
        refPrgPila.mostrarInfo(
            this,
            "¿Qué es la Data a Eliminar?",
            " \n La Data a Eliminar muestra los datos del \n" +
            " nodo que será eliminado. \n\n" +
            " Este empleado se identifica por su código. \n",
            "imagenes/data_a_eliminar_Pila.png");
    }//GEN-LAST:event_btnDataAEliminarActionPerformed

    private void btnInfoDataOriginalElimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoDataOriginalElimActionPerformed
        refPrgPila.mostrarInfo(
            this,
            "¿Qué es la Data Original?",
            " \n La Data Original muestra la pila antes POP. \n" +
            " Son los nodos tal como estaban apilados. \n" +
            " Sirve para comparar cambios posteriores. \n",
            "imagenes/data_original_pila.png");
    }//GEN-LAST:event_btnInfoDataOriginalElimActionPerformed

    private void btnMostrarElimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarElimActionPerformed
        refPrgPila.mostrar(txaElim);
    }//GEN-LAST:event_btnMostrarElimActionPerformed

    private void btnPopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPopActionPerformed
        refPrgPila.pop();
        
        refPrgPila.mostrar(txaIngre);
    }//GEN-LAST:event_btnPopActionPerformed

    private void btnInfoMostrarIngreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoMostrarIngreActionPerformed
        refPrgPila.mostrarInfo(
            this,
            "¿Qué hace el botón MOSTRAR?",
            " \n Recorre la pila desde el tope hasta el final. \n" +
            " Muestra código, nombre y sueldo de cada nodo. \n" +
            " Limpia el área de texto para evitar duplicados. \n" +
            " Actualiza la vista tras cada inserción o eliminación. \n" +
            " Permite verificar el estado real de la pila. \n",
            "imagenes/mostrar_pila.png");
    }//GEN-LAST:event_btnInfoMostrarIngreActionPerformed

    private void btnInfoGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoGuardarActionPerformed
        refPrgPila.mostrarInfo(
            this,
            "¿Qué hace el botón PUSH?",
            "\n Crea un nodo con código, nombre y sueldo. \n" +
            " Si la pila está vacía, ese nodo será tope. \n" +
            " Si no, enlaza sobre él, el puntero tope. \n" +
            " Actualiza el puntero tope al nuevo nodo. \n",
            "imagenes/push_pila.png");
    }//GEN-LAST:event_btnInfoGuardarActionPerformed

    private void btnDataActualizadaIngreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDataActualizadaIngreActionPerformed
        refPrgPila.mostrarInfo(
            this,
            "¿Qué es la Data Actualizada?",
            " \n La Data Actualizada muestra cómo queda la pila \n" +
            " después de insertar un nuevo nodo. \n\n" +
            " Aquí se ve la secuencia de empleados incluyendo \n" +
            " al recién añadido al final. \n ",
            "imagenes/data_actualizada_pilaIngre.png");
    }//GEN-LAST:event_btnDataActualizadaIngreActionPerformed

    private void btnDataAGuardarIngreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDataAGuardarIngreActionPerformed
        refPrgPila.mostrarInfo(
            this,
            "¿Qué es la Data a Guardar?",
            " \n La Data a Guardar muestra los datos que el usuario \n" +
            " ha ingresado en los campos de texto. \n\n" +
            " Estos datos aún no están guardados en la pila \n" +
            " pero están listos para ser insertados. \n",
            "imagenes/data_a_guardar_lista.png");
    }//GEN-LAST:event_btnDataAGuardarIngreActionPerformed

    private void btnInfoDataOriginalIngreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoDataOriginalIngreActionPerformed
        refPrgPila.mostrarInfo(
            this,
            "¿Qué es la Data Original?",
            " \n La Data Original muestra los registros que ya están \n" +
            " guardados en la pila. \n\n" +
            " Cada nodo contiene un empleado con su código, \n" +
            " nombre y sueldo.\n\n " +
            " Esta información se carga al iniciar el programa.\n ",
            "imagenes/data_original_pila.png");
    }//GEN-LAST:event_btnInfoDataOriginalIngreActionPerformed

    private void btnInfoOrganizacionPilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoOrganizacionPilaActionPerformed
        refPrgPila.mostrarInfo(
            this,
            "¿Cómo se organiza una pila?",
            " \n La pila mantiene un puntero llamado tope. \n" +
            " El tope referencia al último nodo insertado. \n" +
            " Cada nodo guarda datos y un puntero (sgte) \n" +
            " que apunta al nodo inferior. \n" +
            " El fondo no enlaza a ningún nodo adicional. \n" +
            " Al insertar, el nuevo nodo pasa a ser tope. \n" +
            " Al extraer, el tope se mueve al nodo anterior. \n",
            "imagenes/pila_basica.png");
    }//GEN-LAST:event_btnInfoOrganizacionPilaActionPerformed

    private void btnInfoPilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoPilaActionPerformed
        refPrgPila.mostrarInfo(
            this,
            "¿Qué es una pila?",
            " \n Una pila es una estructura de datos LIFO. \n" +
            " LIFO significa: último en entrar, primero en salir. \n" +
            " Modela un conjunto ordenado como una torre. \n" +
            " Cada inserción ocurre en el tope de la pila. \n" +
            " Cada extracción ocurre desde ese mismo tope. \n",
            "imagenes/pila_basica.png");
    }//GEN-LAST:event_btnInfoPilaActionPerformed

    private void btnMostrarIngreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarIngreActionPerformed
        refPrgPila.mostrar(txaIngre);
    }//GEN-LAST:event_btnMostrarIngreActionPerformed

    private void btnPushIngreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPushIngreActionPerformed
        int cod = Integer.parseInt(txtCodIngre.getText());
        String nom = txtNomIngre.getText();
        float sue = Float.parseFloat(txtSueIngre.getText());
        refPrgPila.push(cod, nom, sue);
        JOptionPane.showMessageDialog(null, "Empleado insertado correctamente");

        txtCodIngre.setText("");
        txtNomIngre.setText("");
        txtSueIngre.setText("");
        txtCodIngre.requestFocus();

        refPrgPila.mostrar(txaElim);
    }//GEN-LAST:event_btnPushIngreActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDataAEliminar;
    private javax.swing.JButton btnDataAGuardarIngre;
    private javax.swing.JButton btnDataActualizadaElim;
    private javax.swing.JButton btnDataActualizadaIngre;
    private javax.swing.JButton btnInfoDataOriginalElim;
    private javax.swing.JButton btnInfoDataOriginalIngre;
    private javax.swing.JButton btnInfoGuardar;
    private javax.swing.JButton btnInfoMostrarElim;
    private javax.swing.JButton btnInfoMostrarIngre;
    private javax.swing.JButton btnInfoOrganizacionPila;
    private javax.swing.JButton btnInfoPila;
    private javax.swing.JButton btnInfoPop;
    private javax.swing.JButton btnMostrarElim;
    private javax.swing.JButton btnMostrarIngre;
    private javax.swing.JButton btnPop;
    private javax.swing.JButton btnPushIngre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea txaElim;
    private javax.swing.JTextArea txaIngre;
    private javax.swing.JTextField txtCodIngre;
    private javax.swing.JTextField txtNomIngre;
    private javax.swing.JTextField txtSueIngre;
    // End of variables declaration//GEN-END:variables
}
