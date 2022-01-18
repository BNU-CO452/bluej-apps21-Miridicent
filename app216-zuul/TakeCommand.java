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
        Location currentLocation = map.getCurrentLocation();
        // remove the item from the current room
        // and add it to the player's inventory
        // Print out a suitable message.
        
        if(get.equals("notebook"))
        {
            player.inven.put("Notebook", "A compleatly full note book, one spell stands out, The first part reads rag-----, the rest is faded");
            System.out.println("Item Added");
        }
        else if(get.equals("textbook"))
        {
            player.inven.put("Textbook", "research papers based around dispelling a spell used to seal doors, the eligible part reads ---na---");
            System.out.println("Item Added");
        }
        else if(get.equals("cookbook"))
        {
            player.inven.put("Cookbook", "spell instructions hidden amongst the cook books, The only part you can make out is -----r--");
            System.out.println("Item Added");
        }
        else if(get.equals("storybook"))
        {
            player.inven.put("Storybook", "innocent looking book, actually contains spells, one looks more important than the rest, You make out ------ok");
            System.out.println("Item Added");
        }
        else if(get.equals("notebook") && player.inven.containsKey("Notebook") || get.equals("textbook") && player.inven.containsKey("Textbook") || get.equals("cookbook") && player.inven.containsKey("Cookbook") ||   get.equals("storybook") && player.inven.containsKey("Storybook"))
        {
            System.out.println("You all ready have that Item");    
        }
    }    
}
