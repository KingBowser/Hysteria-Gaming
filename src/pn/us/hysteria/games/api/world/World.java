package pn.us.hysteria.games.api.world;

/**
 * Describes the world in which Entities exist
 * Creator: KingBowser
 * Date: 2/14/13
 * Time: 11:43 AM
 * Refer to LICENSE for licensing information
 */
public interface World {

    /**
     * Get the full size of th world
     *
     * @return size of the full world
     */
    public long getWorldSize();

    /**
     * Get the size of the loaded world in whatever unit the game should be using (chunks, miles, clumps...)
     *
     * @return loaded size
     */
    public int getLoadedSize();

}
