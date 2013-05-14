package pn.us.hysteria.games.api.elements;

/**
 * Describes the basic properties of an item
 * Creator: KingBowser
 * Date: 2/15/13
 * Time: 11:23 PM
 * Refer to LICENSE for licensing information
 */
public interface ItemDescriptor {

    /**
     * Get the ID of the item
     *
     * @return item id
     */
    public int getID();

    /**
     * Get the name of the item
     *
     * @return item name
     */
    public String getName();

    /**
     * Get the type descriptor
     *
     * @return item type
     */
    public ItemType getType();

}
