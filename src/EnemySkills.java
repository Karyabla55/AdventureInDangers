
public class EnemySkills extends Skills {
    
    String[] enemySkillName = {"Kan Em","Isır","5 Tas","Lanet","karanligin zirvesi"};
    Double[] enemySkillDamage = {2.5,1.5,50.0,90.0,100.5};
    int[] enemySkillMana =  {10,20,30,40,60};
    public EnemySkills(double enemyDamage,int Level) {
        
        this.name = enemySkillName[Level] ;
        this.damage = (enemyDamage)*enemySkillDamage[Level];
        this.mana = enemySkillMana[Level];

    }
    
}
