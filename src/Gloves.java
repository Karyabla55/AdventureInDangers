
public class Gloves extends Items {
    
    String[] Name = {"Sıradan Eldiven","Kemik Eldiven","Demir eldiven","Obsidyen eldiven"};
    int[] Price = {20,60,70,80};
    int[] Damage = {20,20,50,90};
    public Gloves(int Level){
        this.damage= Damage[Level];
        this.name= Name[Level];
        this.price = Price[Level];
        this.Type = type[3];  
    }
}
