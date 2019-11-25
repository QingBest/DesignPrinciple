package com.designprinciple.command;

/**
 * @ClassName Invoker
 * @Description 调用者
 * @User Administrator
 * @Date 2019/10/21
 **/
public class Invoker {
    private AbstractCommand command;

    //接受命令
    public void setCommand(AbstractCommand command){
        this.command = command;
    }

    //执行命令
    public void action(){
        this.command.execute();
    }
}
