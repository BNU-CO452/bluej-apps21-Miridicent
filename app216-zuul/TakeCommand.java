
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
    String take;
    public Item item;
    /**
     * Take an item from a location and add it
     * to the player's inventory.
     */
    public TakeCommand(Game zuul, String take)
    {
        super(zuul);
        this.take = take;
    }    

    public void execute()
    {
        if(take == null) 
        {
            // if there is no second word, we don't know what to take...
            System.out.println("Take what?");
            return;
        }
        else if(take != null)
        {
            zuul.PLAYER.findItem();
            if(zuul.PLAYER.findItem().contains(take))
            {
                zuul.PLAYER.addInv(item.name, item.description);
                System.out.print("Item added to Inventory");
            }
            else
            {
                System.out.println("You can't take that");
            }
        }
        Map map = zuul.MAP;
        // remove the item from the current room
        // and add it to the player's inventory
        // Print out a suitable message.
    }
}
