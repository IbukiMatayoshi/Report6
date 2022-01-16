package jp.ac.uryukyu.ie.e215712;

/**
 * Heroクラス
 * LivingThingクラスのサブクラス
 */
public class Hero extends LivingThing {
    /**
     * コンストラクタ。名前、HP、攻撃力、防御力、MPを設定できる。
     * @param _name　名前
     * @param _hitPoint　HP
     * @param _attack　攻撃力
     * @param _defence　防御力
     * @param _magicPoint　MP
     */
    public Hero(String _name, int _hitPoint, int _attack, int _defence, int _magicPoint){
        this.name = _name;
        this.hitPoint = _hitPoint;
        this.attack = _attack;
        this.defence = _defence;
        this.magicPoint = _magicPoint;
        addAction(new Attack());
    }

    /**
     * 行動させるコマンド
     * ターミナルに数字を入力してコマンドを決定させる。
     * 行動の種類によって動作が異なる。
     */
    @Override
    public void act(LivingThing target){
        if (this.dead == false){
            var commandSelector = new CommandSelector();
        
            for (Action a : actions){
                commandSelector.addCommand(a.getName());
            }

            var commandNumber = commandSelector.commandImput();

            if (actions.get(commandNumber).getType().equals("ToEnemies")){
                actions.get(commandNumber).execute(this, target);
            }else{
                actions.get(commandNumber).execute(this, this);
            }

        } 
        
    }
    
    /**
     * 生死状態の確認を行うメソッド
     * HPが0以下の場合死亡したとされる。
     * その後メッセージが出力される
     */
    @Override
    public void judgement(){
        if (this.hitPoint <= 0){
            this.setDead(true);
            System.out.println("勇者"+name+"は倒れた。");
        }
    } 
}
