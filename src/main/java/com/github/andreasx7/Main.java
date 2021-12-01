package com.github.andreasx7;

import com.github.andreasx7.listeners.*;
import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;

public class Main {

    public static void main(String[] args) {
        // Insert your bot's token here
        String token = ToKen.TOKEN;

        DiscordApi api = new DiscordApiBuilder().setToken(token).login().join();


        // Add a listener which answers with "Pong!" if someone writes "!ping"

            api.addListener(new event1());
            api.addListener(new event2());
            api.addListener(new event3());
            api.addListener(new event4());
            api.addListener(new event5());
            api.addListener(new artemis());
            api.addListener(new options());


        // Print the invite url of your bot
        System.out.println("You can invite the bot by using the following url: " + api.createBotInvite());
    }

}