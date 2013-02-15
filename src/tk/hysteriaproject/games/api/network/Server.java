package tk.hysteriaproject.games.api.network;

/**
 * Describes a server
 * Creator: KingBowser
 * Date: 2/14/13
 * Time: 2:18 PM
 * Refer to LICENSE for licensing information
 */
public interface Server {

    /**
     * Get the address of the server
     *
     * @return address
     */
    public String getAddress();

    /**
     * Get the port on which the server is operating
     *
     * @return port
     */
    public int getPort();

    /**
     * Get the name of the server
     *
     * @return server name
     */
    public String getName();

    /**
     * Get the server's "banner" (if applicable)
     *
     * @return server banner, null if none
     */
    public String getBanner();

    /**
     * Get the number of players on the server
     *
     * @return player count
     */
    public int getPlayerCount();

}
