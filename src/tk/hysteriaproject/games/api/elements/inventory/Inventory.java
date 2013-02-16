package tk.hysteriaproject.games.api.elements.inventory;

/**
 * Describes a slot-based inventory in the abstract
 * Creator: KingBowser
 * Date: 2/15/13
 * Time: 10:51 PM
 * Refer to LICENSE for licensing information
 */
public interface Inventory {

    /**
     * Get the size of the inventory in slots
     *
     * @return size
     */
    public int getSize();

    /**
     * Should return the space currently occupied
     *
     * @return used space count
     */
    public int getSpaceOccupied();

    /**
     * Get the slot for a specific slot-position
     *
     * @param slotID ID of the slot
     * @return slot at position of ID
     */
    public Slot getSlot(int slotID);

    /**
     * Assign a new Slot to a position in the inventory
     *
     * @param slotID       ID of the slot
     * @param newSlotValue new assignment
     */
    public void setSlot(int slotID, Slot newSlotValue);

}
