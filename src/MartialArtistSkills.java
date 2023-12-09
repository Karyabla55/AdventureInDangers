
public class MartialArtistSkills extends Skills {
    String[] Name = {"Sert Yumruk","Seri Yumruklar","Demir Yay","Obsidyen Yay"};
    int[] Price = {20,60,70,80};
    Double[] Damage = {3.0,1.5,50.0,90.0};

    public MartialArtistSkills(Items Item,int Level) {
        this.name = Name[Level];
        this.damage = (Item.damage)*Damage[Level];
        this.price = Price[Level];
        this.type = Item.Type;
        
    }

}
