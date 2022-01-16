package jp.ac.uryukyu.ie.e215712;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * コマンド選択を行うクラス
 * ArrayList<String> commands; コマンドの保存先
 * Scanner scanner; 読み込み機能
 */
public class CommandSelector {
    ArrayList<String> commands;
    Scanner scanner;

    /**
     * コンストラクタ。コマンドを保存するリストを作り、読み込み機能を呼び出す。
     */
    CommandSelector(){
        this.commands = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }
    
    /**
     * コマンドを追加するメソッド
     * @param commandName　追加したいコマンド
     */
    void addCommand(String commandName){
        commands.add(commandName);
    }

    /**
     * 保存されたコマンドを一斉削除するメソッド。
     */
    void clearCommand(){
        commands.clear();
    }
    
    /**
     * コマンドを選択するメソッド
     * 数字入力を想定している。
     * @return　選択した数字
     */
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
