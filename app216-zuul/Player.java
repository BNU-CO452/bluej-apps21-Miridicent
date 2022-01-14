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
    private int score;
    private int mcname;
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
        this.score = 0;
        this.mcname = mcname;
        this.item = item;
        inven = new HashMap<>();
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int decreaseHealth(int health)
    {
        health = health - 1; 
        return health;
    }
    
    /**
     * get characters name 
     */
    public void nameCharacter(String name)
    {
        String cha = ("What is your name?");
        cha = name;
    }
    
    /**
     * increace score by 10
     */
    public int smallboost(int score)
    {
        score = score + 10;
        return score;
    }
    
    /**
     * increace score by 50
     */
    public int bigboost(int score)
    {
        score = score + 50;
        return score;
    }
    
    /**
     * Add Item to inven
     */
    public void addInv(Item item)
    {
        inven.put(item.name, item.idescription);    
    }
       
    /**
     * Display Inventory
     */
    public void printInv()
    {
        System.out.print(inven);
    }
    
}
