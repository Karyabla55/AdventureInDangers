
public class SwordmanSkills extends Skills{
    public static String[] Name = {"Ağır Darbe","Çifte Darbe","Çivili Darbe","Dönen Darbe"};
    int[] Price = {20,60,70,80};
    int[] Mana = {10,20,30,40};
    Double[] Damage = {2.5,3.0,50.0,90.0};

    public SwordmanSkills(Items Item,int Level) {
        this.name = Name[Level];
        this.damage = Item.damage*Damage[Level];
        this.price = Price[Level];
        this.type = Item.Type;
        this.mana = Mana[Level];
        
    }
    
}
