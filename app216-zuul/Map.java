
/**
 * This class is reponsible for creating and
 * linking all the Locations in the game to
 * form a 2D or 3D network
 *
 *  [Pub]<---->[Outside]<---->[Theatre]
 *                 |
 *          [Computer Lab]<---->[Office]
 *             
 * @author Derek Peacock and Nicholas Day
 * Modified by Conor Briggs
 * @version 2021-08-22
 */
public class Map
{
    // Need to add a list of exits
    
    private Location entrance, chamber, hallwayone, hallwaytwo, study, magiclab, kitchen, dining, stairs, centre;

    private Location currentLocation;
    
    private int dispell;

    /**
     * Constructor for objects of class Map
     */
    public Map()
    {
        createLocations();
        this.dispell = 0;
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
     * Create the outside and link it to the
     * theatre, lab and pub
     */
    private void createEntrance()
    {
        entrance = new Location("You stand in the entrance,The walls are cracked and the floor is withering away and the sound of battle rages outside the ironclad doors, something isn't right here. To the east there appeaes to be some kind of large chamber");
        
        
        entrance.setItem(new Item("ChamberKey", "an old rusty key" , 101));
    }
    
    /**
     * Create the pub and link it to the outside
     */
    private void createChamber()
    {
        chamber = new Location("The chamber is large and derelict, clearly someone hasn't been keeping the place clean. to the north and south are equally decrepit hallways, to the east is a large door with suspicious looking runes placed on it ");
        
        entrance.setExit("east", chamber);
        chamber.setExit("west", entrance);
        if (dispell == 4) 
        {
            chamber.setExit("east", stairs);
        }
        else
        {
            System.out.println("The magic on the door blocks you from opening it, you won't be getting in there without dispelling it first");
        }
    }
    
    /**
     * Create the theatre linked to the outside
     */
    private void createHallwayone()
    {
        hallwayone = new Location("A decrepit hallway meets you. to the west is a room full of books and paper, to the east is what appears to be a lab of some sort");
        
        chamber.setExit("north", hallwayone);
        hallwayone.setExit("south", chamber);
    }
    
    /**
     * Create the office linked to the lab
     */
    private void createHallwaytwo()
    {
        hallwaytwo = new Location("The hallway is old and cracked, to the west there seems to be a white room full cooking tools, to the east a long table with over a dozen chairs");
        
        hallwaytwo.setExit("north", chamber);
        chamber.setExit("south", hallwaytwo);
    }
    
    /**
     * Create the lab and link it to the outside and office
     */
    private void createStudy()
    {
        // create the Locations
        study = new Location("books and paper are scattered all over the floor and the book shelves look like there about to collapse, this study hasn't been used in a long time");
        
        study.setItem(new Item("Notebook", "A compleatly full note book", 102));
        hallwayone.setExit("west", study);
        study.setExit("east", hallwayone);
    }
    
    /**
     * Create the lab and link it to the outside and office
     */
    private void createMagiclab()
    {
        // create the Locations
        magiclab = new Location("Vials of bizarre looking mixtures line the table as well a burners, beakers and a complex looking book about the lifecycle of the rascetseen (Whatever that is)");
        
        hallwayone.setExit("east", magiclab);
        magiclab.setExit("west", hallwayone);
    }
    
    /**
     * Create the lab and link it to the outside and office
     */
    private void createKitchen()
    {
        // create the Locations
        kitchen = new Location("The kitchen despite being old is surprisingly normal compared to a lot of the castle, it's walls are lined with ovens stoves and some strage box contraption labled as a Microwave");
        
        hallwaytwo.setExit("west", kitchen);
        kitchen.setExit("east", hallwaytwo);
    }
    
    /**
     * Create the lab and link it to the outside and office
     */
    private void createDining()
    {
        // create the Locations
        dining = new Location("The dining table present here looks as if it could hold a small army of people and yet it stands quite empty now");
        
        hallwaytwo.setExit("east", dining);
        dining.setExit("west", hallwaytwo);
    }
    
    /**
     * Create the lab and link it to the outside and office
     */
    private void createStairs()
    {
        // create the Locations
        stairs = new Location("The staircase spirals downwards in to an inky black abyss, who knows what horrors lurk in the depths (you haven't seen any monsters yet but who knows)");
        
    }
    
    /**
     * Create the lab and link it to the outside and office
     */
    private void createCentre()
    {
        // create the Locations
        centre = new Location("a strangly familier figure stands at the centre of a large swirling room look at battle taking place outside the walls of the castle");
        
        stairs.setExit("east", centre);
    }
    
    public Location getCurrentLocation()
    {
        return currentLocation;
    }
    
    public void enterLocation(Location nextLocation)
    {
        currentLocation = nextLocation;
    }
}
