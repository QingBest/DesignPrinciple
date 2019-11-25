package com.designprinciple.command;

/**
 * @ClassName ConcreteCommand
 * @Description 具体命令方
 * @User Administrator
 * @Date 2019/10/21
 **/
public class ConcreteCommand extends AbstractCommand {
    //对哪个Receiver进行命令处理
    private ConcreteReceiver receiver;

    //默认自己为接收者
    public ConcreteCommand(){
        super(new ConcreteReceiver());
    }
    //构造函数传递接收者
    public ConcreteCommand(ConcreteReceiver receiver) {
        super(receiver);
    }

    public void execute() {
        this.receiver.doSomething();
    }

    public void rollback() {
        //回滚操作
        super.rollback();
    }
}
