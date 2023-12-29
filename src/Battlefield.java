
public class Battlefield extends frmBattelfield{
    
    
    public Battlefield(Character Player,Character Enemy) {
        this.player = Player;
        this.enemy  = Enemy;
    }
    
    public Character playerAttack(){
        enemy.setHealth(enemy.getHealth()-player.getDamage());
        return enemy;
    }
    public Character playerSkill(int ComboBoxİndex){
        
        if(player.skills[ComboBoxİndex].mana <= player.getMana()){
            enemy.setHealth(enemy.getHealth()-player.skills[ComboBoxİndex].damage);
            player.setMana(player.getMana()-player.skills[ComboBoxİndex].mana);
        }else{
            notEnoughManaDialog();
            enemy.setHealth(enemy.getHealth()-player.getDamage());
            
        }
        return enemy;
    }
    public Character enemyBattle(){
        
        if (enemy.getSkill().mana <= enemy.getMana()){
            player.setHealth(player.getHealth()-enemy.getSkill().damage);
            enemy.setMana(enemy.getMana()-enemy.getSkill().mana);
        }
        else{
            player.setHealth(player.getHealth()-enemy.getDamage());
        }
        
        return player;
    }

    
    
}
