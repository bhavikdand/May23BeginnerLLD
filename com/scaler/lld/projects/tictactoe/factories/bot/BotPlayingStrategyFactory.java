package com.scaler.lld.projects.tictactoe.factories.bot;

import com.scaler.lld.projects.tictactoe.models.BotLevel;
import com.scaler.lld.projects.tictactoe.strategies.bot.BotPlayingStrategy;
import com.scaler.lld.projects.tictactoe.strategies.bot.EasyBotPlayingStrategy;

public class BotPlayingStrategyFactory {

    public static BotPlayingStrategy getStrategy(BotLevel level){
        switch (level){
            case LOW:
            case HIGH:
            case MEDIUM:
                return new EasyBotPlayingStrategy();
        }
        throw new UnsupportedOperationException("Unknown bot type");
    }
}
