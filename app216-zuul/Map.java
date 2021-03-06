import java.util.HashMap;
/**
 * This class is reponsible for creating and
 * linking all the Locations in the game to
 * form a 2D or 3D network
 *   [Study] <----> [Hallway1] <----> [Magic Lab]
 *                      |
 *  [Entrance]<---->[Chamber]<---->[Stairs]
 *                      |
 *  [Kitchen]<----> [Hallway 2]<---->[Dining Room]
 *             
 * @author Derek Peacock and Nicholas Day
 * Modified by Conor Briggs
 * @version 2021-08-22
 */
public class Map
{
    // Need to add a list of exits
    
    public Location entrance, chamber, hallwayone, hallwaytwo, study, magiclab, kitchen, dining, stairs, centre;

    public Location currentLocation;
    
    public Location location;
    
    public Player player;
    
    public boolean dispell;
    
    /**
     * Constructor for objects of class Map
     */
    public Map(Player player)
    {
        createLocations();
        this.player = player;
        this.dispell = false;
    }

    /**
     * Create all the Locations and link their exits together.
     * Set the current location to the outside.
     * Both locations need to have been created before
     * their exists are linked.
     */
    private void createLocations()
    {
        createEntrance();
        createChamber();
        createHallwayone();
        createHallwaytwo();
        createStudy();
        createMagiclab();
        createKitchen();
        createDining();
        createStairs();
        createCentre();

        currentLocation = entrance;  // start game entrance
    }
    
    /**
     * Create the entrance and link it 
     */
    private void createEntrance()
    {
        entrance = new Location("You stand in the entrance,something isn't right here.");
        System.out.println("The walls are cracked and the floor is withering away and the sound of battle rages outside the ironclad doors");
        System.out.println("To the east there appears to be a large chamber");
    }
    
    /**
     * Create the chamber and link it
     */
    private void createChamber()
    {
        chamber = new Location("The chamber is large and derelict,  to the north and south are equally decrepit hallways, \n clearly someone hasn't been keeping the place clean. \n to the east is a large door with suspicious looking runes placed on it. \n to get through you may need to CAST a spell ");
        
        entrance.setExit("east", chamber);
        chamber.setExit("west", entrance);
        
    }
    
    /**
     * Create Hallwayone link it
     */
    private void createHallwayone()
    {
        hallwayone = new Location("A decrepit hallway meets you. \n to the west is a room full of books and paper,\n to the east is what appears to be a lab of some sort  ");
        
        
        chamber.setExit("north", hallwayone);
        hallwayone.setExit("south", chamber);
    }
    
    /**
     * Create Hallwaytwo and link it
     */
    private void createHallwaytwo()
    {
        hallwaytwo = new Location("The hallway is old and cracked,\n to the west there seems to be a white room full cooking tools, \n to the east a long table with over a dozen chairs");
        
        
        hallwaytwo.setExit("north", chamber);
        chamber.setExit("south", hallwaytwo);
    }
    
    /**
     * Create the study and link it
     */
    private void createStudy()
    {
        // create the Locations
        study = new Location("books and paper are scattered all over the floor and the book shelves look like there about to collapse,\n this study hasn't been used in a long time");

           
        study.setItem(new Item("Notebook", "A compleatly full note book, one spell stands out, The first part reads rag-----, the rest is faded", 102));
        hallwayone.setExit("west", study);
        study.setExit("east", hallwayone);
    }
    
    /**
     * Create the Magic lab and link it 
     */
    private void createMagiclab()
    {
        // create the Locations
        magiclab = new Location("Vials of bizarre looking mixtures line the table as well as burners, \n beakers and a complex looking book about the lifecycle of the rascetseen (Whatever that is)");
        
        magiclab.setItem(new Item("Textbook", "research papers based around dispelling a spell used to seal doors, the eligible part reads ---na---", 103));

        hallwayone.setExit("east", magiclab);
        magiclab.setExit("west", hallwayone);
    }
    
    /**
     * Create the Kitchen and link it 
     */
    private void createKitchen()
    {
        // create the Locations
        kitchen = new Location("The kitchen despite being old is surprisingly normal compared to a lot of the castle, \n it's walls are lined with ovens stoves and some strage box contraption labled as a Microwave");
        
        kitchen.setItem(new Item("Cookbook", "spell instructions hidden amongst the cook books, The only part you can make out is -----r--", 103));

        hallwaytwo.setExit("west", kitchen);
        kitchen.setExit("east", hallwaytwo);
    }
    
    /**
     * Create the Dineing room and link it 
     */
    private void createDining()
    {
        // create the Locations
        dining = new Location("The dining table present here looks as if it could hold a small army of people and yet it stands quite empty now");
        
        dining.setItem(new Item("Storybook", "innocent looking book, actually contains spells, one looks more important than the rest, You make out ------ok", 104));
        hallwaytwo.setExit("east", dining);
        dining.setExit("west", hallwaytwo);
    }
    
    /**
     * Create the stairs and link it 
     */
    private void createStairs()
    {
        // create the Locations
        stairs = new Location("The staircase spirals downwards in to an inky black abyss, \n who knows what horrors lurk in the depths (you haven't seen any monsters yet but who knows)");
        
    }
    
    /**
     * Create the centre and link it 
     */
    public void createCentre()
    {
        // create the Locations
        centre = new Location("a strangly familier figure stands at the centre of a large swirling room looking at a battle taking place outside the walls of the castle. \n a faint wisper can be heard at the back of your mind. \n it's saying nhilo magic can stop him... ");
        stairs.setExit("east", centre);
        if (dispell == true) 
        {
            chamber.setExit("east", stairs);
            
        }
    }
    
    public Location getCurrentLocation()
    {
        return currentLocation;
    }
    
    public void enterLocation(Location nextLocation)
    {
        currentLocation = nextLocation;
    }
    
    /**
     * Finds the item in the items Hashmap
     */
    public String findItem()
    {
        if(location.items.containsKey(location.item.getName()))
        {
            return location.item.name; 
        }
        return null;
    }
    
    /**
     * Finds the item description in the items Hashmap
     */
    public String findItemD()
    {
        if(location.items.containsKey(location.item.getName()))
        {
            return location.item.idescription; 
        }
        return null;
    }
    
    
}
