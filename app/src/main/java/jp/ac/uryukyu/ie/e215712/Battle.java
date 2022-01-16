package jp.ac.uryukyu.ie.e215712;

/**
 * Battleクラス。
 * 本課題におけるSolverクラス
 * 戦闘関連を担うクラス
 */
public class Battle {
    /**
     * 戦闘するメソッド
     * 最初に敵・味方両方の名前、HP、MPを表示する。
     * その後に、どちらかが死亡するまで、戦闘が続く。
     * @param player　プレイヤー
     * @param enemy　敵
     */
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

    /**
     * オート戦闘するメソッド
     * どちらかが死亡するまで戦闘が続く
     * 行動は「たたかう」固定になる。
     * @param player　プレイヤー
     * @param enemy　敵
     */
    public void auto(LivingThing player, LivingThing enemy){
        int turn = 1;
        while(player.getDead() == false && enemy.getDead() == false){
            System.out.printf("%dターン目\n", turn);
            player.showStatus();
            enemy.showStatus();
            player.getAction().get(0).execute(player, enemy);;
            enemy.getAction().get(0).execute(enemy, player);;
            turn++;
        }
    }
}
