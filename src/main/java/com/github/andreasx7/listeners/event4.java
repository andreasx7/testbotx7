package com.github.andreasx7.listeners;

import org.javacord.api.event.message.MessageCreateEvent;
import org.javacord.api.listener.message.MessageCreateListener;

public class event4 implements MessageCreateListener {

    @Override
    public void onMessageCreate(MessageCreateEvent event) {
        if (event.getMessageContent().contains("bot") && !event.getMessageAuthor().isBotUser()) {
            event.getChannel().sendMessage("bot en kamis");
        }

    }

}
