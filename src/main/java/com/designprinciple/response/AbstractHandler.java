package com.designprinciple.response;

/**
 * @ClassName AbstractHandler
 * @Description 抽象处理者
 * @User Administrator
 * @Date 2019/10/21
 **/
public abstract class AbstractHandler {
    private AbstractHandler nextHandler;

    //每个处理者都必须对请求作出处理
    public final Response handleMessage(Request request){
        Response response = null;
        //判断是否是自己的处理级别
        if (this.getHandlerLevel().equals(request.getRequestLevel())){
            response = this.echo(request);
        }else {
            //不属于自己的处理级别，判断是否有下一个处理者
            if (this.nextHandler != null){
                response = this.nextHandler.handleMessage(request);
            }else {
                //没有合适的处理者，自己处理
            }
        }
        return response;
    }

    //设置下一个处理者是谁
    public void setNext(AbstractHandler handler){
        this.nextHandler = handler;
    }

    //每个处理者都有一个处理级别
    protected abstract Level getHandlerLevel();

    //每个处理者都必须实现处理任务
    protected abstract Response echo(Request request);
}
