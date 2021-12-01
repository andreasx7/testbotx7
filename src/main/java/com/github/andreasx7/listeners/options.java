package com.github.andreasx7.listeners;

import org.javacord.api.event.message.MessageCreateEvent;
import org.javacord.api.listener.message.MessageCreateListener;

public class options implements MessageCreateListener {

    @Override
    public void onMessageCreate(MessageCreateEvent event) {
        if (event.getMessageContent().equalsIgnoreCase("option") && !event.getMessageAuthor().isBotUser()) {
            event.getChannel().sendMessage("A is bigger than B.\nA is smaller than C\nC is the number 5");
            event.getApi().addListener(new channelComponents());
        }
    }

}
