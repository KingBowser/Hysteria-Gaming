package pn.us.hysteria.games.api.module;

import tk.hysteriaproject.api.spec.SuccessState;

/**
 * Provides a command or flag that may be invoked
 * <p/>
 * Creator: KingBowser
 * Date: 5/23/13
 * Time: 8:23 PM
 * Refer to LICENSE for licensing information
 */
public interface Directive {

    /**
     * Get the 'command'
     *
     * @return command name
     */
    public String getDirective();

    /**
     * Get the description of the command
     *
     * @return description
     */
    public String getDescritpion();

    /**
     * Get help for the command
     *
     * @return help
     */
    public String getHelp();

    /**
     * Invoke the command
     *
     * @param commandLine data passed with the command
     * @return success
     */
    public SuccessState invoke(String commandLine);

}
