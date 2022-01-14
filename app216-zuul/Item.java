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
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void getShortDes()
    {
        System.out.println(name);
        
    }
    
    public String getLongDes()
    {
        System.out.println(name + " " + idescription);
        return idescription;
    }
    
    public String getName()
    {
        return name;
    }
}
