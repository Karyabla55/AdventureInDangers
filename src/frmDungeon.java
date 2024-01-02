

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.swing.JPanel;


public class frmDungeon extends javax.swing.JFrame {
    Random rand = new Random();
    public static Character player;
    public static Character enemy;
    private BufferedImage backgroundImage;
    
    public frmDungeon() {
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
                    backgroundImage = ImageIO.read(new File("./src/Images/DungeonMage.jpg"));
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnFloor1 = new javax.swing.JButton();
        btnFloor2 = new javax.swing.JButton();
        btnFloor3 = new javax.swing.JButton();
        btnFloor4 = new javax.swing.JButton();
        btnFloor5 = new javax.swing.JButton();
        btnCamp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnFloor1.setText("1.Kat");
        btnFloor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFloor1ActionPerformed(evt);
            }
        });

        btnFloor2.setText("2.Kat");
        btnFloor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFloor2ActionPerformed(evt);
            }
        });

        btnFloor3.setText("3.Kat");
        btnFloor3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFloor3ActionPerformed(evt);
            }
        });

        btnFloor4.setText("4.Kat");
        btnFloor4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFloor4ActionPerformed(evt);
            }
        });

        btnFloor5.setText("5.Kat");
        btnFloor5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFloor5ActionPerformed(evt);
            }
        });

        btnCamp.setText("camp");
        btnCamp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCampActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCamp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 172, Short.MAX_VALUE)
                .addComponent(btnFloor1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFloor2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFloor3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFloor4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFloor5)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(337, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFloor5)
                    .addComponent(btnFloor4)
                    .addComponent(btnFloor2)
                    .addComponent(btnFloor3)
                    .addComponent(btnFloor1)
                    .addComponent(btnCamp))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFloor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFloor1ActionPerformed
        enemy = new Enemy(rand.nextInt(0, 4));
        frmBattelfield.Run(player,enemy);
        this.dispose();
    }//GEN-LAST:event_btnFloor1ActionPerformed

    private void btnFloor5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFloor5ActionPerformed
        enemy = new Enemy(16);
        frmBattelfield.Run(player,enemy);
        this.dispose();
    }//GEN-LAST:event_btnFloor5ActionPerformed

    private void btnCampActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCampActionPerformed
        // TODO add your handling code here:
        frmCamp.Run(player);
        this.dispose();
    }//GEN-LAST:event_btnCampActionPerformed

    private void btnFloor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFloor2ActionPerformed
        enemy = new Enemy(rand.nextInt(4, 8));
        frmBattelfield.Run(player,enemy);
        this.dispose();
    }//GEN-LAST:event_btnFloor2ActionPerformed

    private void btnFloor3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFloor3ActionPerformed
        enemy = new Enemy(rand.nextInt(8, 12));
        frmBattelfield.Run(player,enemy);
        this.dispose();
    }//GEN-LAST:event_btnFloor3ActionPerformed

    private void btnFloor4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFloor4ActionPerformed
        enemy = new Enemy(rand.nextInt(12, 16));
        frmBattelfield.Run(player,enemy);
        this.dispose();
    }//GEN-LAST:event_btnFloor4ActionPerformed

   
    
    
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
            java.util.logging.Logger.getLogger(frmDungeon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmDungeon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmDungeon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmDungeon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmDungeon().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCamp;
    private javax.swing.JButton btnFloor1;
    private javax.swing.JButton btnFloor2;
    private javax.swing.JButton btnFloor3;
    private javax.swing.JButton btnFloor4;
    private javax.swing.JButton btnFloor5;
    // End of variables declaration//GEN-END:variables
}
