package co.gov.minambiente.vista.formulario;

import co.gov.minambiente.controlador.ControladorSolicitud;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Natalia García
 */
public class Seccion3 extends javax.swing.JFrame {

    private ControladorSolicitud controlador;

    public Seccion3() {
        initComponents();
        this.setLocationRelativeTo(null);
        cmbCategoriaAsociada.setEnabled(false);
        setEnabledSection1(false);
        setEnabledSection2(false);
        setEnabledSection4(false);
    }

    public Seccion3(ControladorSolicitud controlador) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.controlador = controlador;
        cmbCategoriaAsociada.setEnabled(false);
        setEnabledSection1(false);
        setEnabledSection2(false);
        setEnabledSection4(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        txtIngresosLetras = new javax.swing.JTextField();
        txtIngresos = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cmbTerrenosDominio = new javax.swing.JComboBox<>();
        btnSiguiente = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lbAutorizacion = new javax.swing.JCheckBox();
        cmbTipoAprovechamientoD = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        cmbCategoriaAsociada = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        cmbTipoAprovechamientoA = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        cmbClaseManejo = new javax.swing.JComboBox<>();
        rbD = new javax.swing.JRadioButton();
        rbA = new javax.swing.JRadioButton();
        rbB = new javax.swing.JRadioButton();
        rbC = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setText("3. Descripción detallada de la solicitud");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Predios de propiedad privada o colectiva:");

        txtIngresosLetras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIngresosLetrasActionPerformed(evt);
            }
        });
        txtIngresosLetras.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIngresosLetrasKeyTyped(evt);
            }
        });

        txtIngresos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIngresosActionPerformed(evt);
            }
        });
        txtIngresos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIngresosKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel9.setText("$");

        jLabel11.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel11.setText("3.2 Objetos forestales objeto de la solicitud de aprovechamiento o manejo sostenible:");

        jLabel12.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel12.setText("Terrenos de dominio público:");

        cmbTerrenosDominio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Permiso", "Asociación", "Concesión Forestal" }));
        cmbTerrenosDominio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTerrenosDominioActionPerformed(evt);
            }
        });

        btnSiguiente.setText("Siguiente");
        btnSiguiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSiguienteMouseClicked(evt);
            }
        });

        btnAnterior.setText("Anterior");
        btnAnterior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAnteriorMouseClicked(evt);
            }
        });
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Arial Narrow", 2, 13)); // NOI18N
        jLabel26.setText("En caso de que se seleccione la clase de manejo sotenible persistente, indique la categoría asociada: ");
        jLabel26.setToolTipText("");

        jLabel13.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel13.setText("3.1. Modo de adquirir el derecho al uso del recurso: ");

        lbAutorizacion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbAutorizacion.setText("Autorización");
        lbAutorizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbAutorizacionActionPerformed(evt);
            }
        });

        cmbTipoAprovechamientoD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Tipo 1", "Tipo 2", "Cambio definitivo de uso de suelo", "Establecimiento y Manejo" }));
        cmbTipoAprovechamientoD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoAprovechamientoDActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel15.setText("Seleccione la clase de aprovechamiento a solicitar: ");

        cmbCategoriaAsociada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Pequeños", "Medianos", "Grandes" }));
        cmbCategoriaAsociada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCategoriaAsociadaActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel16.setText("Seleccione el tipo de aprovechamiento a solicitar: ");

        jLabel17.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel17.setText("Valor en letras:");

        jLabel18.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel18.setText("Ingresos mensuales en Salarios Minímos Legales Mensuales Vigentes - (SLMMV) esperados para la actividad comercial que se pretende desarrollar:");

        jLabel27.setFont(new java.awt.Font("Arial Narrow", 2, 13)); // NOI18N
        jLabel27.setText("Seleccione de acuerdo con el tipo de solicitud el modo por el cual pretende adquirir el derecho al uso del recurso forestal:");
        jLabel27.setToolTipText("");

        cmbTipoAprovechamientoA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Persistente", "Único", "Doméstico", "Manejo Forestal Unificado" }));
        cmbTipoAprovechamientoA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoAprovechamientoAActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel19.setText("Seleccione la clase de manejo sostenible a solicitar: ");

        cmbClaseManejo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Doméstico", "Persistente" }));
        cmbClaseManejo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbClaseManejoActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbD);
        rbD.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        rbD.setText("D. Guaduales y bambusales");
        rbD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbDActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbA);
        rbA.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        rbA.setText("A. Productos forestales maderables");
        rbA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbB);
        rbB.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        rbB.setText("B. Manejo Sostenible de Flora Silvestre y los Productos Forestales No Maderables");
        rbB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbBActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbC);
        rbC.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        rbC.setText("C. Árboles Aislados ");
        rbC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel13)
                            .addComponent(jLabel27)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(12, 12, 12)
                                .addComponent(cmbTerrenosDominio, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbAutorizacion))
                            .addComponent(jLabel11)
                            .addComponent(rbA, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmbTipoAprovechamientoA, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(rbB, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmbClaseManejo, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel18)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtIngresos, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jLabel17)
                                .addGap(12, 12, 12)
                                .addComponent(txtIngresosLetras, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmbCategoriaAsociada, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(rbC, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbD, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(11, 11, 11)
                                .addComponent(cmbTipoAprovechamientoD, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnAnterior)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSiguiente)
                                .addGap(42, 42, 42))))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 878, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel13)
                .addGap(9, 9, 9)
                .addComponent(jLabel27)
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(cmbTerrenosDominio, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(lbAutorizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addComponent(jLabel11)
                .addGap(9, 9, 9)
                .addComponent(rbA)
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(cmbTipoAprovechamientoA, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(rbB)
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(cmbClaseManejo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(jLabel18)
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel17)
                        .addComponent(txtIngresosLetras, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtIngresos, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(cmbCategoriaAsociada, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(rbC)
                .addGap(20, 20, 20)
                .addComponent(rbD)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(cmbTipoAprovechamientoD, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAnterior)
                    .addComponent(btnSiguiente))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void setEnabledSection1(boolean state) {
        cmbTipoAprovechamientoA.setEnabled(state);
    }

    private void setEnabledSection2(boolean state) {
        cmbClaseManejo.setEnabled(state);
        txtIngresosLetras.setEnabled(state);
        txtIngresos.setEnabled(state);
    }

    private void setEnabledSection4(boolean state) {
        cmbTipoAprovechamientoD.setEnabled(state);
    }

    private void txtIngresosLetrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIngresosLetrasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIngresosLetrasActionPerformed

    private void txtIngresosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIngresosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIngresosActionPerformed

    private void cmbTerrenosDominioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTerrenosDominioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbTerrenosDominioActionPerformed

    private void btnSiguienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSiguienteMouseClicked
        String terrenosDominio = (String) cmbTerrenosDominio.getSelectedItem();
        String tipoAprovechamientoA = (String) cmbTipoAprovechamientoA.getSelectedItem();
        String claseManejo = (String) cmbClaseManejo.getSelectedItem();
        String ingresos = txtIngresos.getText().trim();
        String ingresosLetras = txtIngresosLetras.getText().trim();
        String categoriaAsociada = (String) cmbCategoriaAsociada.getSelectedItem();
        String tipoAprovechamientoD = (String) cmbTipoAprovechamientoD.getSelectedItem();

        if (!terrenosDominio.equals("Seleccione")) {
            if (rbA.isSelected()) {
                if (!tipoAprovechamientoA.equals("Seleccione")) {
                    try {
                        this.setVisible(false);
                        new Seccion4_1(controlador).setVisible(true);
                    } catch (IOException ex) {
                        Logger.getLogger(Seccion3.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Ingrese todos los datos solicitados.");
                }
            } else if (rbB.isSelected()) {
                if (!claseManejo.equals("Seleccione") && !ingresos.equals("") && !ingresosLetras.equals("")) {
                    if (cmbClaseManejo.getSelectedIndex() == 2) {
                        if (!categoriaAsociada.equals("Seleccione")) {                          
                                try {
                                    this.setVisible(false);
                                    new Seccion4_1(controlador).setVisible(true);
                                } catch (IOException ex) {
                                    Logger.getLogger(Seccion3.class.getName()).log(Level.SEVERE, null, ex);
                                }
                        } else {
                            JOptionPane.showMessageDialog(null, "Ingrese todos los datos solicitados.");
                        }
                    } else {
                            try {
                                this.setVisible(false);
                                new Seccion4_1(controlador).setVisible(true);
                            } catch (IOException ex) {
                                Logger.getLogger(Seccion3.class.getName()).log(Level.SEVERE, null, ex);
                            }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Ingrese todos los datos solicitados.");
                }
            } else if (rbC.isSelected()) {
                try {
                    this.setVisible(false);
                    new Seccion4_1(controlador).setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Seccion3.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (rbD.isSelected()) {
                if (!tipoAprovechamientoD.equals("Seleccione")) {
                    try {
                        this.setVisible(false);
                        new Seccion4_1(controlador).setVisible(true);
                    } catch (IOException ex) {
                        Logger.getLogger(Seccion3.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Ingrese todos los datos solicitados.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ingrese todos los datos solicitados.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese todos los datos solicitados.");
        }
    }//GEN-LAST:event_btnSiguienteMouseClicked

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnAnteriorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAnteriorMouseClicked
        this.setVisible(false);
        new Seccion2(controlador).setVisible(true);
    }//GEN-LAST:event_btnAnteriorMouseClicked

    private void lbAutorizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbAutorizacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbAutorizacionActionPerformed

    private void cmbTipoAprovechamientoDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoAprovechamientoDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbTipoAprovechamientoDActionPerformed

    private void cmbCategoriaAsociadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCategoriaAsociadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCategoriaAsociadaActionPerformed

    private void cmbTipoAprovechamientoAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoAprovechamientoAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbTipoAprovechamientoAActionPerformed

    private void cmbClaseManejoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbClaseManejoActionPerformed
        if (cmbClaseManejo.getSelectedIndex() == 2) {
            cmbCategoriaAsociada.setEnabled(true);
        } else {
            cmbCategoriaAsociada.setEnabled(false);
        }
    }//GEN-LAST:event_cmbClaseManejoActionPerformed

    private void rbDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbDActionPerformed
        setEnabledSection1(false);
        setEnabledSection2(false);
        setEnabledSection4(true);
    }//GEN-LAST:event_rbDActionPerformed

    private void rbBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbBActionPerformed
        setEnabledSection1(false);
        setEnabledSection2(true);
        setEnabledSection4(false);
    }//GEN-LAST:event_rbBActionPerformed

    private void rbCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCActionPerformed
        setEnabledSection1(false);
        setEnabledSection2(false);
        setEnabledSection4(false);
    }//GEN-LAST:event_rbCActionPerformed

    private void rbAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAActionPerformed
        setEnabledSection1(true);
        setEnabledSection2(false);
        setEnabledSection4(false);
    }//GEN-LAST:event_rbAActionPerformed

    private void txtIngresosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIngresosKeyTyped
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_txtIngresosKeyTyped

    private void txtIngresosLetrasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIngresosLetrasKeyTyped
        if(!Character.isAlphabetic(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_txtIngresosLetrasKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(Seccion3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Seccion3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Seccion3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Seccion3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Seccion3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmbCategoriaAsociada;
    private javax.swing.JComboBox<String> cmbClaseManejo;
    private javax.swing.JComboBox<String> cmbTerrenosDominio;
    private javax.swing.JComboBox<String> cmbTipoAprovechamientoA;
    private javax.swing.JComboBox<String> cmbTipoAprovechamientoD;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JCheckBox lbAutorizacion;
    private javax.swing.JRadioButton rbA;
    private javax.swing.JRadioButton rbB;
    private javax.swing.JRadioButton rbC;
    private javax.swing.JRadioButton rbD;
    private javax.swing.JTextField txtIngresos;
    private javax.swing.JTextField txtIngresosLetras;
    // End of variables declaration//GEN-END:variables
}
