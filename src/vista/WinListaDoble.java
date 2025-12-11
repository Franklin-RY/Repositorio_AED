
package vista;

import controlador.PrgListaDoble;
import javax.swing.JOptionPane;

/**
 *
 * @author Franklin
 */
public class WinListaDoble extends javax.swing.JInternalFrame {
    
    PrgListaDoble refPrgListaDoble;
    
    public WinListaDoble() {
        initComponents();
        refPrgListaDoble = new PrgListaDoble();
        
        refPrgListaDoble.inicializarListaDoble();
        refPrgListaDoble.mostrar(txaIngre);
        refPrgListaDoble.mostrar(txaElim);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnMostrarIngre = new javax.swing.JButton();
        txtNomIngre = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        btnInfoListaSimple = new javax.swing.JButton();
        btnInfoOrganizacionListaSimple = new javax.swing.JButton();
        btnInfoUso = new javax.swing.JButton();
        btnInfoDataOriginalIngre = new javax.swing.JButton();
        btnDataAGuardarIngre = new javax.swing.JButton();
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
        jPanel4 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        btnMostrarElim = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        btnInfoDataOriginalElim = new javax.swing.JButton();
        btnDataAEliminar = new javax.swing.JButton();
        btnDataActualizadaElim = new javax.swing.JButton();
        btnInfoEliminar = new javax.swing.JButton();
        btnInfoMostrarElim = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaElim = new javax.swing.JTextArea();
        btnEliminarNodo1 = new javax.swing.JButton();
        btnInfoEliminarNodo1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Listas Enlazadas Simples");

        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setText("Codigo: ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
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
        jLabel26.setText("LISTAS Doblemente enlazadas");

        btnInfoListaSimple.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnInfoListaSimple.setText("TEORIA SOBRE LISTA DOBLE");
        btnInfoListaSimple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoListaSimpleActionPerformed(evt);
            }
        });

        btnInfoOrganizacionListaSimple.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnInfoOrganizacionListaSimple.setText("¿CÓMO SE ORGANIZA UNA LISTA ENLAZADA DOBLE?");
        btnInfoOrganizacionListaSimple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoOrganizacionListaSimpleActionPerformed(evt);
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnInfoListaSimple)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnInfoOrganizacionListaSimple)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnInfoUso, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btnGuardarIngre)
                                            .addComponent(btnMostrarIngre))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnInfoGuardar)
                                            .addComponent(btnInfoMostrarIngre)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(135, 135, 135)
                                .addComponent(jLabel26)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInfoListaSimple)
                    .addComponent(btnInfoOrganizacionListaSimple)
                    .addComponent(btnInfoUso))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
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

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel10.setText("Codigo: ");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel11.setText("Nombre:");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
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

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel16.setText("Código:       100");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel17.setText("Nombre:     Ana");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel18.setText("Sueldo:       1000.0");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE))
                    .addComponent(jLabel18))
                .addContainerGap(45, Short.MAX_VALUE))
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
        jLabel27.setText("LISTAS Doblemente Enlazadas");

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

        btnEliminarNodo1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnEliminarNodo1.setText("ELIMINA NODO 1");
        btnEliminarNodo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarNodo1ActionPerformed(evt);
            }
        });

        btnInfoEliminarNodo1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnInfoEliminarNodo1.setText("¿Qué hace el boton ELIM.NODO 1?");
        btnInfoEliminarNodo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoEliminarNodo1ActionPerformed(evt);
            }
        });

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
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnDataAEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNomElim)
                            .addComponent(txtCodElim)
                            .addComponent(txtSueElim)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(btnInfoDataOriginalElim, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(btnDataActualizadaElim, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnEliminarNodo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnMostrarElim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnInfoEliminarNodo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(161, 161, 161)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnInfoEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnInfoMostrarElim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jScrollPane2))
                        .addGap(119, 119, 119))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(jLabel27)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtCodElim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar)
                    .addComponent(btnInfoEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtNomElim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMostrarElim)
                    .addComponent(btnInfoMostrarElim, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtSueElim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarNodo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnInfoEliminarNodo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(42, 42, 42)
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
        refPrgListaDoble.mostrarInfo(
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
        refPrgListaDoble.mostrarInfo(
            this,
            "¿Qué hace el botón ELIMINAR?",
            " El botón ELIMINAR busca el nodo que contiene el código \n" +
            " ingresado por el usuario. \n" +
            " Si lo encuentra, elimina ese nodo de la lista enlazada simple. \n\n" +
            " La lista se reorganiza automáticamente: \n" +
            " - Si es el primer nodo, se actualiza el inicio. \n" +
            " - Si es el último, se actualiza el fin. \n" +
            " - Si está en medio, se enlazan los nodos anterior y siguiente. \n\n" +
            " Así se mantiene la continuidad de la lista sin dejar huecos. ",
            "imagenes/eliminar_lista.png");
    }//GEN-LAST:event_btnInfoEliminarActionPerformed

    private void btnDataActualizadaElimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDataActualizadaElimActionPerformed
        refPrgListaDoble.mostrarInfo(
            this,
            "¿Qué es la Data Actualizada?",
            " \n La Data Actualizada muestra cómo queda \n" +
            " la lista enlazada después de eliminar \n" +
            " el nodo seleccionado. \n\n" +
            " Aquí se ve los nodos reorganizados, \n" +
            " sin el empleado eliminado. \n",
            "imagenes/mostrar_eliminacion_lista.png");
    }//GEN-LAST:event_btnDataActualizadaElimActionPerformed

    private void btnDataAEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDataAEliminarActionPerformed
        refPrgListaDoble.mostrarInfo(
            this,
            "¿Qué es la Data a Eliminar?",
            " \n La Data a Eliminar muestra los datos del \n" +
            " nodo que será eliminado. \n\n" +
            " Este empleado se identifica por su código \n" +
            " y se muestra antes de ser removido. \n",
            "imagenes/data_a_eliminar_lista.png");
    }//GEN-LAST:event_btnDataAEliminarActionPerformed

    private void btnInfoDataOriginalElimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoDataOriginalElimActionPerformed
        refPrgListaDoble.mostrarInfo(
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
        refPrgListaDoble.mostrar(txaElim);
    }//GEN-LAST:event_btnMostrarElimActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int cod = Integer.parseInt(txtCodElim.getText());
        
        int opcion = JOptionPane.showConfirmDialog(null,
                "¿Estás seguro de eliminar el Nodo?",
                "Confirmar",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE
        );
        
        if (opcion == JOptionPane.YES_OPTION)
        {
        refPrgListaDoble.eliminarXCodigo(cod);
        txaElim.append(refPrgListaDoble.listarIzqDer());
        }

        txtCodElim.setText("");
        txtCodElim.requestFocus();

        refPrgListaDoble.mostrar(txaIngre);
        
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnInfoMostrarIngreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoMostrarIngreActionPerformed
        refPrgListaDoble.mostrarInfo(
            this,
            "¿Qué hace el botón MOSTRAR?",
            " \n El botón MOSTRAR recorre la lista desde el inicio hasta el fin, \n" +
            " y muestra los datos de cada nodo en el área de texto. \n\n" +
            " Esto permite visualizar todos los empleados guardados \n" +
            " en la lista.  \n",
            "imagenes/mostrar_lista.png");
    }//GEN-LAST:event_btnInfoMostrarIngreActionPerformed

    private void btnInfoGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoGuardarActionPerformed
        refPrgListaDoble.mostrarInfo(
            this,
            "¿Qué hace el botón GUARDAR?",
            " \n El botón GUARDAR crea un nuevo nodo con los datos ingresados \n" +
            " en los campos de texto (Código, Nombre y Sueldo) y lo añade al \n" +
            " final de la lista enlazada. \n\n" +
            " Si la lista está vacía, el nuevo nodo se convierte en el inicio y el fin. \n" +
            " Si ya hay nodos, se enlaza al último y se actualiza el puntero fin. \n ",
            "imagenes/insertar_lista.png");
    }//GEN-LAST:event_btnInfoGuardarActionPerformed

    private void btnDataActualizadaIngreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDataActualizadaIngreActionPerformed
        refPrgListaDoble.mostrarInfo(
            this,
            "¿Qué es la Data Actualizada?",
            " \n La Data Actualizada muestra cómo queda la lista \n" +
            " enlazada después de insertar un nuevo nodo. \n\n" +
            " Aquí se ve la secuencia de empleados incluyendo \n" +
            " al recién añadido al final. \n ",
            "imagenes/mostrar_lista.png");
    }//GEN-LAST:event_btnDataActualizadaIngreActionPerformed

    private void btnDataAGuardarIngreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDataAGuardarIngreActionPerformed
        refPrgListaDoble.mostrarInfo(
            this,
            "¿Qué es la Data a Guardar?",
            " \n La Data a Guardar muestra los datos que el usuario \n" +
            " ha ingresado en los campos de texto. \n\n" +
            " Estos datos aún no están guardados en la lista enlazada \n" +
            " simples, pero están listos para ser insertados. \n",
            "imagenes/data_a_guardar_lista.png");
    }//GEN-LAST:event_btnDataAGuardarIngreActionPerformed

    private void btnInfoDataOriginalIngreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoDataOriginalIngreActionPerformed
        refPrgListaDoble.mostrarInfo(
            this,
            "¿Qué es la Data Original?",
            " \n La Data Original muestra los registros que ya están \n" +
            " guardados en la lista enlazada simple. \n\n" +
            " Cada nodo contiene un empleado con su código, \n" +
            " nombre y sueldo.\n\n " +
            " Esta información se carga al iniciar el programa.\n ",
            "imagenes/data_original_lista.png");
    }//GEN-LAST:event_btnInfoDataOriginalIngreActionPerformed

    private void btnInfoUsoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoUsoActionPerformed
        refPrgListaDoble.mostrarInfo(
            this,
            "¿Por qué se usan las listas enlazadas simples?",
            " Se usan porque permiten manejar datos de manera flexible. \n" +
            " No requieren un tamaño fijo como los arreglos. \n\n" +
            " Son útiles cuando se necesita insertar o eliminar elementos \n" +
            " sin preocuparse por mover grandes bloques de memoria. \n\n" +
            " Además, se adaptan mejor a situaciones dinámicas. ",
            "");
    }//GEN-LAST:event_btnInfoUsoActionPerformed

    private void btnInfoOrganizacionListaSimpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoOrganizacionListaSimpleActionPerformed
        refPrgListaDoble.mostrarInfo(
            this,
            "¿Cómo se organiza una lista enlazada simple?",
            " \n Cada nodo tiene dos partes: \n" +
            " 1) Los datos del empleado (código, nombre, sueldo). \n" +
            " 2) Una referencia al siguiente nodo. \n\n " +
            " El primer nodo se llama 'inicio' y el último 'fin'. \n " +
            " El último nodo apunta a null, indicando el final de la lista. \n",
            "imagenes/estructura_nodo.png");
    }//GEN-LAST:event_btnInfoOrganizacionListaSimpleActionPerformed

    private void btnInfoListaSimpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoListaSimpleActionPerformed
        refPrgListaDoble.mostrarInfo(
            this,
            "¿Qué es una lista enlazada simple?",
            " \n Una lista enlazada simple es una estructura dinámica de datos. \n" +
            " Está formada por nodos, y cada nodo contiene información \n" +
            " (ej. un empleado) y un puntero (sgte) al siguiente nodo. \n\n" +
            " A diferencia de los arreglos, las listas no tienen tamaño fijo, \n" +
            " pueden crecer o reducirse según se inserten o eliminen elementos. \n",
            "imagenes/lista_simple.png");
    }//GEN-LAST:event_btnInfoListaSimpleActionPerformed

    private void btnMostrarIngreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarIngreActionPerformed
        refPrgListaDoble.mostrar(txaIngre);
    }//GEN-LAST:event_btnMostrarIngreActionPerformed

    private void btnGuardarIngreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarIngreActionPerformed
        int cod = Integer.parseInt(txtCodIngre.getText());
        String nom = txtNomIngre.getText();
        float sue = Float.parseFloat(txtSueIngre.getText());
        refPrgListaDoble.agregar(cod, nom, sue);
        JOptionPane.showMessageDialog(null, "Empleado insertado correctamente");

        txtCodIngre.setText("");
        txtNomIngre.setText("");
        txtSueIngre.setText("");
        txtCodIngre.requestFocus();

        refPrgListaDoble.mostrar(txaElim);
    }//GEN-LAST:event_btnGuardarIngreActionPerformed

    private void btnEliminarNodo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarNodo1ActionPerformed
        if (refPrgListaDoble.estaVacia()){
            txaElim.setText("LISTA VACÍA\n"+"No hay nodos para eliminar");
            return;
        }
        int codPrimero = refPrgListaDoble.getIni().emp.getCodigo();
        String nomPrimero = refPrgListaDoble.getIni().emp.getNombre();
        float suelPrimero = refPrgListaDoble.getIni().emp.getSueldo();
        
        int opcion = JOptionPane.showConfirmDialog(
        null,
        "¿Deseas eliminar el PRIMER NODO de la lista?\n\n" +
        "Código: " + codPrimero + "\n" +
        "Nombre: " + nomPrimero + "\n" +
        "Sueldo: " + suelPrimero,
        "Confirmar Eliminación del Primer Nodo",
        JOptionPane.YES_NO_OPTION,
        JOptionPane.WARNING_MESSAGE
        );
        
        if (opcion == JOptionPane.YES_OPTION) {
            refPrgListaDoble.elimNodo1();
                if (refPrgListaDoble.estaVacia()) {
                    txaElim.append("Se eliminó el único nodo que había.\n");
                }
                else
                {
                    txaElim.append("=== LISTA COMPLETA DESPUÉS ===\n");
                    txaElim.append(refPrgListaDoble.listarIzqDer());
                }
                refPrgListaDoble.mostrar(txaIngre);
                txtCodElim.setText("");
                txtCodElim.requestFocus();
        }
    }//GEN-LAST:event_btnEliminarNodo1ActionPerformed

    private void btnInfoEliminarNodo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoEliminarNodo1ActionPerformed
        refPrgListaDoble.mostrarInfo(
        this,
        "¿Qué hace el botón ELIMIN.NODO 1?",
        "\n ELIMINACIÓN DEL PRIMER NODO\n\n" +
        " Este botón elimina automáticamente el PRIMER NODO \n" +
        " (nodo de inicio) de la lista doblemente enlazada. \n\n" +
        " DIFERENCIA CON 'ELIMINAR':\n" +
        " • ELIMINAR: Busca un código específico\n" +
        " • ELIMIN.NODO 1: Va DIRECTO al inicio\n\n" +
        " PROCESO:\n" +
        " 1. Valida que la lista NO esté vacía\n" +
        " 2. Muestra los datos del nodo a eliminar\n" +
        " 3. Pide confirmación al usuario\n" +
        " 4. Elimina el nodo y actualiza los punteros\n" +
        " 5. Muestra la lista actualizada\n\n" +
        " CASOS:\n" +
        " • Si hay 1 nodo → la lista queda vacía\n",
        "imagenes/eliminar_primer_nodo.png");
    }//GEN-LAST:event_btnInfoEliminarNodo1ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDataAEliminar;
    private javax.swing.JButton btnDataAGuardarIngre;
    private javax.swing.JButton btnDataActualizadaElim;
    private javax.swing.JButton btnDataActualizadaIngre;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEliminarNodo1;
    private javax.swing.JButton btnGuardarIngre;
    private javax.swing.JButton btnInfoDataOriginalElim;
    private javax.swing.JButton btnInfoDataOriginalIngre;
    private javax.swing.JButton btnInfoEliminar;
    private javax.swing.JButton btnInfoEliminarNodo1;
    private javax.swing.JButton btnInfoGuardar;
    private javax.swing.JButton btnInfoListaSimple;
    private javax.swing.JButton btnInfoMostrarElim;
    private javax.swing.JButton btnInfoMostrarIngre;
    private javax.swing.JButton btnInfoOrganizacionListaSimple;
    private javax.swing.JButton btnInfoUso;
    private javax.swing.JButton btnMostrarElim;
    private javax.swing.JButton btnMostrarIngre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JTextField txtCodElim;
    private javax.swing.JTextField txtCodIngre;
    private javax.swing.JTextField txtNomElim;
    private javax.swing.JTextField txtNomIngre;
    private javax.swing.JTextField txtSueElim;
    private javax.swing.JTextField txtSueIngre;
    // End of variables declaration//GEN-END:variables
}
