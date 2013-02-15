package tk.hysteriaproject.games.api.elements;

/**
 * Creator: KingBowser
 * Date: 2/15/13
 * Time: 2:53 PM
 * Refer to LICENSE for licensing information
 */
public class MessageAddEvent {

    // Variables

    /**
     * Message regarded by the event
     */
    private final Chat.Message messageInQuestion;

    // Constructors

    public MessageAddEvent(Chat.Message message) {

        messageInQuestion = message;

    }

    // Methods

    /**
     * Get the message for which the event was created
     *
     * @return message
     */
    public Chat.Message getMessage() {
        return messageInQuestion;
    }

}
