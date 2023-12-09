
public abstract class Character {

    private String name;
    private int health;
    private int gold;
    private int mana;
    private double damage;
    private int armor;
    private int level;
    private boolean holdWeapon;
    private String jobName;
    private Items item;
    private Skills skill;
    private String weaponType;
    Skills[] skills;
   
    
    
    
   
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the health
     */
    public int getHealth() {
        return health;
    }

    /**
     * @param health the health to set
     */
    public void setHealth(int health) {
        this.health = health;
    }

    /**
     * @return the gold
     */
    public int getGold() {
        return gold;
    }

    /**
     * @param gold the gold to set
     */
    public void setGold(int gold) {
        this.gold = gold;
    }

    /**
     * @return the mana
     */
    public int getMana() {
        return mana;
    }

    /**
     * @param mana the mana to set
     */
    public void setMana(int mana) {
        this.mana = mana;
    }

    /**
     * @return the damage
     */
    public double getDamage() {
        return damage;
    }

    /**
     * @param damage the damage to set
     */
    public void setDamage(double damage) {
        this.damage = damage;
    }

    /**
     * @return the armor
     */
    public int getArmor() {
        return armor;
    }

    /**
     * @param armor the armor to set
     */
    public void setArmor(int armor) {
        this.armor = armor;
    }

    /**
     * @return the level
     */
    public int getLevel() {
        return level;
    }

    /**
     * @param level the level to set
     */
    public void setLevel(int level) {
        this.level = level;
    }

    /**
     * @return the weapon
     */
    public boolean isHoldWeapon() {
        return holdWeapon;
    }

    /**
     * @param weapon the weapon to set
     */
    public void setWeapon(boolean weapon) {
        this.holdWeapon = weapon;
    }

    /**
     * @return the jobName
     */
    public String getJobName() {
        return jobName;
    }

    /**
     * @param jobName the jobName to set
     */
    public void setJobName(String jobName) {
        this.jobName = jobName;
    }


    /**
     * @return the item
     */
    public Items getItem() {
        return item;
    }

    /**
     * @param item the item to set
     */
    public void setItem(Items item) {
        this.item = item;
    }


    /**
     * @return the skill
     */
    public Skills getSkill() {
        return skill;
    }

    /**
     * @param skill the skill to set
     */
    public void setSkill(Skills skill) {
        this.skill = skill;
    }

    /**
     * @return the weaponType
     */
    public String getWeaponType() {
        return weaponType;
    }

    /**
     * @param weaponType the weaponType to set
     */
    public void setWeaponType(String weaponType) {
        this.weaponType = weaponType;
    }

}
