package pn.us.hysteria.games.api.world.entity;

import pn.us.hysteria.games.api.elements.Chat;

/**
 * Describes an Entity with a name, like an NPC or a Player
 * Creator: KingBowser
 * Date: 2/14/13
 * Time: 2:01 PM
 * Refer to LICENSE for licensing information
 */
public interface NamedEntity extends Entity, Chat.Message.Sender {

    /**
     * Get the name of the NamedEntity
     *
     * @return entity name
     */
    public String getName();

}
