
public class Swords extends Items{
    
    String[] Name = {"Sıradan Kılıc","Kemik Kılıc"};
    int[] Price = {20,60,70,80};
    int[] Damage = {15,20,50,90};
    public Swords(int Level){
        this.damage= Damage[Level];
        this.name= Name[Level];
        this.price = Price[Level];
        this.Type= type[1];  
    }
}
