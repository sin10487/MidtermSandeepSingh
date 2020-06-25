package midterm;

/**
 * A class to model items stored in the inventory of a Warehouse. For simplicity, let's assume each item in the
 * inventory has a name, quantity and a unique ID. The system allows to add new items, find quantity by item's ID and
 * print full inventory. Use this code to answer Q#1 and Q#2 of Part B.
 *
 */

public class Item {

    public int itemID;
    private String name;
    private int quantity;

    /**
     * An array to hold up to 100 items.
     */
    public static Item[] inventory = new Item[100];
    private int itemCounter = 0; // counts numbers of items in the inventory.

    /**
     * Constructor takes in item's ID, quantity and it's name.
     *
     * @param itemID Unique ID of the item.
     * @param quantity the quantity of the item.
     * @param name the name of the item.
     */
    public Item(int itemID, int quantity, String name) {
        this.itemID = itemID;
        this.quantity = quantity;
        this.name = name;
    }

    /**
     * A method to add new item into the inventory.
     *
     * @param newItem the item object to be added into the inventory.
     */
    public void addItem(Item newItem) {
        inventory[itemCounter] = newItem;
        itemCounter++;
        quantity++;
    }

    /**
     * A method to print full inventory i.e. item's ID, name and it's quantity.
     */
    public void printInventory() {
        for (int i = 0; i < itemCounter; i++) {
            System.out.println("ID: " + inventory[i].itemID
                    + "\t Name: " + inventory[i].name
                    + "\t Quantity:" + inventory[i].quantity);
        }
    }

    /**
     * A method to get quantity of a specific item in the inventory.
     *
     * @param ID the ID of the item to be searched
     * @return the quantity of the item.
     */
    public int getItemQuantity(int ID) {
        int temp = 0;
        for (int j = 0; j < itemCounter; j++) {
            if (inventory[j].itemID == ID) {
                temp = inventory[j].quantity;
                break;
            }
        }
        return temp;
    }

}
