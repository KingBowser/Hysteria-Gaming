package pn.us.hysteria.games.api.elements.inventory;

/**
 * Defines an inventory used to perform transforms based on the items currently within it, much like Minecraft's machines
 * Creator: KingBowser
 * Date: 2/15/13
 * Time: 11:30 PM
 * Refer to LICENSE for licensing information
 */
public interface TransformInventory extends Inventory {

    /**
     * Called to determine whether or not the arrangement and/or selection of items in the TransformInventory
     * -- constitute(s) a valid transform
     *
     * @return transform validity
     */
    public boolean isCurrentTransformValid();

    /**
     * Get the result of the transform
     *
     * @return transform result, null (or 'air' item, if applicable) if an invalid transform is specified
     */
    public Slot getTransformResult();

}
