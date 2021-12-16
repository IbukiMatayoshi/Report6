import jp.ac.uryukyu.ie.e215712.*;

public class Facilitator {
    public static void main(String[] args) {
        LivingThing hero1 = new Hero("taro", 10, 1, 1);
        LivingThing enemy1 = new Enemy("slime", 5, 1, 1);

        System.out.println(hero1.getName());
        System.out.println(enemy1.getName());
    }
}
