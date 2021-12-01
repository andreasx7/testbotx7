package com.github.andreasx7.listeners;

import org.javacord.api.event.message.MessageCreateEvent;
import org.javacord.api.listener.message.MessageCreateListener;

public class event3 implements MessageCreateListener {

    @Override
    public void onMessageCreate(MessageCreateEvent event) {
        if (event.getMessageContent().contains("fact") && !event.getMessageAuthor().isBotUser()) {
            event.getChannel().sendMessage("en krepes oi krepppes");
        }
    }

}
