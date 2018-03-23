package com.heguodong.template;

import android.util.Log;

/**
 * Created by 何国栋 on 2018/3/23.
 */

public class Student extends AbstractPerson {

    @Override
    public void dressUp() {
        Log.i("heguodong","穿校服");
    }

    @Override
    public void eatBreakfast() {
        Log.i("heguodong","吃妈妈做的早饭");
    }

    @Override
    public void takeThings() {
        Log.i("heguodong","背着书包去上学");
    }
}
