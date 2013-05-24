package pn.us.hysteria.games.api.elements.inventory;

import pn.us.hysteria.api.spec.event.EventPacket;

/**
 * Published when an inventory is changed
 * Creator: KingBowser
 * Date: 2/18/13
 * Time: 9:13 PM
 * Refer to LICENSE for licensing information
 */
public class InventoryModifiedEvent extends EventPacket {

    // Variables

    /**
     * Inventory that was modified
     */
    private final Inventory inventoryThatWasModified;

    // Constructors


    public InventoryModifiedEvent(Inventory inventory) {

        inventoryThatWasModified = inventory;

    }

    // Methods

    /**
     * Get the inventory that was modified
     *
     * @return inventory
     */
    public Inventory getInventory() {
        return inventoryThatWasModified;
    }

}
