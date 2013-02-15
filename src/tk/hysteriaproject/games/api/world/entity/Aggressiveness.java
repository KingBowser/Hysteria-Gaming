package tk.hysteriaproject.games.api.world.entity;

/**
 * Describes how an entity should be expected to behave relative to the entities around it
 * Creator: KingBowser
 * Date: 2/14/13
 * Time: 12:35 PM
 * Refer to LICENSE for licensing information
 */
public enum Aggressiveness {

    /**
     * Aggressives should attack when approached, or approach and attack
     */
    AGFRESSIVE,

    /**
     * Passives shoul attack when provoked
     */
    PASSIVE,

    /**
     * Neutrals should not respond to others in any way
     */
    NEUTRAL,

    /**
     * Associatives should be attracted to Sentients, other Associatives, and/or Neutrals
     */
    ASSOCIATIVE,

    /**
     * Sentients are players - or smart entities - that should decide when to attack on their "own"
     */
    SENTIENT

}
