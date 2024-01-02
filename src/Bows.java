
public class Bows extends Items {
    
    String[] Name = {"Sıradan yay","Kemik Yay","Demir Yay","Obsidyen Yay"};
    int[] Price = {20,60,70,80};
    int[] Damage = {30,40,50,90};
    public Bows(int Level){
        this.damage= Damage[Level];
        this.name= Name[Level];
        this.price = Price[Level];
        this.Type = type[0];  
    } 
    public Bows(){
        
    }
}
