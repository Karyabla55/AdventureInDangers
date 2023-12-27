
public class MageSkills extends Skills{
    String[] Name = {"Alev Topu","Zemin-i Alev","Lav Fırtınası","Ateş Çemberi"};
    int[] Price = {20,60,70,80};
    int[] Mana = {10,20,30,40};
    Double[] Damage = {2.5,1.5,50.0,90.0};
    //For player skill
    public MageSkills(Items Item,int Level) {
        
        this.name =Name[Level] ;
        this.damage = (Item.damage)*Damage[Level];
        this.mana = Mana[Level];
        this.price = Price[Level];
        this.type = Item.Type;
        

    }
    

}
