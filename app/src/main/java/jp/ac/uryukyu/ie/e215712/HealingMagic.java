package jp.ac.uryukyu.ie.e215712;

public class HealingMagic implements Action{
    String name;
    int consumption;
    int amount;
    final String TYPE = "ToAllies";

    public HealingMagic(String _name, int _consumption, int _amount){
        this.name = _name;
        this.consumption = _consumption;
        this.amount = _amount;
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
