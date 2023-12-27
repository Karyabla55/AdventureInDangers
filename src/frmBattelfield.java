
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;




public class frmBattelfield extends javax.swing.JFrame {
    static Character player;
    static Character enemy;
    static Battlefield battlefield;
    private BufferedImage backgroundImage;
    public frmBattelfield() {
        setBackground();
        initComponents();
        setLocationRelativeTo(null);
        
        
    }
    
    
    
    
    private void setBackground(){
        try {
            switch (player.getJobName()) {
                case "Archer":
                    backgroundImage = ImageIO.read(new File("./src/Images/DungeonArcher.jpg"));
                    break;
                case "Swordsman":
                    backgroundImage = ImageIO.read(new File("./src/Images/DungeonSwordsman.jpg"));
                    break; 
                case "Mage":
                    backgroundImage = ImageIO.read(new File("./src/Images/BattlefieldMage.jpg"));
                    break;
                case "Martial Artist":
                    backgroundImage = ImageIO.read(new File("./src/Images/DungeonMartialArtist.jpg"));
                    break;
                default:
                    throw new AssertionError();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        JPanel contentPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(backgroundImage, 0, 0, getWidth(),getHeight(), this);
            }
        };
        contentPanel.setLayout(null);
        setContentPane(contentPanel);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        btnUseSkill = new javax.swing.JButton();
        btnAttack = new javax.swing.JButton();
        btnRunAway = new javax.swing.JButton();
        prgbPlayerHealth = new javax.swing.JProgressBar();
        prgbPlayerMana = new javax.swing.JProgressBar();
        prgbEnemyHealth = new javax.swing.JProgressBar();
        prgbEnemyMana = new javax.swing.JProgressBar();
        lblPlayerHit = new javax.swing.JLabel();
        lblPlayerHit1 = new javax.swing.JLabel();
        lblPlayerHit2 = new javax.swing.JLabel();
        lblActionEvents = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnUseSkill.setText("Use Skill");
        btnUseSkill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUseSkillActionPerformed(evt);
            }
        });

        btnAttack.setText("Attack");
        btnAttack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAttackActionPerformed(evt);
            }
        });

        btnRunAway.setText("Run away");
        btnRunAway.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRunAwayActionPerformed(evt);
            }
        });

        prgbPlayerHealth.setForeground(new java.awt.Color(153, 0, 51));
        prgbPlayerHealth.setMaximum((int)player.getHealth());

        prgbPlayerMana.setForeground(new java.awt.Color(0, 51, 255));

        prgbEnemyHealth.setForeground(new java.awt.Color(204, 0, 51));

        prgbEnemyMana.setForeground(new java.awt.Color(204, 0, 51));

        lblPlayerHit2.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        lblPlayerHit2.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnRunAway)
                        .addGap(66, 66, 66)
                        .addComponent(lblActionEvents, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnUseSkill)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnAttack)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(prgbPlayerMana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(prgbPlayerHealth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblPlayerHit2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 183, Short.MAX_VALUE)
                                .addComponent(lblPlayerHit1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblPlayerHit, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(prgbEnemyHealth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(prgbEnemyMana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(prgbPlayerHealth, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPlayerHit2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addComponent(prgbPlayerMana, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(prgbEnemyHealth, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(prgbEnemyMana, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(lblPlayerHit1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(lblPlayerHit)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 219, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUseSkill))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAttack)
                    .addComponent(btnRunAway)
                    .addComponent(lblActionEvents))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUseSkillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUseSkillActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUseSkillActionPerformed

    private void btnAttackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAttackActionPerformed
        enemy=battlefield.playerAttack();
        lblActionEvents.setText("Düşmana "+player.getDamage()+" vurdunuz");
        player= battlefield.enemyBattle();
        prgbPlayerHealth.setValue((int)player.getHealth());
        prgbEnemyHealth.setValue((int)enemy.getHealth());
    }//GEN-LAST:event_btnAttackActionPerformed

    private void btnRunAwayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRunAwayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRunAwayActionPerformed

    
    public static void Run(Character Player,Character Enemy) {
        player = Player;
        enemy = Enemy;
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
            java.util.logging.Logger.getLogger(frmBattelfield.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmBattelfield.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmBattelfield.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmBattelfield.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                System.out.println("work");
                battlefield = new Battlefield(player, enemy);
                
                new frmBattelfield().setVisible(true);
                System.out.println("Work-2");
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAttack;
    private javax.swing.JButton btnRunAway;
    private javax.swing.JButton btnUseSkill;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel lblActionEvents;
    private javax.swing.JLabel lblPlayerHit;
    private javax.swing.JLabel lblPlayerHit1;
    private javax.swing.JLabel lblPlayerHit2;
    private javax.swing.JProgressBar prgbEnemyHealth;
    private javax.swing.JProgressBar prgbEnemyMana;
    private javax.swing.JProgressBar prgbPlayerHealth;
    private javax.swing.JProgressBar prgbPlayerMana;
    // End of variables declaration//GEN-END:variables
}
