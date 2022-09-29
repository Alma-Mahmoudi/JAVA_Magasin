/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package magasin;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import java.sql.*;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author asus
 */
public class AjoutProduit extends javax.swing.JFrame {

    Connection con;
    PreparedStatement ps;
    ResultSet rs;
 
    public AjoutProduit() {
        initComponents();
        //connectSQL();
        Table();
        Toolkit toolkit = getToolkit();
        Dimension size= toolkit.getScreenSize();
        setLocation(size.width/2-getWidth()/2, size.height/2 -getHeight()/2);
    }   
    public void connectSQL(){
        try {
             Class.forName("com.mysql.jdbc.Driver");
             con= DriverManager.getConnection("jdbc:mysql://localhost:3306/magasin","root","");
            // JOptionPane.showMessageDialog(null,"Connection reussie");    
        } catch(Exception e){
            e.printStackTrace();
        }
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
        jLabelExit = new javax.swing.JLabel();
        jLabelMin = new javax.swing.JLabel();
        jLabelDeconnecter = new javax.swing.JLabel();
        jLabel3Connecter1 = new javax.swing.JLabel();
        jLabelMenu = new javax.swing.JLabel();
        jLabelAjoutProduit = new javax.swing.JLabel();
        jLabelStockClients = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cat = new javax.swing.JComboBox<>();
        nomp = new javax.swing.JTextField();
        prix = new javax.swing.JTextField();
        date = new javax.swing.JTextField();
        etage = new javax.swing.JComboBox<>();
        rechercheId = new javax.swing.JTextField();
        nondispo = new javax.swing.JCheckBox();
        stock = new javax.swing.JCheckBox();
        cmd = new javax.swing.JCheckBox();
        jButtonAjouter = new javax.swing.JButton();
        jButtonSupprimer = new javax.swing.JButton();
        jButtonModifier = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButtonRecherche = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabelAjoutClient = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(77, 77, 77));

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

        jLabel3Connecter1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3Connecter1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3Connecter1.setForeground(new java.awt.Color(0, 204, 204));
        jLabel3Connecter1.setText("| Utilisateur");
        jLabel3Connecter1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3Connecter1MouseClicked(evt);
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

        jLabelAjoutProduit.setBackground(new java.awt.Color(255, 255, 255));
        jLabelAjoutProduit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelAjoutProduit.setForeground(new java.awt.Color(255, 102, 0));
        jLabelAjoutProduit.setText("Ajouter un Produit |");
        jLabelAjoutProduit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelAjoutProduitMouseClicked(evt);
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

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Produit");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Etage:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Catégorie:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Date:");

        cat.setBackground(new java.awt.Color(108, 122, 137));
        cat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Electromenager", "Sante ", "Beaute", "Maisn ", "Bureau", "Jardin ", "Plein Air", "Vetements", "Superette", "Autres" }));
        cat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catActionPerformed(evt);
            }
        });

        nomp.setBackground(new java.awt.Color(108, 122, 137));

        prix.setBackground(new java.awt.Color(108, 122, 137));

        date.setBackground(new java.awt.Color(108, 122, 137));

        etage.setBackground(new java.awt.Color(108, 122, 137));
        etage.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Etage 1", "Etage 2", "Etage 3", "Etage 4", "Etage 5", "Etage 6" }));
        etage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etageActionPerformed(evt);
            }
        });

        rechercheId.setBackground(new java.awt.Color(108, 122, 137));

        nondispo.setBackground(new java.awt.Color(255, 255, 255));
        nondispo.setText("Non Disponible");
        nondispo.setOpaque(false);

        stock.setBackground(new java.awt.Color(255, 255, 255));
        stock.setText("En Stock");
        stock.setOpaque(false);

        cmd.setBackground(new java.awt.Color(255, 255, 255));
        cmd.setText("Sur Commande");
        cmd.setOpaque(false);

        jButtonAjouter.setText("Ajouter");
        jButtonAjouter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonAjouterMouseClicked(evt);
            }
        });

        jButtonSupprimer.setText("Supprimer");
        jButtonSupprimer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSupprimerMouseClicked(evt);
            }
        });

        jButtonModifier.setText("Modifier");
        jButtonModifier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonModifierMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Prix:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Nom:");

        jButtonRecherche.setText("Recherche");
        jButtonRecherche.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonRechercheMouseClicked(evt);
            }
        });
        jButtonRecherche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRechercheActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(rechercheId)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonRecherche, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jButtonAjouter, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(etage, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cat, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(nomp)
                                        .addComponent(prix)
                                        .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cmd)
                                            .addComponent(nondispo)
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(jButtonModifier, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(stock, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(jButtonSupprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(21, 21, 21))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(17, 17, 17)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(etage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(14, 14, 14)
                .addComponent(stock, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmd, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nondispo, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonModifier)
                    .addComponent(jButtonSupprimer)
                    .addComponent(jButtonAjouter))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRecherche, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rechercheId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable2.setShowGrid(true);
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable2MouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jLabelAjoutClient.setBackground(new java.awt.Color(255, 255, 255));
        jLabelAjoutClient.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelAjoutClient.setForeground(new java.awt.Color(255, 102, 0));
        jLabelAjoutClient.setText("Ajouter un Client");
        jLabelAjoutClient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelAjoutClientMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelMin, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLabelExit, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel3Connecter1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelMenu)
                        .addGap(1, 1, 1)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabelStockClients)
                        .addGap(2, 2, 2)
                        .addComponent(jLabelAjoutProduit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelAjoutClient)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelDeconnecter, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
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
                    .addComponent(jLabel3Connecter1)
                    .addComponent(jLabelAjoutProduit)
                    .addComponent(jLabelStockClients)
                    .addComponent(jLabelMenu)
                    .addComponent(jLabelAjoutClient))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addGap(8, 8, 8))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 910, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void jLabel3Connecter1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3Connecter1MouseClicked
       Menu menu=new Menu();
        menu.setVisible(true);
        setVisible(false);
        this.dispose();
    }//GEN-LAST:event_jLabel3Connecter1MouseClicked

    private void jLabelMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMenuMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelMenuMouseClicked

    private void jLabelAjoutProduitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAjoutProduitMouseClicked
        // TODO add your handling code here:
        AjoutProduit prod=new AjoutProduit();
        prod.setVisible(true);
        setVisible(false);
        this.dispose();

    }//GEN-LAST:event_jLabelAjoutProduitMouseClicked

    private void jLabelStockClientsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelStockClientsMouseClicked
        // TODO add your handling code here:
        ProduitsClients prodcl=new ProduitsClients();
        prodcl.setVisible(true);
        setVisible(false);
        this.dispose();
    }//GEN-LAST:event_jLabelStockClientsMouseClicked

    private void catActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_catActionPerformed

    private void etageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_etageActionPerformed

    private void jButtonAjouterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAjouterMouseClicked
        try {
            ButtonGroup bg = new ButtonGroup();
            bg.add(stock);
            bg.add(cmd);
            bg.add(nondispo);
            
            connectSQL();
            String query="INSERT INTO `produits`(`Categorie`, `Etage`, `Nom`, `Prix`, `Date`, `Stock`) VALUES (?,?,?,?,?,?)";
            ps = con.prepareStatement(query);
            ps.setString(1, cat.getSelectedItem().toString());
            ps.setString(2, etage.getSelectedItem().toString());
            ps.setString(3, nomp.getText());
            ps.setString(4, prix.getText());
            ps.setString(5, date.getText());
            ps.setString(6, "En Stock");
            if( cmd.isSelected()){
                ps.setString(6, "Sur Commande");
            } 
            if( nondispo.isSelected()) {
                ps.setString(6, "Non Disponible");
            }
              
            if(ps.executeUpdate() > 0){
               JOptionPane.showMessageDialog(null,"Produit ajouté avec succès");
               Table();
               nomp.setText("");
               prix.setText("");
               date.setText("");
           }else {
                JOptionPane.showMessageDialog(null,"Error : Vérifier vos informations ");
            }                
        } catch(Exception e) {
            e.printStackTrace();              
        }
    }//GEN-LAST:event_jButtonAjouterMouseClicked

    private void jLabelAjoutClientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAjoutClientMouseClicked
        AjoutClient cl=new AjoutClient();
        cl.setVisible(true);
        setVisible(false);
        this.dispose();
    }//GEN-LAST:event_jLabelAjoutClientMouseClicked

    private void jButtonModifierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonModifierMouseClicked
        try {
            ButtonGroup bg = new ButtonGroup();
            bg.add(stock);
            bg.add(cmd);
            bg.add(nondispo);
            
            connectSQL();
            String query="UPDATE `produits` SET `Categorie`=?,`Etage`=?,`Nom`=?,`Prix`=?,`Date`=?,`Stock`=? WHERE idp=?";
            ps = con.prepareStatement(query);
            
             //update function
            DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
           int selectedIndex = jTable2.getSelectedRow();
            int id = Integer.parseInt(model.getValueAt(selectedIndex, 0).toString());
          
            ps.setString(1, cat.getSelectedItem().toString());
            ps.setString(2, etage.getSelectedItem().toString());
            ps.setString(3, nomp.getText());
            ps.setString(4, prix.getText());
            ps.setString(5, date.getText());
            if( stock.isSelected()){
               ps.setString(6, "En Stock");
            }
            if( cmd.isSelected()){
                ps.setString(6, "Sur Commande");
            } 
            if( nondispo.isSelected()) {
                ps.setString(6, "Non Disponible");
            }     
            ps.setInt(7,id);
     
            if(ps.executeUpdate() > 0){
               JOptionPane.showMessageDialog(null,"Produit modifié avec succès");
                Table();
           }else {
                JOptionPane.showMessageDialog(null,"Error : Vérifier vos informations ");
            }                
        } catch(Exception e) {
            e.printStackTrace();              
        }
    }//GEN-LAST:event_jButtonModifierMouseClicked

    private void jTable2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseReleased
        int j = jTable2.getSelectedRow();
        DefaultTableModel model=(DefaultTableModel) jTable2.getModel();
         int selectedIndex = jTable2.getSelectedRow();
        int idp = Integer.parseInt(model.getValueAt(selectedIndex, 0).toString());
     
        cat.setSelectedItem(model.getValueAt(j,1).toString());
        etage.setSelectedItem(model.getValueAt(j,2).toString());
        nomp.setText(model.getValueAt(j,3).toString());
        prix.setText(model.getValueAt(j,4).toString());
        date.setText(model.getValueAt(j,5).toString());
        
               
         if( model.getValueAt(j,6).equals("En Stock")){
                stock.setSelected(true);
                cmd.setSelected(false);
                nondispo.setSelected(false);
         } 
        else if( model.getValueAt(j,6).equals("Sur Commande")){
               stock.setSelected(false);
                cmd.setSelected(true);
                nondispo.setSelected(false);
         } 
         else if( model.getValueAt(j,6).equals("Non Disponible")) {
                stock.setSelected(false);
                cmd.setSelected(false);
                nondispo.setSelected(true);
         }       
    }//GEN-LAST:event_jTable2MouseReleased

    private void jButtonSupprimerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSupprimerMouseClicked
        try {
            connectSQL();
            String query="DELETE FROM `produits` WHERE idp=?";
            ps = con.prepareStatement(query);
   
            DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
            int selectedIndex = jTable2.getSelectedRow();
            int id = Integer.parseInt(model.getValueAt(selectedIndex, 0).toString());
           
            ps.setInt(1,id);          
      
            if(ps.executeUpdate() > 0){
               JOptionPane.showMessageDialog(null,"Produit supprimé avec succès");
               nomp.setText("");
               prix.setText("");
               date.setText("");
               Table();
           }else {
                JOptionPane.showMessageDialog(null,"Error : Vérifier vos informations ");
            }                
        } catch(Exception e) {
            e.printStackTrace();              
        }
        
    }//GEN-LAST:event_jButtonSupprimerMouseClicked

    private void jButtonRechercheMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRechercheMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonRechercheMouseClicked

    private void jButtonRechercheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRechercheActionPerformed
      try {    
        int idp = Integer.parseInt(rechercheId.getText().toString());
        connectSQL();
        String query="SELECT * FROM `produits` WHERE idp=?";
        ps = con.prepareStatement(query);
        ps.setInt(1,idp);
        ResultSet rs=ps.executeQuery(); 
        
        if(rs.next() ==true) {
           cat.setSelectedItem(rs.getString(2));
           etage.setSelectedItem(rs.getString(3));
           nomp.setText(rs.getString(4));
           prix.setText(rs.getString(5));
           date.setText(rs.getString(6));
          
           if( rs.getString(7).equals("En Stock")){
                stock.setSelected(true);
                cmd.setSelected(false);
                nondispo.setSelected(false);
            } 
           else if( rs.getString(7).equals("Sur Commande")){
                stock.setSelected(false);
                cmd.setSelected(true);
                nondispo.setSelected(false);
           } 
            else if(rs.getString(7).equals("Non Disponible")) {
                stock.setSelected(false);
                cmd.setSelected(false);
                nondispo.setSelected(true);
         }       
           
           
        }else
        {
            JOptionPane.showMessageDialog(null,"Aucun Résultat");
        }
        
       
      } catch(Exception e) {
            e.printStackTrace();              
       }
    }//GEN-LAST:event_jButtonRechercheActionPerformed
     
    public void Table() {
        String [] produit={"ID","Catégorie","Etage","Nom","Prix","Dtae","Stock"};
        String [] afficher= new String[8];
        DefaultTableModel model=new DefaultTableModel(null,produit);
        try {
            connectSQL();
            Statement st= con.createStatement();
            String query1="SELECT * FROM produits";
            rs = st.executeQuery(query1);
            
            while(rs.next()){
                
                afficher[0]=rs.getString("idp");
                afficher[1]=rs.getString("Categorie");
                afficher[2]=rs.getString("Etage");
                afficher[3]=rs.getString("Nom");
                afficher[4]=rs.getString("Prix");
                afficher[5]=rs.getString("Date");
                afficher[6]=rs.getString("Stock");
                
                model.addRow(afficher);
            }
            
            jTable2.setModel(model);
            con.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
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
            java.util.logging.Logger.getLogger(AjoutProduit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AjoutProduit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AjoutProduit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AjoutProduit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AjoutProduit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cat;
    private javax.swing.JCheckBox cmd;
    private javax.swing.JTextField date;
    private javax.swing.JComboBox<String> etage;
    private javax.swing.JButton jButtonAjouter;
    private javax.swing.JButton jButtonModifier;
    private javax.swing.JButton jButtonRecherche;
    private javax.swing.JButton jButtonSupprimer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel3Connecter1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelAjoutClient;
    private javax.swing.JLabel jLabelAjoutProduit;
    private javax.swing.JLabel jLabelDeconnecter;
    private javax.swing.JLabel jLabelExit;
    private javax.swing.JLabel jLabelMenu;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JLabel jLabelStockClients;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField nomp;
    private javax.swing.JCheckBox nondispo;
    private javax.swing.JTextField prix;
    private javax.swing.JTextField rechercheId;
    private javax.swing.JCheckBox stock;
    // End of variables declaration//GEN-END:variables
}
