
/**
 * Write a description of class Item here.
 *
 * @author (Conor Briggs)
 * @version (a version number or a date)
 */
public class Item
{
    // instance variables - replace the example below with your own
    private int id;
    private String name;
    private String description;

    /**
     * Constructor for objects of class Item
     */
    public Item()
    {
        // initialise instance variables
        this.id = id;
        this.name = name;
        this.description = description;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getName()
    {
        System.out.println(name);
        return name;
    }
    
    public String getDescription(int id)
    {
        System.out.println(description);
        return description;
    }
    
    public int getID()
    {
        System.out.println(id);
        return id;
    }
}
