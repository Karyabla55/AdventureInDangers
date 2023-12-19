
public class MartialArtist extends Jobs{
    public MartialArtist(Items Item,int Level,Skills skill){
        this.name = "Martial Artist";
        this.gold = 15;
        this.health = 45;
        this.mana = 10;
        this.armor = 20;
        this.damage = Item.damage;
        this.holdWeapon = true;
        this.item = Item;
        this.skills = skill;
    }   
    
}
