import greenfoot.*;  

public class MenuScreen extends World
{
    public MenuScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        Button toInstruct = new Button("buttonLong_beige.png");
        addObject(toInstruct, 400, 200);
    }
}