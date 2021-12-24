package jp.ac.uryukyu.ie.e215712;

public class Enemy extends LivingThing{
    public Enemy(String _name, int _hitPoint, int _attack, int _defence){
        this.name = _name;
        this.hitPoint = _hitPoint;
        this.attack = _attack;
        this.defence = _defence;
    }

    public void act(LivingThing target){
        if(this.dead == false){
            var commandNumber = new java.util.Random().nextInt(actions.size());
            actions.get(commandNumber).execute(this, target);
        }
    }

    @Override
    public void judgement(){
        if (this.hitPoint <= 0){
            this.setDead(true);
            System.out.println(name + "は倒れた");
        }
    }
}
