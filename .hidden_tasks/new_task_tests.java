```java
package com.mydomain.indamon;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class IndamonGameTest {
    private IndamonGame game;

    @Before
    public void setUp() {
        game = new IndamonGame("Player1");
    }

    @Test
    public void testGetPlayerName() {
        assertEquals("Player1", game.getPlayerName());
    }

    @Test
    public void testSetPlayerName() {
        game.setPlayerName("NewName");
        assertEquals("NewName", game.getPlayerName());
    }

    @Test
    public void testGetScore() {
        assertEquals(0, game.getScore());
    }

    @Test
    public void testSetScore() {
        game.setScore(10);
        assertEquals(10, game.getScore());
    }

    @Test
    public void testAttackEnemy() {
        Indamon enemy = new Indamon("Siberov", 10, 5, 5);
        game.setEnemyIndamon(enemy);
        game.attackEnemy();
        assertEquals(9, enemy.getHp());
        assertEquals(1, game.getScore());
    }

    @Test
    public void testInitializeGame() {
        Indamon playerIndamon = new Indamon("Glassey", 10, 5, 5);
        game.initializeGame(playerIndamon);
        assertEquals(playerIndamon, game.getPlayerIndamon());
    }

    @Test
    public void testEndGame() {
        game.endGame();
        assertTrue(game.getGameEnded());
    }
}

```