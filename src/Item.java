/**
 * This class represents a shopping item object;
 *
 * @author Evelyn Sionov
 */
public class Item {
    /** The name of the Item*/
    private String name = "";
    /** The price of the Item*/
    private double price;

    /**
     * Instantiates an Item object.
     *
     * @param name The name
     * @param price The price
     */
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    /**
     * Returns the name of the item.
     *
     * @return The name of the item
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the price of the item.
     *
     * @return The price of the item.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Returns a String that includes a description of the item using its instance variables.
     *
     * @return  String representation of the item's description.
     */

    public String itemInfo() {
        return name + ", $" + price + " each";
    }

}