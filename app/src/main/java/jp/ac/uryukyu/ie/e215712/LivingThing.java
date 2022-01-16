package jp.ac.uryukyu.ie.e215712;

import java.util.ArrayList;

/**
 * LivingThingクラス
 * 抽象クラス
 * HeroクラスやEnemyクラスの親クラス
 * String name; // 名前
 * int hitPoint; // HP（体力）
 * int attack; // 攻撃力
 * int defence; // 防御力（今後のダメージ計算式の変更により登場）
 * int magicPoint; // MP（魔力量：魔法を唱えるときに使う）
 * boolean dead; // 生死状態（true = 死亡）
 * ArrayList<Action> actions; // 保有しているActionのリスト 
 */
public abstract class LivingThing {
    String name;
    int hitPoint;
    int attack;
    int defence;
    int magicPoint;
    boolean dead = false;
    ArrayList<Action> actions = new ArrayList<>();
    
    /**
     * 名前を返すメソッド
     * @return　名前
     */
    public String getName(){
        return name;
    }

    /**
     * HPを返すメソッド
     * @return　HP
     */
    public int getHitPoint(){
        return hitPoint;
    }

    /**
     * 攻撃力を返すメソッド
     * @return　攻撃力
     */
    public int getAttack(){
        return attack;
    }

    /**
     * 防御力を返すメソッド
     * @return　防御力
     */
    public int getDefence(){
        return defence;
    }

    /**
     * MPを返すメソッド
     * @return　MP
     */
    public int getMagicPoint(){
        return magicPoint;
    }

    /**
     * 生死状態を返すメソッド
     * @return　生死状態
     */
    public boolean getDead(){
        return dead;
    }

    /**
     * 行動のリストを返すメソッド
     * @return　保持している行動のリスト
     */
    public ArrayList<Action> getAction(){
        return actions;
    }

    /**
     * 名前を設定するメソッド
     * @param _name　名前
     */
    public void setName(String _name){
        this.name = _name;
    }
    
    /**
     * HPを設定するメソッド
     * @param _hitPoint HP
     */
    public void setHitPoint(int _hitPoint){
        this.hitPoint = _hitPoint;
    }
    
    /**
     * 攻撃力を設定するメソッド
     * @param _attack　攻撃力
     */
    public void setAttack(int _attack){
        this.attack = _attack;
    }

    /**
     * 防御力を設定するメソッド
     * @param _defence　防御力
     */
    public void setDefence(int _defence){
        this.defence = _defence;
    }

    /**
     * MPを設定するメソッド
     * @param _magicPoint　MP
     */
    public void setMagicPoint(int _magicPoint){
        this.magicPoint = _magicPoint;
    }
    /**
     * 生死状態を設定するメソッド
     * @param _dead　生死状態
     */
    public void setDead(boolean _dead){
        this.dead = _dead;
    }

    /**
     * Actionを追加するメソッド
     * @param _action　追加したいAction
     */
    public void addAction(Action _action){
        this.actions.add(_action);
    }

    /**
     * 保有しているActionを出力するメソッド
     */
    public void showAction(){
        var number = 0;
        for (Action a: actions){
            System.out.println(number + ":"+ a.getName());
        }
    }

    /**
     * 自身のステータスを出力するメソッド
     * 名前、HP、MPの順に出力される
     */
    public void showStatus(){
        System.out.printf("%s : HP %d MP %d \n", this.name, this.hitPoint, this.magicPoint);
    }

    /**
     * ダメージを受けるときに使うメソッド
     * @param value　ダメージ量
     */
    public void dameged(int value){
        this.hitPoint -= value;
    }

    /**
     * MPを消費するときに使うメソッド
     * @param value　消費量
     */
    public void consumedMP(int value){
        this.magicPoint -= value;
    }

    /**
     * 回復するときに使うメソッド
     * @param value　回復量
     */
    public void healed(int value){
        this.hitPoint += value;
    }
    
    //継承先で具体的な実装をするメソッド
    abstract void act(LivingThing target);
    abstract void judgement();
}
