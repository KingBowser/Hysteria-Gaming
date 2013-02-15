package tk.hysteriaproject.games.api.elements;

import java.util.Collection;

/**
 * Describes a "chat".
 * Contains messages from said chat
 * Creator: KingBowser
 * Date: 2/15/13
 * Time: 12:01 PM
 * Refer to LICENSE for licensing information
 */
public interface Chat {

    /**
     * Add a message to the chat
     *
     * @param message message to add
     */
    public void addMessage(Message message);

    /**
     * Should return a collection of all the messages in the chat
     *
     * @return messages
     */
    public Collection<Message> getMessages();

    /**
     * Clear the chat
     */
    public void clear();

    /**
     * Defines a chat message
     */
    public interface Message {

        /**
         * Get the message contents
         *
         * @return contents
         */
        public String getContents();

        /**
         * Get the sender of the message
         *
         * @return message sender
         */
        public Sender getSender();

        /**
         * Describes a thing which sends a message
         */
        public interface Sender {

            /**
             * Get the name of the sender
             *
             * @return name
             */
            public String getSenderName();

        }

    }

}
