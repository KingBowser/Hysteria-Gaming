package tk.hysteriaproject.games.api.network;

import tk.hysteriaproject.api.spec.event.EventPacket;

/**
 * Published when the client connects to a server
 * Creator: KingBowser
 * Date: 2/15/13
 * Time: 3:00 PM
 * Refer to LICENSE for licensing information
 */
public class ConnectingToServerEvent extends EventPacket {

    // Variables

    /**
     * The server that the client is trying to connect
     */
    private final Server serverConnectingTo;

    // Constructors

    public ConnectingToServerEvent(Server server) {

        serverConnectingTo = server;

    }

    // Methods

    /**
     * Get the server that the event was spawned in regard to
     *
     * @return
     */
    public Server getServerConnectingTo() {

        return serverConnectingTo;

    }

}
