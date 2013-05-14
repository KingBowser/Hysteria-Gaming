package pn.us.hysteria.games.api.elements;

import tk.hysteriaproject.api.spec.event.EventPacket;

/**
 * Event published on the use of an item
 * Creator: KingBowser
 * Date: 2/15/13
 * Time: 2:47 PM
 * Refer to LICENSE for licensing information
 */
public class ItemUseEvent extends EventPacket {

    // Variables

    /**
     * Item regarded by the event
     */
    private final Item itemUsed;

    // Constructors

    public ItemUseEvent(Item used) {

        itemUsed = used;

    }

    // Methods

    /**
     * Get the item regarded by the event
     *
     * @return item
     */
    public Item getItemUsed() {
        return itemUsed;
    }

}
