package com.yao.mystruts2.action;

/**
 * Created by Jack Yao on 2022/4/14 4:04 PM
 */
public class HelloWordAction {
    public  String helloWord(){
        System.out.println("成功訪問HelloWord  Action");
        System.out.println("呼叫Service");
        return "success";
    }
}
