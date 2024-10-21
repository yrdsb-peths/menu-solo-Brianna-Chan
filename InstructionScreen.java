import greenfoot.*;

public class InstructionScreen extends World
{
    public static Label screens[] = {new Label("Screen 0", 40), new Label("Screen 1", 40), new Label("Screen 2", 40)};
    public static int index = 0;
    Button nextScreen, prevScreen;

    public InstructionScreen()
    {
        super(600,400,1);
        
        //add buttons to screen
        nextScreen = new Button(1);
        addObject(nextScreen, 450, 350);
        prevScreen = new Button(-1);
        addObject(prevScreen, 150,350);

        //add screen number label
        addObject(screens[index], getHeight() / 2, getWidth() / 2);
    }

    public void act()
    {
        //update label if mouse is clicked
        if(Greenfoot.mouseClicked(null))
        {
            //check for changes in index for either buttons
            nextScreen.updateIndex();
            prevScreen.updateIndex();

            //remove previous lale and add new one
            removeObjects(getObjects(Label.class));
            addObject(screens[index], getHeight() / 2, getWidth() / 2);
        }
    }
}