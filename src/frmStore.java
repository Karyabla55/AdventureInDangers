
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.JPanel;
import java.util.ArrayList;



public class frmStore extends javax.swing.JFrame {
    private BufferedImage backgroundImage;
    DefaultListModel item = new DefaultListModel();
    ArrayList<Items> weapons = new ArrayList<>(); 
    
    public static Character player;
    public frmStore() {
        setBackground();
        initComponents();
        setLocationRelativeTo(null);
        lstSellingItems.setModel(item);
        setModel();
        setLbls();      
    }
    
    private void setLbls(){
        lblPlayerItemName.setText("Weapon Name: "+player.getItem().name);
        lblPlayerItemDMG.setText("Weapon Damage: "+Integer.toString(player.getItem().damage));
        lblPlayerItemType.setText("Weapon Type: "+player.getItem().Type);
        lblPlayerItemPrice.setText("Price: "+Integer.toString(player.getItem().price/2));
        
        lblPlayerGold.setText("Gold:" +Integer.toString(player.getGold()));
    }
    private void setModel(){
        weapons.add(new Bows(0));
        weapons.add(new Bows(1));
        weapons.add(new Bows(2));
        weapons.add(new Bows(3));
        
        weapons.add(new Swords(0));
        weapons.add(new Swords(1));
        weapons.add(new Swords(2));
        weapons.add(new Swords(3));
        
        weapons.add(new Gloves(0));
        weapons.add(new Gloves(1));
        weapons.add(new Gloves(2));
        weapons.add(new Gloves(3));

        weapons.add(new Staffs(0));
        weapons.add(new Staffs(1));
        weapons.add(new Staffs(2));
        weapons.add(new Staffs(3));

        
        
        for (Items weapon : weapons) {
            item.addElement(weapon.name);
        }
    }
    private void setBackground(){
        try {
            backgroundImage = ImageIO.read(new File("./src/Images/StoreBackground.jpg"));
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

        jScrollPane1 = new javax.swing.JScrollPane();
        lstSellingItems = new javax.swing.JList<>();
        btnBuy = new javax.swing.JButton();
        btnSell = new javax.swing.JButton();
        lblItemName = new javax.swing.JLabel();
        lblItemDMG = new javax.swing.JLabel();
        lblItemType = new javax.swing.JLabel();
        lblPlayerItemName = new javax.swing.JLabel();
        lblPlayerItemDMG = new javax.swing.JLabel();
        lblPlayerItemType = new javax.swing.JLabel();
        btnShow = new javax.swing.JButton();
        btnCamp = new javax.swing.JButton();
        lblPlayerItemPrice = new javax.swing.JLabel();
        lblItemPrice = new javax.swing.JLabel();
        btnSkillStore = new javax.swing.JButton();
        lblPlayerGold = new javax.swing.JLabel();
        lblerrorMassage = new javax.swing.JLabel();
        lblSkillStoreErrorMassage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lstSellingItems.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lstSellingItems);

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

        lblItemName.setForeground(new java.awt.Color(255, 255, 255));
        lblItemName.setText("Weapon Name:");

        lblItemDMG.setForeground(new java.awt.Color(255, 255, 255));
        lblItemDMG.setText("Weapon Damage:");

        lblItemType.setForeground(new java.awt.Color(255, 255, 255));
        lblItemType.setText("Weapon Type:");

        lblPlayerItemName.setForeground(new java.awt.Color(255, 255, 255));
        lblPlayerItemName.setText("Weapon Name:");

        lblPlayerItemDMG.setForeground(new java.awt.Color(255, 255, 255));
        lblPlayerItemDMG.setText("Weapon Damage:");

        lblPlayerItemType.setForeground(new java.awt.Color(255, 255, 255));
        lblPlayerItemType.setText("Weapon Type: ");

        btnShow.setText("Show");
        btnShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowActionPerformed(evt);
            }
        });

        btnCamp.setText("Camp");
        btnCamp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCampActionPerformed(evt);
            }
        });

        lblPlayerItemPrice.setForeground(new java.awt.Color(255, 255, 255));
        lblPlayerItemPrice.setText("Price: ");

        lblItemPrice.setForeground(new java.awt.Color(255, 255, 255));
        lblItemPrice.setText("Price:");

        btnSkillStore.setText("Skills");
        btnSkillStore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSkillStoreActionPerformed(evt);
            }
        });

        lblPlayerGold.setForeground(new java.awt.Color(255, 255, 255));
        lblPlayerGold.setText("Gold:");

        lblSkillStoreErrorMassage.setText(".");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(btnSkillStore)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblSkillStoreErrorMassage, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCamp)
                .addGap(55, 55, 55))
            .addGroup(layout.createSequentialGroup()
                .addGap(239, 239, 239)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblItemName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblItemDMG, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                    .addComponent(lblItemType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblItemPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPlayerItemDMG, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(lblPlayerItemName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPlayerItemPrice, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPlayerItemType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPlayerGold, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblerrorMassage, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuy)
                    .addComponent(btnSell)
                    .addComponent(btnShow))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(lblPlayerItemName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPlayerItemDMG)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPlayerItemType)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPlayerItemPrice)
                        .addGap(26, 26, 26)
                        .addComponent(lblPlayerGold))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(btnBuy)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnSell)
                            .addGap(5, 5, 5)
                            .addComponent(btnShow))))
                .addGap(18, 18, 18)
                .addComponent(lblItemName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblItemDMG)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblItemType, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblItemPrice)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCamp)
                    .addComponent(btnSkillStore)
                    .addComponent(lblSkillStoreErrorMassage))
                .addGap(18, 18, 18)
                .addComponent(lblerrorMassage)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuyActionPerformed
        int index = lstSellingItems.getSelectedIndex();
        if(index != -1 && index < weapons.size()){
            if(weapons.get(index).Type.equals(player.getWeaponType())){
                if(player.isHoldWeapon() == false){
                    if(weapons.get(index).price <= player.getGold()){
                        player.setGold(player.getGold()-weapons.get(index).price);
                        player.setItem(weapons.get(index));
                        player.setDamage(weapons.get(index).damage);
                        switch (player.getJobName()) {
                            case "Mage":
                                for(Skills pSkill: player.skills){
                                    for(int i=0;i<player.skills.length;i++){
                                        if(pSkill.name.equals(MageSkills.Name[i])){
                                            player.skills[i] = new MageSkills(weapons.get(index), i);
                                            
                                        }
                                    }
                                    
                                }   break;
                            case "Swordsman":
                                for(Skills pSkill: player.skills){
                                    for(int i=0;i<player.skills.length;i++){
                                        if(pSkill.name.equals(SwordmanSkills.Name[i])){
                                            player.skills[i] = new SwordmanSkills(weapons.get(index), i);
                                            
                                        }
                                    }
                                    
                                }   break;
                            case "Martial Artist":
                                for(Skills pSkill: player.skills){
                                    for(int i=0;i<player.skills.length;i++){
                                        if(pSkill.name.equals(MartialArtistSkills.Name[i])){
                                            player.skills[i] = new MartialArtistSkills(weapons.get(index), i);
                                            
                                        }
                                    }
                                    
                                }   break;
                            case "Archer":
                                for(Skills pSkill: player.skills){
                                    for(int i=0;i<player.skills.length;i++){
                                        if(pSkill.name.equals(ArcherSkills.Name[i])){
                                            player.skills[i] = new ArcherSkills(weapons.get(index), i);
                                            
                                        }
                                    }
                                    
                                }   break;
                            default:
                                break;
                        }
                    player.setWeapon(true);
                    setLbls();
                    }
                    else{
                        lblerrorMassage.setText("paran yok");
                    }

            }
                else{
                    lblerrorMassage.setText("Bu silahı alamazsınız. Çünkü elinizde silah var.");
                }

        }
            
            else{
                lblerrorMassage.setText("Bu silahı alamazsınız. Çünkü kullandığınız silah tipi uyuşmuyor");
            }
        } 
    }//GEN-LAST:event_btnBuyActionPerformed

    private void btnShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowActionPerformed
        
        int index = lstSellingItems.getSelectedIndex();
        
        if (index != -1 && index < weapons.size()) {
            lblItemName.setText("Weapon Name:"+weapons.get(index).name);
            lblItemDMG.setText("Weapon Damage:"+Integer.toString(weapons.get(index).damage) );
            lblItemType.setText("Weapon Type:"+weapons.get(index).Type);
            lblItemPrice.setText("Price:"+weapons.get(index).price);
        }

    }//GEN-LAST:event_btnShowActionPerformed

    private void btnCampActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCampActionPerformed
        frmCamp.Run(player);
        this.dispose();
    }//GEN-LAST:event_btnCampActionPerformed

    private void btnSkillStoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSkillStoreActionPerformed
        frmSkillStore.Run(player);
        this.dispose();
    }//GEN-LAST:event_btnSkillStoreActionPerformed

    private void btnSellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSellActionPerformed
        player.setWeapon(false);
        player.setGold(player.getGold()+player.getItem().price/2);
        player.setItem(Items.emptyItem());
        setLbls();
    }//GEN-LAST:event_btnSellActionPerformed

    /**
     * @param args the command line arguments
     */
    
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
            java.util.logging.Logger.getLogger(frmStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmStore().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuy;
    private javax.swing.JButton btnCamp;
    private javax.swing.JButton btnSell;
    private javax.swing.JButton btnShow;
    private javax.swing.JButton btnSkillStore;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblItemDMG;
    private javax.swing.JLabel lblItemName;
    private javax.swing.JLabel lblItemPrice;
    private javax.swing.JLabel lblItemType;
    private javax.swing.JLabel lblPlayerGold;
    private javax.swing.JLabel lblPlayerItemDMG;
    private javax.swing.JLabel lblPlayerItemName;
    private javax.swing.JLabel lblPlayerItemPrice;
    private javax.swing.JLabel lblPlayerItemType;
    private javax.swing.JLabel lblSkillStoreErrorMassage;
    private javax.swing.JLabel lblerrorMassage;
    private javax.swing.JList<String> lstSellingItems;
    // End of variables declaration//GEN-END:variables

    
}
