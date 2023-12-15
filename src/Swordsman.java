
public class Swordsman extends Jobs {
    public Swordsman(Items Item ,int Level,Skills skill){
        this.name = "Swordsman";
        this.gold = 50;
        this.health = 35;
        this.mana = 50;
        this.armor = 20;
        this.holdWeapon = true;
        this.item = Item;
        this.skills = skill;
    }    
}
