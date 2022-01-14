
/**
 * Write a description of class BagCommand here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BagCommand extends ZuulCommand
{
    // instance variables - replace the example below with your own
    String bag;

    /**
     * Constructor for objects of class BagCommand
     */
    public BagCommand(Game zuul)
    {
        super(zuul);
        this.bag = bag;
    }

    /**
     * allows the player to view there inventory
     */
    public void execute()
    {
        System.out.println(zuul.PLAYER.inventory);    
    }
}
