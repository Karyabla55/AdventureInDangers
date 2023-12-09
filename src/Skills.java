
public abstract class Skills {
    String name;
    int price;
    double damage ;
    String type;
    
    public static Skills emptySkill(){
        Skills skill = new ArcherSkills();
        skill.name= "Empty";
        skill.damage = 0;
        skill.price = 0;
        return  skill;
    }

}
