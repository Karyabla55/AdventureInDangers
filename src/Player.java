
public class Player extends Character {
    
    public Player(String Name,Jobs Job){
        this.setName(Name);
        this.setGold(Job.gold);
        this.setHealth(Job.health);
        this.setMana(Job.mana);
        this.setJobName(Job.name);
        this.setArmor(Job.armor);
        this.setDamage(Job.damage);
        this.setWeapon(Job.holdWeapon);
        this.setItem(Job.item);
        this.setLevel(0);
        this.setWeaponType(Job.item.Type);
        this.skills = new Skills[2];
        this.skills[0] = Job.skills;
        this.skills[1] = Skills.emptySkill();
        
       
    }
   
}
