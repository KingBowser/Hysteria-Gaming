package tk.hysteriaproject.games.api.network;

import tk.hysteriaproject.api.spec.event.EventPacket;

/**
 * Published when a player leaves the server
 * Creator: KingBowser
 * Date: 2/16/13
 * Time: 11:49 PM
 * Refer to LICENSE for licensing information
 */
public class PlayerLeaveEvent extends EventPacket {
    // Variables

    /**
     * The server which the player is Leaving
     */
    private final Server serverOnWhichPlayerResides;

    /**
     * PLayer Leaving the server
     */
    private final Player playerLeavingServer;

    /**
     * Reason for the player's exit
     */
    private final ExitReason exitReason;

    // Constructors

    public PlayerLeaveEvent(Server leavee, Player leaver, ExitReason reasonExiting) {

        serverOnWhichPlayerResides = leavee;

        playerLeavingServer = leaver;

        exitReason = reasonExiting;

    }

    public PlayerLeaveEvent(Server leavee, Player leaver) {
        this(leavee, leaver, ExitReason.DEFAULT);
    }

    // Methods

    /**
     * Get the server which the player is Leaving
     *
     * @return server
     */
    public Server getServer() {
        return serverOnWhichPlayerResides;
    }

    /**
     * Get the player Leaving the server
     *
     * @return player
     */
    public Player getPlayer() {
        return playerLeavingServer;
    }

    /**
     * Get the reason provided for the player's exiting
     *
     * @return exit reason
     */
    public ExitReason getExitReason() {
        return exitReason;
    }

    /**
     * Describes the reason for a player's exiting of a server
     */
    public static interface ExitReason {

        /**
         * Default exit reason
         */
        public static final ExitReason DEFAULT = new ExitReason() {
            @Override
            public String getExitReason() {
                return "Unknown Reason";
            }
        };

        /**
         * Get the reason for exit
         *
         * @return reason
         */
        public String getExitReason();

    }

}
