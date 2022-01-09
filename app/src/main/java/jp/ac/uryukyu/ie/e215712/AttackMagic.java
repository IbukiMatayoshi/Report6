package jp.ac.uryukyu.ie.e215712;

public class AttackMagic implements Action {
    String name;
    int consumption;
    int attack;
    final String TYPE = "ToEnemies";

    public AttackMagic(String _name, int _consumption, int _attack){
        this.name = _name;
        this.consumption = _consumption;
        this.attack = _attack;
    }

    @Override
    public String getType(){
        return TYPE;
    }
    
    @Override
    public String getName(){
        return name;
    }

    @Override
    public void execute(LivingThing executer, LivingThing target){
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
