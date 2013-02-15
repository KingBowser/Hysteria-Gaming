package tk.hysteriaproject.games.api.world.entity;

import tk.hysteriaproject.games.api.LocationSettable;

/**
 * Describes an entity of any variety
 * Creator: KingBowser
 * Date: 2/14/13
 * Time: 11:50 AM
 * Refer to LICENSE for licensing information
 */
public interface Entity extends LocationSettable, DamageSource {

    /**
     * Get the entity's HP count
     *
     * @return HP
     */
    public short getLife();

    /**
     * Whether or not the entity is alive
     *
     * @return alive-nes
     */
    public boolean isAlive();

    /**
     * Kills the entity
     */
    public void kill();

    /**
     * Attack the entity from a damage source
     *
     * @param attackedBy the damagesource dealing damage to the entity
     */
    public void attack(DamageSource attackedBy);

    /**
     * Get the entity's aggressiveness descriptor
     *
     * @return aggressiveness
     */
    public Aggressiveness getEntityAggressiveness();

    /**
     * Get the ID of the entity
     *
     * @return entity ID
     */
    public int getID();

}
