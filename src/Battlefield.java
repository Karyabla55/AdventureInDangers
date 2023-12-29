

/**
 *
 * @author zeki1
 */
public class Battlefield extends frmBattelfield{


    private Character player;
    private Character enemy;
    public Battlefield(Character Player,Character Enemy) {
        this.player = Player;
        this.enemy  = Enemy;
    }
    
    public void deneme(){
        
    }

    
    public Character getPlayer() {
        return player;
    }

    
    public void setPlayer(Character player) {
        this.player = player;
    }

    
    public Character getEnemy() {
        return enemy;
    }

    
    public void setEnemy(Character enemy) {
        this.enemy = enemy;
    }

    
    
}
