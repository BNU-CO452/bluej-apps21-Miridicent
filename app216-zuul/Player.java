import java.util.HashMap;
import java.util.ArrayList;
/**
 * Write a description of class Player here.
 *
 * @author (Conor Briggs)
 * @version (a version number or a date)
 */
public class Player
{ 
    // instance variables - replace the example below with your own
    public int health;
    public HashMap<String, String> inven;
    public Item item;
    public Location location;
    /**
     * Constructor for objects of class Player
     */
    public Player()
    {
        // initialise instance variables
        this.health = 3;
        this.item = item;
        inven = new HashMap<>();
        
    }

    /**
     * Decrease the players health 
     */
    public int decreaseHealth()
    {
        health = health - 1; 
        return health;
    }
    
    
    
    
    
    
    
}
