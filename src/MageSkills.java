
public class MageSkills extends Skills{
    public static String[] Name = {"Alev Topu","Zemin-i Alev","Lav Fırtınası","Ateş Çemberi"};
    int[] Price = {20,60,70,80};
    int[] Mana = {10,20,30,40};
    Double[] Damage = {2.5,1.5,50.0,90.0};
    //For player skill
    public MageSkills(Items Item,int Index) {
        
        this.name =Name[Index] ;
        this.damage = (Item.damage)*Damage[Index];
        this.mana = Mana[Index];
        this.price = Price[Index];
        this.type = Item.Type;
    }
    

}
