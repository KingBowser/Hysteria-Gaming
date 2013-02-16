package tk.hysteriaproject.games.api.elements;

/**
 * Describes an item in its simplest abstract form
 * Creator: KingBowser
 * Date: 2/14/13
 * Time: 5:59 PM
 * Refer to LICENSE for licensing information
 */
public interface Item extends Usable, ItemDescriptor {

    /**
     * Get the item's damage value
     *
     * @return damage value
     */
    public short getDamage();

}
