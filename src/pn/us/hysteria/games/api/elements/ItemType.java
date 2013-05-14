package pn.us.hysteria.games.api.elements;

/**
 * Describes an item's "type"
 * Creator: KingBowser
 * Date: 2/14/13
 * Time: 6:03 PM
 * Refer to LICENSE for licensing information
 */
public enum ItemType {

    /**
     * Weapons should harm other entities. They may double as tools (see: hammers, etc...)
     */
    WEAPON,

    /**
     * Tools should perform a function (modify the world, cast a spell, open a door, etc...)
     */
    TOOL,

    /**
     * Wearable ItemTypes should be things like armour and hats
     */
    WEARABLE,

    /**
     * Admin ItemTypes should be things that perform an administrative function, like ban a player, etc...
     */
    ADMIN,

    /**
     * Others may do anything not defined in an ItemType
     */
    OTHER

}
