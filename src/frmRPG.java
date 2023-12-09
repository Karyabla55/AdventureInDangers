


public class frmRPG extends javax.swing.JFrame {
    Items itemB = new Bows(0);
    Items itemSw = new Swords(0);
    Items itemSt = new Staffs(0);
    Items itemG = new Gloves(0);
    
    Skills SkillA = new ArcherSkills(itemB,0);
    Skills SkillS = new SwordmanSkills(itemSw,0);
    Skills SkillMr = new MartialArtistSkills(itemG,0);
    Skills SkillMa = new MageSkills(itemSt,0);
    
    
    
    Jobs archer = new Archer(itemB,0,SkillA);
    Jobs swordsman = new Swordsman(itemSw,0,SkillS);
    Jobs mage = new Mage(itemSt,0,SkillMa);
    Jobs martialArtis = new MartialArtist(itemG,0,SkillMr);

    public frmRPG() {
        initComponents();
        setLocationRelativeTo(null);
        setLbls();
    }
    
    public void setLbls(){
        //Archer lbls
        lblArcherHP.setText("Sağlık Puanı:"+archer.health);

        lblArcherMP.setText("Mana Puanı:"+archer.mana);

        lblArcherWT.setText("Silah Tipi:"+archer.item.Type);

        lblArcherGold.setText("Altın miktarı:"+archer.gold);

        lblArcherArmor.setText("Armor: "+archer.armor);
        
        //Mage lbls
        
        lblMageHP.setText("Sağlık Puanı:"+mage.health);

        lblMageMP.setText("Mana Puanı:"+mage.mana);

        lblMageWT.setText("Silah Tipi:"+mage.item.Type);

        lblMageGold.setText("Altın miktarı:"+mage.gold);

        lblMageArmor.setText("Armor: "+mage.armor);
        
        //Martial Artist lbls
        
        lblMartialArtistHP.setText("Sağlık Puanı:"+martialArtis.health);

        lblMartialArtistMP.setText("Mana Puanı:"+martialArtis.mana);

        lblMartialArtistWT.setText("Silah Tipi:"+martialArtis.item.Type);

        lblMartialArtistGold.setText("Altın miktarı:"+martialArtis.gold);

        lblMartialArtistArmor.setText("Armor: "+martialArtis.armor);
        
        //Swordsman lbls
        lblSwordsmanHP.setText("Sağlık Puanı:"+swordsman.health);

        lblSwordsmanMP.setText("Mana Puanı:"+swordsman.mana);

        lblSwordsmanWT.setText("Silah Tipi:"+swordsman.item.Type);

        lblSwordsmanGold.setText("Altın miktarı:"+swordsman.gold);

        lblSwordsmanArmor.setText("Armor: "+swordsman.armor);
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCharacterName = new javax.swing.JLabel();
        txtCharacterName = new javax.swing.JTextField();
        btnArcher = new javax.swing.JButton();
        btnMage = new javax.swing.JButton();
        btnMartialArtist = new javax.swing.JButton();
        btnSwordsman = new javax.swing.JButton();
        lblMageHP = new javax.swing.JLabel();
        lblMageMP = new javax.swing.JLabel();
        lblMageWT = new javax.swing.JLabel();
        lblMageGold = new javax.swing.JLabel();
        lblMageArmor = new javax.swing.JLabel();
        lblArcherHP = new javax.swing.JLabel();
        lblArcherMP = new javax.swing.JLabel();
        lblArcherWT = new javax.swing.JLabel();
        lblArcherGold = new javax.swing.JLabel();
        lblArcherArmor = new javax.swing.JLabel();
        lblMartialArtistHP = new javax.swing.JLabel();
        lblMartialArtistMP = new javax.swing.JLabel();
        lblMartialArtistWT = new javax.swing.JLabel();
        lblMartialArtistGold = new javax.swing.JLabel();
        lblMartialArtistArmor = new javax.swing.JLabel();
        lblSwordsmanHP = new javax.swing.JLabel();
        lblSwordsmanMP = new javax.swing.JLabel();
        lblSwordsmanWT = new javax.swing.JLabel();
        lblSwordsmanGold = new javax.swing.JLabel();
        lblSwordsmanArmor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Adventure İn Dangers");
        setPreferredSize(new java.awt.Dimension(640, 380));

        lblCharacterName.setText("Karakter ismi");

        txtCharacterName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCharacterNameActionPerformed(evt);
            }
        });

        btnArcher.setText("Okçu");
        btnArcher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArcherActionPerformed(evt);
            }
        });

        btnMage.setText("Büyücü");
        btnMage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMageActionPerformed(evt);
            }
        });

        btnMartialArtist.setText("Dövüş Sanatçısı");
        btnMartialArtist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMartialArtistActionPerformed(evt);
            }
        });

        btnSwordsman.setText("Kılıç Ustası");
        btnSwordsman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSwordsmanActionPerformed(evt);
            }
        });

        lblMageHP.setText("Sağlık Puanı:");

        lblMageMP.setText("Mana Puanı:");

        lblMageWT.setText("Silah Tipi:");

        lblMageGold.setText("Altın miktarı:");

        lblMageArmor.setText("Armor: ");

        lblArcherHP.setText("Sağlık Puanı:");

        lblArcherMP.setText("Mana Puanı:");

        lblArcherWT.setText("Silah Tipi:");

        lblArcherGold.setText("Altın miktarı:");

        lblArcherArmor.setText("Armor: ");

        lblMartialArtistHP.setText("Sağlık Puanı:");

        lblMartialArtistMP.setText("Mana Puanı:");

        lblMartialArtistWT.setText("Silah Tipi:");

        lblMartialArtistGold.setText("Altın miktarı:");

        lblMartialArtistArmor.setText("Armor: ");

        lblSwordsmanHP.setText("Sağlık Puanı:");

        lblSwordsmanMP.setText("Mana Puanı:");

        lblSwordsmanWT.setText("Silah Tipi:");

        lblSwordsmanGold.setText("Altın miktarı:");

        lblSwordsmanArmor.setText("Armor: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(lblCharacterName)
                        .addGap(18, 18, 18)
                        .addComponent(txtCharacterName, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnArcher)
                                .addGap(90, 90, 90)
                                .addComponent(btnMage))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblArcherMP, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(lblArcherWT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblArcherHP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblArcherGold, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblArcherArmor, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblMageMP, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(lblMageWT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblMageHP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblMageGold, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblMageArmor, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblMartialArtistMP, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblMartialArtistWT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblMartialArtistHP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblMartialArtistGold, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblMartialArtistArmor, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnMartialArtist))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSwordsman)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblSwordsmanMP, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblSwordsmanWT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblSwordsmanHP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblSwordsmanGold, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblSwordsmanArmor, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCharacterName)
                    .addComponent(txtCharacterName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnArcher)
                    .addComponent(btnMage)
                    .addComponent(btnMartialArtist)
                    .addComponent(btnSwordsman))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblMageHP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMageMP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMageWT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMageGold)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMageArmor))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblArcherHP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblArcherMP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblArcherWT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblArcherGold)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblArcherArmor))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblMartialArtistHP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMartialArtistMP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMartialArtistWT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMartialArtistGold)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMartialArtistArmor))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSwordsmanHP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSwordsmanMP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSwordsmanWT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSwordsmanGold)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSwordsmanArmor)))
                .addContainerGap(114, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCharacterNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCharacterNameActionPerformed
        
    }//GEN-LAST:event_txtCharacterNameActionPerformed

    private void btnMageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMageActionPerformed
        Character player = new Player(txtCharacterName.getText(),mage);
        System.out.println("Work");
        frmCamp.Run(player);
        this.dispose();
        
    }//GEN-LAST:event_btnMageActionPerformed

    private void btnMartialArtistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMartialArtistActionPerformed
        Character player = new Player(txtCharacterName.getText(),martialArtis);
        System.out.println("Work");
        frmCamp.Run(player);
        this.dispose();
    }//GEN-LAST:event_btnMartialArtistActionPerformed

    private void btnArcherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArcherActionPerformed
        Character player = new Player(txtCharacterName.getText(),archer);
        System.out.println("Work");
        frmCamp.Run(player);
        System.out.println(player.getItem().Type);
        this.dispose();
    }//GEN-LAST:event_btnArcherActionPerformed

    private void btnSwordsmanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSwordsmanActionPerformed
        Character player = new Player(txtCharacterName.getText(),swordsman);
        System.out.println("Work");
        frmCamp.Run(player);
        this.dispose();
    }//GEN-LAST:event_btnSwordsmanActionPerformed

    public static void Run(){
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
            java.util.logging.Logger.getLogger(frmRPG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRPG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRPG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRPG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmRPG().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnArcher;
    private javax.swing.JButton btnMage;
    private javax.swing.JButton btnMartialArtist;
    private javax.swing.JButton btnSwordsman;
    private javax.swing.JLabel lblArcherArmor;
    private javax.swing.JLabel lblArcherGold;
    private javax.swing.JLabel lblArcherHP;
    private javax.swing.JLabel lblArcherMP;
    private javax.swing.JLabel lblArcherWT;
    private javax.swing.JLabel lblCharacterName;
    private javax.swing.JLabel lblMageArmor;
    private javax.swing.JLabel lblMageGold;
    private javax.swing.JLabel lblMageHP;
    private javax.swing.JLabel lblMageMP;
    private javax.swing.JLabel lblMageWT;
    private javax.swing.JLabel lblMartialArtistArmor;
    private javax.swing.JLabel lblMartialArtistGold;
    private javax.swing.JLabel lblMartialArtistHP;
    private javax.swing.JLabel lblMartialArtistMP;
    private javax.swing.JLabel lblMartialArtistWT;
    private javax.swing.JLabel lblSwordsmanArmor;
    private javax.swing.JLabel lblSwordsmanGold;
    private javax.swing.JLabel lblSwordsmanHP;
    private javax.swing.JLabel lblSwordsmanMP;
    private javax.swing.JLabel lblSwordsmanWT;
    private javax.swing.JTextField txtCharacterName;
    // End of variables declaration//GEN-END:variables
}
