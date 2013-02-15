package tk.hysteriaproject.games.api.world;

import tk.hysteriaproject.api.spec.event.EventPacket;
import tk.hysteriaproject.games.api.world.entity.Entity;

/**
 * Published when an entity enters the world
 * Creator: KingBowser
 * Date: 2/15/13
 * Time: 4:55 PM
 * Refer to LICENSE for licensing information
 */
public class WorldEnterEvent extends EventPacket {

    // Variables

    /**
     * World entered by the entity
     */
    private final World worldAccessed;

    /**
     * Entity entering the world
     */
    private final Entity entityInWorld;

    // Constructors

    public WorldEnterEvent(World entering, Entity enterer) {

        worldAccessed = entering;

        entityInWorld = enterer;

    }

    // Methods

    /**
     * Get the entity in question
     *
     * @return entity
     */
    public Entity getEntity() {
        return entityInWorld;
    }

    /**
     * Get the world in question
     *
     * @return world
     */
    public World getWorld() {
        return worldAccessed;
    }

}
