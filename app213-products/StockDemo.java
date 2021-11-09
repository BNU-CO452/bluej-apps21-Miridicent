
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
    }
    
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

    private void sellProducts()
    {
        stock.sellProduct(101, 500);
        stock.sellProduct(102, 556);
        stock.sellProduct(103, 789);
        stock.sellProduct(104, 102);
        stock.sellProduct(105, 1234);
        stock.sellProduct(106, 435);
        stock.sellProduct(107, 123);
        stock.sellProduct(108, 678);
        stock.sellProduct(109, 1678);
        stock.sellProduct(110, 476);
    }  
    
    private void removeProducts()
    {
        stock.removeProduct(1);
        stock.removeProduct(3);
    }
}