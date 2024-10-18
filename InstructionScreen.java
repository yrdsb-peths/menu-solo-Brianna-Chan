import greenfoot.*;

public class InstructionScreen extends World
{
    Label screens[] = {new Label("Screen 0", 40), new Label("Screen 1", 40)};
    public static int index;

    public InstructionScreen()
    {
        super(600,400,1);
        
        //create array of labels
        screens = new Label[1];

        //add buttons to screen
        Button nextScreen = new Button(1);
        addObject(nextScreen, 450, 350);

        Button prevScreen = new Button(-1);
        addObject(prevScreen, 150,350);
    }

    public void act()
    {
        if(Greenfoot.mouseClicked(null))
        {
            addObject(screens[index % 2], getHeight() / 2, getWidth() / 2);
        }
    }
}