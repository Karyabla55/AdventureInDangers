
public class ArcherSkills extends Skills{
    String[] Name = {"Odaklı Vuruş","Seri Oklar","Demir Yay","Obsidyen Yay"};
    int[] Price = {20,60,70,80};
    Double[] Damage = {2.5,1.5,50.0,90.0};

    public ArcherSkills(){
        
    }
    public ArcherSkills(Items Item,int Level) {
        this.name = Name[Level];
        this.damage = (Item.damage)*Damage[Level];
        this.price = Price[Level]; 
        this.type = Item.Type;
    }
 
}

