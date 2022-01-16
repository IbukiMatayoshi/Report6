package jp.ac.uryukyu.ie.e215712;

/**
 * Attackクラス
 * Actionクラスのサブクラス
 * final String TYPE = "ToEnemies"; 行動の種類。　"ToEnemies"は敵に向けて行うものとする。
 */
public class Attack implements Action{
    final String TYPE = "ToEnemies";

    /**
     * 自身の行動の種類を返すメソッド
     */
    @Override
    public String getType(){
        return this.TYPE;
    }

    /**
     * 自身の行動の名前を返すメソッド
     */
    @Override
    public String getName(){
        return "たたかう";
    }
    /**
     * 行動を実行するメソッド
     * targetにexecuterの攻撃力依存のダメージを与える。
     * ダメージを与えた後にtargetの死亡判定を行う。
     * @param executer 実行者
     * @param target 実行対象
     */
    @Override
    public void execute(LivingThing executer, LivingThing target){
        if (executer.getDead() == false){
            target.dameged(executer.getAttack());
            System.out.println(executer.getName() + "の攻撃！");
            System.out.println(target.getName() + "に" + executer.getAttack() + "のダメージ！");
            target.judgement();
        }
    }
}
