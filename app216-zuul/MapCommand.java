
/**
 * Write a description of class MapCommand here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MapCommand extends ZuulCommand
{

    String map;

    /**
     * Constructor for objects of class MapCommand
     */
    public MapCommand(Game zuul)
    {
        super(zuul);
        this.map = map;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void execute()
    {
        System.out.println("The buldings layout flashes in your mind");
        System.out.println("");
        System.out.println("[Study] <----> [Hallway1] <----> [Magic Lab]");
        System.out.println("                   |");
        System.out.println("[Entrance]<---->[Chamber]<---->[Stairs]");
        System.out.println("                   |");
        System.out.println("[Kitchen]<----> [Hallway 2]<---->[Dining Room]");
    }
}
