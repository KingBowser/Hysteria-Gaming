package tk.hysteriaproject.games.api.elements;

/**
 * Describes an item in its simplest abstract form
 * Creator: KingBowser
 * Date: 2/14/13
 * Time: 5:59 PM
 * Refer to LICENSE for licensing information
 */
public interface Item extends Usable {

    /**
     * Get the ID of the item
     * @return item id
     */
    public int getID();

    /**
     * Get the name of the item
     * @return item name
     */
    public String getName();

    /**
     * Get the type descriptor
     * @return item type
     */
    public ItemType getType();

}
