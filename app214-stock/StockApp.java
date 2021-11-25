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
    
    private int ID;
    
    /**
     * Constructor for objects of class StockApp
     */
    public StockApp()
    {
        this.ID = ID;
        reader = new InputReader();
        
        stock = new StockList();
        
        stock.add(new Product(1, "Elisans Draught"));
        stock.add(new Product(2, "1001 Spells for Dummies"));
        stock.add(new Product(3, "Stun Orb"));
        stock.add(new Product(4, "Mana Locator"));
        stock.add(new Product(5, "Cure Minor"));
        stock.add(new Product(6, "Cure Alls"));
        stock.add(new Product(7, "Arcantus Venom"));
        stock.add(new Product(8, "Guide to Elemental Manipulation"));
        stock.add(new Product(9, "Tulaclion Remedy"));
        stock.add(new Product(10, "Kitsune Repellent"));
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
    
    /**
     * This will execute a spesific function when a keyword is inputted into the terminal
     */
    private boolean executeChoice(String choice)
    {
        // exits the program
        if(choice.equals("quit"))
        {
            return true;
        }
        // Allows the user to add a product
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
        //allows the user to remove a product from the list
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
        // allows the user to buy an amount of a product
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
        // allows the user to sell an amount of a product
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
        // allows the user to search if a spesific item is in the list
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
        // checks if any products are low
        else if(choice.equals("check"))
        {
             stock.checkProduct(ID);
        }
        // restocks products if low
        else if(choice.equals("restock"))
        {
            stock.restockProduct(ID, 1000);
        }
        // Prints the list of products 
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