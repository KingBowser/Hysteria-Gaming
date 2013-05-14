package pn.us.hysteria.games.api.world.entity;

import tk.hysteriaproject.api.spec.event.EventPacket;

/**
 * Published upon the creation of an entity
 * Creator: KingBowser
 * Date: 2/15/13
 * Time: 4:22 PM
 * Refer to LICENSE for licensing information
 */
public class EntityCreationEvent extends EventPacket {

    // Variables

    /**
     * Entity for which the event was created
     */
    private final Entity entityCreating;

    // Constructors

    public EntityCreationEvent(Entity entity) {
        entityCreating = entity;
    }

    // Methods

    /**
     * Get the entity for which this event exists
     *
     * @return entity
     */
    public Entity getEntityCreating() {
        return entityCreating;
    }

    public void cancel() {
        getEntityCreating().kill();
    }

}
