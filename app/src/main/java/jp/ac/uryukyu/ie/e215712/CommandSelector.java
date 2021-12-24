package jp.ac.uryukyu.ie.e215712;

import java.util.ArrayList;
import java.util.Scanner;

public class CommandSelector {
    ArrayList<String> commands;
    Scanner scanner;
    
    CommandSelector(){
        this.commands = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    void addCommand(Action _action){
        commands.add(_action.name());
    }

    void clearCommand(Action _action){
        commands.clear();
    }
    

    int commandImput(){
        var index = 0;
        System.out.println("========");
        for (String c : commands){
            System.out.println(index + ":" + c);
            index++;
        }
        System.out.println("========");
        System.out.println("どうする？");

        while(true){
            int target = scanner.nextInt();

            if (target>=0 && target < commands.size()){
                return target;
            }
        }
        
    }
}
