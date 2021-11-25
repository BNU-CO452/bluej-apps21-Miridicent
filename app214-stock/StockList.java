import java.util.ArrayList;

/**
 * Manage the stock in a business.
 * The stock is described by zero or more Products.
 * 
 * @author (Conor Briggs) 
 * @version (a version number or a date)
 */
public class StockList
{
    // A list of the products.
    public ArrayList<Product> stock;
    
    
    /**
     * Initialise the stock manager.
     */
    public StockList()
    {
        stock = new ArrayList<Product>();
    }

    /**
     * Add a product to the list.
     * @param item The product item to be added.
     */
    public void add(Product item)
    {
        stock.add(item);
    }
    
    /**
     * A method to buy a single quantity of the product
     */
    public void buyProduct(int productID)
    {
        buyProduct(productID, 1);
    }
    
    
    /**
     * Buy a quantity of a particular product.
     * Increase the quantity of the product by the given amount.
     * @param id The ID of the product.
     * @param amount The amount to increase the quantity by.
     */
    public void buyProduct(int productID, int amount)
    {
        Product product = findProduct(productID);
        if(product != null) 
        {
            if(product.getQuantity() < 1000)
            {
                product.increaseQuantity(amount);
                System.out.println("Bought " + amount + " of " + product.getName());
                
                // printout message
            }
            else
            {
                System.out.println("Not enough shelf space for " + product.getName() + "Please sell the existing stock");
                // printout message
            }
        }
        else
        {
                System.out.println ("Couldn't find product");

        }
    }
    
    /**
     * Find a product to match the product id,
     * if not found return null
     */
    public Product findProduct(int productID)
    {
        for(Product product : stock)
        {
            if(product.getID() == productID)
                return product;   
        }
        return null;
    }
    
    /**
     * Finds products based on name 
     * if not found return null
     */
    public Product findName(String keyword)
    {
        for(Product product : stock)
        {
            if(product.getName().contains(keyword))
            return product;
        }
        return null;
    }
    
    /**
     * Finds products based on name and prints
     * if not found return null
     */
    public Product findNamep(String keyword)
    {
        for(Product product : stock)
        {
            if(product.getName().contains(keyword));
            System.out.println(product);
        }
        return null;
    }
    
    /**
     * Finds product specified and removes it from the list
     * if not found return null
     */
    public void removeProduct (int productID)
    {
        Product product = findProduct(productID);
        product = product;
        stock.remove(product);
      
    }
    
    /**
     * Checks the amount in each product, 
     * if it's lower than the specified number then it will be displayed
     */
    public Product checkProduct(int productID)
    {
        for(Product product : stock) 
        {
          if(product.getQuantity() <= 50)
          System.out.println(product + " stock is getting low");
        }
        return null;
    }   
    
    /**
     * automatically restocks a product if it gets to low 
     */
    public Product restockProduct(int productID, int amount)
    {
        for(Product product : stock)
        {
          if(product.getQuantity() <= 50)
          product.increaseQuantity(amount);
          System.out.println(product);
        }
     
        return null;
    }
    
    /**
     * A method to sell a single quantity of the product
     */
    public void sellProuduct(int productID)
    {
        sellProduct(productID, 1);
    }
    
    /**
     * Sell one of the given product.
     * Show the before and after status of the product.
     * @param id The ID of the product being sold.
     */
    public void sellProduct(int productID, int amount)
    {
        Product product = findProduct(productID);
        
        if(product != null) 
        {
            if(product.getQuantity() > 0 && product.getQuantity() > amount)
            {
                product.decreaseQuantity(amount);
                System.out.println("Sold " + amount + " of " + product.getName());
                
                // printout message
            }
            else if(product.getQuantity() == 0)
            {
                System.out.println("The product" + product.getName() + "is out of stock");
                // printout message
            }
            
            else 
            {
                System.out.println("Can't sell " + amount + " of " + product.getName() + " because we only have" + product.getQuantity());
            }
        }
        else
        {
            System.out.println ("Couldn't find product");
        }
    }    

    
    /**
     * Locate a product with the given ID, and return how
     * many of this item are in stock. If the ID does not
     * match any product, return zero.
     * @param id The ID of the product.
     * @return The quantity of the given product in stock.
     */
    public int numberInStock(int productID)
    {
        return 0;
    }

    /**
     * Print details of the given product. If found,
     * its name and stock quantity will be shown.
     * @param id The ID of the product to look for.
     */
    public void printProduct(int productID)
    {
        Product product = findProduct(productID);
        
        if(product != null) 
        {
            System.out.println(product.toString());
        }
    }
    
    /**
     * Print out each product in the stock
     * in the order they are in the stock list
     */
    public void print()
    {
        printHeading();
        
        for(Product product : stock)
        {
            System.out.println(product);
        }

        System.out.println();
    }
    
    /**
     * prints the heading of the stock list
     */
    public void printHeading()
    {
        System.out.println();
        System.out.println(" Conor's Stock List");
        System.out.println(" ====================");
        System.out.println();
    }
}