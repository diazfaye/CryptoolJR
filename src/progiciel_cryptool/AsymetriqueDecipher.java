/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progiciel_cryptool;

import java.awt.Color;
import java.awt.Dimension;
import java.io.File;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.spec.InvalidKeySpecException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.NoSuchPaddingException;
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
public class AsymetriqueDecipher extends javax.swing.JFrame {

    /**
     * Creates new form AsymetriqueDecipher
     */
    private String txtFichier;
    private String txtCle;
    private String txtDestination;
    private String algo;

    public AsymetriqueDecipher(String txtFichier, String txtCle, String txtDestin, String algo) {
        this.txtFichier = txtFichier;
        this.txtCle = txtCle;
        this.txtDestination = txtDestin;
        this.algo = algo;
    }

    public AsymetriqueDecipher() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtFile = new javax.swing.JTextField();
        txtKey = new javax.swing.JTextField();
        btnFile = new javax.swing.JButton();
        btnKey = new javax.swing.JButton();
        btnDecipher = new javax.swing.JToggleButton();
        btnGenPairKey = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        varAlgo = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        btnDest = new javax.swing.JButton();
        lblClose = new javax.swing.JLabel();
        lblMinimize = new javax.swing.JLabel();
        btnAcceuil = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Veuillez choisir votre fichier a déchiffrer");

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

        btnFile.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnFile.setText("Message");
        btnFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFileActionPerformed(evt);
            }
        });

        btnKey.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnKey.setText("CléPriv");
        btnKey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeyActionPerformed(evt);
            }
        });

        btnDecipher.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDecipher.setText("Déchiffrer");
        btnDecipher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecipherActionPerformed(evt);
            }
        });

        btnGenPairKey.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnGenPairKey.setText("genKeyPair");
        btnGenPairKey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenPairKeyActionPerformed(evt);
            }
        });

        jToggleButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jToggleButton3.setText("Quitter");
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });

        varAlgo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "RSA", "DSA", "DH" }));
        varAlgo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                varAlgoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Algorithme");

        btnDest.setBackground(new java.awt.Color(153, 204, 255));
        btnDest.setText("Choisir un endroit pour l'enregistrement");
        btnDest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDestActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtKey, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(txtFile, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnFile)
                                    .addComponent(btnKey)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(btnDecipher)
                                .addGap(34, 34, 34)
                                .addComponent(btnGenPairKey)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jToggleButton3)
                                .addGap(24, 24, 24))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnDest)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(varAlgo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel2)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(58, 58, 58)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(varAlgo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(btnDest)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFile, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFile))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtKey, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKey))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton3)
                    .addComponent(btnGenPairKey)
                    .addComponent(btnDecipher))
                .addGap(20, 20, 20))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, -1, 400));

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
        jPanel1.add(lblClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(686, 0, 22, -1));

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
        jPanel1.add(lblMinimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(657, 0, 22, 22));

        btnAcceuil.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAcceuil.setText("Acceuil");
        btnAcceuil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceuilActionPerformed(evt);
            }
        });
        jPanel1.add(btnAcceuil, new org.netbeans.lib.awtextra.AbsoluteConstraints(577, 0, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("DECHIFFREMENT ASYMETRIQUE");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 41, 498, -1));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/progiciel_cryptool/images-rem.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/progiciel_cryptool/keys-remov.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 250, 250));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFileActionPerformed

    private void txtKeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKeyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKeyActionPerformed

    private void btnFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFileActionPerformed
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("m2tdsi", "txt");
        chooser.addChoosableFileFilter(filter);
        chooser.setDialogTitle("Choisissez votre fichier");
        int fileState = chooser.showDialog(null, "OK");
        if (fileState == JFileChooser.APPROVE_OPTION);
        File selectedFichier = chooser.getSelectedFile();
        String path = selectedFichier.getAbsolutePath();
        txtFile.setText(path);
        txtFichier = selectedFichier.getName();
    }//GEN-LAST:event_btnFileActionPerformed

    private void btnKeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeyActionPerformed
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("m2tdsi", "txt");
        chooser.addChoosableFileFilter(filter);
        chooser.setDialogTitle("Choisissez votre fichier");
        int fileState = chooser.showDialog(null, "OK");
        if (fileState == JFileChooser.APPROVE_OPTION);
        File selectedFichier = chooser.getSelectedFile();
        String path = selectedFichier.getAbsolutePath();
        txtKey.setText(path);
        txtCle = selectedFichier.getName();
    }//GEN-LAST:event_btnKeyActionPerformed

    private void btnDecipherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecipherActionPerformed
        try {
            FonctionsRSA fRSA = new FonctionsRSA();
            algo = varAlgo.getSelectedItem().toString();
            PrivateKey priv = fRSA.getPriv(txtCle, algo);
            fRSA.dechiffrer(priv, txtFichier, txtDestination, algo);
            JOptionPane.showMessageDialog(null, "Chemin pour votre fichier déchiffré " + txtDestination);
        } catch (IOException ex) {
            Logger.getLogger(AsymetriqueCipher.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(AsymetriqueCipher.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvalidKeySpecException ex) {
            Logger.getLogger(AsymetriqueCipher.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchPaddingException ex) {
            Logger.getLogger(AsymetriqueCipher.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvalidKeyException ex) {
            Logger.getLogger(AsymetriqueCipher.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDecipherActionPerformed

    private void btnGenPairKeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenPairKeyActionPerformed
        GenPairKey gen = new GenPairKey();
        gen.setVisible(true);
        gen.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnGenPairKeyActionPerformed

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jToggleButton3ActionPerformed

    private void varAlgoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varAlgoActionPerformed
        // TODO add your handling code here:
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
        /*Acceuil ac = new Acceuil();
        ac.setVisible(true);
        //ac.setLocationRelativeTo(null);
        Dimension tailleEcran = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        int hauteur = (int) tailleEcran.getHeight();
        int largeur = (int) tailleEcran.getWidth();
        ac.setSize(largeur, hauteur);
        */
        this.dispose();
    }//GEN-LAST:event_btnAcceuilActionPerformed

    private void btnDestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDestActionPerformed
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("m2tdsi", "txt");
        chooser.addChoosableFileFilter(filter);
        chooser.setDialogTitle("Choisissez l'endroit à enregistrer votre fichier: ");
        int fileState = chooser.showDialog(null, "OK");
        if (fileState == JFileChooser.APPROVE_OPTION);
        File selectedFichier = chooser.getSelectedFile();
        String path = selectedFichier.getAbsolutePath();
        btnDest.setText(path + ".txt");
        txtDestination = selectedFichier.getAbsolutePath();
    }//GEN-LAST:event_btnDestActionPerformed

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
            java.util.logging.Logger.getLogger(AsymetriqueDecipher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AsymetriqueDecipher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AsymetriqueDecipher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AsymetriqueDecipher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AsymetriqueDecipher().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcceuil;
    private javax.swing.JToggleButton btnDecipher;
    private javax.swing.JButton btnDest;
    private javax.swing.JButton btnFile;
    private javax.swing.JToggleButton btnGenPairKey;
    private javax.swing.JButton btnKey;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblMinimize;
    private javax.swing.JTextField txtFile;
    private javax.swing.JTextField txtKey;
    private javax.swing.JComboBox varAlgo;
    // End of variables declaration//GEN-END:variables
}
