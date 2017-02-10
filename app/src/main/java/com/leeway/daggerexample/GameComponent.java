package com.leeway.daggerexample;

import dagger.Component;

/**
 * Created by Lee Lorz on 2/10/2017.
 */

@Component(modules = GameModule.class)
public interface GameComponent {
    void inject(GameSession obj);
}
