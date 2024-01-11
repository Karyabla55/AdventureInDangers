
public class ArcherSkills extends Skills{
    public static String[] Name = {"Odaklı Vuruş","Seri Oklar","Ok Yağmuru","Patlayıcı Ok"};
    int[] Price = {20,60,70,80};
    Double[] Damage = {2.5,5.5,10.0,15.0};
    int[] Mana = {10,20,30,40};

    public ArcherSkills(){
        
    }
    public ArcherSkills(Items Item,int Level) {
        this.name = Name[Level];
        this.damage = (Item.damage)*Damage[Level];
        this.price = Price[Level]; 
        this.type = Item.Type;
        this.mana = Mana[Level];
    }
 
}

