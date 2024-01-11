
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JPanel;


public class frmCamp extends javax.swing.JFrame {
    
    private Clip clip;
    private AudioInputStream sound;
    public static Character player;
    private BufferedImage backgroundImage;
    
    public frmCamp() {
        setBackground();
        setBackgroundMusic();
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
    private void setBackgroundMusic() {
        try {
            File file = new File("./src/Sounds/ThemeSongCamp.wav");
            sound = AudioSystem.getAudioInputStream(file);
            clip = AudioSystem.getClip();
            clip.open(sound);
        } catch (Exception e) {
            System.out.println("Dosya bulunamadı");
        }
        clip.start();
    }
    
    private void setBackground(){
        try {
            switch (player.getJobName()) {
                case "Archer":
                    backgroundImage = ImageIO.read(new File("./src/Images/ArcherCamp.jpg"));
                    break;
                case "Swordsman":
                    backgroundImage = ImageIO.read(new File("./src/Images/SwordsmanCamp.jpg"));
                    break; 
                case "Mage":
                    backgroundImage = ImageIO.read(new File("./src/Images/MageCamp.jpg"));
                    break;
                case "Martial Artist":
                    backgroundImage = ImageIO.read(new File("./src/Images/MartialArtistCamp.jpg"));
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
        btnStore = new javax.swing.JButton();
        btnDungeon = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblPlayerName.setForeground(new java.awt.Color(255, 255, 255));
        lblPlayerName.setText("Name:");

        lblPlayerHP.setForeground(new java.awt.Color(255, 255, 255));
        lblPlayerHP.setText("HP:");

        lblPlayerMP.setForeground(new java.awt.Color(255, 255, 255));
        lblPlayerMP.setText("MP");

        lblPlayerJOB.setForeground(new java.awt.Color(255, 255, 255));
        lblPlayerJOB.setText("Job:");

        lblPlayerWN.setForeground(new java.awt.Color(255, 255, 255));
        lblPlayerWN.setText("Weapon Name:");

        lblPlayerWT.setForeground(new java.awt.Color(255, 255, 255));
        lblPlayerWT.setText("Weapon Type:");

        lblPlayerDMG.setForeground(new java.awt.Color(255, 255, 255));
        lblPlayerDMG.setText("Damage: ");

        lblPlayerARM.setForeground(new java.awt.Color(255, 255, 255));
        lblPlayerARM.setText("Armor");

        lblPlayerLVL.setForeground(new java.awt.Color(255, 255, 255));
        lblPlayerLVL.setText("Level:");

        lblPlayerGLD.setForeground(new java.awt.Color(255, 255, 255));
        lblPlayerGLD.setText("Gold:");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(btnStore)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 344, Short.MAX_VALUE)
                .addComponent(btnDungeon)
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblPlayerName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPlayerHP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPlayerMP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPlayerJOB)
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
                .addComponent(lblPlayerGLD)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnStore)
                    .addComponent(btnDungeon))
                .addGap(31, 31, 31)
                .addComponent(jLabel4))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStoreActionPerformed
        frmStore.Run(player);
        
        try {
            sound.close();
        } catch (IOException ex) {
            Logger.getLogger(frmStart.class.getName()).log(Level.SEVERE, null, ex);
        }
        clip.close();
        clip.stop();
        this.dispose();
    }//GEN-LAST:event_btnStoreActionPerformed

    private void btnDungeonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDungeonActionPerformed
        frmDungeon.Run(player);
        
        try {
            sound.close();
        } catch (IOException ex) {
            Logger.getLogger(frmStart.class.getName()).log(Level.SEVERE, null, ex);
        }
        clip.close();
        clip.stop();
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
