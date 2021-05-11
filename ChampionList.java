import core.data.*;
import java.util.ArrayList;

public class ChampionList {
    
    private Champion[] list;
    
    
    public ChampionList(String filename)
    {
        //loads the information and creates an array of some desired stats
        DataSource ds = DataSource.connect(filename);
        ds.load();
        //ds.printUsageString();
        list = ds.fetchArray("Champion","Id", "Name", "Difficulty", "Damage", "Sturdiness", "Mobility");

    }
    
    public String findMostDamage() 
    {
        //creates list and searches list to find the champs most likely to do damage

        ArrayList<Champion> newList = new ArrayList<Champion>();
        //use a strongest score asigned by individual characteristics. Total score is compiled
        // and the best champ is returned once added to new array. 

        
        for (Champion value : list)
        {
            int strongestScore = 0;
            
            if (value.getDamage() == 3)
            {
                  strongestScore = strongestScore + 4;
            }
            if (value.getDifficulty() < 2) 
            {
                strongestScore = strongestScore + 2;
            }
            if (value.getMobility() > 2){
                strongestScore = strongestScore + 2;
            }
            if (value.getSturdiness() > 2 ){
                strongestScore += 1;
            }
            
            //creates a new object and adds to new list
            newList.add(new Champion(value.getName(), strongestScore));
        }
        
        String maxName = newList.get(0).getName();
        int maxScore = newList.get(0).getStrongestScore();
        
        for (Champion values : newList)
        {
            if (values.getStrongestScore() > maxScore)
            {
                maxName = values.getName();
                maxScore = values.getStrongestScore();
            }
        }
        
        return maxName + " is the strongest champion with a score of " + maxScore;
        
    
        
    }
    
    
}