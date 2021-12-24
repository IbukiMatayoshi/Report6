package jp.ac.uryukyu.ie.e215712;

public class Attack implements ActionToEnemies{
    @Override
    public String name(){
        return "たたかう";
    }

    @Override
    public void execute(LivingThing executer, LivingThing target){
        int executerAttack = executer.getAttack();
        int targetHitPoint = target.getHitPoint();
        targetHitPoint -= executerAttack;
        target.setHitPoint(targetHitPoint);
        System.out.println(executer.getName() + "の攻撃！");
        System.out.println(target.getName() + "に" + executerAttack + "のダメージ！");
    }
}
