package jp.ac.uryukyu.ie.e215712;

public abstract class LivingThing {
    String name;
    int hitPoint;
    int attack;
    int defence;

    public String getName(){
        return name;
    }

    public int getHitPoint(){
        return hitPoint;
    }

    public int getAttack(){
        return attack;
    }

    public int getDefence(){
        return defence;
    }

    public void setHitPoint(int _hitPoint){
        this.hitPoint = _hitPoint;
    }

    public void setAttack(int _attack){
        this.attack = _attack;
    }

    public void setDefence(int _defence){
        this.defence = _defence;
    }
}
