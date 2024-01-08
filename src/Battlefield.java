
public class Battlefield extends frmBattelfield{
    private Character player;
    private Character enemy;

    public Battlefield(Character Player, Character Enemy) {
        this.player = Player;
        this.enemy = Enemy;
    }

    public Character playerAttack() {
        this.enemy.setHealth(this.enemy.getHealth() - this.player.getDamage());
        return this.enemy;
    }

    public Character playerSkill(int ComboBoxİndex) {
        if (this.player.skills[ComboBoxİndex].mana <= this.player.getMana()) {
            this.enemy.setHealth(this.enemy.getHealth() - this.player.skills[ComboBoxİndex].damage);
            this.player.setMana(this.player.getMana() - this.player.skills[ComboBoxİndex].mana);
        } else {
            this.notEnoughManaDialog();
            this.enemy.setHealth(this.enemy.getHealth() - this.player.getDamage());
        }

        return this.enemy;
    }

    public Character enemyBattle() {
        if (this.enemy.getSkill().mana <= this.enemy.getMana()) {
            this.player.setHealth(this.player.getHealth() - this.enemy.getSkill().damage);
            this.enemy.setMana(this.enemy.getMana() - this.enemy.getSkill().mana);
        } else {
            this.player.setHealth(this.player.getHealth() - this.enemy.getDamage());
        }

        return this.player;
    }

    public void setPlayer(Character player) {
        this.player = player;
    }

    public Character getEnemy() {
        return this.enemy;
    }

    public void setEnemy(Character enemy) {
        this.enemy = enemy;
    }
    
}
