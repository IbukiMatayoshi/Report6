package jp.ac.uryukyu.ie.e215712;

/**
 * Actionインターフェイス
 * これを継承して様々なActionを作る
 */
public interface Action {
    public String getType();
    public String getName();
    public void execute(LivingThing executer, LivingThing target);
    
}
