package pn.us.hysteria.games.api.elements.inventory;

import tk.hysteriaproject.api.spec.event.EventPacket;

/**
 * Similar to {@code SlotIDChangeEvent}, but describes only the assignment of a new value to a slot position
 * Creator: KingBowser
 * Date: 2/16/13
 * Time: 12:08 AM
 * Refer to LICENSE for licensing information
 */
public class PositionAssignmentEvent extends EventPacket {

    // Variables

    /**
     * The inventory in which the change has been proposed
     */
    private final Inventory changeReceiver;

    /**
     * The slot at which the change was proposed
     */
    private final int slotIDInInventory;

    /**
     * The proposed value for the specified slot
     */
    private final Slot newAssigment;

    // Constructors

    public PositionAssignmentEvent(Inventory changing, int locus, Slot newValue) {

        changeReceiver = changing;

        slotIDInInventory = locus;

        newAssigment = newValue;

    }

    // Methods

    /**
     * Get the site of the proposed modification
     *
     * @return inventory
     */
    public Inventory getInventory() {
        return changeReceiver;
    }

    /**
     * Get the point in the inventory at which the change was proposed
     *
     * @return slot ID
     */
    public int getChangeLocus() {
        return slotIDInInventory;
    }

    /**
     * Get the proposed value for the locus
     *
     * @return proposed value
     */
    public Slot getProposedValue() {
        return newAssigment;
    }


}
