import jp.ac.uryukyu.ie.e215712.*;

public class Facilitator {
    public static void main(String[] args) {
        LivingThing hero1 = new Hero("taro", 10, 1, 1, 40);
        hero1.addAction(new Attack());
        hero1.addAction(new AttackMagic("fire", 20, 10));
        hero1.addAction(new HealingMagic("hoimi", 10, 10));
        LivingThing enemy1 = new Enemy("slime", 15, 1, 1);
        enemy1.addAction(new Attack());

        System.out.println(hero1.getName());
        System.out.println(enemy1.getName());
        hero1.showAction();

        Battle battle1 = new Battle();

        battle1.start(hero1, enemy1);
    }
}
