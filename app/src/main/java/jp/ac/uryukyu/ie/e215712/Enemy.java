package jp.ac.uryukyu.ie.e215712;

public class Enemy extends LivingThing{
    public Enemy(String _name, int _hitPoint, int _attack, int _defence){
        this.name = _name;
        this.hitPoint = _hitPoint;
        this.attack = _attack;
        this.defence = _defence;
    }
}
