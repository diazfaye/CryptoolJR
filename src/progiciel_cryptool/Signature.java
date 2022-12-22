/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progiciel_cryptool;

import chap2.TestECDSA;
import java.awt.Color;
import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.SignatureException;
import java.security.interfaces.RSAPrivateKey;
import java.security.spec.InvalidKeySpecException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.filechooser.FileNameExtensionFilter;
import tp.FonctionsRSA;

/**
 *
 * @author DELL
 */
public class Signature extends javax.swing.JFrame {

    private String txtFichier;
    private String txtCle;
    private String algorithme;
    private String hach;
    private String txtDestination;
    private String signature;

    public Signature(String txtFichier, String txtCle, String algo, String hach, String txtDestin, String sign) {
        this.txtFichier = txtFichier;
        this.txtCle = txtCle;
        this.algorithme = algo;
        this.hach = hach;
        this.txtDestination = txtDestin;
        this.signature = sign;
    }

    public Signature() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnFile = new javax.swing.JButton();
        btnPrivK = new javax.swing.JButton();
        quitter = new javax.swing.JToggleButton();
        btnPairKey = new javax.swing.JToggleButton();
        btnSigner = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        txtFile = new javax.swing.JTextField();
        txtKey = new javax.swing.JTextField();
        varHash = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        varSign = new javax.swing.JComboBox();
        varAlgo = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnDesti = new javax.swing.JButton();
        lblClose = new javax.swing.JLabel();
        lblMinimize = new javax.swing.JLabel();
        btnAcceuil = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnFile.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnFile.setText("Fichier");
        btnFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFileActionPerformed(evt);
            }
        });

        btnPrivK.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPrivK.setText("CléPriv");
        btnPrivK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrivKActionPerformed(evt);
            }
        });

        quitter.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        quitter.setText("Quitter");
        quitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitterActionPerformed(evt);
            }
        });

        btnPairKey.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPairKey.setText("genKeyPair");
        btnPairKey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPairKeyActionPerformed(evt);
            }
        });

        btnSigner.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSigner.setText("Signer");
        btnSigner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignerActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Veuillez choisir votre fichier a signer");

        txtFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFileActionPerformed(evt);
            }
        });

        txtKey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKeyActionPerformed(evt);
            }
        });

        varHash.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SHA-256", " ", "SHA-1" }));
        varHash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                varHashActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Algorithme");

        varSign.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SHA256WithRSA" }));
        varSign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                varSignActionPerformed(evt);
            }
        });

        varAlgo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "RSA", "DSA", "EC" }));
        varAlgo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                varAlgoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Signature");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Hachage");

        btnDesti.setBackground(new java.awt.Color(153, 204, 255));
        btnDesti.setText("Choisir un dossier pour l'enregistrement");
        btnDesti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDestiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(varAlgo, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(varHash, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(varSign, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3)
                                        .addGap(8, 8, 8))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnSigner)
                                .addGap(57, 57, 57)
                                .addComponent(btnPairKey)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(quitter)))
                        .addGap(31, 31, 31))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtFile, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnFile))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnDesti)
                                    .addComponent(txtKey, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnPrivK, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(38, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(varAlgo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(varHash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(varSign, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtFile, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFile))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtKey, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPrivK))
                .addGap(21, 21, 21)
                .addComponent(btnDesti)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quitter)
                    .addComponent(btnPairKey)
                    .addComponent(btnSigner))
                .addGap(22, 22, 22))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, -1, 380));

        lblClose.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblClose.setText("X");
        lblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCloseMouseExited(evt);
            }
        });
        jPanel1.add(lblClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 0, 20, -1));

        lblMinimize.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblMinimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMinimize.setText("-");
        lblMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinimizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMinimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMinimizeMouseExited(evt);
            }
        });
        jPanel1.add(lblMinimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 0, 20, 22));

        btnAcceuil.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAcceuil.setText("Acceuil");
        btnAcceuil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceuilActionPerformed(evt);
            }
        });
        jPanel1.add(btnAcceuil, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 0, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("SIGNATURE NUMERIQUE");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 320, -1));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/progiciel_cryptool/images-rem.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFileActionPerformed
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("m2tdsi", "txt");
        chooser.addChoosableFileFilter(filter);
        chooser.setDialogTitle("Choisissez votre fichier");
        int fileState = chooser.showDialog(null, "OK");
        if (fileState == JFileChooser.APPROVE_OPTION);
        File selectedFicher = chooser.getSelectedFile();
        String path = selectedFicher.getAbsolutePath();

        txtFile.setText(path);
        txtFichier = selectedFicher.getAbsolutePath();
        System.out.println(txtFichier);

    }//GEN-LAST:event_btnFileActionPerformed

    private void btnPrivKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrivKActionPerformed
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("m2tdsi", "txt");
        chooser.addChoosableFileFilter(filter);
        chooser.setDialogTitle("Choisissez votre fichier");
        int fileState = chooser.showDialog(null, "OK");
        if (fileState == JFileChooser.APPROVE_OPTION);
        File selectedFicher = chooser.getSelectedFile();
        String path = selectedFicher.getAbsolutePath();

        txtKey.setText(path);
        txtCle = selectedFicher.getAbsolutePath();
        //txtDestination = selectedFicher.getAbsolutePath();

    }//GEN-LAST:event_btnPrivKActionPerformed


    private void quitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitterActionPerformed
       dispose();
    }//GEN-LAST:event_quitterActionPerformed

    private void btnPairKeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPairKeyActionPerformed
        GenPairKey gen = new GenPairKey();
        gen.setVisible(true);
        gen.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnPairKeyActionPerformed

    private void btnSignerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignerActionPerformed
        algorithme = varAlgo.getSelectedItem().toString();
        hach = varHash.getSelectedItem().toString();
        signature = varSign.getSelectedItem().toString();
        if (algorithme.equals("EC")) {
            try {
                TestECDSA testEC = new TestECDSA();
                PrivateKey priv;
                priv = testEC.getPriv(txtCle, algorithme);
                testEC.signer(priv, txtFichier, txtDestination, hach, signature);
                JOptionPane.showMessageDialog(null, "Chemin pour votre fichier signé " + txtDestination);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erreur signature ECDSA");
            }
        } else {
            try {
                FonctionsRSA fRSA = new FonctionsRSA();

                PrivateKey priv;
                priv = fRSA.getPriv(txtCle, algorithme);
                fRSA.signer(priv, txtFichier, txtDestination, hach, signature);
                JOptionPane.showMessageDialog(null, "Chemin pour votre fichier signé " + txtDestination);
            } catch (Exception ex) {
               JOptionPane.showMessageDialog(null, "Signature echouée ");
            }
        }

    }//GEN-LAST:event_btnSignerActionPerformed

    private void txtFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFileActionPerformed

    private void txtKeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKeyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKeyActionPerformed

    private void varHashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varHashActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_varHashActionPerformed

    private void varSignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varSignActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_varSignActionPerformed

    private void varAlgoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varAlgoActionPerformed
        algorithme = varAlgo.getSelectedItem().toString();
        if (algorithme.equalsIgnoreCase("RSA")) {
            varSign.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"SHA1WithRSA", "SHA256WithRSA"
            }));

        } else if (algorithme.equalsIgnoreCase("DSA")) {
            varSign.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"SHA1WithDSA", "SHA256WithDSA"}));

        } else if (algorithme.equalsIgnoreCase("EC")) {
            varSign.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"SHA1WithECDSA", "SHA256WithECDSA"}));

        }
    }//GEN-LAST:event_varAlgoActionPerformed

    private void lblMinimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizeMouseEntered
        lblMinimize.setForeground(Color.white);
        Border borderLabel = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
        lblMinimize.setBorder(borderLabel);
    }//GEN-LAST:event_lblMinimizeMouseEntered

    private void lblMinimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizeMouseExited
        lblMinimize.setForeground(Color.black);
        Border borderLabel = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        lblMinimize.setBorder(borderLabel);
    }//GEN-LAST:event_lblMinimizeMouseExited

    private void lblMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizeMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_lblMinimizeMouseClicked

    private void lblCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseEntered
        lblClose.setForeground(Color.red);
        Border borderLabel = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.red);
        lblClose.setBorder(borderLabel);
    }//GEN-LAST:event_lblCloseMouseEntered

    private void lblCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseExited
        lblClose.setForeground(Color.black);
        Border borderLabel = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        lblClose.setBorder(borderLabel);
    }//GEN-LAST:event_lblCloseMouseExited

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblCloseMouseClicked

    private void btnAcceuilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceuilActionPerformed

        this.dispose();
    }//GEN-LAST:event_btnAcceuilActionPerformed

    private void btnDestiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDestiActionPerformed
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("m2tdsi", "txt");
        chooser.addChoosableFileFilter(filter);
        chooser.setDialogTitle("Choisissez l'endroit à enregistrer votre fichier: ");
        int fileState = chooser.showDialog(null, "OK");
        if (fileState == JFileChooser.APPROVE_OPTION);
        File selectedFichier = chooser.getSelectedFile();
        String path = selectedFichier.getAbsolutePath();
        btnDesti.setText(path + ".txt");
        txtDestination = selectedFichier.getAbsolutePath() + ".txt";
    }//GEN-LAST:event_btnDestiActionPerformed

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
            java.util.logging.Logger.getLogger(Signature.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signature.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signature.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signature.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signature().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcceuil;
    private javax.swing.JButton btnDesti;
    private javax.swing.JButton btnFile;
    private javax.swing.JToggleButton btnPairKey;
    private javax.swing.JButton btnPrivK;
    private javax.swing.JToggleButton btnSigner;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblMinimize;
    private javax.swing.JToggleButton quitter;
    private javax.swing.JTextField txtFile;
    private javax.swing.JTextField txtKey;
    private javax.swing.JComboBox varAlgo;
    private javax.swing.JComboBox varHash;
    private javax.swing.JComboBox varSign;
    // End of variables declaration//GEN-END:variables
}
