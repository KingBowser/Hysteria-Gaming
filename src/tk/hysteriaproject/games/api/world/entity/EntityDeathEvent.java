package tk.hysteriaproject.games.api.world.entity;

import tk.hysteriaproject.api.spec.event.EventPacket;

/**
 * Creator: KingBowser
 * Date: 2/15/13
 * Time: 4:49 PM
 * Refer to LICENSE for licensing information
 */
public class EntityDeathEvent extends EventPacket {

    // Variables

    /**
     * Entity for which this event exists
     */
    private final Entity entityDied;

    /**
     * DamageSource responsible for the death of the entity in question
     */
    private final DamageSource agressor;

    // Constructors

    public EntityDeathEvent(Entity killed, DamageSource killer) {


        entityDied = killed;

        agressor = killer;

    }

    // Methods

    /**
     * Get the entity fow which this event was published
     * @return dead entity
     */
    public Entity getDeadEntity() {
        return entityDied;
    }

    /**
     * Get the DamageSource responsible for the death of the entity in question
     * @return Killer
     */
    public DamageSource getKiller() {
        return agressor;
    }

}
