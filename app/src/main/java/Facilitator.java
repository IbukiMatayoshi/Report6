import jp.ac.uryukyu.ie.e215712.*;

/**
 * Facilitatorクラス
 * 本課題におけるmainクラス
 */
public class Facilitator {
    public static void main(String[] args) {
        LivingThing hero1 = new Hero("taro", 10, 1, 1, 40);
        hero1.addAction(new AttackMagic("fire", 20, 10));
        hero1.addAction(new HealingMagic("hoimi", 10, 10));

        LivingThing hero2 = new Hero("jiro", 20, 5, 5, 10);
        hero2.addAction(new AttackMagic("sander", 10, 10));

        LivingThing enemy1 = new Enemy("slime", 15, 1, 1, 0);

        LivingThing enemy2 = new Enemy("goblin", 20, 1, 1, 10);

        Battle battle1 = new Battle();

        battle1.start(hero1, enemy1);
        battle1.auto(hero2, enemy2);
    }
}
