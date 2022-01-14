import java.util.HashMap;
/**
 * Write a description of class Item here.
 *
 * @author (Conor Briggs)
 * @version (a version number or a date)
 */
public class Item
{
    // instance variables - replace the example below with your own
    public int id;
    public String name;
    public String idescription;
    /**
     * Constructor for objects of class Item
     */
    public Item(String name, String idescription, int id)
    {
        // initialise instance variables
        this.id = id;
        this.name = name;
        this.idescription = idescription;
    }

    /**
     * Gets the short description for the item
     */
    public void getShortDes()
    {
        System.out.println(name);
        
    }
    
    /**
     * Gets the long description from the item 
     */
    public String getLongDes()
    {
        System.out.println(name + " " + idescription);
        return idescription;
    }
    
    /**
     * Gets the item name
     */
    public String getName()
    {
        return name;
    }
}
