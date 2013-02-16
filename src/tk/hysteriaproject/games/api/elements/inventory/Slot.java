package tk.hysteriaproject.games.api.elements.inventory;

import tk.hysteriaproject.games.api.elements.Item;
import tk.hysteriaproject.games.api.elements.Usable;

/**
 * Describes a set of many of the same item [in an inventory]
 * Creator: KingBowser
 * Date: 2/15/13
 * Time: 10:54 PM
 * Refer to LICENSE for licensing information
 */
public interface Slot extends Usable {

    /**
     * Get the count of items in the stack
     *
     * @return amount of items
     */
    public short getAmount();

    /**
     * Gets the item at the top of the stack
     * This should be the item that will be used in any event requiring use of the Slot.
     *
     * @return item
     */
    public Item getTopMost();

    /**
     * Get the type of item in the stack
     *
     * @return item
     */
    public Class<Item> getItemType();

    /**
     * Increases the number of items in the stack
     */
    public void addItem();

    /**
     * Pops the topmost item off the stack, moving the new one up, and returns the old one
     *
     * @return item
     */
    public Item removeItem();

    /**
     * Scale the stack to the specified number of items
     * The stack should be scaled in such a manner that the topmost items are kept, whilst the lowermost items (should they exceed the new bounds) are removed.
     *
     * @param stackSize size to which the stack should be scaled
     */
    public void setCount(short stackSize);

}
