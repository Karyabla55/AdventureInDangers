
public class Mage extends Jobs{
    public Mage(Items Item,int Level,Skills skill){
        this.name = "Mage";
        this.gold = 70;
        this.health = 20;
        this.damage = Item.damage;
        this.mana = 30;
        this.armor = 20;
        this.holdWeapon = true;
        this.item = Item;
        this.skills = skill;
    }   
    
}
