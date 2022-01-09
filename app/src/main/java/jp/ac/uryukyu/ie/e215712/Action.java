package jp.ac.uryukyu.ie.e215712;

public interface Action {
    public String getType();
    public String getName();
    public void execute(LivingThing executer, LivingThing target);
    
}
