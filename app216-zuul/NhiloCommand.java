
/**
 * Write a description of class NhiloCommand here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NhiloCommand extends ZuulCommand
{
    // instance variables - replace the example below with your own
    String win;

    /**
     * Constructor for objects of class NhiloCommand
     */
    public NhiloCommand(Game zuul)
    {
        super(zuul);
        this.win = win;
    }

    /**
     *Defeats the wizard
     */
    public void execute()
    {
        // put your code here
        System.out.println("A purple bolt flys from your fingers killing the man");
        System.out.println("In the moment the memories of who you are come rushing back");
        System.out.println("You are the royal wizard, you were sent here in order to stop this man from unleashing a devastating spell on the world");
        System.out.println("Looks like you will me returning with a heros welcome");
        System.out.println("");
        System.out.println("Thanks for playing");
        System.exit(0);
    }
}
