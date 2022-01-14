import java.util.HashMap;
/**
 * This command allows the player to
 * take or pickup an item from a room
 * and carry it around to use somewhere
 * else
 *
 * @author Derek Peacock & Nicholas Day
 * Modified by Conor Briggs
 * @version 2021-08-23
 */
public class TakeCommand extends ZuulCommand
{
    String get;
    public Item item;
    public Location location;
    /**
     * Take an item from a location and add it
     * to the player's inventory.
     */
    public TakeCommand(Game zuul, String get)
    {
        super(zuul);
        this.get = get;
        
    }    

    public void execute()
    {
        if(get == null) 
        {
            // if there is no second word, we don't know what to take...
            System.out.println("Take what?");
            return;
        }
    

        Map map = zuul.MAP;
        Player player = zuul.PLAYER;
        // remove the item from the current room
        // and add it to the player's inventory
        // Print out a suitable message.
        if(item.getName().equals("ChamberKey"))
        {
            player.inventory.add(item);
           
        }
    }    
}
