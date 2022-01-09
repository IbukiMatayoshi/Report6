package jp.ac.uryukyu.ie.e215712;

public class Attack implements Action{
    final String TYPE = "ToEnemies";
    @Override
    public String getType(){
        return this.TYPE;
    }
    @Override
    public String getName(){
        return "たたかう";
    }

    @Override
    public void execute(LivingThing executer, LivingThing target){
        target.dameged(executer.getAttack());
        System.out.println(executer.getName() + "の攻撃！");
        System.out.println(target.getName() + "に" + executer.getAttack() + "のダメージ！");
        target.judgement();
    }
}
