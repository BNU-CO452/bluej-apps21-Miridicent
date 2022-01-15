
/**
 * This contains all the possible command words
 * for the game of Zuul
 *
 * @author Derek Peacock & Nicholas Day
 * Modified by Conor Briggs
 * @version 25-08-2021
 */
public enum CommandWords
{
    GO   ("go","Exit location in <direction>"),
    TAKE ("take", "Take <item> from location"),
    HELP ("help", "List all available commands"),
    QUIT ("quit", "End the game"),
    CAST ("cast", "Cast a spell"),
    MAP  ("map", "See the map"),
    BAG  ("bag", "See Inventory"),
    NHILO ("nhilo","Use when time are most dire");
    
    public final String word;
    public final String description;
    /**
     * Constructor for the command words 
     */
    CommandWords(String word, String description)
    {
        this.word = word;
        this.description = description;
    }
}
