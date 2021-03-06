
/**
 * Modules to be assigned to courses.
 * @author (Conor Briggs)
 * @version (05/1-/2021)
 */
public class Module
{
    // Unique Module code 
    private String code;
    
    // Title of the module 
    private String title;
    
    //Credit Value for the module
    private int credit;

    /**
     * Create a module with code, title and credit 
     */
    public Module(String code, String title)
    {
        // initialise instance variables
        this.code = code;
        this.title = title;
        credit = 0; 
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getCode()
    {
        return this.code;
    }
 
    public String getTitle()
    {
        return this.title;
    }
    
    //gets credit value
    public int getCredit()
    {
        return this.credit;
    }
    
    //set credit for a module
    public void setCredit(int credit)
    {
        this.credit = credit;
       
    }
    
    //prints moudule information
    public void print()
    {
        //printHeading();
        
        System.out.println(" Module Code: " + code + ": " + title);
        System.out.println(" Credit: " + credit);
    }
}
