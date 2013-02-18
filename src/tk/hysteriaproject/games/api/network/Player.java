package tk.hysteriaproject.games.api.network;

import tk.hysteriaproject.games.api.elements.Chat;
import tk.hysteriaproject.games.api.world.entity.NamedEntity;

/**
 * Describes a player, on a remote server
 * Creator: KingBowser
 * Date: 2/16/13
 * Time: 11:51 PM
 * Refer to LICENSE for licensing information
 */
public interface Player extends Chat.Message.Sender {

    /**
     * Get the name of the player
     *
     * @return player's name
     */
    public String getName();

    /**
     * Get the URI to the texture of the player
     *
     * @return URI of the texture for the player
     */
    public String getTextureURI();

    /**
     * Whether or not the player has a corresponding entity at the moment
     *
     * @return entity existance
     */
    public boolean playerHasEntity();

    /**
     * Should the player have a corresponding entity, this method will retreive it
     *
     * @return player entity
     */
    public NamedEntity getPlayerEntity();

}
