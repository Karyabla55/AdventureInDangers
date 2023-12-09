
public abstract class Items {
    String name;
    int damage;
    int price;
    String[] type= {"BOW","SWORD","STAFF","GLOVE"};
    String Type;
    
    public static Items emptyItem(){
        Items item = new Bows();
        item.Type = " " ;
        item.damage = 0;
        item.name = "Empty";
        item.price = 0;
        return item;
    }
}
