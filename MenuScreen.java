import greenfoot.*;  

public class MenuScreen extends World
{
    public MenuScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        Buttons toInstruct = new Buttons("buttonLong_beige.png");
        addObject(toInstruct, 100, 100);
    }
}