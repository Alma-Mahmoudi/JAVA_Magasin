/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package magasin;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author asus
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size= toolkit.getScreenSize();
        setLocation(size.width/2-getWidth()/2, size.height/2 -getHeight()/2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        jButtonSuperette = new javax.swing.JButton();
        jButtonMaison = new javax.swing.JButton();
        jButtonElectromenager = new javax.swing.JButton();
        jButtonJardin = new javax.swing.JButton();
        jButtonVetement = new javax.swing.JButton();
        jLabelExit = new javax.swing.JLabel();
        jLabelMin = new javax.swing.JLabel();
        jLabelDeconnecter = new javax.swing.JLabel();
        jLabelAjoutClient = new javax.swing.JLabel();
        jLabel3Connecter1 = new javax.swing.JLabel();
        jButtonSante = new javax.swing.JButton();
        jLabelStockClients = new javax.swing.JLabel();
        jLabelMenu = new javax.swing.JLabel();
        jLabelAjoutProduit1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(77, 77, 77));

        jButtonSuperette.setBackground(new java.awt.Color(77, 77, 77));
        jButtonSuperette.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonSuperette.setText("Supérette");
        jButtonSuperette.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSuperetteMouseClicked(evt);
            }
        });

        jButtonMaison.setBackground(new java.awt.Color(0, 153, 153));
        jButtonMaison.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonMaison.setText("Maison & Bureau");
        jButtonMaison.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonMaisonMouseClicked(evt);
            }
        });
        jButtonMaison.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMaisonActionPerformed(evt);
            }
        });

        jButtonElectromenager.setBackground(new java.awt.Color(0, 153, 153));
        jButtonElectromenager.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonElectromenager.setText("Electroménager");
        jButtonElectromenager.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonElectromenagerMouseClicked(evt);
            }
        });

        jButtonJardin.setBackground(new java.awt.Color(153, 153, 153));
        jButtonJardin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonJardin.setText("Jardin & Plein Air");
        jButtonJardin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonJardinMouseClicked(evt);
            }
        });

        jButtonVetement.setBackground(new java.awt.Color(153, 153, 153));
        jButtonVetement.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonVetement.setText("Vêtements");
        jButtonVetement.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonVetementMouseClicked(evt);
            }
        });

        jLabelExit.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabelExit.setForeground(new java.awt.Color(255, 255, 255));
        jLabelExit.setText("X");
        jLabelExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelExitMouseClicked(evt);
            }
        });

        jLabelMin.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabelMin.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMin.setText("-");
        jLabelMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinMouseClicked(evt);
            }
        });

        jLabelDeconnecter.setBackground(new java.awt.Color(255, 255, 255));
        jLabelDeconnecter.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelDeconnecter.setForeground(new java.awt.Color(0, 204, 204));
        jLabelDeconnecter.setText("| Déconnexion");
        jLabelDeconnecter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelDeconnecterMouseClicked(evt);
            }
        });

        jLabelAjoutClient.setBackground(new java.awt.Color(255, 255, 255));
        jLabelAjoutClient.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelAjoutClient.setForeground(new java.awt.Color(255, 102, 0));
        jLabelAjoutClient.setText("Ajouter un Client");
        jLabelAjoutClient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelAjoutClientMouseClicked(evt);
            }
        });

        jLabel3Connecter1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3Connecter1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3Connecter1.setForeground(new java.awt.Color(0, 204, 204));
        jLabel3Connecter1.setText("| Utilisateur");
        jLabel3Connecter1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3Connecter1MouseClicked(evt);
            }
        });

        jButtonSante.setBackground(new java.awt.Color(77, 77, 77));
        jButtonSante.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonSante.setText("Santé & Beauté");
        jButtonSante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSanteMouseClicked(evt);
            }
        });

        jLabelStockClients.setBackground(new java.awt.Color(255, 255, 255));
        jLabelStockClients.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelStockClients.setForeground(new java.awt.Color(255, 102, 0));
        jLabelStockClients.setText("STOCK & Clients |");
        jLabelStockClients.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelStockClientsMouseClicked(evt);
            }
        });

        jLabelMenu.setBackground(new java.awt.Color(255, 255, 255));
        jLabelMenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelMenu.setForeground(new java.awt.Color(255, 102, 0));
        jLabelMenu.setText("Menu |");
        jLabelMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMenuMouseClicked(evt);
            }
        });

        jLabelAjoutProduit1.setBackground(new java.awt.Color(255, 255, 255));
        jLabelAjoutProduit1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelAjoutProduit1.setForeground(new java.awt.Color(255, 102, 0));
        jLabelAjoutProduit1.setText("Ajouter un Produit |");
        jLabelAjoutProduit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelAjoutProduit1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonVetement, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonSante, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonElectromenager, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                            .addComponent(jButtonSuperette, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonMaison, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                            .addComponent(jButtonJardin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel3Connecter1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                        .addComponent(jLabelMenu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelStockClients)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelAjoutProduit1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelAjoutClient, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelDeconnecter, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(74, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelMin, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelExit, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelExit)
                    .addComponent(jLabelMin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDeconnecter)
                    .addComponent(jLabelAjoutClient)
                    .addComponent(jLabel3Connecter1)
                    .addComponent(jLabelStockClients)
                    .addComponent(jLabelMenu)
                    .addComponent(jLabelAjoutProduit1))
                .addGap(109, 109, 109)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButtonSuperette, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonVetement, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                    .addComponent(jButtonMaison, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonElectromenager, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                    .addComponent(jButtonJardin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonSante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelExitMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabelExitMouseClicked

    private void jLabelMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMinMouseClicked

    private void jLabelDeconnecterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelDeconnecterMouseClicked
        // TODO add your handling code here:
        Connecter con=new Connecter();
        con.setVisible(true);
        con.pack();
        con.setLocationRelativeTo(null);
        con.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabelDeconnecterMouseClicked

    private void jLabelAjoutClientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAjoutClientMouseClicked
        // TODO add your handling code here:
        AjoutClient cl=new AjoutClient();
        cl.setVisible(true);
        setVisible(false);
        this.dispose();
              
    }//GEN-LAST:event_jLabelAjoutClientMouseClicked

    private void jLabel3Connecter1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3Connecter1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3Connecter1MouseClicked

    private void jButtonMaisonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMaisonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonMaisonActionPerformed

    private void jLabelStockClientsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelStockClientsMouseClicked
        // TODO add your handling code here:
        ProduitsClients prodcl=new ProduitsClients();
        prodcl.setVisible(true);
        setVisible(false);
        this.dispose();
    }//GEN-LAST:event_jLabelStockClientsMouseClicked

    private void jLabelMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMenuMouseClicked
       Menu menu=new Menu();
        menu.setVisible(true);
        setVisible(false);
        this.dispose();
    }//GEN-LAST:event_jLabelMenuMouseClicked

    private void jLabelAjoutProduit1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAjoutProduit1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelAjoutProduit1MouseClicked

    private void jButtonVetementMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonVetementMouseClicked
        vetements vet=new vetements();
        vet.setVisible(true);
        setVisible(false);
        this.dispose();
    }//GEN-LAST:event_jButtonVetementMouseClicked

    private void jButtonSuperetteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSuperetteMouseClicked
        Superette sup=new Superette();
        sup.setVisible(true);
        setVisible(false);
        this.dispose();
    }//GEN-LAST:event_jButtonSuperetteMouseClicked

    private void jButtonMaisonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonMaisonMouseClicked
        MaisonBureau MB=new MaisonBureau();
        MB.setVisible(true);
        setVisible(false);
        this.dispose();
    }//GEN-LAST:event_jButtonMaisonMouseClicked

    private void jButtonSanteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSanteMouseClicked
        SanteBeaute SB=new SanteBeaute();
        SB.setVisible(true);
        setVisible(false);
        this.dispose();
    }//GEN-LAST:event_jButtonSanteMouseClicked

    private void jButtonElectromenagerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonElectromenagerMouseClicked
        Electromenager el=new Electromenager();
        el.setVisible(true);
        setVisible(false);
        this.dispose();
    }//GEN-LAST:event_jButtonElectromenagerMouseClicked

    private void jButtonJardinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonJardinMouseClicked
        JardinPleinAir JP=new JardinPleinAir();
        JP.setVisible(true);
        setVisible(false);
        this.dispose();
    }//GEN-LAST:event_jButtonJardinMouseClicked

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonElectromenager;
    private javax.swing.JButton jButtonJardin;
    private javax.swing.JButton jButtonMaison;
    private javax.swing.JButton jButtonSante;
    private javax.swing.JButton jButtonSuperette;
    private javax.swing.JButton jButtonVetement;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel3Connecter1;
    private javax.swing.JLabel jLabelAjoutClient;
    private javax.swing.JLabel jLabelAjoutProduit1;
    private javax.swing.JLabel jLabelDeconnecter;
    private javax.swing.JLabel jLabelExit;
    private javax.swing.JLabel jLabelMenu;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JLabel jLabelStockClients;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
