import java.util.ArrayList;
/**
 * Write a description of class HelpCommand here.
 *
 * @author (Conor Briggs)
 * @version (a version number or a date)
 */
public class HelpCommand extends ZuulCommand
{
    public HelpCommand(Game zuul)
    {
        super(zuul);
    }

    /**
     * Print out some help information.
     * Here we print some stupid, cryptic message and
     * a list of the command words.
     */
    public void execute()
    {
        System.out.println(" A vision fills your mind");
        System.out.println(" they reveal secrets and truths of the world.");        
        System.out.println();
        System.out.println(" Your command words are:");
        System.out.println();
        
        for(CommandWords command : CommandWords.values())
        {
            System.out.println(" " + command.word + 
                               "\t  : " + command.description);                        
        }   
        System.out.println();
        System.out.println(" e.g. go west, take gold");
        System.out.println();
        System.out.println(zuul.MAP.getCurrentLocation().getLongDescription());
    }
}
