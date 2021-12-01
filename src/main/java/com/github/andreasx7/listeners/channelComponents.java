package com.github.andreasx7.listeners;

import org.javacord.api.entity.channel.TextChannel;
import org.javacord.api.entity.message.MessageBuilder;
import org.javacord.api.entity.message.component.ActionRow;
import org.javacord.api.entity.message.component.SelectMenu;
import org.javacord.api.entity.message.component.SelectMenuOption;
import org.javacord.api.event.message.MessageCreateEvent;
import org.javacord.api.interaction.MessageComponentInteraction;
import org.javacord.api.listener.channel.TextChannelAttachableListenerManager;
import org.javacord.api.listener.message.MessageCreateListener;

import java.util.Arrays;

public class channelComponents implements MessageCreateListener {


    @Override
    public void onMessageCreate(MessageCreateEvent event) {

        TextChannel channel = event.getChannel();

            new MessageBuilder()
                    .setContent("Select an option of this list!")
                    .addComponents(
                            ActionRow.of(SelectMenu.create("options", "Click here to show the options", 1, 1,
                                    Arrays.asList(SelectMenuOption.create("C is 2", "You selected Option One!", "Click here to select Option One"),
                                            SelectMenuOption.create("B is 6", "You selected Option Two!", "Click here to select Option Two"),
                                            SelectMenuOption.create("A is 3", "You selected Option Three!", "Click here to select Option Three")))))
                    .send(channel);

            TextChannelAttachableListenerManager api = null;
            api.addMessageComponentCreateListener(event5 -> {
                MessageComponentInteraction messageComponentInteraction = event5.getMessageComponentInteraction();
                String customId = messageComponentInteraction.getCustomId();

                if (customId.equals("options")) {


                    messageComponentInteraction.createImmediateResponder()
                            .setContent("You selected an option in a select menu!")
                            .respond();
                }
            });
        }

    }

