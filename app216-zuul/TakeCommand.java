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
    public HashMap<String, String> stuff;
    /**
     * Take an item from a location and add it
     * to the player's inventory.
     */
    public TakeCommand(Game zuul, String get)
    {
        super(zuul);
        this.get = get;
        stuff = new HashMap<>();
        stuff.put("ChamberKey", "An old rusty key");
    }    

    public void execute()
    {
        if(get == null) 
        {
            // if there is no second word, we don't know what to take...
            System.out.println("Take what?");
            return;
        }
        else if(get != null && get == "ChamberKey")
        {
            zuul.PLAYER.inven.put("Chamber key", "an old rusty key");
            System.out.println("Item added");
        }
    }

    Map map = zuul.MAP;
    // remove the item from the current room
    // and add it to the player's inventory
    // Print out a suitable message.
    
}
