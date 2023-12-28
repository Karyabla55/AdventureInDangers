
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;



public class frmBattelfield extends javax.swing.JFrame {
    static Random rand = new Random();
    static private Clip clip;
    static private AudioInputStream sound;
    
    static Character player;
    static Character enemy;
    static Battlefield battlefield;
    
    private BufferedImage backgroundImage;
    DefaultComboBoxModel model = new DefaultComboBoxModel();
    
    double battlefieldPMH = player.getHealth();
    int battlefieldPMM = player.getMana();
    
    public frmBattelfield() {
        setBackground();
        
        initComponents();
        setLocationRelativeTo(null);
        cmbPlayerSkills.setModel(model);
        setLbls();
        setComboBox();
        
    }
    private static void setBackgroundMusic() {
        String pathName;
            
            int random = rand.nextInt(3);
            switch(random){
                case 0:
                    pathName = "./src/Sounds/ThemeSongBattlefield.wav";
                    
                    break;
                case 1:
                    pathName = "./src/Sounds/TSBattlefield1.wav";
                    
                    break;
                case 2:
                    pathName = "./src/Sounds/TSBattlefield2.wav";
                   
                    break;
                default:
                    pathName = "./src/Sounds/ThemeSongBattlefield.wav";
                    break;
                
            }
            System.out.println(random);
            System.out.println(pathName);
        try {
            File file = new File(pathName);
            sound = AudioSystem.getAudioInputStream(file);
            clip = AudioSystem.getClip();
            clip.open(sound);
            clip.start();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error playing sound: " + e.getMessage());
        }
        clip.start();
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
                    if(enemy.getName().equals("vampir")){
                        backgroundImage = ImageIO.read(new File("./src/Images/BattlefieldMageVampire.jpg"));
                    }
                    else if(enemy.getName().equals("kurt adam")){
                        backgroundImage = ImageIO.read(new File("./src/Images/BattlefieldMageVampire.jpg"));
                    }
                    else if(enemy.getName().equals("thanos")){
                        backgroundImage = ImageIO.read(new File("./src/Images/BattlefieldMageVampire.jpg"));
                    }
                    else if(enemy.getName().equals("cadı")){
                        backgroundImage = ImageIO.read(new File("./src/Images/BattlefieldMageVampire.jpg"));
                    }
                    
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
    
    private void setLbls(){
        prgbPlayerHealth.setValue((int)player.getHealth());
        prgbPlayerMana.setValue((int)player.getMana());
        prgbEnemyHealth.setValue((int)enemy.getHealth());
        prgbEnemyMana.setValue((int)enemy.getMana());
    }
    private void setComboBox(){
        model.addElement(player.skills[0].name);
        model.addElement(player.skills[1].name);
    }
    
    private void wonDialog(){
        // Seçeneklerinizi bir dizi olarak tanımlayın
        Object[] options = {"Zafer!"};
        // Kullanıcının seçimini almak için bir dialog oluşturun
        int selectedOptionIndex = JOptionPane.showOptionDialog(
                null,                   // Parent component (null, ekranda ortalanır)
                "Büyük bir savaşı kazanarak\n bir ödülü hakk ettin",   // Dialog içeriği
                "Savaşı Kazandın",           // Dialog başlığı
                JOptionPane.DEFAULT_OPTION, // Mesaj tipi
                JOptionPane.INFORMATION_MESSAGE, // İkon tipi
                null,                   // Seçenekleri içeren dizi
                options,                // Seçeneklerinizi içeren dizi
                options[0]);            // Varsayılan seçenek

        // Kullanıcının seçtiği seçeneği yazdırın
        if (selectedOptionIndex != JOptionPane.CLOSED_OPTION) {
            if(selectedOptionIndex == 0){
                frmCamp.Run(player);
            this.dispose();
            }      
        } else {
            System.out.println("Hiçbir seçenek seçilmedi.");
        }
    }
    
    
    public void notEnoughManaDialog(){
        String message = "Bu yeteneği kullanmak için \nyeterli manan yok";
        JOptionPane.showMessageDialog(new JFrame(), message, "Yetersiz Mana",
        JOptionPane.ERROR_MESSAGE);
        
    }
    private void loseDialog(){
        // Seçeneklerinizi bir dizi olarak tanımlayın
        Object[] options = {"Kaybettin"};
        // Kullanıcının seçimini almak için bir dialog oluşturun
        int selectedOptionIndex = JOptionPane.showOptionDialog(
                null,                   // Parent component (null, ekranda ortalanır)
                "Senin Kendisinden zayıf olduğunu \nfark eden canavar seni daha fazla umursamadı \nbu sayede hala hayattasın",   // Dialog içeriği
                "Savaşı kaybettin",    //Diyalog başlığı       
                JOptionPane.DEFAULT_OPTION, // Mesaj tipi
                JOptionPane.PLAIN_MESSAGE, // İkon tipi
                null,                   // Seçenekleri içeren dizi
                options,                // Seçeneklerinizi içeren dizi
                options[0]);            // Varsayılan seçenek

        // Kullanıcının seçtiği seçeneği yazdırın
        if (selectedOptionIndex != JOptionPane.CLOSED_OPTION) {
            if(selectedOptionIndex == 0){
                frmCamp.Run(player);
                try {
            sound.close();
        } catch (IOException ex) {
            Logger.getLogger(frmStart.class.getName()).log(Level.SEVERE, null, ex);
        }
        clip.close();
        clip.stop();
            this.dispose();
            }      
        } else {
            System.out.println("Hiçbir seçenek seçilmedi.");
        }
    }
    private void runAwayDialog(){
        // Seçeneklerinizi bir dizi olarak tanımlayın
        Object[] options = {"Evet", "Hayır"};
        // Kullanıcının seçimini almak için bir dialog oluşturun
        int selectedOptionIndex = JOptionPane.showOptionDialog(
                null,                   // Parent component (null, ekranda ortalanır)
                "Kaç",   // Dialog içeriği
                "Bu eylemi gerçekleştirecekmisin?",           // Dialog başlığı
                JOptionPane.DEFAULT_OPTION, // Mesaj tipi
                JOptionPane.QUESTION_MESSAGE, // İkon tipi
                null,                   // Seçenekleri içeren dizi
                options,                // Seçeneklerinizi içeren dizi
                options[0]);            // Varsayılan seçenek

        // Kullanıcının seçtiği seçeneği yazdırın
        if (selectedOptionIndex != JOptionPane.CLOSED_OPTION) {
            if(selectedOptionIndex == 0){
                frmCamp.Run(player);
                try {
            sound.close();
        } catch (IOException ex) {
            Logger.getLogger(frmStart.class.getName()).log(Level.SEVERE, null, ex);
        }
        clip.close();
        clip.stop();
            this.dispose();
            }
            
        } else {
            System.out.println("Hiçbir seçenek seçilmedi.");
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbPlayerSkills = new javax.swing.JComboBox<>();
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
        lblEnemyName = new javax.swing.JLabel();
        lblPlayerName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cmbPlayerSkills.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnUseSkill.setText("Use Skill");
        btnUseSkill.setToolTipText("Yeteneği seçtikten sonra kullabilirsiniz");
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

        prgbPlayerHealth.setBackground(new java.awt.Color(204, 0, 51));
        prgbPlayerHealth.setForeground(new java.awt.Color(153, 0, 51));
        prgbPlayerHealth.setMaximum((int)player.getHealth());

        prgbPlayerMana.setBackground(new java.awt.Color(0, 0, 204));
        prgbPlayerMana.setForeground(new java.awt.Color(0, 51, 255));
        prgbPlayerMana.setMaximum((int)player.getMana()
        );

        prgbEnemyHealth.setBackground(new java.awt.Color(204, 0, 51));
        prgbEnemyHealth.setForeground(new java.awt.Color(204, 0, 0));
        prgbEnemyHealth.setMaximum((int)enemy.getHealth());

        prgbEnemyMana.setBackground(new java.awt.Color(51, 51, 255));
        prgbEnemyMana.setForeground(new java.awt.Color(0, 0, 204));
        prgbEnemyMana.setMaximum(enemy.getMana());

        lblPlayerHit1.setBackground(new java.awt.Color(255, 255, 255));
        lblPlayerHit1.setForeground(new java.awt.Color(204, 0, 51));

        lblPlayerHit2.setBackground(new java.awt.Color(255, 255, 255));
        lblPlayerHit2.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        lblPlayerHit2.setForeground(new java.awt.Color(255, 51, 51));

        lblEnemyName.setBackground(new java.awt.Color(0, 0, 0));
        lblEnemyName.setForeground(new java.awt.Color(255, 255, 255));
        lblEnemyName.setText(enemy.getName());

        lblPlayerName.setBackground(new java.awt.Color(255, 255, 255));
        lblPlayerName.setText(player.getName());

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnUseSkill)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmbPlayerSkills, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnAttack)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(prgbPlayerHealth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblPlayerHit2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblPlayerHit1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblPlayerHit, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(prgbPlayerMana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblPlayerName, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblEnemyName, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(prgbEnemyHealth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(prgbEnemyMana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPlayerHit1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPlayerHit))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(prgbEnemyHealth, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(prgbEnemyMana, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblEnemyName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 222, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbPlayerSkills, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUseSkill))
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(prgbPlayerHealth, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPlayerHit2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(prgbPlayerMana, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lblPlayerName)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAttack)
                    .addComponent(btnRunAway)
                    .addComponent(lblActionEvents))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUseSkillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUseSkillActionPerformed
        enemy=battlefield.playerSkill(cmbPlayerSkills.getSelectedIndex());
        lblActionEvents.setText("Düşmana "+player.skills[cmbPlayerSkills.getSelectedIndex()].damage+" vurdunuz");
        lblPlayerHit1.setText("-"+Integer.toString((int)player.skills[cmbPlayerSkills.getSelectedIndex()].damage));
        prgbPlayerMana.setValue((int)player.getMana());
        prgbEnemyHealth.setValue((int)enemy.getHealth());
        if(enemy.getHealth() <=0){
            player.setGold(player.getGold()+enemy.getGold());
            player.setExperience(player.getExperience()+enemy.getExperience());
            if(player.getExperience()>=player.getLevel()*100){
                player.setLevel(player.getLevel()+1);
                // 2 seviye birden atlama ihtimaline karşılık önlem
                if(player.getExperience()>=player.getLevel()*100){
                    player.setLevel(player.getLevel()+1);
                }
            }
            wonDialog();
            player.setHealth(battlefieldPMH);
            player.setMana(battlefieldPMM);
            frmCamp.Run(player);
            this.dispose();
        }
        else{
            player= battlefield.enemyBattle();
            lblActionEvents.setText("Düşman sana "+enemy.getDamage()+" vurdu");
            lblPlayerHit2.setText("-"+Integer.toString((int)player.getDamage()));
            prgbPlayerHealth.setValue((int)player.getHealth());
            if(player.getHealth()<=0){
                loseDialog();
                player.setExperience(player.getExperience()/2);
                player.setHealth(battlefieldPMH);
                player.setMana(battlefieldPMM);
                frmCamp.Run(player);
                this.dispose();
            }
        
        }
    }//GEN-LAST:event_btnUseSkillActionPerformed

    private void btnAttackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAttackActionPerformed
        enemy=battlefield.playerAttack();
        lblActionEvents.setText("Düşmana "+player.getDamage()+" vurdunuz");
        lblPlayerHit1.setText("-"+Integer.toString((int)player.getDamage()));
        prgbEnemyHealth.setValue((int)enemy.getHealth());
        if(enemy.getHealth() <=0){
            player.setGold(player.getGold()+enemy.getGold());
            player.setExperience(player.getExperience()+enemy.getExperience());
            if(player.getExperience()>=player.getLevel()*100){
                player.setLevel(player.getLevel()+1);
                // 2 seviye birden atlama ihtimaline karşılık önlem
                if(player.getExperience()>=player.getLevel()*100){
                    player.setLevel(player.getLevel()+1);
                }
            }
            wonDialog();
            player.setHealth(battlefieldPMH);
            player.setMana(battlefieldPMM);
            frmCamp.Run(player);
            this.dispose();
        }
        else{
            player= battlefield.enemyBattle();
            lblActionEvents.setText("Düşman sana "+enemy.getDamage()+" vurdu");
            lblPlayerHit2.setText("-"+Integer.toString((int)player.getDamage()));
            prgbPlayerHealth.setValue((int)player.getHealth());
            if(player.getHealth()<=0){
                loseDialog();
                player.setExperience(player.getExperience()/2);
                player.setHealth(battlefieldPMH);
                player.setMana(battlefieldPMM);
                frmCamp.Run(player);
                this.dispose();
            }
        
        }
        
        
        
        
    }//GEN-LAST:event_btnAttackActionPerformed

    private void btnRunAwayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRunAwayActionPerformed
        runAwayDialog();
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
                setBackgroundMusic();
                new frmBattelfield().setVisible(true);
                System.out.println("Work-2");
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAttack;
    private javax.swing.JButton btnRunAway;
    private javax.swing.JButton btnUseSkill;
    private javax.swing.JComboBox<String> cmbPlayerSkills;
    private javax.swing.JLabel lblActionEvents;
    private javax.swing.JLabel lblEnemyName;
    private javax.swing.JLabel lblPlayerHit;
    private javax.swing.JLabel lblPlayerHit1;
    private javax.swing.JLabel lblPlayerHit2;
    private javax.swing.JLabel lblPlayerName;
    private javax.swing.JProgressBar prgbEnemyHealth;
    private javax.swing.JProgressBar prgbEnemyMana;
    private javax.swing.JProgressBar prgbPlayerHealth;
    private javax.swing.JProgressBar prgbPlayerMana;
    // End of variables declaration//GEN-END:variables
}
