package org.powerbot.game.bot;

import org.powerbot.game.client.Callback;
import org.powerbot.game.client.Render;
import org.powerbot.game.event.MessageEvent;

/**
 * An implementation of callback responsible for processing client callbacks to appropriate bot functions.
 *
 * @author Timer
 */
public class CallbackImpl implements Callback {
	private final Bot bot;

	public CallbackImpl(final Bot bot) {
		this.bot = bot;
	}

	/**
	 * Updates this bot's render information used to calculate screen vectors.
	 *
	 * @param render
	 */
	public void updateRenderInfo(final Render render) {
	}

	/**
	 * Notifies the bot of of a message dispatched in the game.
	 *
	 * @param id      The Id of the message dispatched.
	 * @param sender  The name of the sender of this message.
	 * @param message The message contents the sender sent.
	 */
	public void notifyMessage(final int id, final String sender, final String message) {
		bot.eventDispatcher.dispatch(new MessageEvent(id, sender, message));
	}
}
