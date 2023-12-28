
public class MartialArtistSkills extends Skills {
    String[] Name = {"Sert Yumruk","Seri Yumruklar","Ölümcül Tekme","Çift Kroşe"};
    int[] Price = {20,60,70,80};
    int[] Mana = {10,20,30,40}; 
    Double[] Damage = {3.0,1.5,50.0,90.0};

    public MartialArtistSkills(Items Item,int Level) {
        this.name = Name[Level];
        this.damage = (Item.damage)*Damage[Level];
        this.mana = Mana[Level];
         this.price = Price[Level];
        this.type = Item.Type;
        
    }

}
