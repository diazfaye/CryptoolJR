/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progiciel_cryptool;

import chap2.ECDSA;
import chap2.TestECDSA;
import chap2.Utils;
import java.awt.Color;
import java.awt.Dimension;
import java.io.File;
import java.io.IOException;
import java.security.KeyPair;

import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
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
public class GenPairKey extends javax.swing.JFrame {

    private int varTail;
    private String varAlg;
    private String ficDestPub;
    private String ficDestPriv;

    public GenPairKey() {
        initComponents();
    }

    public GenPairKey(int varTail, String varAlg, String ficDestPub, String ficDestPriv) {
        this.varTail = varTail;
        this.varAlg = varAlg;
        this.ficDestPub = ficDestPub;
        this.ficDestPriv = ficDestPriv;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnGenSecPair = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPubK = new javax.swing.JTextArea();
        varAlgo = new javax.swing.JComboBox();
        varTaille = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtPrivK = new javax.swing.JTextArea();
        btnPublic = new javax.swing.JButton();
        btnPrivee = new javax.swing.JButton();
        lblClose = new javax.swing.JLabel();
        lblMinimize = new javax.swing.JLabel();
        btnAcceuil = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnGenSecPair.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnGenSecPair.setText("genKeyPair");
        btnGenSecPair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenSecPairActionPerformed(evt);
            }
        });

        jToggleButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jToggleButton2.setText("Quitter");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("PublicKey");

        txtPubK.setColumns(20);
        txtPubK.setRows(5);
        jScrollPane1.setViewportView(txtPubK);

        varAlgo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "RSA", "DSA", "EC" }));
        varAlgo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                varAlgoActionPerformed(evt);
            }
        });

        varTaille.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                varTailleActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Veuillez choisir votre Algorithme");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("PrivateKey");

        txtPrivK.setColumns(20);
        txtPrivK.setRows(5);
        jScrollPane2.setViewportView(txtPrivK);

        btnPublic.setBackground(new java.awt.Color(102, 204, 255));
        btnPublic.setText("Choisir destination clé public");
        btnPublic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPublicActionPerformed(evt);
            }
        });

        btnPrivee.setBackground(new java.awt.Color(102, 204, 255));
        btnPrivee.setText("Choisir destination clé privée");
        btnPrivee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPriveeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(btnGenSecPair)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jToggleButton2)
                .addGap(34, 34, 34))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(varAlgo, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                        .addComponent(varTaille, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPrivee)
                    .addComponent(btnPublic))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(varAlgo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(varTaille, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(btnPublic)
                .addGap(18, 18, 18)
                .addComponent(btnPrivee)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel3)
                        .addGap(9, 9, 9))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGenSecPair)
                    .addComponent(jToggleButton2))
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, -1, 350));

        lblClose.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblClose.setText("X");
        lblClose.setPreferredSize(new java.awt.Dimension(17, 17));
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
        jPanel1.add(lblClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, 23, 22));

        lblMinimize.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblMinimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMinimize.setText("-");
        lblMinimize.setPreferredSize(new java.awt.Dimension(17, 17));
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
        jPanel1.add(lblMinimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 0, 22, 22));

        btnAcceuil.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAcceuil.setForeground(new java.awt.Color(51, 51, 51));
        btnAcceuil.setText("Acceuil");
        btnAcceuil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceuilActionPerformed(evt);
            }
        });
        jPanel1.add(btnAcceuil, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("GENERATION PAIR DE CLES ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/progiciel_cryptool/keys-remov.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 250, 250));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/progiciel_cryptool/images-rem.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 687, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void varAlgoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varAlgoActionPerformed
        varAlg = varAlgo.getSelectedItem().toString();
        if (varAlg.equalsIgnoreCase("RSA")) {
            varTaille.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"1024", "2048", "3072", "4096", "7680", "15360"
            }));
            btnPublic.setVisible(true);
            btnPrivee.setVisible(true);
        } else if (varAlg.equalsIgnoreCase("DSA")) {
            varTaille.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"512", "1024", "2048", "3072", "7680", "15360"}));
            btnPublic.setVisible(true);
            btnPrivee.setVisible(true);
        } else if (varAlg.equalsIgnoreCase("ElGamal")) {
            varTaille.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"512", "1024", "2048", "3072", "7680", "15360"}));
            btnPublic.setVisible(true);
            btnPrivee.setVisible(true);
        } else if (varAlg.equalsIgnoreCase("EC")) {
            varTaille.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"160", "224", "256", "384", "512"}));
            btnPublic.setVisible(true);
            btnPrivee.setVisible(true);

        } else if (varAlg.equalsIgnoreCase("DH")) {
            varTaille.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"704", "1024", "2048"}));
            btnPublic.setVisible(true);
            btnPrivee.setVisible(true);
        }
    }//GEN-LAST:event_varAlgoActionPerformed

    private void btnGenSecPairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenSecPairActionPerformed
        FonctionsRSA fRSA = new FonctionsRSA();

        varTail = Integer.parseInt(varTaille.getSelectedItem().toString());
        varAlg = varAlgo.getSelectedItem().toString();
        if (varAlg.equalsIgnoreCase("EC")) {
            try {
                TestECDSA testEC = new TestECDSA();
                testEC.genKey(varTail, varAlg, ficDestPub, ficDestPriv);
                PublicKey pub = testEC.getPub(ficDestPub, varAlg);
                txtPubK.setText(Utils.toHex(pub.getEncoded()));
                PrivateKey priv = testEC.getPriv(ficDestPriv, varAlg);
                txtPrivK.setText(Utils.toHex(priv.getEncoded()));

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "testEC");
            }
        } else {
            try {
                fRSA.genkey(varTail, varAlg, ficDestPub, ficDestPriv);
                //PublicKey pub = fRSA.getPub("clepublique.txt",varAlg);
                PublicKey pub = fRSA.getPub(ficDestPub, varAlg);
                txtPubK.setText(Utils.toHex(pub.getEncoded()));
                //PrivateKey priv = fRSA.getPriv("cleprivee.txt",varAlg);
                PrivateKey priv = fRSA.getPriv(ficDestPriv, varAlg);
                txtPrivK.setText(Utils.toHex(priv.getEncoded()));
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "erreur génération clés asymétriques " + txtPubK);
            }
        }

    }//GEN-LAST:event_btnGenSecPairActionPerformed

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

    private void btnPublicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPublicActionPerformed
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("m2tdsi", "txt");
        chooser.addChoosableFileFilter(filter);
        chooser.setDialogTitle("Choisissez l'endroit à enregistrer votre fichier: ");
        int fileState = chooser.showDialog(null, "OK");
        if (fileState == JFileChooser.APPROVE_OPTION);
        File selectedFichier = chooser.getSelectedFile();
        String path = selectedFichier.getAbsolutePath();
        btnPublic.setText(path + ".txt");
        ficDestPub = selectedFichier.getAbsolutePath() + ".txt";
    }//GEN-LAST:event_btnPublicActionPerformed

    private void btnPriveeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPriveeActionPerformed
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("m2tdsi", "txt");
        chooser.addChoosableFileFilter(filter);
        chooser.setDialogTitle("Choisissez l'endroit à enregistrer votre fichier: ");
        int fileState = chooser.showDialog(null, "OK");
        if (fileState == JFileChooser.APPROVE_OPTION);
        File selectedFichier = chooser.getSelectedFile();
        String path = selectedFichier.getAbsolutePath();
        btnPrivee.setText(path + ".txt");
        ficDestPriv = selectedFichier.getAbsolutePath() + ".txt";
    }//GEN-LAST:event_btnPriveeActionPerformed

    private void varTailleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varTailleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_varTailleActionPerformed

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
            java.util.logging.Logger.getLogger(GenPairKey.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GenPairKey.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GenPairKey.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GenPairKey.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GenPairKey().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcceuil;
    private javax.swing.JToggleButton btnGenSecPair;
    private javax.swing.JButton btnPrivee;
    private javax.swing.JButton btnPublic;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblMinimize;
    private javax.swing.JTextArea txtPrivK;
    private javax.swing.JTextArea txtPubK;
    private javax.swing.JComboBox varAlgo;
    private javax.swing.JComboBox varTaille;
    // End of variables declaration//GEN-END:variables
}
