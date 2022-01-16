package jp.ac.uryukyu.ie.e215712;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * 
 */
class BattleTest {
    @Test
    void battleTest(){
        int defalutHitPoint = 100;
        LivingThing demoHero = new Hero("デモ勇者", defalutHitPoint, 100, 100, 100);

        LivingThing demoEnemy = new Enemy("デモエネミー", 10, 1, 10, 0);

        Battle demoBattle = new Battle();

        demoBattle.auto(demoHero, demoEnemy);
        
        assertEquals(defalutHitPoint, demoHero.getHitPoint());
    }
}
