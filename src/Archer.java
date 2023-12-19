
public class Archer extends Jobs{
    public Archer(Items Item,int Level,Skills skill){
        this.name = "Archer";
        this.gold = 70;
        this.health = 25;
        this.mana = 30;
        this.armor = 20;
        this.holdWeapon = true;
        this.damage = Item.damage;
        this.item = Item;
        this.skills = skill;  
    }   
    
}
