import greenfoot.*;
import java.util.*;

public class HighScoreScreen extends World{

    Map<String, Integer> scores; 

    public HighScoreScreen()
    {
        super(600,400,1);
        scores = new HashMap<>();
        scores.put("Billy", 1200);
        scores.put("Bob", 700);
        scores.put("Joe", 100);
        
        Label highScore = new Label("High Scores", 50);
        addObject(highScore, getWidth() / 2, 50);
        
        int i = 0;
        for(Map.Entry<String, Integer> entry : scores.entrySet())
        {
            String key = entry.getKey();
            int value = entry.getValue();
            Label label = new Label((key + ": " + value), 40);
            addObject(label, getWidth() /2, (i * 50) + 100) ;
            i++;
        }
    }
    
    public void act(){}
}
