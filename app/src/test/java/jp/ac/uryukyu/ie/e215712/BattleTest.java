package jp.ac.uryukyu.ie.e215712;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BattleTest {
    @Test
    void battleTest(){
        int defalutHitPoint = 100;
        LivingThing demoHero = new Hero("デモ勇者", defalutHitPoint, 100, 100, 100);
        demoHero.addAction(new Attack());
        LivingThing demoEnemy = new Enemy("デモエネミー", 10, 1, 10);
        demoEnemy.addAction(new Attack());

        for (int i = 0; i < 3; i++ ){
            demoHero.actions.get(0).execute(demoHero, demoEnemy);
            
        }
        demoEnemy.judgement();

        
        demoEnemy.act(demoHero);
        assertEquals(defalutHitPoint, demoHero.getHitPoint());
    }
}
