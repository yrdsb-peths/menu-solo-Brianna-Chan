import greenfoot.*;

public class Button extends Actor
{
    //variable for next world to switch to
    private int next;

    public Button(int next)
    {
        setImage(new GreenfootImage("buttonLong_beige.png"));
        this.next = next;
    }

    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        {
            if(next == 0)
            {
                Greenfoot.setWorld(new InstructionScreen());
            }
            else
            {
                InstructionScreen.index += this.next;
            }
        }
    }
}
