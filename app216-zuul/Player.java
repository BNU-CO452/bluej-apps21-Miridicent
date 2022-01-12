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
    private int health;
    private int score;
    private int mcname;
    public HashMap<String, String> inven;
    public Item item;
    public int dispell;
    public int defeat;
    /**
     * Constructor for objects of class Player
     */
    public Player()
    {
        // initialise instance variables
        this.health = 5;
        this.score = 0;
        this.mcname = mcname;
        this.dispell = 0;
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
    
    public void nameCharacter(String name)
    {
        String cha = ("What is your name?");
        cha = name;
    }
    
    public int smallboost(int score)
    {
        score = score + 10;
        return score;
    }
    
    public int bigboost(int score)
    {
        score = score + 50;
        return score;
    }
    
    public void addInv(String name, String description)
    {
        inven.put(item.name, item.description);    
    }
    
    public void printInv()
    {
        System.out.print(inven);
    }
}
