package com.github.andreasx7.listeners;

import org.javacord.api.event.message.MessageCreateEvent;
import org.javacord.api.listener.message.MessageCreateListener;

public class artemis implements MessageCreateListener {

    @Override
    public void onMessageCreate(MessageCreateEvent event) {
        if (event.getMessageContent().contains("artemis") && !event.getMessageAuthor().isBotUser()) {
            event.getChannel().sendMessage("nda");
        }
        if (event.getMessageContent().contains("nda") && !event.getMessageAuthor().isBotUser()) {
            event.getChannel().sendMessage("<@330788972731301898>");
        }
        if (event.getMessageContent().contains("lol") && !event.getMessageAuthor().isBotUser()) {
            event.getChannel().sendMessage("lol en pezis");
        }
    }

}
