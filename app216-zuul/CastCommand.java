
/**
 * Write a description of class CastCommand here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CastCommand extends ZuulCommand
{
    // instance variables - replace the example below with your own
    String spell;
    
    
    /**
     * Constructor for objects of class CastCommand
     */
    public CastCommand(Game zuul, String spell)
    {
        // initialise instance variables
        super(zuul);
        this.spell = spell;
        
    }

    public void execute()
    {
        if(spell == null) 
        {
            // if there is no second word, we don't know what to take...
            System.out.println("Spells? You don't know any spells");
            return;
        }
        else if(spell == "Ragnarok" && zuul.MAP.dispell == false)
        {
            zuul.MAP.dispell = true; 
        }
        else if(spell == "Nhilo")
        {
            //defeat = 1;
            System.out.println("A purple bolt flys from your fingers killing the man");
            System.out.println("In the moment the memories of who you are come rushing back");
            System.out.println("You are the royal wizard, you were sent here in order to stop this man from unleashing a devastating spell on the world");
            System.out.println("Looks like you will me returning with a heros welcome");
            System.out.println("");
            System.out.println("Thanks for playing");
            System.exit(0);
        }
        else if(spell != "Ragnarok" && spell != "Nhilo")
        {
            zuul.PLAYER.decreaseHealth();
            System.out.println("You have " + zuul.PLAYER.health + " health left");
            zuul.gameover();
        }

        Map map = zuul.MAP;
        
    }
}
