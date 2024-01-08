
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
    
    private void setEnemies(){
        enemyName.add("Vampir");
        enemyName.add("Kurt Adam");
        enemyName.add("Thonas");
        enemyName.add("cadı");
        
        enemyHealth.add(100.0);
        enemyHealth.add(150.0);
        enemyHealth.add(200.0);
        enemyHealth.add(75.0);
        
        enemyDamage.add(40.0);
        enemyDamage.add(35.0);
        enemyDamage.add(70.0);
        enemyDamage.add(45.0);
        
        enemyGold.add(10);
        enemyGold.add(20);
        enemyGold.add(30);
        enemyGold.add(40);
        
        enemyMana.add(10);
        enemyMana.add(20);
        enemyMana.add(30);
        enemyMana.add(40);
        
        enemyExp.add(20);
        enemyExp.add(30);
        enemyExp.add(40);
        enemyExp.add(15);
        
        
        
    }
    
    
}
