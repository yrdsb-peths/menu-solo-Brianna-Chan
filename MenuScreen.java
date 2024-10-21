import greenfoot.*;  

public class MenuScreen extends World
{
    public MenuScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        Label menuLabel = new Label("Menu Screen", 40);
        addObject(menuLabel, getWidth() / 2, getHeight() / 2);
        
        Button toInstruct = new Button(0);
        addObject(toInstruct, 450, 350);

    }
}