package tk.hysteriaproject.games.api.network;

import tk.hysteriaproject.api.spec.event.EventPacket;

/**
 * Creator: KingBowser
 * Date: 2/16/13
 * Time: 11:49 PM
 * Refer to LICENSE for licensing information
 */
public class PlayerJoinEvent extends EventPacket {

    // Variables

    /**
     * The server which the player is joining
     */
    private final Server serverOnWhichPlayerResides;

    /**
     * PLayer joining the server
     */
    private final Player playerJoiningServer;

    // Constructors

    public PlayerJoinEvent(Server joinee, Player joiner) {

        serverOnWhichPlayerResides = joinee;

        playerJoiningServer = joiner;

    }

    // Methods

    /**
     * Get the server which the player is joining
     *
     * @return server
     */
    public Server getServer() {
        return serverOnWhichPlayerResides;
    }

    /**
     * Get the player joining the server
     *
     * @return player
     */
    public Player getPlayer() {
        return playerJoiningServer;
    }

}
