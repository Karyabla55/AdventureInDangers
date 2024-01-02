
public class EnemySkills extends Skills {
    
    String[] enemySkillName = {"Kan Em","Isır","Demir Yay","Obsidyen Yay","tas","olum bogumu","agac yikimi","dev balyoz","olum isini","sarsan yumruk","olum asidi","eriten alev","kemik kiran","buyulu kristal ok","ulvi ideal","keskin hapis","karanligin zirvesi"};
    Double[] enemySkillDamage = {2.5,1.5,50.0,90.0,2.5,1.5,50.0,90.0,2.5,1.5,50.0,90.0,2.5,1.5,50.0,90.0,100.5};
    public EnemySkills(double enemyDamage,int Level) {
        
        this.name = enemySkillName[Level] ;
        this.damage = (enemyDamage)*enemySkillDamage[Level];

    }
    
}
