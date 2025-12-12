
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
        refPrgListaDoble.listarIzqDer(txaIngre);
        refPrgListaDoble.listarIzqDer(txaElim);
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
        btnMostrarIngreIzqDer = new javax.swing.JButton();
        txtNomIngre = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        btnInfoListaSimple = new javax.swing.JButton();
        btnInfoOrganizacionListaSimple = new javax.swing.JButton();
        btnInfoDataOriginalIngre = new javax.swing.JButton();
        btnDataActualizadaIngre = new javax.swing.JButton();
        btnInfoGuardar = new javax.swing.JButton();
        btnInfoMostrarIzqDer = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaIngre = new javax.swing.JTextArea();
        btnMostrarIngreDerIzq = new javax.swing.JButton();
        btnInfoMostrarDerIzq = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtCodElim = new javax.swing.JTextField();
        txtNomElim = new javax.swing.JTextField();
        txtSueElim = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        btnInfoDataOriginalElim = new javax.swing.JButton();
        btnDataActualizadaElim = new javax.swing.JButton();
        btnInfoEliminar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaElim = new javax.swing.JTextArea();
        btnMostrarIzqDerElim = new javax.swing.JButton();
        btnMostrarDerIzqElim = new javax.swing.JButton();
        btnInfoMostrarDerIzqElim = new javax.swing.JButton();
        btnInfoMostrarIzqDerElim = new javax.swing.JButton();

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

        btnMostrarIngreIzqDer.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnMostrarIngreIzqDer.setText("MOSTRAR DE IZQUIERDA A DERECHA");
        btnMostrarIngreIzqDer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarIngreIzqDerActionPerformed(evt);
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

        btnInfoMostrarIzqDer.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnInfoMostrarIzqDer.setText("¿Qué hace el botón MOSTRAR I-D?");
        btnInfoMostrarIzqDer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoMostrarIzqDerActionPerformed(evt);
            }
        });

        txaIngre.setColumns(20);
        txaIngre.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txaIngre.setRows(5);
        jScrollPane1.setViewportView(txaIngre);

        btnMostrarIngreDerIzq.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnMostrarIngreDerIzq.setText("MOSTRAR DE DERECHA A IZQUIERDA");
        btnMostrarIngreDerIzq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarIngreDerIzqActionPerformed(evt);
            }
        });

        btnInfoMostrarDerIzq.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnInfoMostrarDerIzq.setText("¿Qué hace el botón MOSTRAR D-I?");
        btnInfoMostrarDerIzq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoMostrarDerIzqActionPerformed(evt);
            }
        });

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
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNomIngre)
                                    .addComponent(txtCodIngre)
                                    .addComponent(txtSueIngre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnMostrarIngreIzqDer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnMostrarIngreDerIzq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnGuardarIngre, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(btnInfoDataOriginalIngre)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnDataActualizadaIngre))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnInfoMostrarIzqDer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnInfoMostrarDerIzq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnInfoGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(btnInfoListaSimple, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnInfoOrganizacionListaSimple))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(jLabel26)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnInfoListaSimple, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInfoOrganizacionListaSimple))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCodIngre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardarIngre)
                    .addComponent(btnInfoGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNomIngre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMostrarIngreIzqDer)
                    .addComponent(btnInfoMostrarIzqDer, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtSueIngre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMostrarIngreDerIzq)
                    .addComponent(btnInfoMostrarDerIzq, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInfoDataOriginalIngre)
                    .addComponent(btnDataActualizadaIngre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
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
        txtNomElim.setText("Ana");

        txtSueElim.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtSueElim.setText("1000");

        btnEliminar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnEliminar.setText("ELIMINAR POR CÓDIGO");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
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

        txaElim.setColumns(20);
        txaElim.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txaElim.setRows(5);
        jScrollPane2.setViewportView(txaElim);

        btnMostrarIzqDerElim.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnMostrarIzqDerElim.setText("MOSTRAR DE IZQUIERDA A DERECHA");
        btnMostrarIzqDerElim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarIzqDerElimActionPerformed(evt);
            }
        });

        btnMostrarDerIzqElim.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnMostrarDerIzqElim.setText("MOSTRAR DE DERECHA A IZQUIERDA");
        btnMostrarDerIzqElim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarDerIzqElimActionPerformed(evt);
            }
        });

        btnInfoMostrarDerIzqElim.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnInfoMostrarDerIzqElim.setText("¿Qué hace el botón MOSTRAR D-I?");
        btnInfoMostrarDerIzqElim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoMostrarDerIzqElimActionPerformed(evt);
            }
        });

        btnInfoMostrarIzqDerElim.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnInfoMostrarIzqDerElim.setText("¿Qué hace el botón MOSTRAR I-D?");
        btnInfoMostrarIzqDerElim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoMostrarIzqDerElimActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(jLabel27))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(btnInfoDataOriginalElim)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnDataActualizadaElim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtSueElim, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNomElim, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCodElim, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnMostrarIzqDerElim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnMostrarDerIzqElim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnInfoMostrarIzqDerElim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnInfoMostrarDerIzqElim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnInfoEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtCodElim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar)
                    .addComponent(btnInfoEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtNomElim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMostrarIzqDerElim)
                    .addComponent(btnInfoMostrarIzqDerElim, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtSueElim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMostrarDerIzqElim)
                    .addComponent(btnInfoMostrarDerIzqElim, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInfoDataOriginalElim)
                    .addComponent(btnDataActualizadaElim))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
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

    private void btnInfoEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoEliminarActionPerformed
        refPrgListaDoble.mostrarInfo(
            this,
            "¿Qué hace el botón ELIMINAR?",
            "El botón ELIMINAR busca un nodo por su código\n" +
            "Si lo encuentra, lo desconecta de la lista doble\n" +
            "Si es el único nodo, la lista queda vacía\n" +
            "Si es el primero, se actualiza el inicio y se\n" +
            "elimina el enlace hacia atrás\n" +
            "Si es el último, se actualiza el fin y se elimina\n" +
            "el enlace hacia adelante\n" +
            "Si está en medio, se conectan sus vecinos y se\n" +
            "limpian sus referencias sgte y ant\n" +
            "Se muestra un mensaje confirmando la eliminación",
            "imagenes/eliminar_lista_doble.png");
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

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int cod = Integer.parseInt(txtCodElim.getText());
        refPrgListaDoble.eliminarXcodigo(cod);
        
        txtCodElim.setText("");
        txtNomElim.setText("");
        txtSueElim.setText("");
        txtCodElim.requestFocus();
        
        refPrgListaDoble.listarIzqDer(txaIngre);
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnInfoMostrarIzqDerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoMostrarIzqDerActionPerformed
        refPrgListaDoble.mostrarInfo(
            this,
            "¿Qué hace el botón MOSTRAR I-D?",
            "Este botón recorre la lista desde el primer nodo\n" +
            "hasta el último, usando el puntero 'sgte'\n" +
            "Muestra cada empleado en orden de ingreso\n" +
            "El recorrido se realiza de izquierda a derecha\n" +
            "y se imprime en el área de texto\n" +
            "Sirve para verificar cómo se organizan los nodos\n" +
            "y confirmar que los datos se guardaron correctamente\n",
            "imagenes/mostrar_lista.png");
    }//GEN-LAST:event_btnInfoMostrarIzqDerActionPerformed

    private void btnInfoGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoGuardarActionPerformed
        refPrgListaDoble.mostrarInfo(
            this,
            "¿Qué hace el botón GUARDAR?",
            "El botón GUARDAR crea un nuevo nodo en la lista doble\n" +
            "con los datos ingresados: código, nombre y sueldo\n" +
            "El nodo se conecta al final de la lista existente\n" +
            "Si la lista está vacía, el nodo se convierte en el\n" +
            "primer y último elemento al mismo tiempo\n" +
            "Cada nodo guarda un objeto Empleado con sus datos\n" +
            "y se enlaza con punteros 'sgte' y 'ant' para recorrer\n" +
            "en ambos sentidos según se necesite",
            "imagenes/guardar_lista_doble.png");
    }//GEN-LAST:event_btnInfoGuardarActionPerformed

    private void btnDataActualizadaIngreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDataActualizadaIngreActionPerformed
        refPrgListaDoble.mostrarInfo(
            this,
            "¿Qué es la DATA ACTUALIZADA?",
            "\nLa Data Actualizada muestra el estado final de la lista\n" +
            "después de realizar de insertar un nodo al final.\n" +
            "Permite comparar con la Data Original para verificar\n" +
            "que se insertó correctamente\n",
            "imagenes/mostrar_lista.png");
    }//GEN-LAST:event_btnDataActualizadaIngreActionPerformed

    private void btnInfoDataOriginalIngreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoDataOriginalIngreActionPerformed
        refPrgListaDoble.mostrarInfo(
            this,
            "¿Qué es la DATA ORIGINAL?",
            "\nLa Data Original muestra los nodos actuales de la lista\n" +
            "antes de realizar cualquier eliminación o modificación\n" +
            "Se genera al presionar MOSTRAR I-D o D-I\n" +
            "y refleja el estado completo de la lista en ese momento\n" +
            "Sirve como referencia para comparar con la Data Actualizada\n",
            "imagenes/data_original_lista.png");
    }//GEN-LAST:event_btnInfoDataOriginalIngreActionPerformed

    private void btnInfoOrganizacionListaSimpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoOrganizacionListaSimpleActionPerformed
        refPrgListaDoble.mostrarInfo(
            this,
            "¿Cómo se organiza una lista doblemente enlazada?",
            "La lista mantiene dos referencias principales:\n" +
            "ini apunta al primer nodo y fin al último nodo\n" +
            "Primer nodo: ini.ant siempre es null\n" +
            "Último nodo: fin.sgte siempre es null\n" +
            "Cada inserción al final actualiza fin.sgte=nuevo y\n" +
            "nuevo.ant=fin, luego fin=nuevo\n" +
            "Si la lista está vacía, ini y fin apuntan al mismo\n" +
            "nuevo nodo tras la primera inserción",
            "imagenes/Lista_Doble_Estructura.png");
    }//GEN-LAST:event_btnInfoOrganizacionListaSimpleActionPerformed

    private void btnInfoListaSimpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoListaSimpleActionPerformed
        refPrgListaDoble.mostrarInfo(
            this,
            "Teoría sobre lista doble",
            "Una lista doblemente enlazada es una estructura\n" +
            "lineal de nodos donde cada nodo conoce a su\n" +
            "siguiente (sgte) y a su anterior (ant)\n" +
            "Permite recorridos en ambos sentidos y elimina\n" +
            "la necesidad de buscar el anterior durante\n" +
            "operaciones como eliminación o inserción intermedia\n" +
            "Cada nodo encapsula un objeto (Empleado) y\n" +
            "punteros ant y sgte para mantener los enlaces",
            "imagenes/lista_doble.png");
    }//GEN-LAST:event_btnInfoListaSimpleActionPerformed

    private void btnMostrarIngreIzqDerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarIngreIzqDerActionPerformed
        refPrgListaDoble.listarIzqDer(txaIngre);
    }//GEN-LAST:event_btnMostrarIngreIzqDerActionPerformed

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

        refPrgListaDoble.listarIzqDer(txaElim);
    }//GEN-LAST:event_btnGuardarIngreActionPerformed

    private void btnMostrarIngreDerIzqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarIngreDerIzqActionPerformed
        refPrgListaDoble.listarDerIzq(txaIngre);
    }//GEN-LAST:event_btnMostrarIngreDerIzqActionPerformed

    private void btnInfoMostrarDerIzqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoMostrarDerIzqActionPerformed
        refPrgListaDoble.mostrarInfo(
            this,
            "¿Qué hace el botón MOSTRAR D-I?",
            "Este botón recorre la lista desde el último nodo\n" +
            "hasta el primero, usando el puntero 'ant'\n" +
            "Muestra los empleados en orden inverso\n" +
            "El recorrido se realiza de derecha a izquierda\n" +
            "y se imprime en el área de texto\n" +
            "Permite verificar que los enlaces 'ant' funcionan\n" +
            "y que la lista doble está correctamente enlazada\n",
            "imagenes/mostrar_der_izq.png");
    }//GEN-LAST:event_btnInfoMostrarDerIzqActionPerformed

    private void btnMostrarIzqDerElimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarIzqDerElimActionPerformed
        refPrgListaDoble.listarIzqDer(txaElim);
    }//GEN-LAST:event_btnMostrarIzqDerElimActionPerformed

    private void btnMostrarDerIzqElimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarDerIzqElimActionPerformed
        refPrgListaDoble.listarDerIzq(txaElim);
    }//GEN-LAST:event_btnMostrarDerIzqElimActionPerformed

    private void btnInfoMostrarDerIzqElimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoMostrarDerIzqElimActionPerformed
        refPrgListaDoble.mostrarInfo(
            this,
            "¿Qué hace el botón MOSTRAR D-I?",
            "Este botón recorre la lista desde el final\n" +
            "Avanza con el puntero ant hasta llegar al inicio\n" +
            "Muestra los nodos en orden inverso\n" +
            "Permite verificar que los enlaces hacia atrás\n" +
            "siguen funcionando correctamente\n" +
            "El recorrido es de derecha a izquierda\n" +
            "y se imprime en el área de texto\n",
            "imagenes/mostrar_der_izq_elim.png");
    }//GEN-LAST:event_btnInfoMostrarDerIzqElimActionPerformed

    private void btnInfoMostrarIzqDerElimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoMostrarIzqDerElimActionPerformed
        refPrgListaDoble.mostrarInfo(
            this,
            "¿Qué hace el botón MOSTRAR I-D?",
            "Este botón recorre la lista desde el inicio\n" +
            "Avanza con el puntero sgte hasta llegar al final\n" +
            "Muestra cada nodo en orden de ingreso\n" +
            "Sirve para verificar el estado actual de la lista\n" +
            "después de eliminar un nodo\n" +
            "El recorrido es de izquierda a derecha\n" +
            "y se imprime en el área de texto\n",
            "imagenes/mostrar_izq_der.png");
    }//GEN-LAST:event_btnInfoMostrarIzqDerElimActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDataActualizadaElim;
    private javax.swing.JButton btnDataActualizadaIngre;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardarIngre;
    private javax.swing.JButton btnInfoDataOriginalElim;
    private javax.swing.JButton btnInfoDataOriginalIngre;
    private javax.swing.JButton btnInfoEliminar;
    private javax.swing.JButton btnInfoGuardar;
    private javax.swing.JButton btnInfoListaSimple;
    private javax.swing.JButton btnInfoMostrarDerIzq;
    private javax.swing.JButton btnInfoMostrarDerIzqElim;
    private javax.swing.JButton btnInfoMostrarIzqDer;
    private javax.swing.JButton btnInfoMostrarIzqDerElim;
    private javax.swing.JButton btnInfoOrganizacionListaSimple;
    private javax.swing.JButton btnMostrarDerIzqElim;
    private javax.swing.JButton btnMostrarIngreDerIzq;
    private javax.swing.JButton btnMostrarIngreIzqDer;
    private javax.swing.JButton btnMostrarIzqDerElim;
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
