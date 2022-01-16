package jp.ac.uryukyu.ie.e215712;


/**
 * HealingMagicクラス。
 * Actionクラスのサブクラス
 * String name; 魔法の名前
 * int consumption; 消費MP
 * int amount; 回復量
 * final String TYPE = "ToAllies"; 行動の種類。 "ToAllies"は味方に対して行うものとする。
 */
public class HealingMagic implements Action{
    String name;
    int consumption;
    int amount;
    final String TYPE = "ToAllies";

    /**
     * コンストラクタ。　魔法の名前、消費MP、回復量を設定できる。
     * @param _name
     * @param _consumption
     * @param _amount
     */
    public HealingMagic(String _name, int _consumption, int _amount){
        this.name = _name;
        this.consumption = _consumption;
        this.amount = _amount;
    }

    /**
     * 行動の種類を返すメソッド。
     */
    @Override
    public String getType(){
        return TYPE;
    }

    /**
     * 魔法の名前を返すメソッド。
     */
    @Override
    public String getName(){
        return name;
    }

    /**
     * 行動を実行するメソッド
     * targetを回復量のぶん回復する。
     * executerのMPがconsumption以上ないと発動できない。
     * @param executer　実行者
     * @param target　実行対象
     */
    @Override
    public void execute(LivingThing executer, LivingThing target){
        if (executer.getDead() == false){
            if (executer.getMagicPoint() >= consumption){
                target.healed(amount);
                executer.consumedMP(consumption);
                System.out.println(executer.getName() + "の" + name + "!");
                System.out.println(target.getName() + "は" + amount + "回復した！");
            }else{
                System.out.println(executer.getName() + "は" + name + "を唱えることができなかった！");
            }
        }
    }
}
