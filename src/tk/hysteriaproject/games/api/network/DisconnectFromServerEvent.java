package tk.hysteriaproject.games.api.network;

import tk.hysteriaproject.api.spec.event.EventPacket;

/**
 * Published when disconnecting from a server
 * Creator: KingBowser
 * Date: 2/15/13
 * Time: 4:19 PM
 * Refer to LICENSE for licensing information
 */
public class DisconnectFromServerEvent extends EventPacket {

    // Variables

    /**
     * Server from which the user wishes to disconnect
     */
    private final Server serverDisconnectingFrom;

    // Constructors

    public DisconnectFromServerEvent(Server server) {
        serverDisconnectingFrom = server;
    }

    // Methods

    /**
     * Get the server from which the front-end user wishes to disconnect
     * @return server
     */
    public Server getServerDisconnectingFrom() {
        return serverDisconnectingFrom;
    }

}
