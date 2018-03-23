package com.heguodong.template;

/**
 * Created by 何国栋 on 2018/3/23.
 */

public abstract class AbstractPerson {

    public void prepareGotoSchool() {
        dressUp();
        eatBreakfast();
        takeThings();
    }

    //以下是不同子类根据自身特性完成的具体步骤
    public abstract void dressUp();
    public abstract void eatBreakfast();
    public abstract void takeThings();
}
