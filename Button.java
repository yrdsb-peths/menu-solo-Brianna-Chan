import greenfoot.*;

public class Button extends Actor
{
    //variable for which direction to go in terms of instructions screens
    private int next;

    public Button(int next)
    {
        setImage(new GreenfootImage("buttonLong_beige.png"));
        this.next = next;
    }

    public void act()
    {
        //switch from menu screen to instruction screen
        if(Greenfoot.mouseClicked(this))
        {
            if(next == 0)
            {
                Greenfoot.setWorld(new InstructionScreen());
            }
        }
    }
    
    /*
     * update the label index
     */
    public void updateIndex()
    {
        if(Greenfoot.mouseClicked(this))
        {
            //add next value (-1 if going previous screen, 1 if next)
            InstructionScreen.index += this.next;
            
            //cycle array when limits reached
            if(InstructionScreen.index < 0)
            {
                System.out.println(InstructionScreen.index);
                InstructionScreen.index = 2;
            }
            else if(InstructionScreen.index > 2)
            {
                InstructionScreen.index = 0;
            }
        }
    }
}
