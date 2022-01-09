package jp.ac.uryukyu.ie.e215712;



public class Battle {
    
    public void start(LivingThing player, LivingThing enemy){
        int turn = 1;
        while(player.getDead() == false && enemy.getDead() == false){
            System.out.printf("%dターン目\n", turn);
            player.showStatus();
            enemy.showStatus();
            player.act(enemy);
            enemy.act(player);
            turn++;

        }
    }
}
