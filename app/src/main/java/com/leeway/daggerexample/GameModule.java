package com.leeway.daggerexample;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Lee Lorz on 2/10/2017.
 */

@Module
public class GameModule {
    @Provides
    GameData providesGameData() {
        return new GameData();
    }
}
