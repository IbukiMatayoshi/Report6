package jp.ac.uryukyu.ie.e215712;
/**
 * Enemyクラス
 * LivingThingクラスのサブクラス
 */
public class Enemy extends LivingThing{
    /**
     * コンストラクタ。名前、HP、攻撃力、防御力、MPを設定できる。
     * @param _name　名前
     * @param _hitPoint　HP
     * @param _attack　攻撃力
     * @param _defence　防御力
     * @param _magicPoint　MP
     */
    public Enemy(String _name, int _hitPoint, int _attack, int _defence, int _magicPoint){
        this.name = _name;
        this.hitPoint = _hitPoint;
        this.attack = _attack;
        this.defence = _defence;
        this.magicPoint = _magicPoint;
        addAction(new Attack());
    }

    /**
     * 行動させるコマンド
     * 自身が持っているActionの中からランダムで選択される
     */
    public void act(LivingThing target){
        if(this.dead == false){
            var commandNumber = new java.util.Random().nextInt(actions.size());
            actions.get(commandNumber).execute(this, target);
        }
    }

    /**
     * 生死状態の確認を行うメソッド
     * HPが0以下の場合死亡したとされる
     * その後メッセージが出力される
     */
    @Override
    public void judgement(){
        if (this.hitPoint <= 0){
            this.setDead(true);
            System.out.println(name + "は倒れた");
        }
    }
}
