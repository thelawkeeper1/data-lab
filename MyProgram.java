public class MyProgram
{
    static String filename = "LoL-Champions.csv";
    
    
    public static void main(String[] args)
    {
        //https://www.kaggle.com/uskeche/leauge-of-legends-champions-dataset
        ChampionList newChampionList = new ChampionList(filename);

        

        //prints out all the goodies here
        System.out.println("This program finds which champions are the strongest based on:");
        System.out.println("Damage: How easily the champion could delete another champion.");
        System.out.println("Difficulty: How easy the champion is to play effectively.");
        System.out.println("Sturdiness: How likely the damage is to survive some fights.");
        System.out.println("Mobility: How likely the champion is to evade damage.");
        System.out.println();
        
        System.out.println("The top damage dealers are: ");
        System.out.println(newChampionList.findMostDamage());
        
        
    }
    
    
    
    
    
}