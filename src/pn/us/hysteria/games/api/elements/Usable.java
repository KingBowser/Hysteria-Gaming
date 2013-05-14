package pn.us.hysteria.games.api.elements;

import tk.hysteriaproject.api.spec.event.EventPacket;

/**
 * A thing that may be used
 * Creator: KingBowser
 * Date: 2/14/13
 * Time: 6:16 PM
 * Refer to LICENSE for licensing information
 */
public interface Usable {

    /**
     * "Use" the usable
     *
     * @param usableEvent data to pass regarding the usage of the item
     */
    public void onUse(UsableUsedEvent usableEvent);

    /**
     * Describes the intention to, or the use of, a usable
     */
    public class UsableUsedEvent extends EventPacket {

        /**
         * The thing being passed to the item
         */
        private final Object[] vectorsUseAgainst;

        /**
         * Describes the way in which the Usable is being used in an object-relative manner
         */
        private final EnumUseType mannerOfUse;

        public UsableUsedEvent(EnumUseType manner, Object... intentAgainst) {
            mannerOfUse = manner;

            vectorsUseAgainst = intentAgainst;
        }

    }

    /**
     * Describes the way in which a Usable may be used
     */
    public enum EnumUseType {

        /**
         * The primary use should be the main purpose of the item
         */
        PRIMARY,

        /**
         * The secondary use should be a related purpose, but actuated in a different manner
         */
        SECONDARY,

        /**
         * The "other" use may be a tertiary and/or unrelated use
         */
        OTHER

    }

}
