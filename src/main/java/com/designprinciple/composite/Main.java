package com.designprinciple.composite;

/**
 * @ClassName Main
 * @Description TODO
 * @User Administrator
 * @Date 2019/11/19
 **/
public class Main {
    public static void main(String[] args){
        //创建一个根节点
        Composite root = new Composite();
        root.doSomething();

        //创建一个树枝构件
        Composite branch = new Composite();

        //创建一个叶子节点
        Leaf leaf = new Leaf();
        root.add(branch);
        branch.add(leaf);
    }

    //递归遍历树
    public static void display(Composite root){
        for (Component component :root.getChildren()){
            if (component instanceof Leaf){
                //叶子节点
                component.doSomething();
            }else{
                //树枝节点
                display((Composite) component);
            }
        }
    }
}
