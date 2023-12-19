
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.JPanel;


public class frmSkillStore extends javax.swing.JFrame {
    private BufferedImage backgroundImage;
    static Character player;
    DefaultListModel skill = new DefaultListModel();
    DefaultListModel playerSkill = new DefaultListModel();
    Skills[] skills = new Skills[4]; //array list yapılacak
    /**
     * Creates new form frmSkillStore
     */
    public frmSkillStore() {
        setBackground();
        initComponents();
        setLocationRelativeTo(null);
        lstSelllingSkills.setModel(skill);
        lstPlayerSkills.setModel(playerSkill);
        setPlayerSkillList();
        setSellingSkillList();
        
    }
    
    private void setPlayerSkillList(){  
       for(Skills pSkill : player.skills){
           playerSkill.addElement(pSkill.name);
       }
    }
    
    private void setSellingSkillList(){
        skills[0] = new ArcherSkills(player.getItem(), 0);
        skills[1] = new ArcherSkills(player.getItem(), 1);
        skills[2] = new ArcherSkills(player.getItem(), 2);
        skills[3] = new ArcherSkills(player.getItem(), 3);
        
        for(Skills sSkills : skills){
           skill.addElement(sSkills.name);
        }
    }
    
    private void setBackground(){
        try {
            backgroundImage = ImageIO.read(new File("./src/Images/SkillStoreBackground.jpg"));
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCamp = new javax.swing.JButton();
        btnWeaponStore = new javax.swing.JButton();
        btnBuy = new javax.swing.JButton();
        btnSell = new javax.swing.JButton();
        lblSkillName = new javax.swing.JLabel();
        lblSkillDamage = new javax.swing.JLabel();
        lblSkillPrice = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstPlayerSkills = new javax.swing.JList<>();
        lblPlayerSkillPrice = new javax.swing.JLabel();
        lblPlayerSkillName = new javax.swing.JLabel();
        lblPlayerSkillDamage = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstSelllingSkills = new javax.swing.JList<>();
        btnShowSkills = new javax.swing.JButton();
        lblSkillType = new javax.swing.JLabel();
        lblPlayerSkillType = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(640, 380));

        btnCamp.setText("Camp");
        btnCamp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCampActionPerformed(evt);
            }
        });

        btnWeaponStore.setText("Weapons");
        btnWeaponStore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWeaponStoreActionPerformed(evt);
            }
        });

        btnBuy.setBackground(new java.awt.Color(102, 0, 0));
        btnBuy.setForeground(new java.awt.Color(204, 0, 51));
        btnBuy.setText("Buy ");
        btnBuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuyActionPerformed(evt);
            }
        });

        btnSell.setText("Sell ");
        btnSell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSellActionPerformed(evt);
            }
        });

        lblSkillName.setForeground(new java.awt.Color(255, 255, 255));
        lblSkillName.setText("Skill Name");

        lblSkillDamage.setForeground(new java.awt.Color(255, 255, 255));
        lblSkillDamage.setText("Skill Damage");

        lblSkillPrice.setForeground(new java.awt.Color(255, 255, 255));
        lblSkillPrice.setText("Skill Price");

        lstPlayerSkills.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lstPlayerSkills);

        lblPlayerSkillPrice.setForeground(new java.awt.Color(255, 255, 255));
        lblPlayerSkillPrice.setText("Skill Price:");

        lblPlayerSkillName.setForeground(new java.awt.Color(255, 255, 255));
        lblPlayerSkillName.setText("Skill Name:");

        lblPlayerSkillDamage.setForeground(new java.awt.Color(255, 255, 255));
        lblPlayerSkillDamage.setText("Skill Damage:");

        lstSelllingSkills.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(lstSelllingSkills);

        btnShowSkills.setText("Show");
        btnShowSkills.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowSkillsActionPerformed(evt);
            }
        });

        lblSkillType.setForeground(new java.awt.Color(255, 255, 255));
        lblSkillType.setText("Skill Type:");

        lblPlayerSkillType.setForeground(new java.awt.Color(255, 255, 255));
        lblPlayerSkillType.setText("Skill Type:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(btnWeaponStore)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCamp)
                .addGap(55, 55, 55))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuy)
                    .addComponent(btnSell)
                    .addComponent(btnShowSkills))
                .addContainerGap(9, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblPlayerSkillPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPlayerSkillDamage, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(lblPlayerSkillName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPlayerSkillType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSkillType, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblSkillName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblSkillDamage, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                    .addComponent(lblSkillPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(btnBuy)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnSell)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnShowSkills))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblSkillName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSkillDamage)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lblPlayerSkillType)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblPlayerSkillPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblSkillType)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblSkillPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblPlayerSkillName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPlayerSkillDamage)
                        .addGap(50, 50, 50)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCamp)
                    .addComponent(btnWeaponStore))
                .addGap(55, 55, 55))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /*    */
    private void btnCampActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCampActionPerformed
        frmCamp.Run(player);
        this.dispose();
    }//GEN-LAST:event_btnCampActionPerformed

    private void btnBuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuyActionPerformed

    private void btnWeaponStoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWeaponStoreActionPerformed
        frmStore.Run(player);
        this.dispose();
    }//GEN-LAST:event_btnWeaponStoreActionPerformed

    private void btnSellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSellActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSellActionPerformed

    private void btnShowSkillsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowSkillsActionPerformed
        int sellingIndex = lstSelllingSkills.getSelectedIndex();
        int playerIndex = lstPlayerSkills.getSelectedIndex();
        
        if (sellingIndex != -1 && sellingIndex < skills.length) {
            lblSkillName.setText("Skill Name:"+skills[sellingIndex].name);
            lblSkillDamage.setText("Skill Damage:"+Double.toString(skills[sellingIndex].damage) );
            lblSkillType.setText("Skill Type:"+skills[sellingIndex].type);
            lblSkillPrice.setText("Skill Price:"+skills[sellingIndex].price);
        }
        if(playerIndex != -1 && playerIndex < player.skills.length){
            lblPlayerSkillName.setText("Skill Name:"+player.skills[playerIndex].name);
            lblPlayerSkillDamage.setText("Skill Damage:"+Double.toString(player.skills[playerIndex].damage) );
            lblPlayerSkillType.setText("Skill Type:"+player.skills[playerIndex].type);
            lblPlayerSkillPrice.setText("Skill Price:"+player.skills[playerIndex].price);
        }

    }//GEN-LAST:event_btnShowSkillsActionPerformed

   
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
            java.util.logging.Logger.getLogger(frmSkillStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmSkillStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmSkillStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmSkillStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmSkillStore().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuy;
    private javax.swing.JButton btnCamp;
    private javax.swing.JButton btnSell;
    private javax.swing.JButton btnShowSkills;
    private javax.swing.JButton btnWeaponStore;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblPlayerSkillDamage;
    private javax.swing.JLabel lblPlayerSkillName;
    private javax.swing.JLabel lblPlayerSkillPrice;
    private javax.swing.JLabel lblPlayerSkillType;
    private javax.swing.JLabel lblSkillDamage;
    private javax.swing.JLabel lblSkillName;
    private javax.swing.JLabel lblSkillPrice;
    private javax.swing.JLabel lblSkillType;
    private javax.swing.JList<String> lstPlayerSkills;
    private javax.swing.JList<String> lstSelllingSkills;
    // End of variables declaration//GEN-END:variables
}
