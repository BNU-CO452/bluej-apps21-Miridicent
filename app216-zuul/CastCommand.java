
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
        else if(spell == "Ragnarok")
        {
            zuul.PLAYER.dispell = 1; 
            System.out.println("The massive door at the Centre Chamber has opened ");
        }
        else if(spell == "Nhilo")
        {
            //defeat = 1;
            zuul.MAP.Win();
        }
        else if(spell != "Ragnarok" && spell != "Nhilo")
        {
            //gameover
        }

        Map map = zuul.MAP;
        
    }
}
