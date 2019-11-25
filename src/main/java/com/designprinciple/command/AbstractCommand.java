package com.designprinciple.command;

/**
 * @ClassName AbstractCommand
 * @Description 抽象命令方
 * @User Administrator
 * @Date 2019/10/21
 **/
public abstract class AbstractCommand {
    protected final AbstractReceiver receiver;

    public AbstractCommand(AbstractReceiver receiver) {
        this.receiver = receiver;
    }

    public abstract void execute();

    public void rollback(){
     //统一回滚
    }
}
