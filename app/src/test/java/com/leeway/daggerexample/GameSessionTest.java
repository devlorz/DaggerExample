package com.leeway.daggerexample;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Lee Lorz on 2/10/2017.
 */

public class GameSessionTest {
    @Test
    public void testGameSession(){
        GameSession session = new GameSession();
        DaggerGameComponent.create().inject(session);
        assertEquals("Hello Dagger", session.data.hello);
    }
}
