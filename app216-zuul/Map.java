
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
        dispell = 0;
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

        currentLocation = entrance;  // start game outside
    }
    
    /**
     * Create the outside and link it to the
     * theatre, lab and pub
     */
    private void createEntrance()
    {
        entrance = new Location("You stand in the entrance,The walls are cracked and the floor is withering away and the sound of battle rages outside the ironclad doors, something isn't right here. To the east there appeaes to be some kind of large chamber");
        
        entrance.setExit("east", chamber);
    }
    
    /**
     * Create the pub and link it to the outside
     */
    private void createChamber()
    {
        chamber = new Location("The chamber is large and derelict, clearly someone hasn't been keeping the place clean. to the north and south are equally decrepit hallways, to the east is a large door with suspicious looking runes placed on it ");
        
        chamber.setExit("north", hallwayone);
        chamber.setExit("south", hallwaytwo);
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
        hallwayone = new Location("in a lecture theater");
        
        hallwayone.setExit("west", study);
        hallwayone.setExit("east", magiclab);
    }
    
    /**
     * Create the office linked to the lab
     */
    private void createHallwaytwo()
    {
        hallwaytwo = new Location("in the computing admin office");
        
        hallwaytwo.setExit("west", kitchen);
        hallwaytwo.setExit("east", dining);
    }
    
    /**
     * Create the lab and link it to the outside and office
     */
    private void createStudy()
    {
        // create the Locations
        study = new Location("in a computing lab");
        
        study.setExit("east", hallwayone);
    }
    
    /**
     * Create the lab and link it to the outside and office
     */
    private void createMagiclab()
    {
        // create the Locations
        magiclab = new Location("in a computing lab");
        
        magiclab.setExit("west", hallwayone);
    }
    
    /**
     * Create the lab and link it to the outside and office
     */
    private void createKitchen()
    {
        // create the Locations
        kitchen = new Location("in a computing lab");
        
        kitchen.setExit("east", hallwaytwo);
    }
    
    /**
     * Create the lab and link it to the outside and office
     */
    private void createDining()
    {
        // create the Locations
        dining = new Location("in a computing lab");
        
        dining.setExit("west", hallwaytwo);
    }
    
    /**
     * Create the lab and link it to the outside and office
     */
    private void createStairs()
    {
        // create the Locations
        stairs = new Location("in a computing lab");
        
        stairs.setExit("east", centre);
    }
    
    /**
     * Create the lab and link it to the outside and office
     */
    private void createCentre()
    {
        // create the Locations
        centre = new Location("in a computing lab");
        
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
