
public class Staffs extends Items {
    
    String[] Name = {"Sıradan Asa","Kemik Asa"};
    int[] Price = {20,60,70,80};
    int[] Damage = {15,20,50,90};
    public Staffs(int Level){
        this.damage= Damage[Level];
        this.name= Name[Level];
        this.price = Price[Level];
        this.Type = type[2];  
    }
    
}
