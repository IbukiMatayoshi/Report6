package jp.ac.uryukyu.ie.e215712;

public interface Action {
    public String name();
    public void execute(LivingThing executer, LivingThing target);
    
}
