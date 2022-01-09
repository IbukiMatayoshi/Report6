package jp.ac.uryukyu.ie.e215712;

import java.util.ArrayList;

public abstract class LivingThing {
    String name;
    int hitPoint;
    int attack;
    int defence;
    int magicPoint;
    boolean dead = false;
    ArrayList<Action> actions = new ArrayList<>();
    

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

    public int getMagicPoint(){
        return magicPoint;
    }

    public boolean getDead(){
        return dead;
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

    public void setMagicPoint(int _magicPoint){
        this.magicPoint = _magicPoint;
    }

    public void setDead(boolean _dead){
        this.dead = _dead;
    }

    public void addAction(Action _action){
        this.actions.add(_action);
    }

    public void showAction(){
        var number = 0;
        for (Action a: actions){
            System.out.println(number + ":"+ a.getName());
        }
    }

    public void showStatus(){
        System.out.printf("%s : HP %d MP %d \n", this.name, this.hitPoint, this.magicPoint);
    }

    public void dameged(int value){
        this.hitPoint -= value;
    }

    public void consumedMP(int value){
        this.magicPoint -= value;
    }

    public void healed(int value){
        this.hitPoint += value;
    }
    abstract void act(LivingThing target);
    abstract void judgement();
}
