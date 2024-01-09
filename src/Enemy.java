
import java.util.ArrayList;


public class Enemy extends Character{
    ArrayList<String> enemyName = new ArrayList();
    ArrayList<Double> enemyHealth = new ArrayList();
    ArrayList<Double> enemyDamage = new ArrayList();
    ArrayList<Integer> enemyGold = new ArrayList();
    ArrayList<Integer> enemyMana = new ArrayList();
    ArrayList<Integer> enemyExp = new ArrayList();
    Skills[] enemySkills;
    public Enemy(int level) {
        setEnemies();
        setEnemySkills();
        setName((enemyName.get(level)));
        setHealth(enemyHealth.get(level));
        setDamage(enemyDamage.get(level));
        setMana(enemyMana.get(level));
        setGold(enemyGold.get(level));
        setExperience(enemyExp.get(level));
        setSkill(enemySkills[level]);
    }
    
    private void setEnemies(){
        enemyName.add("Vampir");
        enemyName.add("Kurt Adam");
        enemyName.add("Thonas");
        enemyName.add("cadı");
        enemyName.add("Dünyanın Sonu");
        
        enemyHealth.add(100.0);
        enemyHealth.add(150.0);
        enemyHealth.add(200.0);
        enemyHealth.add(75.0);
        enemyHealth.add(1500.0);
        
        enemyDamage.add(40.0);
        enemyDamage.add(35.0);
        enemyDamage.add(70.0);
        enemyDamage.add(45.0);
        enemyDamage.add(70.0);
        
        enemyGold.add(10);
        enemyGold.add(20);
        enemyGold.add(30);
        enemyGold.add(40);
        enemyGold.add(100);
        
        enemyMana.add(10);
        enemyMana.add(20);
        enemyMana.add(30);
        enemyMana.add(40);
        enemyMana.add(40);
        
        enemyExp.add(20);
        enemyExp.add(30);
        enemyExp.add(40);
        enemyExp.add(15);
        enemyExp.add(1000);
        
    }
    
    private void setEnemySkills(){
        enemySkills = new Skills[]{ new EnemySkills(enemyDamage.get(0), 0), 
                                    new EnemySkills(enemyDamage.get(1), 1), 
                                    new EnemySkills(enemyDamage.get(0), 2), 
                                    new EnemySkills(enemyDamage.get(3), 3),
                                    new EnemySkills(enemyDamage.get(4), 4)};
    }
    
    
}
