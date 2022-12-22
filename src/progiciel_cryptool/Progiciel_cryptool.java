/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progiciel_cryptool;

import java.awt.Dimension;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class Progiciel_cryptool {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException {
        Acceuil ac = new Acceuil();
        ac.setVisible(true);
        ac.getBtnLogout().setVisible(false);
        ac.getBtnAsymetrique().setVisible(false);
        ac.getBtnDH().setVisible(false);
        ac.getBtnPairKey().setVisible(false);
        ac.getBtnSecKey().setVisible(false);
        ac.getBtnSign().setVisible(false);
        ac.getBtnSymetrique().setVisible(false);
        ac.getBtnHybride().setVisible(false);
        ac.getBtnECC().setVisible(false);
        Dimension tailleEcran = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        int hauteur = (int) tailleEcran.getHeight();
        int largeur = (int) tailleEcran.getWidth();
        ac.setSize(largeur, hauteur);
        try {
            Login log = new Login();
            log.setVisible(true);
            log.setLocationRelativeTo(null);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "login failled");
        }

    }

}
