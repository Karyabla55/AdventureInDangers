
public class ArcherSkills extends Skills{
    String[] Name = {"Odaklı Vuruş","Seri Oklar","Ok Yağmuru","Patlayıcı Ok"};
    int[] Price = {20,60,70,80};
    Double[] Damage = {2.5,5.5,10.0,15.0};

    public ArcherSkills(){
        
    }
    public ArcherSkills(Items Item,int Level) {
        this.name = Name[Level];
        this.damage = (Item.damage)*Damage[Level];
        this.price = Price[Level]; 
        this.type = Item.Type;
    }
 
}

