import java.util.ArrayList;
/**
 * This app provides a user interface to the
 * stock manager so that users can add, edit,
 * print and remove stock products
 *
 * @author Conor Briggs
 * @version 0.1
 */
public class StockApp
{
    private InputReader reader;
    
    private StockList stock;
    
    /**
     * Constructor for objects of class StockApp
     */
    public StockApp()
    {
        reader = new InputReader();
        
        stock = new StockList();
        //StockDemo demo = new StockDemo(stock);
    }

    /**
     *  Display a list of menu choices and execute
     *  the user's choice.
     */
    public void run()
    {
        boolean finished = false;
        
        while(!finished)
        {
            printHeading();
            printMenuChoices();
           
            String choice = reader.getString("Please enter your choice > ");
            
            finished = executeChoice(choice.toLowerCase());
        }
    }
    
    private boolean executeChoice(String choice)
    {
        if(choice.equals("quit"))
        {
            return true;
        }
        else if(choice.equals("add"))
        {
            int id = reader.getInt("please enter the ID:");
            String name = reader.getString("please enter the name");
            if(stock.findProduct(id) == null)
            {
                Product product = new Product(id, name);
                stock.add(product);
                System.out.println("Product " + product.getID() + ", " + product.getName() + " has been added ");
            }
            else if (stock.findProduct(id) != null)
            {
                System.out.println("There is already a product with that ID");
            }
            else 
            {
                System.out.println("Error, please try again");
            }
        }
        else if (choice.equals("remove"))
        {
            int rid = reader.getInt("please enter the ID of the product you wish removed");
            if(stock.findProduct(rid) != null)
            {
                stock.removeProduct(rid);
                System.out.println("product has been removed");
            }
            else if (stock.findProduct(rid) == null)
            {
                System.out.println("There isn't a product with that ID");  
            }
            else 
            {
                System.out.println("Error, please try again");
        
            }
        }   
        else if(choice.equals("buy"))
        {
            int rid = reader.getInt("please enter the ID of the product you wish purchase");
            int amount = reader.getInt("how much would you like to buy?");
            if(stock.findProduct(rid) != null) 
            {
                stock.buyProduct(rid, amount);
            }
            else if(stock.findProduct(rid) == null)
            {
                System.out.println("There isn't a product with that ID");
            }
        }
        else if(choice.equals("sell"))
        {
            int rid = reader.getInt("please enter the ID of the product you wish sell");
            int amount = reader.getInt("how much would you like to sell?");
            if(stock.findProduct(rid) != null) 
            {
                stock.sellProduct(rid, amount);
            }
            else if(stock.findProduct(rid) == null)
            {
                System.out.println("There isn't a product with that ID");
            }
        }
        else if(choice.equals("search"))
        {
            String keyword = reader.getString("What product do you want to find?");
            Product product = stock.findName(keyword);
            if(product != null)
            {
                System.out.println(product);
            }
            else
            {
                System.out.println("There are no products with that name");
            }
        }
        else if(choice.equals("check"))
        {
            int cid = reader.getInt("input the ID of the product you would like to check");
            stock.checkProduct(cid);
        }
        else if(choice.equals("restock"))
        {
            int rsid = reader.getInt("input the ID of the product you would like to check");
            stock.restockProduct(rsid, 1000);
        }
        else if(choice.equals("print"))
        {
            stock.print();
        }
        
        return false;
    }
   
    /**
     * Print out a menu of operation choices
     */
    private void printMenuChoices()
    {
        System.out.println();
        System.out.println("    Add:        Add a new product");
        System.out.println("    Remove:     Remove an old product");
        System.out.println("    Print:      Print all products");
        System.out.println("    Buy         Buy an amount of a product");
        System.out.println("    Sell        Sell an amount of a product");
        System.out.println("    Search      Search for a product");
        System.out.println("    Check       Checks stock level");
        System.out.println("    Restock     Restocks product if the quantity is low");
        System.out.println("    Quit:       Quit the program");
        System.out.println();        
    }
    
    /**
     * Print the title of the program and the authors name
     */
    private void printHeading()
    {
        System.out.println("********************************");
        System.out.println("  App21-04: Stock Application ");
        System.out.println("      by Conor Briggs");
        System.out.println("********************************");
    }
    
}