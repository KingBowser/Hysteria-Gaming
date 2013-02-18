package tk.hysteriaproject.games.api.elements.inventory;

import tk.hysteriaproject.api.spec.event.EventPacket;

/**
 * Published when a transform completes in a TransformInventory
 * Creator: KingBowser
 * Date: 2/16/13
 * Time: 11:40 PM
 * Refer to LICENSE for licensing information
 */
public class ItemTransformEvent extends EventPacket {

    // Variables

    /**
     * The TransformInventory originating this event
     */
    private final TransformInventory transformOriginator;

    /**
     * The result of the transform currently in the TransformInventory
     */
    private final Slot transformResult;

    // Constructors

    public ItemTransformEvent(TransformInventory creator, Slot result) {

        transformOriginator = creator;

        transformResult = result;

    }

    // Methods

    /**
     * Get the TransformInventory responsible for the publishing of the ItemTransformEvent
     *
     * @return originator
     */
    public TransformInventory getOriginator() {
        return transformOriginator;
    }

    /**
     * Get the resulting item of the transform
     *
     * @return result
     */
    public Slot getTransformResult() {
        return transformResult;
    }

}
