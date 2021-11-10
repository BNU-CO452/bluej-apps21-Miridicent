
/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author David J. Barnes and Michael Kölling.
 * Modified by Conor Briggs
 * @version 2016.02.29
 */
public class StockDemo
{
   // The stock manager.
   public StockList stock;

   /**
     * Create a StockManager and populate it with at least
     * 10 sample products.
     */
    public StockDemo() 
    {
       this.stock = new StockList();
        
       // Add at least 10 products, they must be unique to you
       // Make sure the ids are sequential numbers
        
       stock.add(new Product(1, "Elisans Draught"));
       stock.add(new Product(2, "1001 Spells for Dummies"));
       stock.add(new Product(3, "Stun Orb"));
       stock.add(new Product(4, "Mana Locator"));
       stock.add(new Product(5, "Novice Ritual Magic Set"));
       stock.add(new Product(6, "Cure Alls"));
       stock.add(new Product(7, "Arcantus Venom"));
       stock.add(new Product(8, "Guide to Elemental Manipulation"));
       stock.add(new Product(9, "Tulaclion Remedy"));
       stock.add(new Product(10, "Kitsune Repellent"));
        
        
       runDemo();
    }
    
  /**
    * Provide a demonstration of how the ProductList meets all
    * the user requirements by making a delivery of each product 
    * buying it in various amounts and then selling each
    * product by various amounts. Make sure all the requirements
    * have been demonstrated.
   */
    public void runDemo()
    {
       // Show details of all of the products before delivery.
        
       stock.print();

       buyProducts();
       stock.print();        

       sellProducts();
       stock.print();
        
       removeProducts();
       stock.print();
       
       findProductname();
    }
    
   /**
    * sells an amount of the products specified
    * if there are none then the program will inform the User
    */
    private void buyProducts()
    {
       stock.buyProduct(1, 505);
       stock.buyProduct(2, 600);
       stock.buyProduct(3, 1000);
       stock.buyProduct(4, 1340);
       stock.buyProduct(5, 2304);
       stock.buyProduct(6, 901);
       stock.buyProduct(7, 869);
       stock.buyProduct(8, 1102);
       stock.buyProduct(9, 3456);
       stock.buyProduct(10, 899);
    }

   /**
    * buys an amount of the products specified
    * if there are none then the program will inform the buyer
    */
    private void sellProducts()
    {
       stock.sellProduct(1, 500);
       stock.sellProduct(2, 556);
       stock.sellProduct(3, 789);
       stock.sellProduct(4, 102);
       stock.sellProduct(5, 1234);
       stock.sellProduct(6, 435);
       stock.sellProduct(7, 123);
       stock.sellProduct(8, 678);
       stock.sellProduct(9, 1678);
       stock.sellProduct(10, 476);
    }  
   
   /**
    * removes the specified products from the stock list
    */ 
   private void removeProducts()
    {
       stock.removeProduct(1);
       stock.removeProduct(2);
    }
   
   /**
    * finds and displays products based on names
    */
   private void findProductname()
   {
       stock.findName("Cure Alls");
       stock.findName("Tulaclion Remedy");
   }
   
   private void checkProductamount()
   {
       stock.checkProduct(1);
       stock.checkProduct(2);
       stock.checkProduct(3);
       stock.checkProduct(4);
       stock.checkProduct(5);
       stock.checkProduct(6);
       stock.checkProduct(7);
       stock.checkProduct(8);
       stock.checkProduct(9);
       stock.checkProduct(10);
   }
}