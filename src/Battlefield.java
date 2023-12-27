
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
        enemy.setHealth(enemy.getHealth()-player.skills[ComboBoxİndex].damage);
        if(player.skills[ComboBoxİndex].mana <= player.getMana()){
            player.setMana(player.getMana()-player.skills[ComboBoxİndex].mana);
        }
        return enemy;
    }
    public Character enemyBattle(){
        player.setHealth(player.getHealth()-enemy.getDamage());
        return player;
    }

    
    
}
