package pn.us.hysteria.games.api.elements.inventory;

import tk.hysteriaproject.api.spec.event.EventPacket;

/**
 * Event that may be published when a Slot is moved either by the engine or the player
 * IE: "Moving" a slot is assigning the Slot to a different ID within the original inventory
 * Creator: KingBowser
 * Date: 2/15/13
 * Time: 11:50 PM
 * Refer to LICENSE for licensing information
 */
public class SlotIDChangeEvent extends EventPacket {

    /**
     * The old and new (respectively) Slot locations
     */
    private final int oldSlotID, newSlotID;

    /**
     * The old and new (respectively) Inventories
     */
    private final Inventory originalInventory, newInventory;

    /**
     * The Slot being moved
     */
    private final Slot objectChangingStates;

    // Constructors

    /**
     * Create the packet
     *
     * @param slot   slot being moved
     * @param oldInv original inventory
     * @param oldID  original slot ID
     * @param newInv new inventory
     * @param newID  new ID
     */
    public SlotIDChangeEvent(Slot slot, Inventory oldInv, int oldID, Inventory newInv, int newID) {

        objectChangingStates = slot;

        originalInventory = oldInv;
        oldSlotID = oldID;

        newInventory = newInv;
        newSlotID = newID;

    }

    // Methods

    /**
     * Is the slot being assigned to a new inventory?
     *
     * @return whether or not the assignment is a move between inventories
     */
    public boolean isCrossInventory() {
        return originalInventory != newInventory;
    }

    /**
     * Get the original inventory
     *
     * @return original inventory
     */
    public Inventory getOriginalInventory() {
        return originalInventory;
    }

    /**
     * Get the new inventory
     *
     * @return new inventory
     */
    public Inventory getNewInventory() {
        return newInventory;
    }

    /**
     * Get the originating slot's ID assignment within the SlotIDChangeEvent#getOriginalInventory()
     *
     * @return original ID assignment
     */
    public int getOriginalSlotID() {
        return oldSlotID;
    }

    /**
     * Get the new slot ID assignment in the new inventory
     *
     * @return new slot ID assignment
     */
    public int getNewSlotID() {
        return newSlotID;
    }

    /**
     * Get the Slot being re-assigned to new IDs and/or inventories
     *
     * @return Slot being assigned to new IDs/inventories
     */
    public Slot getSlot() {
        return objectChangingStates;
    }
}
