
public class Enemy extends Character{
    String enemyName[] = {"vampir","kurt adam","thanos","cadı"};
    double enemyHealth[] = {100.0,150.0,200.0,75.0};
    double enemyDamage[] = {40.0,35.0,70.0,45.0};
    int enemyGold[] = {10,20,30,40};
    int enemyMana[] = {10,20,30,40};
    int enemyExp[] = {20,30,40,10};
    Skills enemySkills[] = {new EnemySkills(enemyDamage[0],0),new EnemySkills(enemyDamage[1], 1),
        new EnemySkills(enemyDamage[2],2),new EnemySkills(enemyDamage[3], 3)};
    
    public Enemy(int level){
        
        this.setName(enemyName[level]);
        this.setHealth(enemyHealth[level]);
        this.setDamage(enemyDamage[level]);
        this.setGold(enemyGold[level]);
        this.setMana(enemyMana[level]);
        this.setExperience(enemyExp[level]);
        this.setSkill(enemySkills[level]);
        
    }
    
    
}
