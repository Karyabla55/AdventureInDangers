
import java.util.ArrayList;


public class Enemy extends Character{
    ArrayList<String> enemyName = new ArrayList();
    ArrayList<Double> enemyHealth = new ArrayList();
    ArrayList<Double> enemyDamage = new ArrayList();
    ArrayList<Integer> enemyGold = new ArrayList();
    ArrayList<Integer> enemyMana = new ArrayList();
    ArrayList<Integer> enemyExp = new ArrayList();

    public Enemy(int level) {
        this.setEnemies();
        Skills[] enemySkills = new Skills[]{new EnemySkills((Double)this.enemyDamage.get(0), 0), new EnemySkills((Double)this.enemyDamage.get(1), 1), new EnemySkills((Double)this.enemyDamage.get(0), 2), new EnemySkills((Double)this.enemyDamage.get(3), 3)};
        this.setName((String)this.enemyName.get(level));
        this.setHealth((Double)this.enemyHealth.get(level));
        this.setDamage((Double)this.enemyDamage.get(level));
        this.setMana((Integer)this.enemyMana.get(level));
        this.setGold((Integer)this.enemyGold.get(level));
        this.setExperience((Integer)this.enemyExp.get(level));
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
