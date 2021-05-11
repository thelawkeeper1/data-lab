public class Champion {
    
    private int ID;
    private String name;
    private String championClass;
    private int style;
    private int difficulty;
    private String damageType;
    private int damage;
    private int sturdiness;
    private int crowdControl;
    private int mobility;
    private int strongestScore;
    
    public Champion (String name, int strongestScore)
    {
        this.name = name;
        this.strongestScore = strongestScore;
    }
    
    public Champion (int ID, String name, int difficulty, int damage, int sturdiness, int mobility)
    {
        this.ID = ID;
        this.name = name;
        this.difficulty = difficulty;
        this.damage = damage;
        this.sturdiness = sturdiness;
        this.mobility = mobility; 
    }
    
    
    //"Champion","Id", "Name", "Difficulty", "Damage", "Sturdiness", "Mobility"
    public Champion (int ID, String name, String championClass, int style, int difficulty, 
    String damageType, int damage, int sturdiness, int crowdControl, int mobility)
    {
        this.ID = ID;
        this.name = name;
        this.championClass = championClass;
        this.style = style;
        this.difficulty = difficulty;
        this.damageType = damageType;
        this.damage = damage;
        this.sturdiness = sturdiness;
        this.crowdControl = crowdControl;
        this.mobility = mobility;
        
    }
    
    public int getStrongestScore()
    {
        return strongestScore;
    }
    
    public String getName()
    {
        return name;      
    }   
    
    public String getChampionClass()
    {
        return championClass;      
    }   
    
    public String getDamageType()
    {
        return damageType;      
    }   
    
    public int getId()
    {
        return ID;
    }
    
    public int getStyle()
    {
        return style;
    }
    
    public int getDifficulty()
    {
        return difficulty;
    }
    
    public int getDamage()
    {
        return damage;
    }
    
    public int getSturdiness()
    {
        return sturdiness;
    }
    
    public int getcrowdControl()
    {
        return crowdControl;
    }
    
    public int getMobility()
    {
        return mobility;
    }
    
    
}