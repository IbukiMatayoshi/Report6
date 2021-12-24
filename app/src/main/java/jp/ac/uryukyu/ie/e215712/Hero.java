package jp.ac.uryukyu.ie.e215712;

public class Hero extends LivingThing {
    public Hero(String _name, int _hitPoint, int _attack, int _defence){
        this.name = _name;
        this.hitPoint = _hitPoint;
        this.attack = _attack;
        this.defence = _defence;
    }

    public void setName(String _name){
        this.name = _name;
    }

    @Override
    public void act(LivingThing target){
        if (this.dead == false){
            var commandSelector = new CommandSelector();
        
            for (Action a : actions){
                commandSelector.addCommand(a);
            }

            var commandNumber = commandSelector.commandImput();

            actions.get(commandNumber).execute(this, target);
        } 
        
    }

    @Override
    public void judgement(){
        if (this.hitPoint <= 0){
            this.setDead(true);
            System.out.println("勇者"+name+"は倒れた。");
        }
    } 
}
