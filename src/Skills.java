
public abstract class Skills {
    String name;
    int price;
    int mana;
    double damage;
    String type;
    
    public static Skills emptySkill(){
        Skills skill = new ArcherSkills();
        skill.name= "Empty";
        skill.damage = 0;
        skill.price = 0;
        return  skill;
    }

}
