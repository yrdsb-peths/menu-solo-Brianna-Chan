import greenfoot.*;

public class Button extends Actor
{
    //variable for which number the button is
    private int num;

    public Button(String image, int num)
    {
        setImage(new GreenfootImage(image));
        this.num = num;
    }
    
    /*
     * return button number if clicked
    */
    public int getButton()
    {
        if(Greenfoot.mouseClicked(this))
        {
            return this.num;
        }
        else
        {
            return 0;
        }
    }
}


