
public class frmCamp extends javax.swing.JFrame {
    public static Character player;
    public frmCamp() {
        initComponents();
        setLocationRelativeTo(null);
        lblPrint(player);
        
    }
    
    public void lblPrint(Character character){
        lblPlayerName.setText("Name:"+player.getName());
        
        lblPlayerHP.setText("HP:"+player.getHealth());

        lblPlayerMP.setText("MP:"+player.getMana());

        lblPlayerJOB.setText("Job:"+player.getJobName());

        lblPlayerWN.setText("Weapon Name:"+player.getItem().name);
        
        lblPlayerWT.setText("Weapon Type:"+player.getItem().Type);

        lblPlayerDMG.setText("Damage:"+player.getDamage());
        
        lblPlayerLVL.setText("Level:"+player.getLevel());
        
        lblPlayerGLD.setText("Gold:"+ player.getGold());
        
        lblPlayerARM.setText("Armor:"+player.getArmor());
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPlayerName = new javax.swing.JLabel();
        lblPlayerHP = new javax.swing.JLabel();
        lblPlayerMP = new javax.swing.JLabel();
        lblPlayerJOB = new javax.swing.JLabel();
        lblPlayerWN = new javax.swing.JLabel();
        lblPlayerWT = new javax.swing.JLabel();
        lblPlayerDMG = new javax.swing.JLabel();
        lblPlayerARM = new javax.swing.JLabel();
        lblPlayerLVL = new javax.swing.JLabel();
        lblPlayerGLD = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnStore = new javax.swing.JButton();
        btnDungeon = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblPlayerName.setText("Name:");

        lblPlayerHP.setText("HP:");

        lblPlayerMP.setText("MP");

        lblPlayerJOB.setText("Job:");

        lblPlayerWN.setText("Weapon Name:");

        lblPlayerWT.setText("Weapon Type:");

        lblPlayerDMG.setText("Damage: ");

        lblPlayerARM.setText("Armor");

        lblPlayerLVL.setText("Level:");

        lblPlayerGLD.setText("Gold:");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText(" o    ");

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel2.setText("/|\\");

            jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
            jLabel3.setText("/ \\");

                btnStore.setText("Store");
                btnStore.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        btnStoreActionPerformed(evt);
                    }
                });

                btnDungeon.setText("Dungeon");
                btnDungeon.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        btnDungeonActionPerformed(evt);
                    }
                });

                jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
                jLabel4.setText("Made by Hişar");

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(btnStore)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 185, Short.MAX_VALUE)
                        .addComponent(btnDungeon)
                        .addGap(192, 192, 192))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblPlayerGLD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPlayerWN, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(lblPlayerWT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPlayerDMG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPlayerARM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPlayerLVL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPlayerJOB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPlayerMP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPlayerHP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPlayerName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                layout.setVerticalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(lblPlayerName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPlayerHP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPlayerMP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblPlayerJOB)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblPlayerWN)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblPlayerWT)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblPlayerDMG)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblPlayerARM)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblPlayerLVL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblPlayerGLD)))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnStore)
                            .addComponent(btnDungeon))
                        .addContainerGap(73, Short.MAX_VALUE))
                );

                pack();
            }// </editor-fold>//GEN-END:initComponents

    private void btnStoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStoreActionPerformed
        frmStore.Run(player);
        this.dispose();
    }//GEN-LAST:event_btnStoreActionPerformed

    private void btnDungeonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDungeonActionPerformed
        frmDungeon.Run(player);
        this.dispose();
    }//GEN-LAST:event_btnDungeonActionPerformed

    
   
    public static void Run(Character character){
        player = character;
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
            java.util.logging.Logger.getLogger(frmCamp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCamp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCamp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCamp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCamp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDungeon;
    private javax.swing.JButton btnStore;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblPlayerARM;
    private javax.swing.JLabel lblPlayerDMG;
    private javax.swing.JLabel lblPlayerGLD;
    private javax.swing.JLabel lblPlayerHP;
    private javax.swing.JLabel lblPlayerJOB;
    private javax.swing.JLabel lblPlayerLVL;
    private javax.swing.JLabel lblPlayerMP;
    private javax.swing.JLabel lblPlayerName;
    private javax.swing.JLabel lblPlayerWN;
    private javax.swing.JLabel lblPlayerWT;
    // End of variables declaration//GEN-END:variables
}
