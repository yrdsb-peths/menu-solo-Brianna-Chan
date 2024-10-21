import greenfoot.*;  

public class MenuScreen extends World
{
    Queue<Face> avatars;      //queue for all the faces
    Button changeAvatar, toInstruct, toScore;      //button that changes avatar
    Face removed;             //face variable that stores face being removed and displayed
    
    public MenuScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        //add buttons for avatar and to go to instructions screen
        changeAvatar = new Button("buttonLong_blue.png", 1);
        addObject(changeAvatar, getWidth()/2, getHeight() / 2);
        toInstruct = new Button("buttonLong_beige.png", 2);
        addObject(toInstruct, 450, 350);
        toScore = new Button("buttonLong_beige.png", 5);
        addObject(toScore, 150,350 );
        
        //add labels
        addObject((new Label("Instructions", 25)), 450, 310);
        addObject((new Label("High Score", 25)), 150, 310);

        //add avatars to world(image)
        avatars = new Queue<>();
        avatars.enqueue(new Face("face_a.png"));
        avatars.enqueue(new Face("face_b.png"));
        avatars.enqueue(new Face("face_c.png"));

        //display first avatar
        removed = avatars.dequeue();
        avatars.enqueue(removed);
        addObject(removed, getWidth() / 2, getHeight() / 2 - 50);
    }

    public void act()
    {
        //if button pressed remove first from queue and add to end of queue
        if(Greenfoot.mouseClicked(null))
        {
            if(changeAvatar.getButton() == 1)
            {
                removeObjects(getObjects(Face.class));
                removed = avatars.dequeue();
                avatars.enqueue(removed);
                addObject(removed, getWidth() / 2, getHeight() / 2 - 50);

            }
            else if(toInstruct.getButton() == 2)
            {
                Greenfoot.setWorld(new InstructionScreen());
                
            }
            else if(toScore.getButton() == 5)
            {
                Greenfoot.setWorld(new HighScoreScreen());
            }
        }
        
    }
}