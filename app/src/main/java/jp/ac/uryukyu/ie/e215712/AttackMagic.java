package jp.ac.uryukyu.ie.e215712;

/**
 * AttackMagicクラス
 * Actionクラスのサブクラス
 * String name; 魔法の名前
 * int consumption; 消費MP
 * int attack; 魔法の威力
 * final String TYPE = "ToEnemies"; 行動の種類。　"ToEnemies"は敵に向けて行うものとする。
 */
public class AttackMagic implements Action {
    String name;
    int consumption;
    int attack;
    final String TYPE = "ToEnemies";

    /**
     * コンストラクタ。　魔法の名前、消費MP、威力を設定できる。
     * @param _name　魔法の名前
     * @param _consumption　消費MP
     * @param _attack　威力
     */
    public AttackMagic(String _name, int _consumption, int _attack){
        this.name = _name;
        this.consumption = _consumption;
        this.attack = _attack;
    }

    /**
     * 行動の種類を返すメソッド
     */
    @Override
    public String getType(){
        return TYPE;
    }
    
    /**
     * 魔法の名前を返すメソッド
     */
    @Override
    public String getName(){
        return name;
    }
    /**
     * 行動を実行するメソッド
     * targetに魔法の威力依存のダメージを与える。
     * ダメージを与えた後にtargetの死亡判定を行う。
     * executerのMPが消費MP以上ないと発動できない。
     */
    @Override
    public void execute(LivingThing executer, LivingThing target){
        if (executer.getDead() == false) {
            if (executer.getMagicPoint() >= consumption) {
                target.dameged(attack);
                executer.consumedMP(consumption);
                System.out.println(executer.getName() + "の" + name +"!");
                System.out.println(target.getName() + "に" + attack + "のダメージ！");
                target.judgement();
            } else {
                System.out.println(executer.getName() + "は" + name + "を唱えることができなかった！");
            }
        }
    }
}
