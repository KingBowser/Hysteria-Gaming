package pn.us.hysteria.games.api.world.entity;

/**
 * Describes a thing that deals deals damage
 * Creator: KingBowser
 * Date: 2/14/13
 * Time: 1:47 PM
 * Refer to LICENSE for licensing information
 */
public interface DamageSource {

    /**
     * Get the damage count that the DamageSource is capable of dealing
     *
     * @return damage done
     */
    public short getDamage();

}
